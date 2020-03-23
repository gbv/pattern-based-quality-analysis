/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getGraphDepth <em>Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getReturnElements <em>Return Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getMorphismTo <em>Morphism To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Graph#getMorphismFrom <em>Morphism From</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' containment reference.
	 * @see #setRootElement(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_RootElement()
	 * @see qualitypatternmodel.graphstructure.Element#getRoot
	 * @model opposite="root" containment="true" required="true"
	 * @generated
	 */
	Element getRootElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getRootElement <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' containment reference.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(Element value);

	/**
	 * Returns the value of the '<em><b>Return Elements</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Element}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Elements</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_ReturnElements()
	 * @see qualitypatternmodel.graphstructure.Element#getGraph
	 * @model opposite="graph" required="true"
	 * @generated
	 */
	EList<Element> getReturnElements();

	/**
	 * Returns the value of the '<em><b>Morphism To</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.Morphism}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism To</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_MorphismTo()
	 * @see qualitypatternmodel.patternstructure.Morphism#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Morphism> getMorphismTo();

	/**
	 * Returns the value of the '<em><b>Morphism From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morphism From</em>' reference.
	 * @see #setMorphismFrom(Morphism)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_MorphismFrom()
	 * @see qualitypatternmodel.patternstructure.Morphism#getTo
	 * @model opposite="to"
	 * @generated
	 */
	Morphism getMorphismFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getMorphismFrom <em>Morphism From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morphism From</em>' reference.
	 * @see #getMorphismFrom()
	 * @generated
	 */
	void setMorphismFrom(Morphism value);

	/**
	 * Returns the value of the '<em><b>Operator List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.OperatorList#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator List</em>' containment reference.
	 * @see #setOperatorList(OperatorList)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_OperatorList()
	 * @see qualitypatternmodel.functions.OperatorList#getGraph
	 * @model opposite="graph" containment="true" required="true"
	 * @generated
	 */
	OperatorList getOperatorList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getOperatorList <em>Operator List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator List</em>' containment reference.
	 * @see #getOperatorList()
	 * @generated
	 */
	void setOperatorList(OperatorList value);

	/**
	 * Returns the value of the '<em><b>Graph Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Depth</em>' attribute.
	 * @see #setGraphDepth(int)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_GraphDepth()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getGraphDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getGraphDepth <em>Graph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Depth</em>' attribute.
	 * @see #getGraphDepth()
	 * @generated
	 */
	void setGraphDepth(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isReturnGraph();

	/**
	 * Returns the value of the '<em><b>Quantified Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantified Condition</em>' container reference.
	 * @see #setQuantifiedCondition(QuantifiedCondition)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_QuantifiedCondition()
	 * @see qualitypatternmodel.patternstructure.QuantifiedCondition#getGraph
	 * @model opposite="graph" transient="false"
	 * @generated
	 */
	QuantifiedCondition getQuantifiedCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getQuantifiedCondition <em>Quantified Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantified Condition</em>' container reference.
	 * @see #getQuantifiedCondition()
	 * @generated
	 */
	void setQuantifiedCondition(QuantifiedCondition value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Pattern#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(Pattern)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getGraph_Pattern()
	 * @see qualitypatternmodel.patternstructure.Pattern#getGraph
	 * @model opposite="graph" transient="false"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Operator> getAllOperators() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyGraph(Graph graph) throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Element> getAllElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Relation> getAllRelations();

} // Graph
