/**
 */
package qualitypatternmodel.adaptionneo4j;

import qualitypatternmodel.parameters.TextLiteralParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Property Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyPathParam()
 * @model
 * @generated
 */
public interface NeoPropertyPathParam extends NeoAbstractPathParam {
	/**
	 * Returns the value of the '<em><b>Neo Property Edge</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Edge</em>' reference.
	 * @see #setNeoPropertyEdge(NeoPropertyEdge)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyPathParam_NeoPropertyEdge()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyEdge#getNeoPropertyPathParam
	 * @model opposite="neoPropertyPathParam"
	 * @generated
	 */
	NeoPropertyEdge getNeoPropertyEdge();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyEdge <em>Neo Property Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Edge</em>' reference.
	 * @see #getNeoPropertyEdge()
	 * @generated
	 */
	void setNeoPropertyEdge(NeoPropertyEdge value);

	/**
	 * Returns the value of the '<em><b>Neo Property Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Property Name</em>' reference.
	 * @see #setNeoPropertyName(TextLiteralParam)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyPathParam_NeoPropertyName()
	 * @model
	 * @generated NOT
	 */
	String getNeoPropertyName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPropertyName <em>Neo Property Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Property Name</em>' reference.
	 * @see #getNeoPropertyName()
	 * @generated
	 */
	void setNeoPropertyName(TextLiteralParam value);

	/**
	 * Returns the value of the '<em><b>Neo Path Part</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path Part</em>' containment reference.
	 * @see #setNeoPathPart(NeoPathPart)
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoPropertyPathParam_NeoPathPart()
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart#getNeoPropertyPathParam
	 * @model opposite="neoPropertyPathParam" containment="true"
	 * @generated
	 */
	NeoPathPart getNeoPathPart();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam#getNeoPathPart <em>Neo Path Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Path Part</em>' containment reference.
	 * @see #getNeoPathPart()
	 * @generated
	 */
	void setNeoPathPart(NeoPathPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNeoPropertyName(String neoPropertyName);

} // NeoPropertyPathParam