package qualitypatternmodel.cyphertranslationtests;

import static qualitypatternmodel.xmltranslationtests.Test00.replace;

import java.util.ArrayList;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.CypherSpecificConstants;

public abstract class CypherTranslationAbstract implements CypherTranslationeInterface {
	public static final String BEGIN_TESTS = "<<< BEGIN - Tests >>>";
	public static final String END_TESTS = "<<< END - Tests >>>";
	public static final String TEST_SUCCESSFUL = "Test successful";
	public static final String BEGINNING_OF_THE_EXCEPTIONS_TESTS = "-- Beginning of the Exceptions --";
	public static final String END_OF_THE_EXCEPTION_TESTS = "<<< END - Exception Tests >>>";
	public static final String NO_EXCEPTION_HAS_BEEN_TRIGGERED = "No Exception has been triggered";
	public static final String TRANSLATION = "\n___TRANSLATION___";
	public static final String PATTERN_VALID = "\n\n___PATTERN_(VALID)___";
	public static final AdaptionNeo4JFactory NEO_FACTORY = new AdaptionNeo4JFactoryImpl();
	public static final String END_BUILD_PATTERN_EXCEPTIONS = "<<< END - Build-Pattern-Exceptions >>>";
	public static final String BEGIN_BUILD_PATTERN_EXCEPTIONS = "<<< BEGIN - Build-Pattern-Exceptions >>>";
	public static final String END_SPECIFIC_TESTS = "<<< END - Specific Tests >>>";
	public static final String BEGIN_SPECIFIC_TESTS = "<<< BEGIN - Specific Tests >>>";
	
	public static void exceptionTestHandler(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			try {
				replace(completePattern);
				System.out.println(PATTERN_VALID);
				System.out.println(completePattern.myToString());
				System.out.print(TRANSLATION);
				System.out.println(completePattern.generateCypher());
				System.out.println(NO_EXCEPTION_HAS_BEEN_TRIGGERED);
			} catch (Exception e) {
				System.out.println("");
				System.out.println(BEGINNING_OF_THE_EXCEPTIONS_TESTS);
				System.out.println(e.toString());
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					System.out.println(e2.toString());
				}
				System.out.println(TEST_SUCCESSFUL);
			}
		}
	}

	//Look at this that not so much redundancy exists
	public static void testAllCompletePatterns(ArrayList<CompletePattern> completePatterns, Boolean withDb, Boolean printQuery) {
			try (Java2Neo4JConnector connector = new Java2Neo4JConnector()) {
				for (CompletePattern completePattern : completePatterns) {
					replace(completePattern);
					try {
						System.out.println(PATTERN_VALID);
						System.out.println(completePattern.myToString());
						System.out.print(TRANSLATION);
						String query = completePattern.generateCypher();
						checkForNullInMatchAndReturn(query);
						
						//Depending on the test mode activated the db-connector
						if (printQuery) {
							System.out.println(query); 
						}
						
						//Include the null check for the results
						if (withDb) {
							String hashCode = query.hashCode() + "";
							connector.queryTester(query, hashCode, true);							
						}
					} catch (Exception e) {
						System.out.println();
						e.printStackTrace();
						try {
						  System.out.println(completePattern.myToString());
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}
				}
			}
		}

	protected static void checkForNullInMatchAndReturn(String query) throws InvalidityException {
		//Test for null in MATCH
		String matchString = query.substring(query.indexOf(CypherSpecificConstants.CLAUSE_MATCH), query.indexOf(TestSuiteTranslationTests.NEWLINE));
		if (matchString.toLowerCase().contains(TestSuiteTranslationTests.NULL)) {
			throw new InvalidityException(TestSuiteTranslationTests.THE_MATCH_CLAUSE_CONTAINS_NULL);
		}
		matchString = null;						
		
		//Test for null in RETURN
		String returnString = query.substring(query.indexOf(CypherSpecificConstants.CLAUSE_RETURN));
		if (returnString.toLowerCase().contains(TestSuiteTranslationTests.NULL)) {
			throw new InvalidityException(TestSuiteTranslationTests.THE_RETURN_CLAUSE_CONTAINS_NULL);
		}
		returnString  = null;
	}

	public void generalizedInvalidtyExceptionTests()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		buildInvalidityExceptionPatterns(completePatternsExceptions);
		if (completePatternsExceptions.size() != 0) {
			System.out.println("");
			System.out.println(CypherTranslationAbstract.BEGIN_BUILD_PATTERN_EXCEPTIONS);		
			CypherTranslationAbstract.exceptionTestHandler(completePatternsExceptions);
			System.out.println(CypherTranslationAbstract.END_BUILD_PATTERN_EXCEPTIONS);
			System.out.println("");
		}
	}

	public void generalizedTests()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		buildPatterns(completePatterns);
		if (completePatterns.size() != 0) {
		    System.out.println("");
		    System.out.println(CypherTranslationAbstract.BEGIN_TESTS);
			CypherTranslationAbstract.testAllCompletePatterns(completePatterns, true, true);
		    System.out.println(CypherTranslationAbstract.END_TESTS);
		    System.out.println("");
		}
	}
}
