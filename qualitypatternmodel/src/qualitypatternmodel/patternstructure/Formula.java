/**
 */
package qualitypatternmodel.patternstructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * Represents boolean operators
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Formula#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Formula#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Formula#getCondition2 <em>Condition2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getFormula_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Formula#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getFormula1 <em>Formula1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getFormula_Condition()
	 * @see qualitypatternmodel.patternstructure.Condition#getFormula1
	 * @model opposite="formula1" containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Formula#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Condition2</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getFormula2 <em>Formula2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition2</em>' containment reference.
	 * @see #setCondition2(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getFormula_Condition2()
	 * @see qualitypatternmodel.patternstructure.Condition#getFormula2
	 * @model opposite="formula2" containment="true"
	 * @generated
	 */
	Condition getCondition2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Formula#getCondition2 <em>Condition2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition2</em>' containment reference.
	 * @see #getCondition2()
	 * @generated
	 */
	void setCondition2(Condition value);

} // Formula
