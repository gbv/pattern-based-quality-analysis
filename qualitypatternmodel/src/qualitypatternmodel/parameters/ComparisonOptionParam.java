/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CountCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.ComparisonOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.ComparisonOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.ComparisonOptionParam#getComparisons <em>Comparisons</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.ComparisonOptionParam#getCountCondition <em>Count Condition</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getComparisonOptionParam()
 * @model
 * @generated
 */
public interface ComparisonOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.operators.ComparisonOperator}.
	 * The literals are from the enumeration {@link qualitypatternmodel.operators.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.operators.ComparisonOperator
	 * @see qualitypatternmodel.parameters.ParametersPackage#getComparisonOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<ComparisonOperator> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.operators.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.operators.ComparisonOperator
	 * @see #setValue(ComparisonOperator)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getComparisonOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.operators.ComparisonOperator
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Comparisons</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Comparison#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparisons</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getComparisonOptionParam_Comparisons()
	 * @see qualitypatternmodel.operators.Comparison#getOption
	 * @model opposite="option"
	 * @generated
	 */
	EList<Comparison> getComparisons();

	/**
	 * Returns the value of the '<em><b>Count Condition</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.CountCondition}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountCondition#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Condition</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getComparisonOptionParam_CountCondition()
	 * @see qualitypatternmodel.patternstructure.CountCondition#getOption
	 * @model opposite="option"
	 * @generated
	 */
	EList<CountCondition> getCountCondition();

} // CompOption
