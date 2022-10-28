package qualitypatternmodel.cypherclasstester.concretetests;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl;
import qualitypatternmodel.cypherclasstester.NeoAbstractPathParamTest;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

@DisplayName("NeoPropertyPathParam Test")
public class Cypher03CypherPropertyPathParamTest extends NeoAbstractPathParamTest {
	private static final String NEO_PROPERTY_PATH_PARAM_VARIABLE_EAGE_ONE_CLAMPED = "NeoPropertyPathParam [1] " + "-"+ VARIABLE_EAGE_ONE_CLAMPED + "-";
	private static final String ORIGINAL_PLACE_OF_ISSUE = "originalPlaceOfIssue";
	private static final String INDEXPLACE = "INDEXPLACE";
	private static final String PLACE = "PLACE";
	private static final String EDGE_WITH_TARGET = "-[VARIABLE_EDGE_ONE]-" + "(" + "varPropertyNode2" + ":" + INDEXPLACE + ":" + REGESTA + ")";
	NeoPropertyPathParam neoPropertyPathParam;
	
	@BeforeAll
    static void initAll() {
		
    }
	
	@BeforeEach
	public void setUp() {
		try {
			super.setUp(FACTORY.createNeoPropertyPathParam());		
			neoPropertyPathParam = (NeoPropertyPathParam) super.neoAbstractPathParam;
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
		
	}
	
	@AfterEach
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void validateNeoPropertyEdge() {
		try {
			Method m = getValidateNeoPropertyEdgeMethod();
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
			neoSimpleEdge1.addNeoTargetNodeLabel(REGESTA);
			neoSimpleEdge2.addNeoTargetNodeLabel(REGESTA);
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge1);
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge2);
			neoPropertyPathParam.setNeoPathPart(neoComplexEdge1);
			assertDoesNotThrow(() -> m.invoke(neoPropertyPathParam));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	public void validateNeoPropertyEdgeException() {
		try {
			Method m = getValidateNeoPropertyEdgeMethod();
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			neoPropertyPathParam.setNeoPathPart(neoComplexEdge1);
			try {
				m.invoke(neoPropertyPathParam);
			} catch (Exception e) {
				assertEquals(InvalidityException.class, e.getCause().getClass());
			}
			
			neoPropertyPathParam.setNeoPathPart(FACTORY.createNeoSimpleEdge());
			try {
				m.invoke(neoPropertyPathParam);
			} catch (Exception e) {
				assertEquals(InvalidityException.class, e.getCause().getClass());
			}
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	private Method getValidateNeoPropertyEdgeMethod() throws NoSuchMethodException, SecurityException {
		Class<NeoPropertyPathParamImpl> obj = NeoPropertyPathParamImpl.class;
		Method m = obj.getDeclaredMethod("validateNeoPropertyEdge");
		m.setAccessible(true);
		return m;
	}
	
	@Test 
	public void innerEdgesHaveTargets() {
		try {
			Class<NeoPropertyPathParamImpl> obj = NeoPropertyPathParamImpl.class;
			Method m = obj.getDeclaredMethod("innerEdgesHaveTargets", EList.class);
			m.setAccessible(true);
			
			NeoSimpleEdge neoSimpleEdge1 = FACTORY.createNeoSimpleEdge();
			NeoSimpleEdge neoSimpleEdge2 = FACTORY.createNeoSimpleEdge();
			NeoComplexEdge neoComplexEdge1 = FACTORY.createNeoComplexEdge();
			NeoSimpleEdge neoSimpleEdge3 = FACTORY.createNeoSimpleEdge();
			NeoPathPart mockPart = Mockito.mock(NeoPathPart.class);
			neoComplexEdge1.addNeoPathPart(neoSimpleEdge3);
			EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
			l.add(neoSimpleEdge1);
			l.add(neoSimpleEdge2);
			l.add(neoComplexEdge1);
			l.add(mockPart);
			
			//Case that neoSimpleEdge.getNeoTargetNodeLabels() == null and the size > 0 is not testable
			assertEquals(false, m.invoke(neoPropertyPathParam, l));
			
			neoSimpleEdge1.addNeoTargetNodeLabel(REGESTA);
			neoSimpleEdge2.addNeoTargetNodeLabel(PLACE);
			neoSimpleEdge3.addNeoTargetNodeLabel(INDEXPLACE);
			assertEquals(true, m.invoke(neoPropertyPathParam, l));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test 
	public void getNeoPropertyName() {
		//Check if the original value is null
		assertNull(neoPropertyPathParam.getNeoPropertyName());
		
		//Set a valid Property-Namen
		String noePropertyName = ORIGINAL_PLACE_OF_ISSUE;
		neoPropertyPathParam.setNeoPropertyName(noePropertyName);
		assertEquals(noePropertyName, neoPropertyPathParam.getNeoPropertyName());
		
		//Setting the Value to null
		neoPropertyPathParam.setNeoPropertyName((String) null);
		assertNull(neoPropertyPathParam.getNeoPropertyName());
		
		//Trying to set a Empty-String --> Nothing happens
		neoPropertyPathParam.setNeoPropertyName("");
		assertNull(neoPropertyPathParam.getNeoPropertyName());
	}
	
	@Test
	@Override
	public void getReturnInnerEdgeNodes() {
		try {
			//No NeoPathPart is set
			assertNull(neoPropertyPathParam.getNeoPathPart());
			assertNull(neoPropertyPathParam.getReturnInnerEdgeNodes());
			
			//NeoPathPart is set
			NeoSimpleEdgeImpl mockPathPart = Mockito.mock(NeoSimpleEdgeImpl.class);
			String internalEdgeString = CypherSpecificConstants.INTERNAL_EDGE_NODE + 1;
			Mockito.when(mockPathPart.getCypherInnerEdgeNodes(Mockito.anyBoolean())).thenReturn(internalEdgeString);
			neoPropertyPathParam.setNeoPathPart(mockPathPart);
			assertEquals(internalEdgeString, neoAbstractPathParam.getReturnInnerEdgeNodes());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	@Test
	@Override
	public void getCypherReturnVariable() {
		try {
			buildMockSimpleEdge();
			neoPropertyPathParam.setNeoPathPart((NeoPathPart) super.mockSimpleEdge);
			assertEquals(NeoAbstractPathParamTest.VARIABLE_EDGE_ONE, neoPropertyPathParam.getCypherReturnVariable());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
	
	@Test
	@Override
	public void generateCypher() {
		try {
			//If nothing is set
			assertEquals(null, super.neoAbstractPathParam.generateCypher());
			
			//If NeoPathParts are set
			buildMockSimpleEdge();
			TextListParam tL = new TextListParamImpl();
			tL.addStringValue(PLACE);
			tL.addStringValue(REGESTA);
			Mockito.when(mockSimpleEdge.getNeoTargetNodeLabels()).thenReturn(tL);
			Mockito.when(mockSimpleEdge.generateCypher()).thenReturn(EDGE_WITH_TARGET);
			neoPropertyPathParam.setNeoPathPart(mockSimpleEdge);
			assertEquals(EDGE_WITH_TARGET, super.neoAbstractPathParam.generateCypher());
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	//Maybe change that --> Verweigertes erbe und so
	@Test
	@Override
	public void createParameters() {
		assertThrows(UnsupportedOperationException.class, () -> neoAbstractPathParam.createParameters());
	}

	@Override
	public void inputIsValid() {
		// TODO Auto-generated method stub
	}

	@Test
	@Override
	public void myToString() {		
		try {
			//Just Print the internalId
			assertTrue(neoPropertyPathParam.myToString().compareTo("NeoPropertyPathParam [1]") == 0);
			
			//If an visibile Edge is set
			buildMockSimpleEdge();
			TextListParam l = new TextListParamImpl();
			l.addStringValue(REGESTA);
			Mockito.when(super.mockSimpleEdge.getNeoTargetNodeLabels()).thenReturn(l);
			neoPropertyPathParam.setNeoPathPart(super.mockSimpleEdge);
			Mockito.when(mockSimpleEdge.generateCypher()).thenReturn("-"+ VARIABLE_EAGE_ONE_CLAMPED + "-");
			
			assertTrue(neoPropertyPathParam.myToString().compareTo(NEO_PROPERTY_PATH_PARAM_VARIABLE_EAGE_ONE_CLAMPED) == 0);	
			
			//Get it with an identifier
			neoPropertyPathParam.setNeoPathPart(null);
			assertNull(neoPropertyPathParam.getNeoPathPart());
			NeoPropertyEdgeImpl mockNeoPropertyEdgeImpl = Mockito.mock(NeoPropertyEdgeImpl.class);
			neoPropertyPathParam.setNeoPropertyEdge(mockNeoPropertyEdgeImpl);
			String varNode3Property = "varNode3.placeOfIssue";
			neoPropertyPathParam.setNeoPropertyName(new TextLiteralParamImpl());
			Mockito.when(mockNeoPropertyEdgeImpl.generateCypherPropertyAddressing()).thenReturn(varNode3Property)
																						.thenThrow(new InvalidityException());
			assertTrue(neoPropertyPathParam.myToString().compareTo("NeoPropertyPathParam [1] " + varNode3Property) == 0);
			
			//In the case of a Exception nothing happens except the StackTrace is printed
			neoPropertyPathParam.myToString();
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}	
	}

	@Test
	@Override
	public void getRelationNumber() {
		try {
			NeoPropertyEdge neoPropertyEdge = FACTORY.createNeoPropertyEdge();
			Field f = super.getInternalIdField();
			
			Class obj = neoPropertyPathParam.getClass();
			Method m = super.getMethodGetRelationNumber(obj);
			
			//If No NeoEdge is set return -1
			assertEquals(-1, m.invoke(neoPropertyPathParam));
			
			//NeoPropertyEdge is set with the Id 1
			f.set(neoPropertyEdge, 1);
			neoPropertyPathParam.setNeoPropertyEdge(neoPropertyEdge);
			assumeNotNull(neoPropertyPathParam.getNeoPropertyEdge());
			assertEquals(1, m.invoke(neoPropertyPathParam));
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}
}