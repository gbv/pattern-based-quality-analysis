package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateQueryServlet extends HttpServlet {
	
	// .. /template/query   /<technology>/<constraintId>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		ServletUtilities.log(getServletContext(), this.getClass().getName(), path, params);
		try {
			int i = path.split("/").length;
			String result = ""; // = applyGet(path, params);
			if (i == 2)
				result = applyGet2(getServletContext(), path, params);
			else if (i == 3)
				result = applyGet3(getServletContext(), path, params);
			else 
				throw new InvalidServletCallException("Wrong url for requesting the mqaf constraint: '.. /template/getdatabase/<technology>/<name>' or '.. /template/getdatabase/<technology>' + {parameter = [..]} (not " + path + ")");

			ServletUtilities.logOutput(getServletContext(), result);
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
		}
		catch (InvalidServletCallException e) {
			ServletUtilities.log(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
			ServletUtilities.log(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
			ServletUtilities.log(getServletContext(), e.getStackTrace());
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateQueryServlet.doGet(" + path + ")\"}");
	}

	public static String applyGet3(ServletContext servletContext, String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getdatabase/<technology>/<name>' (not " + path + ")");

		String technology = pathparts[1];
		String constraintId = pathparts[2];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		String[] constraintIds = new String[] {constraintId};
		return applyGet(servletContext, technology, constraintIds);

//		// 1 load constraint
//		CompletePattern pattern;
//		try {
//			pattern = ServletUtilities.loadConstraint(getServletContext(), technology, constraintId);
//		} catch (IOException e) {
//			throw new FailedServletCallException("constraint not found");
//		}
//		
//		try {
//			pattern.isValid(AbstractionLevel.CONCRETE);
//		} catch (Exception e) {
//			throw new FailedServletCallException(e.getClass().getName() + ": " + e.getMessage());
//		}
//
//		// 2 generate query
//		JSONObject json = null;
//		try {
//			if (pattern.containsJavaOperator())
//				json = generateQueryJsonJava(pattern, technology);
//			else 
//				json = generateQueryJson(pattern, technology);
//		} catch (JSONException e) {
//			e.printStackTrace();
//		} catch (InvalidityException e) {
//			e.printStackTrace();
//		}
//		// 3 return result
//		return json.toString();
	}

	public static String applyGet2(ServletContext servletContext, String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 2 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong api call for requesting the database of a constraint: '.. /template/query/<technology>' + {\"constraints\" = [..]} (not " + path + ")");

		String technology = pathparts[1];
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		String[] constraintIds = parameterMap.get("constraints");
		Set<String> constraintIdSet = new LinkedHashSet<>(Arrays.asList(constraintIds));
		constraintIds = constraintIdSet.toArray(new String[0]);

//		JSONObject result = new JSONObject();
//		JSONArray failed = new JSONArray();
//		
//		for (String constraintId: constraintIds) {
//			// 1 load constraint
//			CompletePattern pattern;
//			try {
//				pattern = ServletUtilities.loadConstraint(getServletContext(), technology, constraintId);
//				pattern.isValid(AbstractionLevel.CONCRETE);
//			// 2 generate query
//				JSONObject queryJson = generateQueryJson(pattern, technology);
//				result.put(constraintId, queryJson);
//			} catch (Exception e) {
//				try {
//					result.put(constraintId, "failed");
//				} catch (JSONException e1) {}
//				failed.put(constraintId);
//			}
//		}
//		try {
//			result.put("failed", failed);
//		} catch (JSONException e) {
//		}
//		return result.toString();
		
		return applyGet(servletContext, technology, constraintIds);
	}
	
	public static String applyGet(ServletContext servletContext, String technology, String[] constraintIds) throws InvalidServletCallException, FailedServletCallException {
		
		JSONObject result = new JSONObject();
		JSONArray failed = new JSONArray();
		
		for (String constraintId: constraintIds) {
			// 1 load constraint
			CompletePattern pattern;
			try {
				pattern = ServletUtilities.loadConstraint(servletContext, technology, constraintId);
				pattern.isValid(AbstractionLevel.CONCRETE);
			// 2 generate query
				JSONObject queryJson; 
				// = generateQueryJson(pattern, technology);
				if (pattern.containsJavaOperator())
					queryJson = generateQueryJsonJava(servletContext, pattern, technology);
				else 
					queryJson = generateQueryJson(servletContext, pattern, technology);
				result.put(constraintId, queryJson);
			} catch (Exception e) {
				System.err.println(constraintId);
				e.printStackTrace();
//				try {
//					result.put(constraintId, Arrays.toString(e.getStackTrace()));
//				} catch (JSONException e1) {}
				failed.put(constraintId);
			}
		}
		try {
			result.put("failed", failed);
		} catch (JSONException e) {
		}
		return result.toString();
	}


	private static JSONObject generateQueryJson(ServletContext servletContext, CompletePattern pattern, String technology) throws JSONException, InvalidServletCallException, FailedServletCallException {
		JSONObject json = new JSONObject();
		
		// 1 technology
		json.put("technology", pattern.getLanguage().getLiteral());
		json.put("technology", technology);
//		pattern.getLanguage().getLiteral();
		
		// 2 query
		try {
			if (technology.equals(ServletUtilities.XML)) {
				json.put("language", "XQuery");
				String xquery = pattern.generateXQuery();
				json.put("query", xquery);
				json.put("query_line", makeQueryOneLine(xquery));
				
			} else if (technology.equals(ServletUtilities.RDF)) {
				json.put("language", "Sparql");
				String sparql = pattern.generateSparql();
				json.put("query", sparql);
				json.put("query_line", makeQueryOneLine(sparql));
				
			} else if (technology.equals(ServletUtilities.NEO4J)) {
				json.put("language", "Cypher");
				String cypher = pattern.generateCypher();
				json.put("query", cypher);
				json.put("query_line", makeQueryOneLine(cypher));

			} else {
				throw new InvalidServletCallException();
			}
		
		} catch (InvalidityException e) {
			throw new FailedServletCallException();
		}
		
		// 3 return json
		return json;
	}
	
	private static String makeQueryOneLine(String query) {
		String shortQuery = query.replace("\r\n", " ");
		shortQuery = shortQuery.replace("\n", " ");
		int len = shortQuery.length() + 1;
		while (shortQuery.length()< len) {
			len = shortQuery.length();
			shortQuery = shortQuery.replace("  ", " ");
		}
		shortQuery = shortQuery.trim();
		return shortQuery;
	}

	private static JSONObject generateQueryJsonJava(ServletContext servletContext, CompletePattern pattern, String technology) throws JSONException, InvalidServletCallException, FailedServletCallException {
		JSONObject json = new JSONObject();
		
		// 1 technology
		if (!technology.equals(pattern.getLanguage().getLiteral()))
			throw new InvalidServletCallException();
		json.put("technology", technology);
//		pattern.getLanguage().getLiteral();
		
		// 2 query and filter
		try {
			if (technology.equals(ServletUtilities.XML)) {
				json.put("language", "XQuery");
				String query = pattern.generateXQuery();
				json.put("query", query);
				json.put("query_line", makeQueryOneLine(query));
				JavaFilter filter = pattern.generateQueryFilter();
				String serializedFilter = filter.toJson().toString();
				json.put("filter", serializedFilter);
				
			} else if (technology.equals(ServletUtilities.RDF)) {
				throw new InvalidServletCallException("Not implemented for RDF.");
				
			} else if (technology.equals(ServletUtilities.NEO4J)) {
				throw new InvalidServletCallException("Not implemented for Neo4j.");

			} else {
				throw new InvalidServletCallException();
			}
		} catch (InvalidityException e) {
			throw new FailedServletCallException();
		}
		
		// 4 return json
		return json;
	}
}
