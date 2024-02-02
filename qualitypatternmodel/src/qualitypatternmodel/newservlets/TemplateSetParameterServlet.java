package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;

@SuppressWarnings("serial")
public class TemplateSetParameterServlet extends HttpServlet {
	
	// .. /template/setparameter   /<technology>/<name>/
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		Map<String, String[]> params = request.getParameterMap();
		System.out.println("TemplateSetParameterServlet.doPost(" + path + ")");
		String result;
		try{
			result = applyPost(path, params);
			response.getOutputStream().println(result);
		}
		catch (InvalidServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (FailedServletCallException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateSetParameterServlet.doPost(" + path + ")\"}");
	}
	
	public String applyPost (String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for setting a database in a constraint: '.. /template/setparameter/<technology>/<name>/' (not " + path + ")");

		String technology = pathparts[1];
		String templatename = pathparts[2];
		
		
		// TODO:
		// 1 check validity parameter
		//   -> InvalidServletCallException
		// 2 load constraint
		// 3 map values to constraintparameter
		//   -> InvalidServletCallException
		// 4 set constraint parameter values
		// 5 save constraint
		
		
//		String path; 
//		String extension = "pattern";
//		Map<String, String> parameter;
//		
//		try {
//			path = identifyConcretePatternPath(request);
//			parameter = identifyParameter(request);
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Path not well formed\"}");
//			return;
//		}
//		
//		CompletePattern pattern;
//		try {
//			pattern = EMFModelLoad.loadCompletePattern(path);
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
//			return;
//		}
//		
//		try {
//			for (String key : parameter.keySet()) {
//				setParameter(pattern, key, parameter.get(key));
//			}
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");
//			return;
//		}
//		
//		try {
//			EMFModelSave.exportToFile(pattern, path, extension);
//		} catch (Exception e) {
//			response.sendError(404);
//			response.getOutputStream().println("{ \"error\": \"Changes could not be saved\"}");
//			return;
//		}
//		
//		response.getOutputStream().println("Successfully set parameter");
		return "";
	}
	
//	private String identifyConcretePatternPath(HttpServletRequest request) {
//		// TODO
//		return "";
//	}
//	
//	private Map<String, String> identifyParameter(HttpServletRequest request) {
//		// TODO
//		return null;
//	}
//	
//	private void setParameter(CompletePattern pattern, String key, String string) {
//		// TODO
//	}
}
