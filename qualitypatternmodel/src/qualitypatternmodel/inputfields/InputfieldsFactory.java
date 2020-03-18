/**
 */
package qualitypatternmodel.inputfields;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.inputfields.InputfieldsPackage
 * @generated
 */
public interface InputfieldsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputfieldsFactory eINSTANCE = qualitypatternmodel.inputfields.impl.InputfieldsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Comp Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Option</em>'.
	 * @generated
	 */
	CompOption createCompOption();

	/**
	 * Returns a new object of class '<em>Property Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Option</em>'.
	 * @generated
	 */
	PropertyOption createPropertyOption();

	/**
	 * Returns a new object of class '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List</em>'.
	 * @generated
	 */
	ParameterList createParameterList();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Text List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text List</em>'.
	 * @generated
	 */
	TextList createTextList();

	/**
	 * Returns a new object of class '<em>Text Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Literal</em>'.
	 * @generated
	 */
	TextLiteral createTextLiteral();

	/**
	 * Returns a new object of class '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number</em>'.
	 * @generated
	 */
	Number createNumber();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns a new object of class '<em>Unknown Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Input Value</em>'.
	 * @generated
	 */
	UnknownInputValue createUnknownInputValue();

	/**
	 * Returns a new object of class '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time</em>'.
	 * @generated
	 */
	DateTime createDateTime();

	/**
	 * Returns a new object of class '<em>Axis Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axis Option</em>'.
	 * @generated
	 */
	AxisOption createAxisOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InputfieldsPackage getInputfieldsPackage();

} //InputfieldsFactory
