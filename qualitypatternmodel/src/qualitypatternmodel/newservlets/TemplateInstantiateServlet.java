package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;

@SuppressWarnings("serial")
public class TemplateInstantiateServlet extends HttpServlet {
	
	// .. /template/instantiate   /<technology>/<abstracttemplate>
	
	@Override
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			String result = applyPut(path, params);
			ServletUtilities.logOutput(result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"1 " + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
	        if (e.getMessage().startsWith("404")) {
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
				response.getWriter().write("{ \"error\": \"2 " + e.getMessage().substring(4) + "\"}");
	        }
	        else if (e.getMessage().startsWith("409")) {
				response.setStatus(HttpServletResponse.SC_CONFLICT);
				response.getWriter().write("{ \"error\": \"3 " + e.getMessage().substring(4) + "\"}");
	        	
	        } else {
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				response.getWriter().write("{ \"error\": \"internal " + e.getMessage() + "\"}");
	        }
		}
		catch (Exception e) {
			ServletUtilities.logError(e);
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"4 " + e.getClass().getSimpleName() + " " + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateInstantiateServlet.doPost()\"}");
	}
	
	public static String applyPut (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException, IOException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 4 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for instantiate in a constraint: '.. /template/instantiate/<technology>/<constraintId>/<variantId>' (not " + path + ")");

		// 1 get parameters
		String technology = pathparts[1];
		String templateId = pathparts[2];
		String textid = pathparts[3];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		// 2 load constraint with old name
		CompletePattern pattern = ServletUtilities.loadTemplate(technology, templateId);
		if (pattern == null)
			throw new FailedServletCallException("404 Requested template '" + templateId + "' does not exist");

		// Optional: set name
		if (parameterMap != null) {
			String[] names = parameterMap.get("name");
			if (names != null && names[0] != null) {
				pattern.setName(names[0]);
			}
			String[] datamodel = parameterMap.get("datamodel");
			if (datamodel != null && datamodel[0] != null) {
				pattern.setDataModelName(datamodel[0]);
			}
			String[] database = parameterMap.get("database");
			if (database != null && database[0] != null) {
				pattern.setDatabaseName(database[0]);
			}
		}
		
		// 3 remove unused variants
		Boolean instantiated = false;
		for (PatternText t: pattern.getText()) {
			if (t.getName().equals(textid)) {
				try {
					t.instantiate();
					instantiated=true;
					break;
				} catch (InvalidityException e) {
					ServletUtilities.logError(e);
					throw new FailedServletCallException("Could not initialize Variant " + textid, e);
				}
			}
		}
		
		if (!instantiated) {
			ArrayList<String> textNames = new ArrayList<String>();
			for (PatternText t: pattern.getText()) {
				textNames.add(t.getName());
			}
			throw new InvalidServletCallException("Variant ID invalid: '" + textid + "' does not exist in " + templateId + ". Available are: " + textNames);
		}

		// 4 create new constraint id
		String constraintId = ServletUtilities.generateNewId(technology, templateId, pattern.getText().get(0).getName());
		pattern.setPatternId(constraintId);
		
		// 5 save constraint
		try {
			ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException("Failed to create new constraint.");
		}
		
		
		return ServletUtilities.getPatternJSON(pattern).toString();
//		return "Template '" + templateId + "' instantiated successfully to '" + constraintId + "'.";
	}
}