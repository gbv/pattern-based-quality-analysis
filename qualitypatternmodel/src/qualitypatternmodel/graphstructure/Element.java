/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.adaptionxml.PropertyLocation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.ElementMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element</b></em>'.
 * This represents a single data element.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getResultOf <em>Result Of</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getProperties <em>Properties</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement()
 * @model
 * @generated
 */
public interface Element extends qualitypatternmodel.graphstructure.Comparable, PatternElement, Adaptable {
	/**
	 * Returns the value of the '<em><b>Mapping From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.ElementMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping From</em>' reference.
	 * @see #setMappingFrom(ElementMapping)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_MappingFrom()
	 * @see qualitypatternmodel.patternstructure.ElementMapping#getTo
	 * @model opposite="to"
	 * @generated
	 */
	ElementMapping getMappingFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#getMappingFrom <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping From</em>' reference.
	 * @see #getMappingFrom()
	 * @generated
	 */
	void setMappingFrom(ElementMapping value);

	/**
	 * Returns the value of the '<em><b>Mapping To</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.ElementMapping}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.ElementMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping To</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_MappingTo()
	 * @see qualitypatternmodel.patternstructure.ElementMapping#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<ElementMapping> getMappingTo();

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getElements
	 * @model opposite="elements" required="true" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Result Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getReturnElements <em>Return Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of</em>' reference.
	 * @see #setResultOf(Graph)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_ResultOf()
	 * @see qualitypatternmodel.graphstructure.Graph#getReturnElements
	 * @model opposite="returnElements"
	 * @generated
	 */
	Graph getResultOf();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#getResultOf <em>Result Of</em>}' reference.
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
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#getName <em>Name</em>}' attribute.
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
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Translated()
	 * @model required="true"
	 * @generated
	 */
	boolean isTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#isTranslated <em>Translated</em>}' attribute.
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
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_PredicatesAreBeingTranslated()
	 * @model required="true"
	 * @generated
	 */
	boolean isPredicatesAreBeingTranslated();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicates Are Being Translated</em>' attribute.
	 * @see #isPredicatesAreBeingTranslated()
	 * @generated
	 */
	void setPredicatesAreBeingTranslated(boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Property}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Properties()
	 * @see qualitypatternmodel.graphstructure.Property#getElement
	 * @model opposite="element" containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.BooleanOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.BooleanOperator#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Predicates()
	 * @see qualitypatternmodel.operators.BooleanOperator#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EList<BooleanOperator> getPredicates();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Relation}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Outgoing()
	 * @see qualitypatternmodel.graphstructure.Relation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Relation> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Relation}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Incoming()
	 * @see qualitypatternmodel.graphstructure.Relation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relation> getIncoming();

	/**
	 * <!-- begin-user-doc -->
	 * Copies all contained <code>SingleElement</code> objects to the next graphs.
	 * Corresponding <code>SingleElement</code> objects are created in these graphs and <code>SingleElementMapping</code> objects are added to the morphism.
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyNextElementsToNextGraphs() throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Copies the contained <code>SingleElement</code> nextElement to the next graphs.
	 * A corresponding <code>SingleElement</code> object is created in these graphs and a SingleElementMapping object is added to the morphism.
	 * @param the <code>SingleElement</code> to be copied.
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void copyNextElementToNextGraphs(Element nextElement) throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Copies the contained <code>SingleElement</code> nextElement to the previous graph or recursively all previous graphs in case recursive is true.
	 * A corresponding <code>SingleElement</code> object is created in these graphs and a <code>SingleElementMapping</code> object is added to the morphism.
	 * @param nextElement the <code>SingleElement</code> to be copied
	 * @param recursive if true, the object is copied recursively to all previous graphs
	 * <!-- end-user-doc -->
	 * @model recursiveRequired="true"
	 * @generated
	 */
	void copyNextElementToPreviousGraphs(Element nextElement, boolean recursive);

	/**
	 * <!-- begin-user-doc -->
	 * Copies all contained <code>SingleElement</code> objects to the previous graph or recursively all previous graphs in case recursive is true.
	 * Corresponding <code>SingleElement</code> objects are created in these graphs and <code>SingleElementMapping</code> objects are added to the morphism.
	 * @param recursive if true, the objects are copied recursively to all previous graphs
	 * <!-- end-user-doc -->
	 * @model recursiveRequired="true"
	 * @generated
	 */
	void copyNextElementsToPreviousGraphs(boolean recursive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearMatchRecursively();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearPredicatesRecursively();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getOriginalID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveMatch(String regex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveComparison(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveMatch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	UnknownParameterValue addPrimitiveComparison();

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
	 * @model
	 * @generated
	 */
	void addPrimitiveComparison(PropertyLocation property, String attr, ComparisonOperator operator, ParameterValue input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveComparison(ParameterValue input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearComparisonRecursively();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clearPropertyRecursively();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Property copyProperty(Property property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void copyPrimitiveComparison(Comparison comparison) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void copyMatch(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Property addNewProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGraphSimple(Graph newGraph);

} // SingleElement
