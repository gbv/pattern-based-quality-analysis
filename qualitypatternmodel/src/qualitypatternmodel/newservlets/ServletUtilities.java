package qualitypatternmodel.newservlets;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;
//import qualitypatternmodel.execution.Database;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;
//import qualitypatternmodel.utility.EMFModelSave;

public abstract class ServletUtilities {

	static public String PATTERNFOLDER = "serverpatterns";
	static public String CONSTRAINTFOLDER = "concrete-patterns";
	static public String TEMPLATEFOLDER = "abstract-patterns";
	static public String EXTENSION = "patternstructure";
	static public String XML = "xml";
	static public String RDF = "rdf";
	static public String NEO4J = "neo4j";
	static public List<String> TECHS = List.of(XML, RDF, NEO4J);
	static public String LVLALL = "all";
	static public String LVLTEMPLATE = "template";
	static public String LVLCONSTRAINT = "concrete";
	static public String LVLREADY = "ready";
	static public List<String> LEVELS = List.of(LVLALL, LVLTEMPLATE, LVLCONSTRAINT, LVLREADY);
	static public String SAVEFILE = PATTERNFOLDER + "/savefile";
	
	// Pattern request
	
	public static List<CompletePattern> getAllPattern(ServletContext context, String technology) {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		List<CompletePattern> astr = loadAbstractPattern(context, technology);
		List<CompletePattern> conc = getReadyConstraints(context, technology);
		if (astr!=null)
			patterns.addAll(astr);
		if (conc!=null)
			patterns.addAll(conc);
		return patterns;
	}
	
	public static List<CompletePattern> getTemplates(ServletContext context, String technology) {
		return loadAbstractPattern(context, technology);
	}

	public static List<CompletePattern> getConstraints(ServletContext context, String technology) {
		return loadAllPatternInstances(context, technology);
	}
	
	public static List<CompletePattern> getReadyConstraints(ServletContext context, String technology) {
		List<CompletePattern> concrete = new BasicEList<CompletePattern>();
		List<CompletePattern> semiconcrete = loadAllPatternInstances(context, technology);
		if (semiconcrete != null)
			for (CompletePattern semi: semiconcrete) {
				try {
					semi.isValid(AbstractionLevel.CONCRETE);
					concrete.add(semi);
				} catch (Exception e) {}
			}
		return concrete;
	}
	
	// Pattern instantiation
	
//	public static CompletePattern instantiateAbstractPattern(String technology, String abstractId, String concreteId) throws IOException {
//		CompletePattern pattern = EMFModelLoad.loadAbstractPattern(technology, abstractId);
//		pattern.setPatternId(concreteId);
//		EMFModelSave.exportToFile2(pattern, technology, concreteId, EXTENSION);
//		return pattern;
//	}
	
//	public static CompletePattern copyConcretePattern(String technology, String concretePattern, String concretePatternName) throws IOException {
//		CompletePattern pattern = EMFModelLoad.loadConcretePattern(technology, concretePattern);
//		pattern.setPatternId(concretePatternName);
//		EMFModelSave.exportToFile2(pattern, technology, concretePatternName, EXTENSION);
//		return pattern;
//	}
	
	public static void deleteConstraint(ServletContext servletContext, String technology, String constraintId) throws IOException {
		String patternpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER + "/" + constraintId + "." + EXTENSION;
		patternpath = servletContext.getRealPath(patternpath);
		
		CompletePattern constraint = EMFModelLoad.loadCompletePattern(patternpath);
		if (constraint instanceof CompletePattern)
			Files.delete(Paths.get(patternpath));
		else {
			throw new IOException("Wrong file format");
		}
	}
	
	// database (not needed anymore!)
//	public static void saveDatabase(String technology, String dbname, String URL, String user, String password) {
//		// TODO
//	};
//	public static Database loadDatabase(String technology, String name) {
//		// TODO
//		return null;
//	};
//	public static List<Database> loadDatabases(String technology) {
//		// TODO
//		return null;
//	};
//	public static void deleteDatabase(String technology, String name) {
//		// TODO
//	};
	
	// pattern modification
	
//	abstract public void setDatabase(String patternName, String databaseName);
//	abstract public void setParameter(String patternName, int parameterIndex, String value);
	
