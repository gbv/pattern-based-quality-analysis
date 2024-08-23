package newservelettest.xmlapitests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.newservlets.ConstraintCopyServlet;
import qualitypatternmodel.newservlets.ConstraintDataModelServlet;
import qualitypatternmodel.newservlets.ConstraintDatabaseServlet;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.newservlets.ConstraintMqafServlet;
import qualitypatternmodel.newservlets.ConstraintNameServlet;
import qualitypatternmodel.newservlets.ConstraintQueryServlet;
import qualitypatternmodel.newservlets.ConstraintServlet;
import qualitypatternmodel.newservlets.ConstraintTagServlet;
import qualitypatternmodel.newservlets.InitialisationServlet;
import qualitypatternmodel.newservlets.PatternListServlet;
import qualitypatternmodel.newservlets.TemplateInstantiateServlet;
import qualitypatternmodel.newservlets.TemplateVariantServlet;

public class FullAPITest {
	private static String FOLDER;
	private static String TECH = "xml";

	public static void main(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		initialize();

		testBasics();
		testConstraintCopyServlet();
		testConstraintDatabaseServlet();
		testConstraintDataModelServlet();
		testConstraintTagServlet();
		testConstraintNameServletPost();

		testConstraintServletPost();
		testPatternListServletGet();

//		testConstraintMqafServlet();
//		testConstraintMqafServletPost();
//		testConstraintQueryServlet();
//		testConstraintExecuteServletGet();

//		testTemplateVariantServletGet();
//		testTemplateVariantServletDelete();
//		testTemplateVariantServletPut();
		close();
	}

	@BeforeClass
	public static void initialize()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		FOLDER = new File(".").getCanonicalPath().replace('\\', '/') + "/temp_" + UUID.randomUUID();
		System.out.println("Create: " + FOLDER);
		ServletContext context = mock(ServletContext.class);
		doAnswer(invocation -> {
			String argument = invocation.getArgument(0);
			if (argument.startsWith("/")) {
				return FOLDER + argument;
			} else {
				return FOLDER + argument;
			}
		}).when(context).getRealPath(anyString());
		InitialisationServlet.initialisation(context);
	}

	@AfterClass
	public static void close() throws IOException {
		System.out.println("Delete: " + FOLDER);
		FileUtils.deleteDirectory(new File(FOLDER));
	}

	private static Map<String, String[]> getEmptyParams() {
		return new HashMap<String, String[]>();
	}

	@Test
	private static void testBasics()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constriantID = newConstraint();
		assertNotNull(constriantID);

		JSONObject constraint = getConstraint(constriantID);
		assertPatternJSONObject(constraint);
		deleteConstraint(constriantID);
		assertThrows(FailedServletCallException.class, () -> {
			getConstraint(constriantID);
		});
		assertThrows(FailedServletCallException.class, () -> {
			deleteConstraint(constriantID);
		});
	}

//	TemplateInstantiateServlet Put
	private static String newConstraint()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return newConstraint("Match_xml", "default-antipattern");
	}

	private static String newConstraint(String pattern, String variant)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		JSONObject ob = TemplateInstantiateServlet.applyPut("/" + TECH + "/" + pattern + "/" + variant,
				getEmptyParams());
		try {
			return ob.getString("constraintID");
		} catch (JSONException e) {
			return null;
		}
	}

//	ConstraintServlet Get
	private static JSONObject getConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		return ConstraintServlet.applyGet("/" + TECH + "/" + id, getEmptyParams());
	}

