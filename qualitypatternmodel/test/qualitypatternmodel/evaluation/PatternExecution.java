package qualitypatternmodel.evaluation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.core.cmd.Open;
import org.basex.core.cmd.XQuery;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.testutilityclasses.EMFModelLoad;
import qualitypatternmodel.testutilityclasses.EMFValidationPreparation;

public class PatternExecution {
	static Context context;
	
	/**
	 * Creates a BaseX database from the XML data located at the provided file path.
	 * @param databaseName the name of the newly created BaseX database
	 * @param dataPath the path where the XML data can be found
	 */
	static void createDatabase(String databaseName, String dataPath) {
		context = new Context();
		try {
			new CreateDB(databaseName, dataPath).execute(context);
		} catch (BaseXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Executes a pattern on the existing BaseX database with the provided name
	 * @param pattern the pattern to be executed
	 * @param databaseName the name of the existing BaseX database
	 */
	static void execute(CompletePattern pattern, String databaseName) {        
        try {
			pattern.isValid(AbstractionLevel.CONCRETE);
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			String query = pattern.generateQuery();
			System.out.println(query);
			new Open(databaseName).execute(context);
		
			List<String> queryResult = new ArrayList<String>();
			Date startDate = new Date();
			
		    try(QueryProcessor proc = new QueryProcessor(query, context)) {		    
		    	Iter iter = proc.iter();
			  	for(Item item; (item = iter.next()) != null;) {
			  		queryResult.add(item.serialize().toString());
		        }
			  	
			  	Date endDate = new Date();
		    	long runtime = endDate.getTime() - startDate.getTime();
		    	System.out.println("\nruntime = " + runtime + " ms");
		    	System.out.println("\nnumber of problems detected = " + queryResult.size());
		    } catch (QueryException | QueryIOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (BaseXException | InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
