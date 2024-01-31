package qualitypatternmodel.newservlets;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DatabaseGetListServlet extends HttpServlet {

	// get List of databases of a format
	// .. /databases/getlist   /<technology>
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String path = request.getContextPath();
		System.out.println("DatabaseGetListServlet.doGet(" + path + ")");
		String result;
		try {
			result = applyGet(path);
			response.getOutputStream().println(result);
		}
		catch (Exception e) {
			response.sendError(404);
			response.getOutputStream().println("{ \"error\": \"Databases not found.\"}");
		}
//		response.getOutputStream().println("{ \"call\": \"DatabaseGetListServlet.doGet(" + path + ")\"}");
	}
	
	private String applyGet(String path) {
//		String format = "xml";
//		
//		List<Database> databases = null; // EMFModelLoad.loadDatabasesOfFormat(format);
//		
//		String output = "{\"databases\":[";
//		
//		for (Database database: databases) {
//			String json = "{";
////			json += "\"name\":\"" + database.getName() + "\",";
////			json += "\"url\":\"" + database.getUrl() + "\"";
//			json += "},";
//			output += json;
//		}
//		output += "]}";
//
//		response.getOutputStream().println(output);
//		
//		// if not found:
//		response.sendError(404);
//		response.getOutputStream().println("{ \"error\": \"Database not found.\"}");
		return "";
	}
}
