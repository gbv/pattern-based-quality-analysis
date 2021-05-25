package qualitypatternmodel.servlettests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConcretePatternListServletTest {
	public static void main(String[] args) throws IOException {
		doGetTest();
	}

	public static void doGetTest() throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8081/qualitypatternmodel/concrete-patterns").openConnection();
		connection.setRequestMethod("GET");
		
		int responseCode = connection.getResponseCode();
		
		ServletTestsUtil.printResult(connection, responseCode);

	}
}
