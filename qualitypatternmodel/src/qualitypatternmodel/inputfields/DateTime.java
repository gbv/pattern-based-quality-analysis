/**
 */
package qualitypatternmodel.inputfields;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.DateTime#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getDateTime()
 * @model
 * @generated
 */
public interface DateTime extends InputValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getDateTime_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.DateTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DateTime
