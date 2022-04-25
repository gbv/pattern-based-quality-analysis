/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.ElementMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element</b></em>'.
 * Representation of data units in <code>Graphs</code>. They may encompass multiple <code>Properties</code> and be related to other <code>Elements<code> via <code>Relations</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getOutgoingMappings <em>Outgoing Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getIncomingMapping <em>Incoming Mapping</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends qualitypatternmodel.graphstructure.Comparable, PatternElement, Adaptable {
	/**
	 * Returns the value of the '<em><b>Incoming Mapping</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.ElementMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Mapping</em>' reference.
	 * @see #setIncomingMapping(ElementMapping)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_IncomingMapping()
	 * @see qualitypatternmodel.patternstructure.ElementMapping#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	ElementMapping getIncomingMapping();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Node#getIncomingMapping <em>Incoming Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Mapping</em>' reference.
	 * @see #getIncomingMapping()
	 * @generated
	 */
	void setIncomingMapping(ElementMapping value);

	/**
	 * Returns the value of the '<em><b>Outgoing Mappings</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.ElementMapping}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.ElementMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Mappings</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_OutgoingMappings()
	 * @see qualitypatternmodel.patternstructure.ElementMapping#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ElementMapping> getOutgoingMappings();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Node#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Result Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getReturnNodes <em>Return Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of</em>' reference.
	 * @see #setResultOf(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_ResultOf()
	 * @see qualitypatternmodel.graphstructure.Graph#getReturnNodes
	 * @model opposite="returnNodes"
	 * @generated
	 */
	Graph getResultOf();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Node#getResultOf <em>Result Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of</em>' reference.
	 * @see #getResultOf()
	 * @generated
	 */
	void setResultOf(Graph value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translated</em>' attribute.
	 * @see #setTranslated(boolean)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_Translated()
	 * @model required="true"
	 * @generated
	 */
	boolean isTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Node#isTranslated <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translated</em>' attribute.
	 * @see #isTranslated()
	 * @generated
	 */
	void setTranslated(boolean value);

	/**
	 * Returns the value of the '<em><b>Predicates Are Being Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates Are Being Translated</em>' attribute.
	 * @see #setPredicatesAreBeingTranslated(boolean)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_PredicatesAreBeingTranslated()
	 * @model required="true"
	 * @generated
	 */
	boolean isPredicatesAreBeingTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Node#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicates Are Being Translated</em>' attribute.
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 */
	void setPredicatesAreBeingTranslated(boolean value);

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.BooleanOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.BooleanOperator#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_Predicates()
	 * @see qualitypatternmodel.operators.BooleanOperator#getNodes
	 * @model opposite="nodes"
	 * @generated
	 */
	EList<BooleanOperator> getPredicates();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Relation}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getNode_Incoming()
	 * @see qualitypatternmodel.graphstructure.Relation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relation> getIncoming();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the <code>internalId</code> of the first correspondence of <code>this</code> in the pattern.
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getOriginalID();

	/**
	 * <!-- begin-user-doc -->
	 * Creates a <code>Property</code> and
	 * a <code>Match</code>
	 * that references the new <code>Property</code> and has <code>regex</code> as its regular expression.
	 * 
	 * @param regex the regular expression for the new <code>Match</code> operator
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveMatch(String regex);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a <code>Property</code> and
	 * a <code>Comparison</code> that compares the new <code>Property</code>
	 * with a newly created <code>TextLiteralParam</code> based on <code>value</code>.
	 * 
	 * @param the value that the newly created <code>Property</code> is compared with by the newly created <code>Comparison</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveComparison(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a <code>Property</code> and a <code>Match</code> operator
	 * that references the new <code>Property</code>.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveMatch();

	/**
	 * <!-- begin-user-doc -->
	 * Creates a <code>Property</code> and
	 * a <code>Comparison</code> that compares the new <code>Property</code>
	 * with a newly created <code>UntypedParameterValue</code>.
	 * 
	 * @return the <code>UntypedParameterValue</code> that the newly
	 * created <code>Property</code> is compared with by the newly created <code>Comparison</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	UntypedParameterValue addPrimitiveComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of all <code>Operators</code> referenced by <code>this</code>.
	 * 
	 * @return a list of all <code>Operators</code> referenced by <code>this</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Operator> getAllOperators();

	/**
	 * <!-- begin-user-doc -->
	 * Creates a <code>Property</code> and
	 * a <code>Comparison</code> based on <code>operator</code> that compares the new <code>Property</code>
	 * with <code>input</code>.
	 * 
	 * @param operator the <code>ComparisonOperator</code> underlying the newly created <code>Comparison</code>
	 * @param input the <code>ParameterValue</code> that is compared to the new <code>Property</code> by the new <code>Comparison</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveComparison(ComparisonOperator operator, ParameterValue input);

	/**
	 * <!-- begin-user-doc -->
	 * Creates a <code>Property</code> and
	 * a <code>Comparison</code> that compares the new <code>Property</code>
	 * with <code>input</code>.	
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveComparison(ParameterValue input);

	/**
	 * <!-- begin-user-doc -->
	 * Sets <code>graph</code> of <code>this</code> to <code>newGraph</code> 
	 * without updating corresponding <code>Elements</code> in previous and following <code>Graphs</code>,
	 * updating referenced <code>Parameters</code>,
	 * clearing <code>predicates</code> and deleting <code>Relations</code>.
	 * 
	 * @param newGraph the new container of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGraphSimple(Graph newGraph);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency(Comparison comp) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model equivalentElementsMany="true"
	 * @generated
	 */
	void getEquivalentElements(EList<Node> equivalentElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PrimitiveNode makePrimitive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ComplexNode makeComplex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTargetNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addOutgoing(Node node);

} // Element