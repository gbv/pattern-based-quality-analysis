package qualitypatternmodel.servlettests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.servlets.Util;
import qualitypatternmodel.utility.EMFModelLoad;

public class AbstractPatternInstantiationServletTest {
	
	private static final String PATTERN_NAME = "test_card";
	
	@After
	public void deletePattern() throws IOException {			
//		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_DELETION_ENDPOINT + PATTERN_NAME).openConnection();
//		connection.setRequestMethod("DELETE");		
//		int responseCode = connection.getResponseCode();
//		assertTrue(responseCode >= 200 && responseCode < 300);
	}

	@Test
	public void doPostTest() throws IOException, JSONException {
		String abstractPatternName = "card_abstract";
		String textName = "test_text";
		HttpURLConnection connection = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.INSTANTIATION_ENDPOINT + abstractPatternName + "/" + textName).openConnection();
		connection.setRequestMethod("POST");
		
		String parameters = "name=" + URLEncoder.encode(PATTERN_NAME);
		
		connection.setDoOutput(true);
	    OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
	    wr.write(parameters);
	    wr.flush();
		
		int responseCode = connection.getResponseCode();
//		System.out.println(responseCode);
//		System.out.println(ServletTestsUtil.getResult(connection));
		assertTrue(responseCode >= 200 && responseCode < 300);

//		String result = ServletTestsUtil.getResult(connection);		
//		ServletTestsUtil.printResult(connection, responseCode, result);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpURLConnection connection2 = (HttpURLConnection) new URL(ServletTestsUtil.PATH_PREFIX + Util.CONCRETE_PATTERN_LIST_ENDPOINT).openConnection();
		connection2.setRequestMethod("GET");
		
		int responseCode2 = connection2.getResponseCode();
		assertTrue(responseCode2 >= 200 && responseCode < 300);
		
		String result2 = ServletTestsUtil.getResult(connection2);		
		
		JSONArray array = new JSONArray(result2);
		List<String> list = ServletTestsUtil.JSONArrayToList(array);
		
		assertTrue(list.contains(PATTERN_NAME));
			
		 			

	}
	
}
