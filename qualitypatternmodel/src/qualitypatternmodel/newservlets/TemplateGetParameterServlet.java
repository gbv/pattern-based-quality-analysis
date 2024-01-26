package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TemplateGetParameterServlet extends HttpServlet {
	
	// .. /template/getparameter   /<technology>/<level>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("TemplateGetParameterServlet.doGet()");
		response.getOutputStream().println("{ \"call\": \"TemplateGetParameterServlet.doGet()\"}");
	}
}
