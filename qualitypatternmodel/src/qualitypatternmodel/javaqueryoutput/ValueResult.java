/**
 */
package qualitypatternmodel.javaqueryoutput;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.ValueResult#getCorrespondsTo <em>Corresponds To</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getValueResult()
 * @model
 * @generated
 */
public interface ValueResult extends InterimResult {
	/**
	 * Returns the value of the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponds To</em>' reference.
	 * @see #setCorrespondsTo(ValueInterim)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getValueResult_CorrespondsTo()
	 * @model
	 * @generated
	 */
	ValueInterim getCorrespondsTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.ValueResult#getCorrespondsTo <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponds To</em>' reference.
	 * @see #getCorrespondsTo()
	 * @generated
	 */
	void setCorrespondsTo(ValueInterim value);

} // ValueResult
