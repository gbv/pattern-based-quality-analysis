/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.Match;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Literal</b></em>'.
 * Defines input parameter of type String.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getMatches <em>Matches</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getPropertyOptionParam <em>Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextLiteralParam#getAxisPair <em>Axis Pair</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam()
 * @model
 * @generated
 */
public interface TextLiteralParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Match}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Match#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_Matches()
	 * @see qualitypatternmodel.operators.Match#getRegularExpression
	 * @model opposite="regularExpression"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Property Option Param</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.PropertyOptionParam#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Option Param</em>' container reference.
	 * @see #setPropertyOptionParam(PropertyOptionParam)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_PropertyOptionParam()
	 * @see qualitypatternmodel.adaptionxml.PropertyOptionParam#getAttributeName
	 * @model opposite="attributeName" transient="false"
	 * @generated
	 */
	PropertyOptionParam getPropertyOptionParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getPropertyOptionParam <em>Property Option Param</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Option Param</em>' container reference.
	 * @see #getPropertyOptionParam()
	 * @generated
	 */
	void setPropertyOptionParam(PropertyOptionParam value);

	/**
	 * Returns the value of the '<em><b>Axis Pair</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.AxisPair#getTextLiteralParam <em>Text Literal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Pair</em>' container reference.
	 * @see #setAxisPair(AxisPair)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextLiteralParam_AxisPair()
	 * @see qualitypatternmodel.adaptionxml.AxisPair#getTextLiteralParam
	 * @model opposite="textLiteralParam" transient="false"
	 * @generated
	 */
	AxisPair getAxisPair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.TextLiteralParam#getAxisPair <em>Axis Pair</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Pair</em>' container reference.
	 * @see #getAxisPair()
	 * @generated
	 */
	void setAxisPair(AxisPair value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(String newValue) throws InvalidityException;

} // TextLiteral
