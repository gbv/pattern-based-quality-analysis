package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;

public class PatternTextListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String requestUrl = request.getRequestURI();
		String patternName = requestUrl.substring("/qualitypatternmodel/concrete-patterns/text-list/".length());
		
		String folderPath = "../../concrete-patterns/";
		String filePath = folderPath + patternName + ".patternstructure";	
		
		URL fileURL = getClass().getClassLoader().getResource(filePath);		
		
		if(fileURL != null) {
			CompletePattern pattern = EMFModelLoad.loadCompletePattern(fileURL.toString());
			EList<PatternText> texts = pattern.getText();
			if (texts.isEmpty()) {
				response.sendError(404);
				response.getOutputStream().println("{ \"error\": \"No pattern texts found\"}");					
			} else {
				String result = "{\"Texts\": [";
				for (PatternText text: texts) {
					result += "\"" + text.getName() + "\", ";
				} 					
				result += "]}";
				result = result.replace(", ]}", "]}");
				response.getOutputStream().println(result);
			}
			
		} else {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Concrete pattern not found\"}");				
		}	
	}
	
}