//	ConstraintServlet Delete
	private static void deleteConstraint(String id)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintServlet.applyDelete("/" + TECH + "/" + id, getEmptyParams());
	}


	private static void assertPatternJSONObjectArray (JSONArray object) {
        for (int i = 0; i < object.length(); i++)
        	assertPatternJSONObject(object.getJSONObject(i));
	}
	
	private static void assertPatternJSONObject (JSONObject object) {
		assert (object.has("name"));
		assert (object.has("constriantID"));
		assert (object.has("variants"));
		assert (object.has("description"));
		assert (object.has("language") && object.getString("language").equals(TECH));
		assert (object.has("executable"));
		assert (object.has("mqafExecutable"));
		assert (object.has("queryExecutable"));
		assert (object.has("filterExecutable"));
		assert (object.has("lastSaved"));
	}

	@Test
	private static void testConstraintCopyServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		JSONObject jsonDefault = getConstraint(constraintID);

		JSONObject jsonCopy = ConstraintCopyServlet.applyPut("/" + TECH + "/" + constraintID, getEmptyParams());
		String constraintIDCopy = null;
		try {
			constraintIDCopy = jsonCopy.getString("constraintID");
			jsonDefault.remove("constraintID");
			jsonDefault.put("constraintID", constraintIDCopy);
			assert (jsonDefault.similar(jsonCopy));

			deleteConstraint(constraintID);
			deleteConstraint(constraintIDCopy);
		} catch (JSONException e) {
			assert (false);
		}
	}

	@Test
	private static void testConstraintDatabaseServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String dbname1 = "db";
		String dbname2 = "db2";

		JSONObject nodb = ConstraintDatabaseServlet.applyGet("/" + TECH + "/" + constraintID, getEmptyParams());
		assert (!nodb.has("database"));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("database", new String[] { dbname1 });
		JSONObject db1 = ConstraintDatabaseServlet.applyPost("/" + TECH + "/" + constraintID, params1);
		assert (db1.has("constraintID") && db1.getString("constraintID").equals(constraintID));
		assert (db1.has("database") && db1.getString("database").equals(dbname1));
		assert (!db1.has("oldDatabase"));
		assert (db1.has("lastSaved"));

		JSONObject db1get = ConstraintDatabaseServlet.applyGet("/" + TECH + "/" + constraintID, getEmptyParams());
		assert (db1get.has("database") && db1get.getString("database").equals(dbname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put("database", new String[] { dbname2 });
		JSONObject db2 = ConstraintDatabaseServlet.applyPost("/" + TECH + "/" + constraintID, params2);
		assert (db2.has("constraintID") && db2.getString("constraintID").equals(constraintID));
		assert (db2.has("database") && db2.getString("database").equals(dbname2));
		assert (db2.has("oldDatabase") && db2.getString("oldDatabase").equals(dbname2));
		assert (db2.has("lastSaved"));

		JSONObject db2get = ConstraintDatabaseServlet.applyGet("/" + TECH + "/" + constraintID, getEmptyParams());
		assert (db2get.has("database") && db2get.getString("database").equals(dbname2));

		deleteConstraint(constraintID);
	}

	@Test
	private static void testConstraintDataModelServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String dmname1 = "dm";
		String dmname2 = "dm2";

		JSONObject nodm = ConstraintDatabaseServlet.applyGet("/" + TECH + "/" + constraintID, getEmptyParams());
		assert (!nodm.has("datamodel"));

		Map<String, String[]> params1 = getEmptyParams();
		params1.put("datamodel", new String[] { dmname1 });
		JSONObject dm1 = ConstraintDataModelServlet.applyPost("/" + TECH + "/" + constraintID, params1);
		assert (dm1.has("constraintID") && dm1.getString("constraintID").equals(constraintID));
		assert (dm1.has("datamodel") && dm1.getString("datamodel").equals(dmname1));
		assert (!dm1.has("oldDatamodel"));
		assert (dm1.has("lastSaved"));

		JSONObject dm1get = ConstraintDataModelServlet.applyGet("/" + TECH + "/" + constraintID, getEmptyParams());
		assert (dm1get.has("datamodel") && dm1get.getString("datamodel").equals(dmname1));

		Map<String, String[]> params2 = getEmptyParams();
		params2.put("datamodel", new String[] { dmname2 });
		JSONObject dm2 = ConstraintDataModelServlet.applyPost("/" + TECH + "/" + constraintID, params2);
		assert (dm2.has("constraintID") && dm2.getString("constraintID").equals(constraintID));
		assert (dm2.has("datamodel") && dm2.getString("datamodel").equals(dmname2));
		assert (dm2.has("oldDatamodel") && dm2.getString("oldDatamodel").equals(dmname1));
		assert (dm2.has("lastSaved"));

		JSONObject db2get = ConstraintDataModelServlet.applyGet("/" + TECH + "/" + constraintID, getEmptyParams());
		assert (db2get.has("datamodel") && db2get.getString("datamodel").equals(dmname2));

		deleteConstraint(constraintID);
	}

	@Test
	private static void testConstraintTagServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String[] lst = new String[] {UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString()};  
		Map<String, String[]> params1 = getEmptyParams();
		params1.put("tag", new String[] { lst[0], lst[1], lst[2] });
		Map<String, String[]> params2 = getEmptyParams();
		params2.put("tag", new String[] { lst[1], lst[2], lst[3] });
		Map<String, String[]> params3 = getEmptyParams();
		params3.put("tag", lst);
		Map<String, String[]> params4 = getEmptyParams();
		params4.put("tag", lst);

		JSONObject tags1 = ConstraintTagServlet.applyPost("/" + TECH + "/" + constraintID, params1);
		assert (tags1.has("success")
				&& tags1.getJSONArray("success").similar(new JSONArray(new String[] { "a", "b", "c" })));
		assert (!tags1.has("failed"));

		JSONObject tags2 = ConstraintTagServlet.applyDelete("/" + TECH + "/" + constraintID, params2);
		assert (tags2.has("success")
				&& tags1.getJSONArray("success").similar(new JSONArray(new String[] { "b", "c" })));
		assert (tags2.has("failed") && tags1.getJSONArray("failed").similar(new JSONArray(new String[] { "d" })));

		JSONObject tags3 = ConstraintTagServlet.applyPost("/" + TECH + "/" + constraintID, params3);
		assert (tags3.has("success")
				&& tags1.getJSONArray("success").similar(new JSONArray(new String[] { "b", "c", "d" })));
		assert (tags3.has("failed") && tags1.getJSONArray("failed").similar(new JSONArray(new String[] { "a" })));

		JSONObject tags4 = ConstraintTagServlet.applyDelete("/" + TECH + "/" + constraintID, params4);
		assert (tags4.has("success")
				&& tags1.getJSONArray("success").similar(new JSONArray(new String[] { "a", "b", "c", "d" })));
		assert (!tags4.has("failed"));

		deleteConstraint(constraintID);
	}

	@Test
	private static void testConstraintNameServletPost()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintID = newConstraint();
		String newName = UUID.randomUUID().toString();
		JSONObject json = getConstraint(constraintID);
		assert (json.has("name") && !json.getString("name").equals(newName));
		Map<String, String[]> param = getEmptyParams();
		param.put("name", new String[] { "newName" });
		ConstraintNameServlet.applyPost("/" + TECH + "/" + constraintID, param);
		JSONObject jsonNamed = getConstraint(constraintID);
		assert (jsonNamed.has("name") && jsonNamed.getString("name").equals(newName));
		deleteConstraint(constraintID);
	}

	@Test
	private static void testConstraintServletPost()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		String constraintId = newConstraint();
		
		Map<String, String[]> params1 = getEmptyParams();
		params1.put("database", new String[]{"value"});
		params1.put("datamodel", new String[]{"value"});
		String uuidstring = UUID.randomUUID().toString();
		params1.put(uuidstring, new String[]{"value"});
		JSONObject get1 = ConstraintServlet.applyPost("/" + TECH + "/" + constraintId, params1);
		assert(get1.has("success") && get1.getJSONArray("success").similar(new JSONArray(new String[] {"datamodel", "database"})));
		assert(get1.has("failed") && get1.getJSONArray("failed").similar(new JSONArray(new String[] {"uuidstring"})));
		assert(get1.has("available") && get1.getJSONArray("available").toList().containsAll(Arrays.asList("database", "datamodel", "namespaces", "name")));
		assert(get1.has("lastSaved"));
		
		JSONObject get = getConstraint(constraintId);
		assert (get.has("database") && get.getString("database").equals("value"));
		assert (get.has("datamodel") && get.getString("datamodel").equals("value"));
		
		deleteConstraint(constraintId);
	}

	@Test
	private static void testPatternListServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		// template
		JSONObject listTemplate = PatternListServlet.applyGet("/" + TECH + "/template", getEmptyParams());
		int templateNo = new File(FOLDER + "/templates/" + TECH + "/abstract-patterns").listFiles().length;
		assert (templateNo > 0);
		assert (listTemplate.has("size") && listTemplate.getInt("size") == templateNo);
		assert (listTemplate.has("ids") && listTemplate.getJSONArray("ids").length() == templateNo);
		assert (listTemplate.has("templates") && listTemplate.getJSONArray("templates").length() == templateNo);
		if (listTemplate.has("templates"))
			assertPatternJSONObjectArray(listTemplate.getJSONArray("templates"));

		JSONObject listConcreteEmpty = PatternListServlet.applyGet("/" + TECH + "/concrete", getEmptyParams());
		assert(listConcreteEmpty.getInt("size") == 0);
		assert (listConcreteEmpty.has("ids") && listConcreteEmpty.getJSONArray("ids").isEmpty());
		assert (listConcreteEmpty.has("templates") && listConcreteEmpty.getJSONArray("templates").isEmpty());

		JSONObject listReadyEmpty = PatternListServlet.applyGet("/" + TECH + "/ready", getEmptyParams());
		assert(listReadyEmpty.getInt("size") == 0);
		assert (listReadyEmpty.has("ids") && listReadyEmpty.getJSONArray("ids").isEmpty());
		assert (listReadyEmpty.has("templates") && listReadyEmpty.getJSONArray("templates").isEmpty());

		ArrayList<String> ids = new ArrayList<String>();
		int n = 10;
		for ( int i = 0; i< n; i++)
			ids.add(newConstraint());

		JSONObject listReady = PatternListServlet.applyGet("/" + TECH + "/ready", getEmptyParams());
		assert(listReady.getInt("size") == n);
		assert (listReady.has("ids") && listReady.getJSONArray("ids").length() == n);
		assert (listReady.has("templates") && listReady.getJSONArray("templates").length() == n);
		if (listReady.has("templates"))
			assertPatternJSONObjectArray(listReady.getJSONArray("templates"));
		
		for (String str: ids)
			deleteConstraint(str);
	}

	@Test
	private static void testConstraintMqafServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintMqafServlet.applyGet2(null, getEmptyParams());
		ConstraintMqafServlet.applyGet3(null, getEmptyParams());
	}

	@Test
	private static void testConstraintMqafServletPost()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintNameServlet.applyPost(null, getEmptyParams());
	}

	@Test
	private static void testConstraintQueryServlet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintQueryServlet.applyGet2(null, getEmptyParams());
		ConstraintQueryServlet.applyGet3(null, getEmptyParams());
	}

	@Test
	private static void testConstraintExecuteServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		ConstraintExecuteServlet.applyGet(null, getEmptyParams());
	}

	@Test
	private static void testTemplateVariantServletGet()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		TemplateVariantServlet.applyGet(null, getEmptyParams());
	}

	@Test
	private static void testTemplateVariantServletDelete()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		TemplateVariantServlet.applyDelete(null, getEmptyParams());
	}

	@Test
	private static void testTemplateVariantServletPut()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		TemplateVariantServlet.applyPut(null, getEmptyParams());
	}
}
