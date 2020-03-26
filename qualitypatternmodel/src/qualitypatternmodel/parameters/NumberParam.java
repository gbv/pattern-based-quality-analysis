/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.NumberParam#getCountComparisons <em>Count Comparisons</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam()
 * @model
 * @generated
 */
public interface NumberParam extends ParameterValue, CountConditionArgument {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_Value()
	 * @model default="0.0"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.NumberParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Count Comparisons</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.CountCondition}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountCondition#getNumberParam <em>Number Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Comparisons</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getNumberParam_CountComparisons()
	 * @see qualitypatternmodel.patternstructure.CountCondition#getNumberParam
	 * @model opposite="numberParam"
	 * @generated
	 */
	EList<CountCondition> getCountComparisons();

} // Number
