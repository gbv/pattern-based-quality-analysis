/**
 */
package QualityPatternModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.Count#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getCount()
 * @model
 * @generated
 */
public interface Count extends NumberOperators {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(SetElement)
	 * @see QualityPatternModel.QualityPatternModelPackage#getCount_Argument()
	 * @model required="true"
	 * @generated
	 */
	SetElement getArgument();

	/**
	 * Sets the value of the '{@link QualityPatternModel.Count#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(SetElement value);

} // Count
