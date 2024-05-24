/**
 */
package qualitypatternmodel.textrepresentation;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Fragment</b></em>'.
 * A fragment of a textual representation of a pattern that represents a parameter, thus gap in the text.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.ParameterFragment#getExampleValue <em>Example Value</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.ParameterFragment#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.ParameterFragment#getValueMap <em>Value Map</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterFragment()
 * @model
 * @generated
 */
public interface ParameterFragment extends Fragment, ParameterReference {
	/**
	 * Returns the value of the '<em><b>Example Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Value</em>' attribute.
	 * @see #setExampleValue(String)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterFragment_ExampleValue()
	 * @model
	 * @generated
	 */
	String getExampleValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getExampleValue <em>Example Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Value</em>' attribute.
	 * @see #getExampleValue()
	 * @generated
	 */
	void setExampleValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterFragment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Map</em>' containment reference.
	 * @see #setValueMap(ValueMap)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getParameterFragment_ValueMap()
	 * @model containment="true"
	 * @generated
	 */
	ValueMap getValueMap();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getValueMap <em>Value Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Map</em>' containment reference.
	 * @see #getValueMap()
	 * @generated
	 */
	void setValueMap(ValueMap value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValue(String value) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getValue();

} // ParameterFragment
