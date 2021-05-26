package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Test;

import qualitypatternmodel.servlets.Util;

public class AbstractPatternListServletTest {


	@Test
	public void doGetTest() throws IOException, JSONException {
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.ABSTRACT_PATTERN_LIST_ENDPOINT).openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		assertTrue(responseCode >= 200 && responseCode < 300);
		
		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);		
		
		JSONArray array = new JSONArray(result);
		List<String> list = ServletTestsUtil.JSONArrayToList(array);
		
		assertTrue(list.contains("card_abstract"));		 	     

	}
	
	
}
