/**
 */
package qualitypatternmodel.inputfields;

import qualitypatternmodel.functions.Match;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.TextLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.TextLiteral#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getTextLiteral()
 * @model
 * @generated
 */
public interface TextLiteral extends Text {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getTextLiteral_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.TextLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Match#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference.
	 * @see #setMatch(Match)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getTextLiteral_Match()
	 * @see qualitypatternmodel.functions.Match#getRegularExpression
	 * @model opposite="regularExpression"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.TextLiteral#getMatch <em>Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // TextLiteral
