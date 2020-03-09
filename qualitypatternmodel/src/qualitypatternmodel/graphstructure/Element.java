/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getRelationFromPrevious <em>Relation From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getProperties <em>Properties</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getGetAllElements <em>Get All Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getGetAllRelations <em>Get All Relations</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#isPredicatesAreBeingTranslated <em>Predicates Are Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends qualitypatternmodel.graphstructure.Comparable, PatternElement {
	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.BooleanOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.BooleanOperator#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_Predicates()
	 * @see qualitypatternmodel.functions.BooleanOperator#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EList<BooleanOperator> getPredicates();

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
	 * Returns the value of the '<em><b>Relation From Previous</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getRelationTo <em>Relation To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation From Previous</em>' containment reference.
	 * @see #setRelationFromPrevious(Relation)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_RelationFromPrevious()
	 * @see qualitypatternmodel.graphstructure.Relation#getRelationTo
	 * @model opposite="relationTo" containment="true"
	 * @generated
	 */
	Relation getRelationFromPrevious();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Element#getRelationFromPrevious <em>Relation From Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation From Previous</em>' containment reference.
	 * @see #getRelationFromPrevious()
	 * @generated
	 */
	void setRelationFromPrevious(Relation value);

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
	 * Returns the value of the '<em><b>Get All Elements</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Elements</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_GetAllElements()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t self.getNextElements()-&gt;collect(e: Element | e.getAllElements)-&gt;asSet()-&gt;including(self)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Element> getGetAllElements();

	/**
	 * Returns the value of the '<em><b>Get All Relations</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Relations</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getElement_GetAllRelations()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t self.getNextElements()-&gt;collect(e: Element | e.getAllRelations)-&gt;asSet()-&gt;including(self.relationFromPrevious)'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Relation> getGetAllRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	int getGraphDepth() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a <code>String</code> representing the XPath predicates that correspond to the predicates specified for <code>this</code> which require the existence of certain related elements.
	 * @param location the <code>Location</code> of the <code>Element</code> <code>this</code> in the pattern
	 * @return the <code>String</code> representing the XPath predicates that correspond to the predicates specified for <code>this</code> which require the existence of certain related elements.
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translateElementExistencePredicates(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Adds a predicate which compares a <code>Property</code> of <code>this</code> with an <code>Input</code>.
	 * For this purpose, new <code>Property</code> and <code>Comparison</code> objects are created automatically.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Adds a predicate which matches a <code>Property</code> of <code>this</code> against a regular expression provided via a <code>TextLiteral</code>.
	 * For this purpose, new <code>Property</code> and <code>Match</code> objects are created automatically.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPrimitiveMatch();

	/**
	 * <!-- begin-user-doc -->
	 * Returns all following <code>SingleElement</code> and <code>SetElement</code> objects.
	 * @return an <code>EList</code> containing all following <code>SingleElement</code> and <code>SetElement</code> objects
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Element> getNextElements();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the <code>SingleElement</code> or <code>SetElement</code> that contains <code>this</code>.
	 * @return the <code>SingleElement</code> or <code>SetElement</code> that contains <code>this</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Element getPreviousElement() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns all <code>Operator</code> objects specified to be predicates of <code>this</code> or of following elements.
	 * @return the list of <code>Operator</code> objects specified to be predicates of <code>this</code> or of following elements
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Operator> getAllOperators() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns all <code>Input</code> objects .
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Input> getAllVariables() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a <code>String</code> representing the XPath expression for referencing the XQuery equivalent to this <code>Element</code> either via its corresponding XQuery variable or via XPath's context feature.
	 * @return the <code>String</code> representing the XPath expression for referencing the XQuery equivalent to this <code>Element</code> either via its corresponding XQuery variable or via XPath's context feature
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getXQueryRepresentation(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a <code>String</code> representing the XPath path expression for navigating from the previous element to <code>this</code> element.
	 * @return the <code>String</code> representing the XPath path expression for navigating from the previous element to <code>this</code> element.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String translatePathFromPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a <code>String</code> representing the XQuery variable corresponding to this <code>Element</code>.
	 * @return the <code>String</code> representing the XQuery variable
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getXQueryVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getOriginalID();

	/**
	 * <!-- begin-user-doc -->
 	 * Returns a <code>String</code> representing the XPath predicates corresponding to the predicates of this object.
 	 * Each predicate is surrounded by square brackets.
	 * @param location the <code>Location</code> of the <code>Element</code> this in the pattern
	 * @return the <code>String</code> representing the XPath predicates
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translatePredicatesViaBrackets(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
  	 * Returns a <code>String</code> representing the XPath predicates corresponding to the predicates of this object as a single boolean expression.
	 * @param location the <code>Location</code> of the <code>Element</code> this in the pattern
	 * @return the <code>String</code> representing the XPath predicates
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String translatePredicatesViaAnd(Location location) throws InvalidityException;
	
	void resetCountOperatorRecursively();
	
	void clearMatchRecursively();

} // Element
