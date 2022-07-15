/**
 */
package qualitypatternmodel.adaptionNeo4J.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getOriginalID() <em>Get Original ID</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getOriginalNode() <em>Get Original Node</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getEquivalentNodes() <em>Get Equivalent Nodes</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph) <em>Set Graph Simple</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getRelationsTo(qualitypatternmodel.graphstructure.Node) <em>Get Relations To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getAllOperators() <em>Get All Operators</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addOutgoing() <em>Add Outgoing</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node) <em>Add Outgoing</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.ComplexNode) <em>Add Incomming</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison() <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch() <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkGeneric() <em>Check Generic</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeGeneric() <em>Make Generic</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeGenericRecursive() <em>Make Generic Recursive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkComplex() <em>Check Complex</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeComplex() <em>Make Complex</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeComplexRecursive() <em>Make Complex Recursive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkPrimitive() <em>Check Primitive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makePrimitive() <em>Make Primitive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makePrimitiveRecursive() <em>Make Primitive Recursive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency() <em>Check Comparison Consistency</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison) <em>Check Comparison Consistency</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#adaptAsXmlElement() <em>Adapt As Xml Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#adaptAsXmlProperty() <em>Adapt As Xml Property</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#adaptAsRdfIriNode() <em>Adapt As Rdf Iri Node</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#adaptAsRdfLiteralNode() <em>Adapt As Rdf Literal Node</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addComparison(qualitypatternmodel.graphstructure.Node) <em>Add Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Adaptable#createParameters() <em>Create Parameters</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList() <em>Remove Parameters From Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getReturnType() <em>Get Return Type</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#isTranslatable() <em>Is Translatable</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements() <em>Get All Argument Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#isOperatorArgument() <em>Is Operator Argument</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#isValid(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#isValidLocal(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid Local</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#myToString() <em>My To String</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#generateCypher() <em>Generate Cypher</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#generateXQuery() <em>Generate XQuery</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#generateSparql() <em>Generate Sparql</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getContainer() <em>Get Container</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getAncestor(java.lang.Class) <em>Get Ancestor</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#initializeTranslation() <em>Initialize Translation</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#prepareTranslation() <em>Prepare Translation</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getOperatorList() <em>Get Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getParameterList() <em>Get Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getAllParameters() <em>Get All Parameters</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#prepareParameterUpdates() <em>Prepare Parameter Updates</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement, org.eclipse.emf.common.util.EList) <em>Trigger Parameter Updates</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#updateParameters(qualitypatternmodel.parameters.ParameterList) <em>Update Parameters</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement) <em>Trigger Parameter Updates</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#recordValues(qualitypatternmodel.execution.XmlDataDatabase) <em>Record Values</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#relationsXmlAdapted() <em>Relations Xml Adapted</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#createXmlAdaption() <em>Create Xml Adaption</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#createRdfAdaption() <em>Create Rdf Adaption</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#createNeo4jAdaption() <em>Create Neo4j Adaption</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NeoNodeTest extends TestCase {

	/**
	 * The fixture for this Neo Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoNode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoNodeTest.class);
	}

	/**
	 * Constructs a new Neo Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoNodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Neo Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NeoNode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Neo Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoNode getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionNeo4JFactory.eINSTANCE.createNeoNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getOriginalID() <em>Get Original ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getOriginalID()
	 * @generated
	 */
	public void testGetOriginalID() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getOriginalNode() <em>Get Original Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getOriginalNode()
	 * @generated
	 */
	public void testGetOriginalNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getEquivalentNodes() <em>Get Equivalent Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getEquivalentNodes()
	 * @generated
	 */
	public void testGetEquivalentNodes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph) <em>Set Graph Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph)
	 * @generated
	 */
	public void testSetGraphSimple__Graph() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getRelationsTo(qualitypatternmodel.graphstructure.Node) <em>Get Relations To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getRelationsTo(qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	public void testGetRelationsTo__Node() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getAllOperators()
	 * @generated
	 */
	public void testGetAllOperators() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addOutgoing() <em>Add Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addOutgoing()
	 * @generated
	 */
	public void testAddOutgoing() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node) <em>Add Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	public void testAddOutgoing__Node() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.ComplexNode) <em>Add Incomming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.ComplexNode)
	 * @generated
	 */
	public void testAddIncomming__ComplexNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison() <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison()
	 * @generated
	 */
	public void testAddPrimitiveComparison() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveComparison__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	public void testAddPrimitiveComparison__ParameterValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	public void testAddPrimitiveComparison__ComparisonOperator_ParameterValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch() <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveMatch()
	 * @generated
	 */
	public void testAddPrimitiveMatch() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveMatch__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkGeneric() <em>Check Generic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkGeneric()
	 * @generated
	 */
	public void testCheckGeneric() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeGeneric() <em>Make Generic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeGeneric()
	 * @generated
	 */
	public void testMakeGeneric() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeGenericRecursive() <em>Make Generic Recursive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeGenericRecursive()
	 * @generated
	 */
	public void testMakeGenericRecursive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkComplex() <em>Check Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkComplex()
	 * @generated
	 */
	public void testCheckComplex() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeComplex() <em>Make Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeComplex()
	 * @generated
	 */
	public void testMakeComplex() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeComplexRecursive() <em>Make Complex Recursive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeComplexRecursive()
	 * @generated
	 */
	public void testMakeComplexRecursive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkPrimitive() <em>Check Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkPrimitive()
	 * @generated
	 */
	public void testCheckPrimitive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makePrimitive() <em>Make Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makePrimitive()
	 * @generated
	 */
	public void testMakePrimitive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makePrimitiveRecursive() <em>Make Primitive Recursive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makePrimitiveRecursive()
	 * @generated
	 */
	public void testMakePrimitiveRecursive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency() <em>Check Comparison Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkComparisonConsistency()
	 * @generated
	 */
	public void testCheckComparisonConsistency() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison) <em>Check Comparison Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison)
	 * @generated
	 */
	public void testCheckComparisonConsistency__Comparison() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#adaptAsXmlElement() <em>Adapt As Xml Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsXmlElement()
	 * @generated
	 */
	public void testAdaptAsXmlElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#adaptAsXmlProperty() <em>Adapt As Xml Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsXmlProperty()
	 * @generated
	 */
	public void testAdaptAsXmlProperty() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#adaptAsRdfIriNode() <em>Adapt As Rdf Iri Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsRdfIriNode()
	 * @generated
	 */
	public void testAdaptAsRdfIriNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#adaptAsRdfLiteralNode() <em>Adapt As Rdf Literal Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#adaptAsRdfLiteralNode()
	 * @generated
	 */
	public void testAdaptAsRdfLiteralNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addComparison(qualitypatternmodel.graphstructure.Node) <em>Add Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addComparison(qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	public void testAddComparison__Node() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Adaptable#createParameters() <em>Create Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Adaptable#createParameters()
	 * @generated
	 */
	public void testCreateParameters() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList() <em>Remove Parameters From Parameter List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList()
	 * @generated
	 */
	public void testRemoveParametersFromParameterList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#validate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidate__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#getReturnType() <em>Get Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#getReturnType()
	 * @generated
	 */
	public void testGetReturnType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#isTranslatable()
	 * @generated
	 */
	public void testIsTranslatable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements() <em>Get All Argument Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements()
	 * @generated
	 */
	public void testGetAllArgumentElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#isOperatorArgument() <em>Is Operator Argument</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#isOperatorArgument()
	 * @generated
	 */
	public void testIsOperatorArgument() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#isValid(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#isValid(qualitypatternmodel.patternstructure.AbstractionLevel)
	 * @generated
	 */
	public void testIsValid__AbstractionLevel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#isValidLocal(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid Local</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#isValidLocal(qualitypatternmodel.patternstructure.AbstractionLevel)
	 * @generated
	 */
	public void testIsValidLocal__AbstractionLevel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#myToString() <em>My To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#myToString()
	 * @generated
	 */
	public void testMyToString() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#generateCypher() <em>Generate Cypher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#generateCypher()
	 * @generated
	 */
	public void testGenerateCypher() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#generateXQuery() <em>Generate XQuery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#generateXQuery()
	 * @generated
	 */
	public void testGenerateXQuery() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#generateSparql() <em>Generate Sparql</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#generateSparql()
	 * @generated
	 */
	public void testGenerateSparql() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#getContainer() <em>Get Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#getContainer()
	 * @generated
	 */
	public void testGetContainer() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#getAncestor(java.lang.Class) <em>Get Ancestor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#getAncestor(java.lang.Class)
	 * @generated
	 */
	public void testGetAncestor__Class() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#initializeTranslation() <em>Initialize Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#initializeTranslation()
	 * @generated
	 */
	public void testInitializeTranslation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#prepareTranslation() <em>Prepare Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#prepareTranslation()
	 * @generated
	 */
	public void testPrepareTranslation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#getOperatorList() <em>Get Operator List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#getOperatorList()
	 * @generated
	 */
	public void testGetOperatorList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#getParameterList() <em>Get Parameter List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#getParameterList()
	 * @generated
	 */
	public void testGetParameterList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#getAllParameters() <em>Get All Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#getAllParameters()
	 * @generated
	 */
	public void testGetAllParameters() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#prepareParameterUpdates() <em>Prepare Parameter Updates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#prepareParameterUpdates()
	 * @generated
	 */
	public void testPrepareParameterUpdates() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement, org.eclipse.emf.common.util.EList) <em>Trigger Parameter Updates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testTriggerParameterUpdates__PatternElement_EList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#updateParameters(qualitypatternmodel.parameters.ParameterList) <em>Update Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#updateParameters(qualitypatternmodel.parameters.ParameterList)
	 * @generated
	 */
	public void testUpdateParameters__ParameterList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement) <em>Trigger Parameter Updates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#triggerParameterUpdates(qualitypatternmodel.patternstructure.PatternElement)
	 * @generated
	 */
	public void testTriggerParameterUpdates__PatternElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#recordValues(qualitypatternmodel.execution.XmlDataDatabase) <em>Record Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#recordValues(qualitypatternmodel.execution.XmlDataDatabase)
	 * @generated
	 */
	public void testRecordValues__XmlDataDatabase() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#relationsXmlAdapted() <em>Relations Xml Adapted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#relationsXmlAdapted()
	 * @generated
	 */
	public void testRelationsXmlAdapted() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#createXmlAdaption() <em>Create Xml Adaption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#createXmlAdaption()
	 * @generated
	 */
	public void testCreateXmlAdaption() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#createRdfAdaption() <em>Create Rdf Adaption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#createRdfAdaption()
	 * @generated
	 */
	public void testCreateRdfAdaption() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.patternstructure.PatternElement#createNeo4jAdaption() <em>Create Neo4j Adaption</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.patternstructure.PatternElement#createNeo4jAdaption()
	 * @generated
	 */
	public void testCreateNeo4jAdaption() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //NeoNodeTest
