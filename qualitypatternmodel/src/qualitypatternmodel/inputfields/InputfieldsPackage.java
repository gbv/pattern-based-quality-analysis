/**
 */
package qualitypatternmodel.inputfields;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.inputfields.InputfieldsFactory
 * @model kind="package"
 * @generated
 */
public interface InputfieldsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inputfields";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "inputfields";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inputfields";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputfieldsPackage eINSTANCE = qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.inputfields.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.inputfields.impl.InputImpl
	 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = GraphstructurePackage.GRAPH_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VARIABLE_LIST = GraphstructurePackage.GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DESCRIPTION = GraphstructurePackage.GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_PREDEFINED = GraphstructurePackage.GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = GraphstructurePackage.GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___TO_XQUERY__LOCATION = GraphstructurePackage.GRAPH_ELEMENT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_ALL_VARIABLES = GraphstructurePackage.GRAPH_ELEMENT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___IS_VALID__BOOLEAN_INT = GraphstructurePackage.GRAPH_ELEMENT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_NEW_ID = GraphstructurePackage.GRAPH_ELEMENT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___PREPARE_TRANSLATION = GraphstructurePackage.GRAPH_ELEMENT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___GET_RETURN_TYPE = GraphstructurePackage.GRAPH_ELEMENT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___IS_TRANSLATABLE = GraphstructurePackage.GRAPH_ELEMENT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___INPUT_IS_VALID = GraphstructurePackage.GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = GraphstructurePackage.GRAPH_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.inputfields.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.inputfields.impl.NumberImpl
	 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VARIABLE_LIST = INPUT__VARIABLE_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DESCRIPTION = INPUT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__IS_PREDEFINED = INPUT__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__NUMBER = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___TO_XQUERY__LOCATION = INPUT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___GET_ALL_VARIABLES = INPUT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___IS_VALID__BOOLEAN_INT = INPUT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___GET_NEW_ID = INPUT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___PREPARE_TRANSLATION = INPUT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___IS_TRANSLATABLE = INPUT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.inputfields.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.inputfields.impl.BooleanImpl
	 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VARIABLE_LIST = INPUT__VARIABLE_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DESCRIPTION = INPUT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__IS_PREDEFINED = INPUT__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__BOOL = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___TO_XQUERY__LOCATION = INPUT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___GET_ALL_VARIABLES = INPUT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___IS_VALID__BOOLEAN_INT = INPUT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___GET_NEW_ID = INPUT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___PREPARE_TRANSLATION = INPUT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___IS_TRANSLATABLE = INPUT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.inputfields.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.inputfields.impl.OptionImpl
	 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VARIABLE_LIST = INPUT__VARIABLE_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DESCRIPTION = INPUT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__IS_PREDEFINED = INPUT__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTIONS = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__SELECTION = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = INPUT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___TO_XQUERY__LOCATION = INPUT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___GET_ALL_VARIABLES = INPUT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___IS_VALID__BOOLEAN_INT = INPUT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___GET_NEW_ID = INPUT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___PREPARE_TRANSLATION = INPUT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___IS_TRANSLATABLE = INPUT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION___IS_VALID__BOOLEAN_INT_CLASS = INPUT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = INPUT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.inputfields.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.inputfields.impl.TextImpl
	 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VARIABLE_LIST = INPUT__VARIABLE_LIST;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DESCRIPTION = INPUT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Predefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__IS_PREDEFINED = INPUT__IS_PREDEFINED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To XQuery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___TO_XQUERY__LOCATION = INPUT___TO_XQUERY__LOCATION;

	/**
	 * The operation id for the '<em>Get All Variables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___GET_ALL_VARIABLES = INPUT___GET_ALL_VARIABLES;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___IS_VALID__BOOLEAN_INT = INPUT___IS_VALID__BOOLEAN_INT;

	/**
	 * The operation id for the '<em>Get New Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___GET_NEW_ID = INPUT___GET_NEW_ID;

	/**
	 * The operation id for the '<em>Prepare Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___PREPARE_TRANSLATION = INPUT___PREPARE_TRANSLATION;

	/**
	 * The operation id for the '<em>Get Return Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___GET_RETURN_TYPE = INPUT___GET_RETURN_TYPE;

	/**
	 * The operation id for the '<em>Is Translatable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___IS_TRANSLATABLE = INPUT___IS_TRANSLATABLE;

	/**
	 * The operation id for the '<em>Input Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT___INPUT_IS_VALID = INPUT___INPUT_IS_VALID;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.inputfields.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see qualitypatternmodel.inputfields.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.inputfields.Input#getVariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable List</em>'.
	 * @see qualitypatternmodel.inputfields.Input#getVariableList()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_VariableList();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.inputfields.Input#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see qualitypatternmodel.inputfields.Input#getDescription()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Description();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.inputfields.Input#isIsPredefined <em>Is Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Predefined</em>'.
	 * @see qualitypatternmodel.inputfields.Input#isIsPredefined()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_IsPredefined();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.inputfields.Input#inputIsValid() <em>Input Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Is Valid</em>' operation.
	 * @see qualitypatternmodel.inputfields.Input#inputIsValid()
	 * @generated
	 */
	EOperation getInput__InputIsValid();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.inputfields.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see qualitypatternmodel.inputfields.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.inputfields.Number#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see qualitypatternmodel.inputfields.Number#getNumber()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Number();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.inputfields.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see qualitypatternmodel.inputfields.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.inputfields.Boolean#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see qualitypatternmodel.inputfields.Boolean#getBool()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Bool();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.inputfields.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see qualitypatternmodel.inputfields.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute list '{@link qualitypatternmodel.inputfields.Option#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see qualitypatternmodel.inputfields.Option#getOptions()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Options();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.inputfields.Option#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see qualitypatternmodel.inputfields.Option#getSelection()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Selection();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.inputfields.Option#isValid(boolean, int, java.lang.Class) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see qualitypatternmodel.inputfields.Option#isValid(boolean, int, java.lang.Class)
	 * @generated
	 */
	EOperation getOption__IsValid__boolean_int_Class();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.inputfields.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see qualitypatternmodel.inputfields.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.inputfields.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see qualitypatternmodel.inputfields.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputfieldsFactory getInputfieldsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link qualitypatternmodel.inputfields.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.inputfields.impl.InputImpl
		 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Variable List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__VARIABLE_LIST = eINSTANCE.getInput_VariableList();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DESCRIPTION = eINSTANCE.getInput_Description();

		/**
		 * The meta object literal for the '<em><b>Is Predefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__IS_PREDEFINED = eINSTANCE.getInput_IsPredefined();

		/**
		 * The meta object literal for the '<em><b>Input Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INPUT___INPUT_IS_VALID = eINSTANCE.getInput__InputIsValid();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.inputfields.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.inputfields.impl.NumberImpl
		 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__NUMBER = eINSTANCE.getNumber_Number();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.inputfields.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.inputfields.impl.BooleanImpl
		 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__BOOL = eINSTANCE.getBoolean_Bool();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.inputfields.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.inputfields.impl.OptionImpl
		 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTIONS = eINSTANCE.getOption_Options();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__SELECTION = eINSTANCE.getOption_Selection();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTION___IS_VALID__BOOLEAN_INT_CLASS = eINSTANCE.getOption__IsValid__boolean_int_Class();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.inputfields.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.inputfields.impl.TextImpl
		 * @see qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

	}

} //InputfieldsPackage
