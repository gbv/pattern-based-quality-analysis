package qualitypatternmodel.cyphertranslationtests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExecutionCondition;

import playground.Java2Neo4JConnector;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest00;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest01NeoElementEdge;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest01NeoPropertyEdge;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest02Return;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest03NotCondition;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest04Formula;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest05ParameterValues;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest06Comparison;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest07QuantifiedCondition;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest08Cycle;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest09Contains;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest10Match;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest11CountCondition;
import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest12CheckNull;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;

//The Excption handler can do more then the for the suite case
public abstract class CypherTestSuiteTranslation implements ExecutionCondition {

	private static final String NOT_ALL_PATTERN_HAVE_BEEN_CHECK = "Not all Pattern have been check - rework test";
	private static final String EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION = "NOT ALL INVALIDTIY EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	private static final String EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION = "NOT ALL UNSUPPORTED MESSAGE EXCPECTED EXCEPTIONS HAVE BEEN THROWN";
	protected static final String THE_MATCH_CLAUSE_CONTAINS_NULL = "The MATCH-CLAUSE contains null";
	protected static final String NEWLINE = "\n";
	protected static final String NULL = "null";
	protected static final String THE_RETURN_CLAUSE_CONTAINS_NULL = "The RETURN-CLAUSE contains null";
	protected static final String TEST_DISABLED_ON_QA_ENVIRONMENT = "Test disabled on QA environment";
	protected static final String TEST_ENABLED_ON_QA_ENVIRONMENT = "Test enabled on QA environment";
	protected ArrayList<CompletePattern> completePatterns;
	
	protected static void exceptionHandler(CompletePattern completePattern) throws InvalidityException {
		completePattern.generateCypher();
	}
	
	public static void testAllCompletePatterns(ArrayList<CompletePattern> completePatterns, boolean isDbOn) throws Exception {
		if (isDbOn) {
			Java2Neo4JConnector connector = new Java2Neo4JConnector();
			CypherTranslation.innerTestAllCompletePatterns(completePatterns, connector);
		} else {
			Java2Neo4JConnector connector = null;
			CypherTranslation.innerTestAllCompletePatterns(completePatterns, connector);
		}
	}

	@BeforeAll
	public void beforeClassFunction() {
		completePatterns = new ArrayList<CompletePattern>();
	}

	@AfterEach
	public void afterEachFunction() {
		completePatterns.clear();
	}

	@AfterAll
	public void afterAllFunction() {
		completePatterns = null;
	}

	//BEGIN - Syntax Validation
	@Test
	public void cypherTest00() {		
		assertDoesNotThrow(() -> {new CypherTest00().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void cypherTest01NeoElementEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoElementEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}

	@Test
	public void cypherTest01NeoElementEdgeExceptions() {		
			assertDoesNotThrow(() -> new CypherTest01NeoElementEdge().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
			assertThrows(InvalidityException.class, () -> {CypherTest01NeoElementEdge.generateToCreateNeoDirectionErrorShallNotWorkException();},
					//Add additional Exceptions
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoElementEdge.generateBuildNeoNeoNeedsAPathParamException();
					//Add additional Exceptions,
					}, 
					EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest01NeoPropertyEdge() {		
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildPatterns(completePatterns); 
			tester(completePatterns);});
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest01NeoPropertyEdge().buildToComplexQueryPatterns(completePatterns); 
		testerForToComplexQueries(completePatterns);});
	}

