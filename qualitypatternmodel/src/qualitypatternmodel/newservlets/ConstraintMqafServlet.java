package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.mqaftranslation.MqafTranslation;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;

@SuppressWarnings("serial")
public class ConstraintMqafServlet extends HttpServlet {

	// GET .. /constraint/mqaf    /<technology>/<constraintId>
	// GET .. /constraint/mqaf    /<technology>    {"constraints":<constraint-ids>}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			int i = path.split("/").length;
			JSONObject result;
			if (i == 2) {
				result = applyGet2(path, params);
			} else if (i == 3) {
				result = applyGet3(path, params);
			} else {
				throw new InvalidServletCallException("Wrong url for requesting the mqaf constraint: '.. /template/getdatabase/<technology>/<name>' or '.. /template/getdatabase/<technology>' + {parameter = [..]} (not " + path + ")");
			}
			ServletUtilities.logOutput(result);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONObject applyGet3(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for requesting the mqaf constraint: '.. /template/getdatabase/<technology>/<name>' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!ServletUtilities.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		}

		JSONObject result = getJsonStringSchemaFromConstraintIds(new String[] { constraintId }, technology);
		if (result == null) {
			result = new JSONObject();
			try {
				result.put(Constants.JSON_FAILED, constraintId);
			} catch (JSONException e) {}
		}
		return result;

//		// 1 load constraint
//		CompletePattern pattern;
//		try {
//			pattern = ServletUtilities.loadConstraint(technology, constraintId);
//		} catch (IOException e) {
//			throw new FailedServletCallException("specified constraint not found", e);
//		}
//
//		try {
//			pattern.isValid(AbstractionLevel.CONCRETE);
//		} catch (Exception e) {
//			System.out.println(pattern.myToString());
//			throw new FailedServletCallException(e.getClass().getName(), e);
//		}
//
//		// 2 generate mqaf constraint
//		String constraint;
//		try {
//			BaseSchema schema = pattern.generateXmlConstraintSchema();
//
//			constraint = ConfigurationReader.toJson(schema);
//		} catch (InvalidityException e) {
//			throw new FailedServletCallException(e.getClass().getName() + ": " + e.getMessage(), e);
//		}
//
//		//			return new JSONObject().put("constraint", constraint).toString();
//		return constraint;
	}


	public JSONObject applyGet2(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong api call for requesting the database of a constraint: '.. /template/getdatabase/<technology>' + {\"constraints\" = [..]} (not " + path + ")");
		}

		String technology = pathparts[1];
		if (!ServletUtilities.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);
		}

		String[] constraintIds = parameterMap.get("constraints");


		return getJsonStringSchemaFromConstraintIds(constraintIds, technology);

//		ArrayList<BaseSchema> schemas = new ArrayList<BaseSchema>();

//		for (String constraintId: constraintIds) {
//			// 1 load constraint
//			CompletePattern pattern;
//			try {
//				pattern = ServletUtilities.loadConstraint(technology, constraintId);
//			} catch (IOException e) {
//				throw new FailedServletCallException("specified constraint not found", e);
//			}
//
//			try {
//				pattern.isValid(AbstractionLevel.CONCRETE);
//			} catch (Exception e) {
//				System.out.println(pattern.myToString());
//				throw new FailedServletCallException(e.getClass().getName(), e);
//			}
//
//			// 2 generate mqaf constraint
//			try {
//				BaseSchema schema = MqafTranslation.translateToConstraintSchema(pattern);
//				schemas.add(schema);
//			} catch (InvalidityException e) {
//				throw new FailedServletCallException(e.getClass().getName() + ": " + e.getMessage(), e);
//			}
//
//		}
//
//		// 3  merge schemas
//		if (schemas.isEmpty())
//			return null;
//
//		BaseSchema mergedSchema = schemas.get(0);
//		for (int i = 1; i< schemas.size(); i++) {
//			mergedSchema.merge(schemas.get(i), false);
//		}
//
//		// 4 return merged schema
//		return ConfigurationReader.toJson(mergedSchema);
//		return null;
//		return ConfigurationReader.toJson(schema);
	}

	private static JSONObject getJsonStringSchemaFromConstraintIds(String[] constraintIds, String technology) throws FailedServletCallException {
		ArrayList<BaseSchema> schemas = new ArrayList<BaseSchema>();
		JSONArray failed = new JSONArray();

		for (String constraintId: constraintIds) {
			// 1 load constraint
			CompletePattern pattern;
			try {
				pattern = ServletUtilities.loadConstraint(technology, constraintId);
				pattern.isValid(AbstractionLevel.CONCRETE);

				// 2 generate mqaf constraint
				BaseSchema schema = MqafTranslation.translateToConstraintSchema(pattern);
				schemas.add(schema);
			} catch (Exception e) {
				failed.put(constraintId);
			}
		}

		// 3  merge schemas
		if (schemas.isEmpty()) {
			return null;
		}

		BaseSchema mergedSchema = schemas.get(0);
		for (int i = 1; i< schemas.size(); i++) {
			mergedSchema.merge(schemas.get(i), false);
		}

		// 4 return merged schema as JSON
		JSONObject jobj = new JSONObject();
		try {
			jobj.put(Constants.JSON_FAILED, failed);
			JSONObject constraint = new JSONObject(ConfigurationReader.toJson(mergedSchema));
			jobj.put(Constants.JSON_CONSTRAINT, constraint);
		} catch (JSONException e) {}
		return jobj;
	}

//    public static JSONObject convertYamlToJson(String yamlString) throws IOException, JSONException {
//    	System.err.println(yamlString);
//    	// Create ObjectMapper for YAML
//        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
//
//        // Read YAML string and convert to JSON object
//        Object yamlObject = yamlMapper.readValue(yamlString, Object.class);
//
//        // Create ObjectMapper for JSON
//        ObjectMapper jsonMapper = new ObjectMapper();
//
//        // Convert YAML object to JSON string
//        String jsonString =  jsonMapper.writeValueAsString(yamlObject);
//        return new JSONObject(jsonString);
////    	// Parse YAML string
////    	System.out.println(yamlString);
////        Yaml yaml = new Yaml();
////        Object yamlObject = yaml.load(yamlString);
////        System.err.println("[" + yamlObject.toString() + "]");
////
////        // Convert YAML object to JSON
////        JSONObject jsonObject = new JSONObject(yamlObject);
////        System.err.println("[" + jsonObject.toString() + "]");
////        return jsonObject;
//
//    }
}
