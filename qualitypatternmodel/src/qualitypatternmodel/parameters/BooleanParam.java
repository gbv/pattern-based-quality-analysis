/**
 */
package qualitypatternmodel.parameters;

import qualitypatternmodel.functions.Match;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.BooleanParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.BooleanParam#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getBooleanParam()
 * @model
 * @generated
 */
public interface BooleanParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBooleanParam_Value()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.BooleanParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Match#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference.
	 * @see #setMatch(Match)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getBooleanParam_Match()
	 * @see qualitypatternmodel.functions.Match#getOption
	 * @model opposite="option"
	 * @generated
	 */
	Match getMatch();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.BooleanParam#getMatch <em>Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(Match value);

} // Boolean