	@Test
	public void cypherTest01NeoPropertyEdgeExceptions() {	
			assertDoesNotThrow(() -> new CypherTest01NeoPropertyEdge().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
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
	public void cypherTest02Return() {		
		assertDoesNotThrow(() -> {new CypherTest02Return().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest02ReturnExceptions() {
			assertDoesNotThrow(() -> new CypherTest02Return().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
						},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
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
	public void cypherTest03NotCondition() {		
		assertDoesNotThrow(() -> {new CypherTest03NotCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest03NotConditionExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
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
	public void cypherTest04Formula() {		
		assertDoesNotThrow(() -> {new CypherTest04Formula().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest04FormulaExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
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
	public void cypherTest05ParameterValues() {		
		assertDoesNotThrow(() -> {new CypherTest05ParameterValues().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest05ParameterValuesExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
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
	public void cypherTest06Comparison() {	
		assertDoesNotThrow(() -> {new CypherTest06Comparison().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest06ComparisonExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
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
	public void cypherTest07QuantifiedCondition() {	
		assertDoesNotThrow(() -> {new CypherTest07QuantifiedCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
		completePatterns.clear();
		assertDoesNotThrow(() -> {new CypherTest07QuantifiedCondition().buildToComplexQueryPatterns(completePatterns); 
		testerForToComplexQueries(completePatterns);});
	}

	@Test
	public void cypherTest07QuantifiedConditionExceptions() {
			assertDoesNotThrow(() -> new CypherTest07QuantifiedCondition().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);
							},
							EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			completePatterns.clear();
			assertDoesNotThrow(() -> new CypherTest07QuantifiedCondition().buildUnsupportedException(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(Exception.class, () -> {exceptionHandler(cp);},
				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
			}
			completePatterns.clear();
			assertDoesNotThrow(() -> new CypherTest07QuantifiedCondition().buildOtherException(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(Exception.class, () -> {exceptionHandler(cp);
					});
			}
		}

	@Test
	public void cypherTest08Cycle() {
		assertDoesNotThrow(() -> {new CypherTest08Cycle().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest08CycleExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additonal Exceptions
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
	public void cypherTest09Contains() {	
		assertDoesNotThrow(() -> {new CypherTest09Contains().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest09ContainsExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
					EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(OperatorCycleException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
	//				//Add additional Exceptions
	//				EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
	//		assertThrows(UnsupportedOperationException.class, () -> {CypherTest01NeoEdge.tryBuildNeoNeoNeedsAPathParam();
	//			//Add additional Exceptions,
	//			}, 
	//				EXCEPTION_MESSAGE_UNSUPPORTED_MESSAGE_EXCEPTION);
	//		assertThrows(Exception.class, () -> {//Add additional Exceptions
	//			}, DIFFRENT_OTHER_EXCEPTIONS);
		}

	@Test
	public void cypherTest10Match() {	
		assertDoesNotThrow(() -> {new CypherTest10Match().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	@Test
	public void cypherTest10MatchExceptions() {		
			assertDoesNotThrow(()-> new CypherTest10Match().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
	//		assertThrows(InvalidityException.class, () -> {CypherTest01NeoEdge.tryToCreateNeoDirectionErrorShallNotWork();},
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
	public void cypherTest11CountCondition() {	
		assertDoesNotThrow(() -> {new CypherTest11CountCondition().buildPatterns(completePatterns); 
		tester(completePatterns);});
	}

	public void cypherTest11CountConditionExceptions() {	
			assertDoesNotThrow(() -> new CypherTest11CountCondition().buildInvalidityExceptionPatterns(completePatterns));
			for (CompletePattern cp : completePatterns) {
				assertThrows(InvalidityException.class, () -> {exceptionHandler(cp);},
						EXCEPTION_MESSAGE_INVALIDTIY_EXCEPTION);
			}
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
	public void cypherTest12CheckNull() {	
		assertDoesNotThrow(() -> {new CypherTest12CheckNull().buildPatterns(completePatterns); 
			tester(completePatterns);});
	}
	
	public void cypherTest12CheckNullExceptions() {		
			assertThrows(InvalidityException.class, () -> {//Add additional Exceptions
					},
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
//	//END - Syntax Validation

	
	
	//BEGIN - String Comparison
	//Sometime the node number is diffrent ... do not now why... but it is...
	//Dieser Umstand führt in den Fehlschlagenden Tests zu Problemen...
	@Test
	public void cypherTest00QueryComp() {	
		try {
			new CypherTest00().buildPatterns(completePatterns);
			int i = 0;
			
			//getBasePatternCypher
//			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getBasePatternComplexFinal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "RETURN varElementNode3");
			i++;
			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), 
					"\nMATCH (varElementNode8:Place), (varElementNode8)-[varElementEdge7]-(varElementNode9:Regesta), (varElementNode9)-[varElementEdge8]-(varElementNode10:Place), (varElementNode9)-[varElementEdge9]-(varElementNode11:IndexPerson), (varElementNode9)-[varElementEdge10]-(varElementNode12), (varElementNode8)-[varElementEdge11]-(varElementNode13), (varElementNode8)-[varElementEdge12]-(varElementNode14)\n"
					+ "RETURN DISTINCT (varElementNode8)");
			i++;

			//getBasePatternCondDateConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.isoStartDate = date('1440-02-02'))\n"
					+ "RETURN varElementNode3");
			i++;
		
			//getBasePatternCondConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.endDate = \"1439-12-20\")\n"
					+ "RETURN varElementNode3");
			i++;
		
			//getBasePatternMatchConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.endDate =~ \"1439.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getBasePatternMatchNotConcrete
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.endDate =~ \"1439.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest01NeoElementEdgeQueryComp() {		
		try {
			new CypherTest01NeoElementEdge().buildPatterns(completePatterns);
			int i = 0;
		
			//getUnspecifiedEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)--(varElementNode4)\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]-(varElementNode4:Place)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(varElementNode4:Place)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Place)<-[varElementEdge2:PLACE_OF_ISSUE]-(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2");
			i++;
			
			//getSimpleEdgeWithTargetNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)--(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2,\n"
					+ "   intEgNode2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varElementEdge2_1:PLACE_OF_ISSUE]-(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1,\n"
					+ "   intEgNode2");
			i++;
			
			//getComplexEdgeWithDoppleEnding
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varElementEdge2_1:PLACE_OF_ISSUE]-(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1,\n"
					+ "   intEgNode2");
			i++;
			
			//getComplexEdgeWithTargeAtEndAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]-(intEgNode2:Place)-[varElementEdge2_1:PLACE_OF_ISSUE]-(intEgNode2_1:Regesta)-[varElementEdge2_2:APPEARS_IN]-(varElementNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1, varElementEdge2_2,\n"
					+ "   intEgNode2, intEgNode2_1");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)<-[varElementEdge2_1:PLACE_OF_ISSUE]-(intEgNode2_1:Regesta)<-[varElementEdge2_2:APPEARS_IN]-(varElementNode4:IndexEntry:IndexPerson)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2, varElementEdge2_1, varElementEdge2_2,\n"
					+ "   intEgNode2, intEgNode2_1");
			i++;
		
			//getMultipleGraphPatterns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varElementEdge3]-(varElementNode6)\n"
					+ "MATCH (varElementNode7)-[varElementEdge4]-(varElementNode8)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getSimpleEdgeWithTargetNodeAndDopple
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)-[varElementEdge2:PLACE_OF_ISSUE]->(intEgNode2:Place)--(varElementNode4:Regesta)\n"
					+ "RETURN varElementNode3, varElementNode4, \n"
					+ "   varElementEdge2,\n"
					+ "   intEgNode2");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest01NeoPropertyEdgeQueryComp() {		
		try {
			new CypherTest01NeoPropertyEdge().buildPatterns(completePatterns);
			new CypherTest01NeoPropertyEdge().buildToComplexQueryPatterns(completePatterns);
			int i = 0;
			
			//getBlankSimpleEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "RETURN varNode3");
			i++;
			
			//getNeoPropertyEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(varPropertyNode4_2)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeReturnOnlyProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)\n"
					+ "RETURN varNode3.identifier");
			i++;
			
			//getSimpleEdgeReturnOnlyMultiProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)\n"
					+ "RETURN varNode5.identifier, varNode5.date, varNode5.placeOfIssue");
			i++;
			
			//getSimpleEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]-(varPropertyNode4_2:Place)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeWithLabelsRight
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(varPropertyNode4_2:Place)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeWithLabelsLeft
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)<-[varEdge2:APPEARS_IN]-(varPropertyNode4_2:IndexEntry:IndexPlace)\n"
					+ "RETURN varNode3");
			i++;
			
			//getSimpleEdgeWithTargetNodePropertyNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(varPropertyNode4_2:Place)\n"
					+ "RETURN varNode3, \n"
					+ "      varPropertyNode4_2, \n"
					+ "      varPropertyNode4_2.identifier");
			i++;
			
			//getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:PLACE_OF_ISSUE]->(varPropertyNode4_2:Place)\n"
					+ "RETURN varNode3, \n"
					+ "      varPropertyNode4_2, \n"
					+ "      varPropertyNode4_2.identifier, \n"
					+ "      varEdge2");
			i++;
			
			//getComplexEdge
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3)-[varEdge2]-(intEgNode2)-[varEdge2_1]-(varPropertyNode4_2)\n"
					+ "RETURN varNode3, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithLabels
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)-[varEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)-[varEdge2_1:IS_SUB_OF]-(varPropertyNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirections
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)<-[varEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)<-[varEdge2_1:IS_SUB_OF]-(varPropertyNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode3:Regesta)<-[varEdge2:APPEARS_IN]-(intEgNode2:IndexEntry:IndexPlace)<-[varEdge2_1:IS_SUB_OF]-(varPropertyNode4_2:IndexEntry:IndexPerson)\n"
					+ "RETURN varNode3, \n"
					+ "      varPropertyNode4_2, \n"
					+ "      varPropertyNode4_2.path, \n"
					+ "      varEdge2, varEdge2_1, \n"
					+ "      intEgNode2");
			i++;
			
			//getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns
//			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode7)\n"
					+ "MATCH (varNode8)\n"
					+ "MATCH (varNode9)-[varEdge6]-(varPropertyNode10_6:Regesta)\n"
					+ "MATCH (varNode11)-[varEdge8]-(varPropertyNode10_8:Regesta)\n"
					+ "WHERE (varNode7.placeOfIssue = varNode8.placeOfIssue AND varNode7.placeOfIssue = varPropertyNode10_6.placeOfIssue AND varNode7.placeOfIssue = varPropertyNode10_8.placeOfIssue)\n"
					+ "            AND NOT ((varNode7.placeOfIssue = varNode8.placeOfIssue))\n"
					+ "RETURN varNode7");
			i++;

			//getMultiEdgesToNeoPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode6)\n"
					+ "MATCH (varNode7)\n"
					+ "MATCH (varNode8)-[varEdge5]-(varPropertyNode9_5:Regesta)\n"
					+ "MATCH (varNode10)-[varEdge6]-(varPropertyNode9_6:Regesta)\n"
					+ "WHERE (varNode6.placeOfIssue = varNode7.placeOfIssue AND varNode6.placeOfIssue = varPropertyNode9_5.placeOfIssue AND varNode6.placeOfIssue = varPropertyNode9_6.placeOfIssue)\n"
					+ "RETURN varNode6");
			i++;			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest02ReturnQueryComp() {		
		try {
			new CypherTest02Return().buildPatterns(completePatterns);
			int i = 0;
			
			//getAllPossibleReturnTypes
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Regesta)-[varEdge3:APPEARS_IN]-(intEgNode3:IndexEntry:IndexPlace)-[varEdge3_1:APPEARS_IN]-(varNode5:Regesta)-[varEdge4:APPEARS_IN]-(intEgNode4:IndexEntry:IndexPerson)-[varEdge4_1:APPEARS_IN]-(varPropertyNode6_4:Regesta)\n"
					+ "RETURN varNode4, varNode5, \n"
					+ "      varPropertyNode6_4, \n"
					+ "      varPropertyNode6_4.summary, \n"
					+ "      varEdge3, varEdge3_1, varEdge4, varEdge4_1, \n"
					+ "      intEgNode3, intEgNode4");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest03NotConditionQueryComp() {		
		try {
			new CypherTest03NotCondition().buildPatterns(completePatterns);
			int i = 0;
			System.out.println(completePatterns.get(i).generateCypher());
			//getTestPattern1
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Literature)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode4)<-[varEdge2]-(varNode5:Regesta)\n"
					+ "            WHERE NOT (EXISTS {\n"
					+ "                              MATCH (varNode5)-[varEdge4]->(varNode6:Reference)})})\n"
					+ "RETURN varNode4");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getTestPattern1WithConditions
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode8:Literature)\n"
					+ "WHERE (varNode8.title = \"BATTENBERG\"\n"
					+ "            AND varNode8.url = \"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=battenberg,_solmser_urkunden_1\")\n"
					+ "            AND NOT (EXISTS {\r\n"
					+ "                        MATCH (varNode8)<-[varEdge6]-(varNode9:Regesta)\n"
					+ "                        WHERE (varNode9.isoStartDate = date('1439-12-20'))\n"
					+ "                              AND NOT (EXISTS {\r\n"
					+ "                                          MATCH (varNode9)-[varEdge11]->(varNode10:Reference)\n"
					+ "                                          WHERE (varNode10.title = \"Kulpis Documenta S. 181f.\")})})\n"
					+ "RETURN varNode8");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getTestPattern2
			System.out.println(completePatterns.get(i).generateCypher());
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode5), (varNode5)-[varEdge4:APPEARS_IN]-(varNode6:IndexPerson), (varNode5)-[varEdge5:ACTION]-(varNode7:Action), (varNode5)-[varEdge6:RECIPIENT_IN]-(varNode8:IndexPlace)})\n"
					+ "RETURN varNode5");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getTestPattern5
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode4), (varNode4)<-[varEdge4:APPEARS_IN]-(varNode5:IndexPerson)-[varEdge5:IS_SUB_OF]-(varNode6:IndexPlace), (varNode4)-[varEdge6:RECIPIENT_IN]-(varNode6)}\n"
					+ "RETURN varNode4");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getNotExistsExists
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5:Regesta)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode5)-[varEdge4:APPEARS_IN]-(varNode6:IndexPerson)\n"
					+ "            WHERE EXISTS {\n"
					+ "                        MATCH (varNode6)-[varEdge6]-(varNode7:Regesta)}})\n"
					+ "RETURN varNode5");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)}\n"
					+ "RETURN varNode4");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)})\n"
					+ "RETURN varNode4");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)}\n"
					+ "RETURN varNode4");
			i++;
			System.out.println(completePatterns.get(i).generateCypher());
			//getNotNotNotNotNotPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "            MATCH (varNode4)-[varEdge4]-(varNode5)})\n"
					+ "RETURN varNode4");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest04FormulaQueryComp() {		
		try {
			new CypherTest04Formula().buildPatterns(completePatterns);
			int i = 0;
			
			//AND
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varElementNode5");
			i++;
			
			//OR
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varElementNode5");
			i++;

			//IMPLIES
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR (NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR NOT (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE (NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
		
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR (NOT EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varElementNode5");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:Regesta)\n"
					+ "WHERE ((EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)})\n"
					+ "   OR NOT (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:PLACE_OF_ISSUE]-(varElementNode6:Place)}\n"
					+ "   AND EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:APPEARS_IN]-(varElementNode7:IndexEntry:IndexPlace)}))\n"
					+ "RETURN varElementNode5");
			i++;
		
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5:IndexPlace)\n"
					+ "WHERE (EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge5:IS_SUB_OF]-(varElementNode6:IndexPlace)}\n"
					+ "   OR EXISTS {\n"
					+ "      MATCH (varElementNode5)-[varElementEdge6:placeOfIssue]-(varElementNode7:Regesta)})\n"
					+ "RETURN varElementNode5");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest05ParameterValuesQueryComp() {		
		try {
			new CypherTest05ParameterValues().buildPatterns(completePatterns);
			int i = 0;
			
			//TextLiteralParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.date = \"1439 Dezember 20\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//TextListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.origPlaceOfIssue = [\"unknown\", \"USA\", \"17\", \"17.0\", \"-17\", \"-17.0\", \"-17.0+\"])\n"
					+ "RETURN varElementNode3");
			i++;
			
			//NumberParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.age = 1452.0)\n"
					+ "RETURN varElementNode3");
			i++;
	
			//BooleanParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isVater = true)\n"
					+ "RETURN varElementNode3");
			i++;
			
			//DateParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isoStartDate  = date('1439-12-20'))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//TimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isoStartDate = time('09:00:00'))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//DateTimeParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.isoStartDate = datetime('2020-10-03T09:00:00'))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//MultiListParam
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.origPlaceOfIssue = [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')])\n"
					+ "RETURN varElementNode3");
			i++;
			
			//MultiListParam + IN
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.origPlaceOfIssue IN [\"unknown\", \"USA\", 17, 17.0, -17, -17.0, \"-17.0+\", date('1439-12-20'), datetime('2020-10-03T09:00:00'), time('09:00:00')])\n"
					+ "RETURN varElementNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest06ComparisonQueryComp() {		
		try {
			new CypherTest06Comparison().buildPatterns(completePatterns);
			int i = 0;
		
			//Equal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)\n"
					+ "MATCH (varElementNode6)\n"
					+ "WHERE (varElementNode5 = varElementNode6\n"
					+ "   AND varElementNode6 = varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;
		
			//Unequal
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)\n"
					+ "MATCH (varElementNode6)\n"
					+ "WHERE (varElementNode5 <> varElementNode6\n"
					+ "   AND varElementNode6 <> varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (varElementNode5 <> varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman <> varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman <> varPropertyNode6_3.normalizedGerman)\n"
					+ "RETURN varElementNode5");
			i++;
		
			//getComparisonTwoNeoPropertiesWithNeoPartsAndPropertyName (EQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (varElementNode5 <> varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman = varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman = varPropertyNode6_3.normalizedGerman)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getMultipleComparisons
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (varElementNode5 <> varElementNode7\n"
					+ "   AND varElementNode7 <> varElementNode5\n"
					+ "   AND varElementNode5 = varElementNode7\n"
					+ "   AND varElementNode7 = varElementNode5\n"
					+ "   AND varElementNode5 = varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman <> varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman <> varPropertyNode6_3.normalizedGerman\n"
					+ "   AND varElementNode5 = varElementNode7\n"
					+ "   AND varPropertyNode6_3.normalizedGerman = varPropertyNode8_4.normalizedGerman\n"
					+ "   AND varPropertyNode8_4.normalizedGerman = varPropertyNode6_3.normalizedGerman)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getCompareByElementId (NOTEQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (ID(varElementNode5) <> ID(varElementNode7)\n"
					+ "   AND varElementNode7 <> varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getCompareByElementId (EQUAL)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varPropertyEdge3:PLACE_OF_ISSUE]-(varPropertyNode6_3:Place)\n"
					+ "MATCH (varElementNode7)-[varPropertyEdge4:PLACE_OF_ISSUE]-(varPropertyNode8_4:Place)\n"
					+ "WHERE (ID(varElementNode5) = ID(varElementNode7)\n"
					+ "   AND varElementNode7 = varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest07QuantifiedConditionQueryComp() {		
		try {
			new CypherTest07QuantifiedCondition().buildPatterns(completePatterns);
			new CypherTest07QuantifiedCondition().buildToComplexQueryPatterns(completePatterns);
			int i = 0;
			
			//getNodesWhereExits (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Regesta)\n"
					+ "WHERE EXISTS (varNode4.origPlaceOfIssue)\n"
					+ "RETURN varNode4");
			i++;
			
			//getNodesWhereExits (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode4:Regesta)\n"
					+ "WHERE NOT (EXISTS (varNode4.origPlaceOfIssue))\n"
					+ "RETURN varNode4");
			i++;
			
			//getNodesWhereMultiplePropertyExistsChecks (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode6:Regesta)\n"
					+ "WHERE EXISTS (varNode6.origPlaceOfIssue, varNode6.startDate, varNode6.endDate)\n"
					+ "RETURN varNode6");
			i++;
			
			//getNodesWhereMultiplePropertyExistsChecks (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode6:Regesta)\n"
					+ "WHERE NOT (EXISTS (varNode6.origPlaceOfIssue) AND EXISTS (varNode6.startDate) AND EXISTS (varNode6.endDate))\n"
					+ "RETURN varNode6");
			i++;
			
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varNode5)\n"
					+ "WHERE NOT (EXISTS {\n"
					+ "                        MATCH (varNode6), (varNode7)\n"
					+ "                        WHERE (varNode5.date = varNode6.startDate AND varNode5.date = varNode7.isoStartDate)})\n"
					+ "RETURN varNode5");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest08CycleQueryComp() {		
		try {
			new CypherTest08Cycle().buildPatterns(completePatterns);
			int i = 0;

			//getCyclePattern(2)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)-[varElementEdge5]-(varElementNode4)\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getCyclePattern(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varElementEdge5]-(varElementNode6)-[varElementEdge6]-(varElementNode7)-[varElementEdge7]-(varElementNode5)\n"
					+ "RETURN varElementNode5");
			i++;

			//getCyclePatternComp(2)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode5)-[varElementEdge4]-(varElementNode6)-[varElementEdge5]-(varElementNode7)\n"
					+ "WHERE (varElementNode5 = varElementNode7)\n"
					+ "RETURN varElementNode5");
			i++;
			
			//getCyclePatternComp(3)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode6)-[varElementEdge5]-(varElementNode7)-[varElementEdge6]-(varElementNode8)-[varElementEdge7]-(varElementNode9)\n"
					+ "WHERE (varElementNode6 = varElementNode9)\n"
					+ "RETURN varElementNode6");
			i++;
						
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest09ContainsQueryComp() {		
		try {
			new CypherTest09Contains().buildPatterns(completePatterns);
			int i = 0;
			
			//getPatternContains (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (varElementNode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//getPatternContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "WHERE (NOT (varElementNode3.archivalHistory CONTAINS (\"http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=gudenus,_cod._dipl.\")))\n"
					+ "RETURN varElementNode3");
			i++;
	
			//getMultipleContains (true)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "WHERE (varElementNode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\")\n"
					+ "   AND varElementNode7.identifier CONTAINS (\"hmel n. \")\n"
					+ "   AND varElementNode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\")\n"
					+ "   AND varElementNode7.bandpk CONTAINS (\"13000000\")\n"
					+ "   AND varElementNode7.title CONTAINS (\"Friedrich\"))\n"
					+ "RETURN varElementNode7");
			i++;
			
			//getMultipleContains (false)
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode7)\n"
					+ "WHERE (NOT (varElementNode7.summary CONTAINS (\"Churfürsten (Dietrich von Mainz, Dietrich\"))\n"
					+ "   AND NOT (varElementNode7.identifier CONTAINS (\"hmel n. \"))\n"
					+ "   AND NOT (varElementNode7.exchangeIdentifier CONTAINS (\"20_000001_000001_013_0\"))\n"
					+ "   AND NOT (varElementNode7.bandpk CONTAINS (\"13000000\"))\n"
					+ "   AND NOT (varElementNode7.title CONTAINS (\"Friedrich\")))\n"
					+ "RETURN varElementNode7");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest10MatchQueryComp() {		
		try {
			new CypherTest10Match().buildPatterns(completePatterns);
			int i = 0;
			
			//getPatternMatch
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \"Churfürsten\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \"Churfürsten\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*(?i)Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*(?i)Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*(?m)Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*(?m)Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary =~ \".*(?s)Churfürsten.*\")\n"
					+ "RETURN varElementNode3");
			i++;
			
			//
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (NOT (varElementNode3.summary =~ \".*(?s)Churfürsten.*\"))\n"
					+ "RETURN varElementNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest11CountConditionQueryComp() {		
		try {
			new CypherTest11CountCondition().buildPatterns(completePatterns);
			int i = 0;
			
			//getJustCount
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode2)\n"
					+ "WITH varElementNode2, COUNT(varElementNode2) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode2");
			i++;
			
			//getCountInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "MATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "WITH varElementNode3, COUNT(varElementNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode3");
			i++;
		
			//getCountInPatternWithRemoveAElement
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "MATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "WITH varElementNode3, COUNT(varElementNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode3");
			i++;
	
			//getMultiCountsInPattern
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3)\n"
					+ "MATCH (varElementNode3)-[varElementEdge2]-(varElementNode4)\n"
					+ "WITH varElementNode3, COUNT(varElementNode3) AS myCounter1, COUNT(varElementNode4) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode3");
			i++;

			//getCountConditionWithWhereClause
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "WHERE (varElementNode4.placeOfIssue = \"Wien\")\n"
					+ "MATCH (varElementNode4)-[varElementEdge4]-(varElementNode5)\n"
					+ "WHERE (varElementNode4 = varElementNode5)\n"
					+ "WITH varElementNode4, COUNT(varElementNode4) AS myCounter1\n"
					+ "WHERE myCounter1 = 1.0\n"
					+ "RETURN varElementNode4");
			i++;
	
			//getCountAPropertyNode
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)-[varPropertyEdge2:PLACE_OF_ISSUE]-(varPropertyNode5_2:IndexPlace)\n"
					+ "MATCH (varElementNode4)-[varElementEdge4]-(varElementNode6)\n"
					+ "WITH varElementNode4, COUNT(varElementNode4) AS myCounter1, COUNT(varPropertyNode5_2) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getCountAProperty
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4)\n"
					+ "MATCH (varElementNode4)-[varElementEdge3]-(varElementNode5)\n"
					+ "WITH varElementNode4, COUNT(varElementNode4) AS myCounter1, COUNT(varElementNode4.placeOfIssue) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode4");
			i++;
			
			//getCountWithRelations
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode4:Regesta)-[varElementEdge2]-(varElementNode5:IndexPlace)\n"
					+ "MATCH (varElementNode4)-[varElementEdge4]-(varElementNode6:IndexPerson)\n"
					+ "WITH varElementNode5, varElementEdge2, COUNT(varElementNode6) AS myCounter1, COUNT(varElementNode5) AS myCounter2\n"
					+ "WHERE myCounter1 = 1.0 AND myCounter2 = 1.0\n"
					+ "RETURN varElementNode5, \n"
					+ "   varElementEdge2");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void cypherTest12CheckNullQueryComp() {		
		try {
			new CypherTest12CheckNull().buildPatterns(completePatterns);
			int i = 0;
	
			//getNullCheckInvalidOptionException
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary IS NULL)\n"
					+ "RETURN varElementNode3");
			i++;

			//getNullCheckNullPrimitiveNodeException
			assertEquals(completePatterns.get(i).generateCypher(), "\nMATCH (varElementNode3:Regesta)\n"
					+ "WHERE (varElementNode3.summary IS NOT NULL)\n"
					+ "RETURN varElementNode3");
			i++;
			
			assertTrue(NOT_ALL_PATTERN_HAVE_BEEN_CHECK, i == completePatterns.size());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	//End - String Comparison
	protected abstract void tester(ArrayList<CompletePattern> completePatterns) throws Exception;
	protected abstract void testerForToComplexQueries(ArrayList<CompletePattern> completePatterns) throws Exception;
}