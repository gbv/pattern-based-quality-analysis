/**
 */
package qualitypatternmodel;

import qualitypatternmodel.inputfields.XSType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.Boolean#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.QualitypatternmodelPackage#getBoolean()
 * @model
 * @generated
 */
public interface Boolean extends XSType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(java.lang.Boolean)
	 * @see qualitypatternmodel.QualitypatternmodelPackage#getBoolean_Value()
	 * @model default="true"
	 * @generated
	 */
	java.lang.Boolean getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.Boolean#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(java.lang.Boolean value);

} // Boolean
