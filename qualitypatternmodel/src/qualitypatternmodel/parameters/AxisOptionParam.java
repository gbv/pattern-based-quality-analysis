/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.AxisOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.AxisOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.AxisOptionParam#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getAxisOptionParam()
 * @model
 * @generated
 */
public interface AxisOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.Axis}.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see qualitypatternmodel.parameters.ParametersPackage#getAxisOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<Axis> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see #setValue(Axis)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getAxisOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	Axis getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.AxisOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Axis value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getAxisOptionParam_Relation()
	 * @see qualitypatternmodel.graphstructure.Relation#getOption
	 * @model opposite="option"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.AxisOptionParam#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

} // AxisOption