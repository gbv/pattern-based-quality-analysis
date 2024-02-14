package qualitypatternmodel.newservlets;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

@SuppressWarnings("serial")
public class TemplateMqafJsonServlet extends HttpServlet {
	
	// .. /template/mqafjson   /<technology>/<constraintId>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getPathInfo();
		System.out.println("TemplateMqafJsonServlet.doGet(" + path + ")");
		try {
			String result = applyGet(path, request.getParameterMap());
			response.getOutputStream().println(result);
			response.setStatus(HttpServletResponse.SC_OK);
//			response.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
//			response.getWriter().write("{ \"error\": \"not implemented\"}");
		}
//		catch (InvalidServletCallException e) {
//	        response.setContentType("application/json");
//			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
//		}
//		catch (FailedServletCallException e) {
//        response.setContentType("application/json");
//		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
//		response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
//	}
			catch (FileNotFoundException e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			response.getWriter().write("{ \"error\": \"unable to find specified constraint\"}");
			e.printStackTrace();
		}
		catch (Exception e) {
	        response.setContentType("application/json");
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("{ \"error\": \"" + e.getMessage() + "\"}");
			e.printStackTrace();
		}
//		response.getOutputStream().println("{ \"call\": \"TemplateMqafJsonServlet.doGet(" + path + ")\"}");
	}

	public String applyGet(String path, Map<String, String[]> parameterMap) throws InvalidServletCallException, FailedServletCallException {
		String[] pathparts = path.split("/");
		if (pathparts.length != 3 || !pathparts[0].equals(""))
			throw new InvalidServletCallException("Wrong url for requesting the database of a constraint: '.. /template/getdatabase/<technology>/<name>' (not " + path + ")");

		String technology = pathparts[1];
		String constraintId = pathparts[2];
		
		if (!ServletUtilities.TECHS.contains(technology))
			throw new InvalidServletCallException("The technology '" + technology + "' is not supported. Supported are: " + ServletUtilities.TECHS);

		// 1 load constraint
		CompletePattern pattern;
		try {
			pattern = ServletUtilities.loadConstraint(getServletContext(), technology, constraintId);
		} catch (IOException e) {
			throw new FailedServletCallException("specified constraint not found", e);
		}
		
		try {
			pattern.isValid(AbstractionLevel.CONCRETE);
		} catch (Exception e) {
			System.out.println(pattern.myToString());
			throw new FailedServletCallException(e.getClass().getName(), e);
		}

		// 2 generate mqaf constraint
		String constraint;
		try {
			constraint = pattern.generateXmlConstraintYAMLFileContent();
		} catch (InvalidityException e) {
			throw new FailedServletCallException(e.getClass().getName() + ": " + e.getMessage(), e);
		}
		
		// 3 return constraint
		return constraint;
	}
}
