/**
 */
package qualitypatternmodel.inputfields;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.Text#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Input {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getText_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.Text#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Text