	// pattern execution
	
//	abstract public String executePattern(String pattern);
//	protected static String[] executePattern(CompletePattern pattern) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	// ---------------
	
	
	private static List<CompletePattern> abstractPatternXml = null;
	private static List<CompletePattern> abstractPatternRdf = null;
	private static List<CompletePattern> abstractPatternNeo = null;
	
	private static List<CompletePattern> loadAbstractPattern(ServletContext context, String technology) {
		String path = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER;
		try {
			abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
			switch(technology) {
			case "xml": {
				if (abstractPatternXml == null)
					abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
				return abstractPatternXml;
			}				
			case "rdf":{
				if (abstractPatternRdf == null)
					abstractPatternRdf = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
				return abstractPatternRdf;
			}
				
			case "neo4j": {
				if (abstractPatternNeo == null)
					abstractPatternNeo = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
				return abstractPatternNeo;
			}	
			default:
				return null;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static List<CompletePattern> loadAllPatternInstances(ServletContext context, String technology) {
		try {
			if (TECHS.contains(technology))
				return EMFModelLoad.loadCompletePatternFromFolder(context, PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER, EXTENSION);
			else return null;
//			switch(technology) {
//			case "xml":
//			case "rdf":
//				return EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/rdf/concrete-patterns", EXTENSION);
//			case "neo4j":
//				return EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/neo4j/concrete-patterns", EXTENSION);
//			default:
//				return null;
//			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static JSONObject getPatternJSON(List<CompletePattern> patterns) {
		JSONObject json = new JSONObject();
		try {
			JSONArray templates = new JSONArray();
			for (CompletePattern pattern: patterns) {
				templates.put(getPatternJSON(pattern));
			}
			json.put("templates", templates);
		} catch (JSONException e) {}
		return json;
		
//		String result = "{\"Templates\": [ ";
//		for (CompletePattern pattern: patterns) {
//			result += getPatternJSON(pattern);
//		}
//		return result += "]}"; // templatelist end
	}
	
	public static JSONObject getPatternJSON(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put("patternID", pattern.getPatternId());
			json.put("name", pattern.getName());
			json.put("shortDescription", pattern.getShortDescription());
			json.put("description", pattern.getDescription());
			if (pattern.getDatabaseName() != null)
				json.put("database", pattern.getDatabaseName());
			if (pattern.getDataModelName() != null)
				json.put("datamodel", pattern.getDataModelName());
			if (pattern.getKeywords() != null && !pattern.getKeywords().isEmpty()) {
				JSONArray tags = new JSONArray(pattern.getKeywords());
				json.put("tag", tags);
			}
			
			try {
				pattern.isValid(AbstractionLevel.CONCRETE);
				json.put("executable", true);	
			} catch (Exception e) {
				json.put("executable", false);
			}
			
			JSONArray variants = new JSONArray();
			for (PatternText text: pattern.getText()) {
				variants.put(text.generateJSONObject());
			}
			json.put("variants", variants);
		} catch (JSONException e) {}
//		String json = "{";
//		json += "\"patternID\": \""+ pattern.getPatternId() + "\", ";
//		json += "\"name\": \""+ pattern.getName() + "\", ";
//		json += "\"patternDescShort\": \"" + pattern.getShortDescription() + "\", ";
//		json += "\"patternDesc\": \""+ pattern.getDescription() +"\",";
//		json += "\"database\": \""+ pattern.getDatabaseName() +"\",";
//		json += "\"datamodel\": \""+ pattern.getDataModelName() +"\",";
//		List<String> keywords = pattern.getKeywords();
//		String keywordsString = "\"keywords\": [";
//        for (int i = 0; i < keywords.size(); i++) {
//        	keywordsString += "\"" + keywords.get(i) + "\"";
//            if (i < keywords.size() - 1) {
//            	keywordsString += ",";
//            }
//        }
//        keywordsString += "], ";
//		json += keywordsString;
//		json += "\"variants\": [";
//		
//		List<PatternText> texts = pattern.getText();
//		for (int i = 0; i<texts.size(); i++) {
//			if (i>0)
//				json += ", ";
//			json += texts.get(i).generateJSON();
//		}
//		json += "]}"; // variant end and template end
		return json;
	}
	
	public static String getPatternJSONHeads(List<CompletePattern> patterns) {
		JSONArray jsonarray = new JSONArray();
		for (CompletePattern pattern: patterns) {
			jsonarray.put(getPatternJSONHead(pattern));
		}
		return jsonarray.toString();
//		String json = "{";
//		json += "\"patternID\": \""+ pattern.getPatternId() + "\", ";
//		json += "\"name\": \""+ pattern.getName() + "\", ";
//		json += "\"patternDescShort\": \"" + pattern.getShortDescription() + "\", ";
//		json += "\"patternDesc\": \""+ pattern.getDescription() +"\",";
//		json += "\"database\": \""+ pattern.getDatabaseName() +"\",";
//		json += "\"datamodel\": \""+ pattern.getDataModelName() +"\",";
//		List<String> keywords = pattern.getKeywords();
//		String keywordsString = "\"keywords\": [";
//        for (int i = 0; i < keywords.size(); i++) {
//        	keywordsString += "\"" + keywords.get(i) + "\"";
//            if (i < keywords.size() - 1) {
//            	keywordsString += ",";
//            }
//        }
//        keywordsString += "], ";
//		json += keywordsString;
//		json += "\"variants\": [";
//		
//		List<PatternText> texts = pattern.getText();
//		for (int i = 0; i<texts.size(); i++) {
//			if (i>0)
//				json += ", ";
//			json += texts.get(i).generateJSON();
//		}
//		json += "]}"; // variant end and template end
//		return json;
//		String result = "[";
//		for (CompletePattern pattern: patterns) {
//			result += "{\"patternID\":\"" + pattern.getPatternId() + "\", \"name\":\"" + pattern.getName() + "\", \"description\":\"" + pattern.getDescription() + "\"}, ";
//		}
//		return result += "]";
	}
	
	public static JSONObject getPatternJSONHead(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put("patternID", pattern.getPatternId());
			json.put("name", pattern.getName());
			json.put("shortDescription", pattern.getShortDescription());
			json.put("description", pattern.getDescription());
		} catch (JSONException e) {}
		return json;
		
	}

	protected static CompletePattern loadConstraint(ServletContext servletContext, String technology, String name) throws IOException {
		String patternpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER + "/" + name + "." + EXTENSION;
		patternpath = servletContext.getRealPath(patternpath);
		return EMFModelLoad.loadCompletePattern(patternpath);
	};

	protected static CompletePattern loadTemplate(ServletContext servletContext, String technology, String templateId) throws IOException {
		String folderPath = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER;
		String absoluteFolderPath = servletContext.getRealPath(folderPath);
		return EMFModelLoad.loadCompletePattern(absoluteFolderPath, templateId, EXTENSION);
	};

	public static void saveConstraint(ServletContext servletContext, String technology, String constraintId, CompletePattern pattern) throws IOException {
		String folderpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER;
		String absoluteFolderPath = servletContext.getRealPath(folderpath);
		EMFModelSave.exportToFile2(pattern, absoluteFolderPath, constraintId, EXTENSION);
	}
	
	public static String generateNewId(ServletContext servletContext, String technology, String templateId, String variantname) throws IOException {
		String name = technology + "_" + templateId + "_" + variantname;
		String filepath = servletContext.getRealPath(SAVEFILE);
		Integer number;
		try {
			number = getNextNumber(filepath, name);
		} catch (JSONException | IOException e) {
			number = 0;
		}
		return name + "_" + number;
	}
	
	public static Integer getNextNumber(String filepath, String variableName) throws JSONException, IOException {
        File file = new File(filepath);
        if (!file.exists()) {
            // If the file doesn't exist, create it and initialize with an empty JSON object
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(variableName, 0);
            Files.write(Paths.get(filepath), jsonObject.toString().getBytes());
            System.out.println("File created successfully: " + filepath);
            return 0; // Return 0 as the initial value
        }

        // Read JSON file
        String jsonString = new String(Files.readAllBytes(Paths.get(filepath)));
        JSONObject jsonObject = new JSONObject(jsonString);

        // Retrieve the value associated with the provided variable name
        int currentValue;
        if (!jsonObject.has(variableName) || !(jsonObject.get(variableName) instanceof Integer)) {
            // If variable doesn't exist or is not an integer, initialize it with a default value
            currentValue = 0;
            jsonObject.put(variableName, currentValue);
            Files.write(Paths.get(filepath), jsonObject.toString().getBytes());
        } else {
            currentValue = jsonObject.getInt(variableName);
        }

        // Increment the value
        int newValue = currentValue + 1;

        // Update the JSON with the new value
        jsonObject.put(variableName, newValue);
        Files.write(Paths.get(filepath), jsonObject.toString().getBytes());

        return newValue;
	}
}
