package qualitypatternmodel.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConcretePatternListServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {
			String fileNames = Util.getFileNamesInFolder("../../concrete-patterns/", getClass());
			if(fileNames == null) {
				response.getOutputStream().println("Loading concrete pattern folder failed.");
			} else {
				response.getOutputStream().println(fileNames);
			}
		} catch (URISyntaxException e) {
			response.getOutputStream().println("Loading concrete pattern folder failed.");
		}	
		
	}
	
}