package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;

@SuppressWarnings("serial")
public class ConstraintDatabaseServlet extends HttpServlet {

	// GET .. /constraint/database    /<technology>/<name>

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try {
			JSONObject result = applyGet(path, params);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	// POST .. /constraint/database    /<technology>/<name>    {"database": <datamode-name>}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.logCall(this.getClass().getName(), path, params);
		try{
			JSONObject result = applyPost(path, params);
			ServletUtilities.putResponse(response, result);
		}
		catch (Exception e) {
			ServletUtilities.putResponseError(response, e);
		}
	}

	public static JSONObject applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getdatabase/<technology>/<name>' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		// 1 load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException(Constants.ERROR_NOT_FOUND_CONSTRAINT);
		}

		// 2 return database name
		JSONObject result = new JSONObject();
		try {
			result.put(Constants.JSON_DATABASE, pattern.getDatabaseName());
		} catch (JSONException e) {}
		return result;
	}

	public static JSONObject applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals("")) {
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/setparameter/<technology>/<name>/' (not " + path + ")");
		}

		String technology = pathparts[1];
		String constraintId = pathparts[2];

		if (!Constants.TECHS.contains(technology)) {
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + Constants.TECHS);
		}

		String[] databaseNameArray = parameterMap.get(Constants.JSON_DATABASE);
		if (databaseNameArray == null || databaseNameArray.length != 1 || databaseNameArray[0].equals("")) {
			throw new InvalidServletCallException(Constants.ERROR_INVALID_VALUE);
		}
		String newDatabaseName = databaseNameArray[0];

		// 1. load Pattern
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("404 Requested pattern '" + constraintId + "' does not exist");
		}

		// 2. change name
		String oldDatabaseName = pattern.getDatabaseName();
		pattern.setDatabaseName(newDatabaseName);

		// 3. save constraint
		String timestamp = null;
		try {
			timestamp = ServletUtilities.saveConstraint(technology, constraintId, pattern);
		} catch (IOException e) {
			throw new FailedServletCallException(Constants.ERROR_SAVING_FAILED);
		}

		JSONObject result = new JSONObject();
		try {
			result.put(Constants.JSON_CONSTRAINT_ID, pattern.getPatternId());
			result.put(Constants.JSON_OLD_DATABASE, oldDatabaseName);
			result.put(Constants.JSON_DATABASE, newDatabaseName);
			result.put(Constants.JSON_LASTSAVED, timestamp);
		} catch (JSONException e) {}

		return result;
//		return "Database of constraint of constraint '" + pattern.getPatternId() + "' updated successfully from '" + oldDatabaseName + "' to '" + newDatabaseName + "'.";
	}

}
