package qualitypatternmodel.cyphertranslationtests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static qualitypatternmodel.xmltranslationtests.Test00.replace;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import playground.Java2Neo4JConnector;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.CypherSpecificConstants;

@TestInstance(Lifecycle.PER_CLASS)
public class TestSuiteTranslationTests {
	private static final String NEWLINE = "\n";
	private static final String NULL = "null";
	private static final String THE_RETURN_CLAUSE_CONTAINS_NULL = "The RETURN-CLAUSE contains null";
	private static final String DIFFRENT_OTHER_EXCEPTIONS = "Diffrent other Exceptions";
	private static final String EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION = "NOT ALL INVALIDTIY EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	private static final String EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION = "NOT ALL UNSUPPORTED MESSAGE EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	private static final String THE_MATCH_CLAUSE_CONTAINS_NULL = "The MATCH-CLAUSE contains null";
	private ArrayList<CompletePattern> completePatterns;
	
	@BeforeAll
	public void beforeClassFunction(){
		completePatterns = new ArrayList<CompletePattern>();
    }
	
	@AfterEach
	public void afterEachFunction(){
		completePatterns.clear();
    }
	
	@AfterAll
	public void afterAllFunction(){
		completePatterns = null;
    }
	
	@Test
	public void CypherTest00() {		
		assertDoesNotThrow(() -> {CypherTest00.buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void CypherTest01NeoEdge() {		
		assertDoesNotThrow(() -> {CypherTest01NeoEdge.buildPatterns(completePatterns); 
			tester(completePatterns);});
	}
	
	
	@Test
	public void CypherTest01NeoEdgeExceptions() {		
		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.buildInvalidateExceptionPatterns(completePatterns);
				for (CompletePattern cp : completePatterns) exceptionHandler(cp);},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
				//Add additional Exceptions,
				}, 
				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
//		assertThrows(Exception.class, () -> {//Add additional Exceptions
//			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	@Test
	public void CypherTest01NeoPropertyEdge() {		
		assertDoesNotThrow(() -> {CypherTest01NeoPropertyEdge.buildPatterns(completePatterns); 
			tester(completePatterns);});
	}
	
	@Test
	public void CypherTest01NeoPropertyEdgeExceptions() {		
		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.buildInvalidateExceptionPatterns(completePatterns);
					for (CompletePattern cp : completePatterns) exceptionHandler(cp);},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
//					//Add additional Exceptions
//					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
//					//Add additional Exceptions,
//					}, 
//					EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
//		assertThrows(Exception.class, () -> {//Add additional Exceptions
//					}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest02Return() {		
		assertDoesNotThrow(() -> {CypherTest02Return.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	@Test
	public void CypherTest02ReturnExceptions() {		
		assertThrows(InvalidityException.class, () -> {CypherTest02Return.buildInvalidyExceptionPatterns(completePatterns);
				for (CompletePattern cp : completePatterns) exceptionHandler(cp);
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
//				//Add additional Exceptions
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
//			//Add additional Exceptions,
//			}, 
//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
//		assertThrows(Exception.class, () -> {//Add additional Exceptions
//			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest03NotCondition() {		
		assertDoesNotThrow(() -> {CypherTest03NotCondition.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest03NotConditionExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
			//Add additional Exceptions,
			}, 
			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
		assertThrows(Exception.class, () -> {//Add additional Exceptions
			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest04Formula() {		
		assertDoesNotThrow(() -> {CypherTest04Formula.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest04FormulaExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
			//Add additional Exceptions,
			}, 
			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
		assertThrows(Exception.class, () -> {//Add additional Exceptions
			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	@Test
	public void CypherTest05ParameterValues() {	
		ArrayList<ParameterValue> values = CypherTest05ParameterValues.getTestParameters();	
		assertDoesNotThrow(() -> {CypherTest05ParameterValues.buildPatterns(completePatterns, values); 
		tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest05ParameterValuesExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
			//Add additional Exceptions,
			}, 
			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
		assertThrows(Exception.class, () -> {//Add additional Exceptions
			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest06Comparison() {	
		assertDoesNotThrow(() -> {CypherTest06Comparison.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest06ComparisonExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
			//Add additional Exceptions,
			}, 
			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
		assertThrows(Exception.class, () -> {//Add additional Exceptions
			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest07QuantifiedCondition() {	
		assertDoesNotThrow(() -> {CypherTest07QuantifiedCondition.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	@Test
	public void CypherTest07QuantifiedConditionExceptions() {		
		assertThrows(InvalidityException.class, () -> {CypherTest07QuantifiedCondition.buildInvalidtyExceptionPatterns(completePatterns);
					for (CompletePattern cp : completePatterns) exceptionHandler(cp);
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
//				//Add additional Exceptions
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
//			//Add additional Exceptions,
//			}, 
//			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
//		assertThrows(Exception.class, () -> {//Add additional Exceptions
//			}, DIFFRENT_OTHER_EXCEPTIONS);
	}	
	
	@Test
	public void CypherTest08Cycle() {	
		assertDoesNotThrow(() -> {CypherTest08Cycle.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest08CycleExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additonal Exceptions
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
			//Add additional Exceptions,
			}, 
			EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
		assertThrows(Exception.class, () -> {//Add additional Exceptions
			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest09Contains() {	
		assertDoesNotThrow(() -> {CypherTest09Contains.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest09ContainsExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
			//Add additional Exceptions,
			}, 
				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
		assertThrows(Exception.class, () -> {//Add additional Exceptions
			}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	@Test
	public void CypherTest10Match() {	
		assertDoesNotThrow(() -> {CypherTest10Match.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	@Test
	public void CypherTest10MatchExceptions() {		
		assertThrows(InvalidityException.class, () -> {CypherTest10Match.buildInvalidtyExceptionPatterns(completePatterns);
				for (CompletePattern cp : completePatterns) exceptionHandler(cp);},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
				//Add additional Exceptions,
				}, 
				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
//		assertThrows(Exception.class, () -> {//Add additional Exceptions
//				}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest11CountCondition() {	
		assertDoesNotThrow(() -> {CypherTest11CountCondition.buildPatterns(completePatterns); 
		tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest11CountConditionExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
				CypherTest00.exceptionHandler(completePatterns);},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
//				//Add additional Exceptions
//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
//				//Add additional Exceptions,
//				}, 
//				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
//		assertThrows(Exception.class, () -> {//Add additional Exceptions
//				}, DIFFRENT_OTHER_EXCEPTIONS);
	}
	
	
	@Test
	public void CypherTest12CheckNull() {	
		assertDoesNotThrow(() -> {CypherTest12CheckNull.buildPatterns(completePatterns); 
			tester(completePatterns);});
	}
	
	//@Test
	public void CypherTest12CheckNullExceptions() {		
		assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
				},
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
				//Add additional Exceptions
				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
				//Add additional Exceptions,
				}, 
				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
		assertThrows(Exception.class, () -> {//Add additional Exceptions
				}, DIFFRENT_OTHER_EXCEPTIONS);
	}

	
	protected void tester(ArrayList<CompletePattern> completePatterns) throws InvalidityException {
		try (Java2Neo4JConnector connector = new Java2Neo4JConnector()){
			for (CompletePattern completePattern : completePatterns) {
				replace(completePattern);
				
				String query = completePattern.generateCypher();
				String hashCode = query.hashCode() + "";
				connector.queryTester(query, hashCode, false);
				
				//Include the null check for the results
				String matchString = query.substring(query.indexOf(CypherSpecificConstants.CLAUSE_MATCH), query.indexOf(NEWLINE));
				if (matchString.toLowerCase().contains(NULL)) {
					throw new InvalidityException(THE_MATCH_CLAUSE_CONTAINS_NULL);
				}
				String returnString = query.substring(query.indexOf(CypherSpecificConstants.CLAUSE_RETURN));
				if (returnString.toLowerCase().contains(NULL)) {
					throw new InvalidityException(THE_RETURN_CLAUSE_CONTAINS_NULL);
				}
			}
		} catch (Exception e) {
			throw e;
		}
	} 
	
	protected static void exceptionHandler(CompletePattern completePattern) throws InvalidityException {
		completePattern.generateCypher();
	}
}
