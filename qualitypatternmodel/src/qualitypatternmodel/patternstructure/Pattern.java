/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern()
 * @model abstract="true"
 * @generated
 */
public interface Pattern extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getPattern
	 * @model opposite="pattern" containment="true" required="true"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getGraph <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' containment reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Condition()
	 * @see qualitypatternmodel.patternstructure.Condition#getPattern
	 * @model opposite="pattern" containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	String generateQuery(Location location) throws InvalidityException;

	void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException;

	void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	void checkMorphismOfNextGraph() throws InvalidityException;
} // Pattern
