/**
 */
package qualitypatternmodel.execution.impl;

import java.util.Map;
import org.basex.core.BaseXException;
import org.basex.core.Context;

import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;

import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.Databaseformat;
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.LocalXmlDatabase;
import qualitypatternmodel.execution.LocalXmlSchema;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.ServerXmlDatabase;
import qualitypatternmodel.execution.ServerXmlSchema;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.execution.XmlResult;

import qualitypatternmodel.execution.XmlSchemaDatabase;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;

import qualitypatternmodel.operators.OperatorsPackage;

import qualitypatternmodel.operators.impl.OperatorsPackageImpl;

import qualitypatternmodel.parameters.ParametersPackage;

import qualitypatternmodel.parameters.impl.ParametersPackageImpl;

import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionPackageImpl extends EPackageImpl implements ExecutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlDataDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localXmlDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverXmlDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToIntMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlSchemaDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localXmlSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverXmlSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseformatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseXExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseXContextWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queryExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queryIOExceptionWrapperEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qualitypatternmodel.execution.ExecutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutionPackageImpl() {
		super(eNS_URI, ExecutionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExecutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutionPackage init() {
		if (isInited) return (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExecutionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExecutionPackageImpl theExecutionPackage = registeredExecutionPackage instanceof ExecutionPackageImpl ? (ExecutionPackageImpl)registeredExecutionPackage : new ExecutionPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(registeredPackage instanceof OperatorsPackageImpl ? registeredPackage : OperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		PatternstructurePackageImpl thePatternstructurePackage = (PatternstructurePackageImpl)(registeredPackage instanceof PatternstructurePackageImpl ? registeredPackage : PatternstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		AdaptionxmlPackageImpl theAdaptionxmlPackage = (AdaptionxmlPackageImpl)(registeredPackage instanceof AdaptionxmlPackageImpl ? registeredPackage : AdaptionxmlPackage.eINSTANCE);

		// Create package meta-data objects
		theExecutionPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();

		// Initialize created meta-data
		theExecutionPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutionPackage.eNS_URI, theExecutionPackage);
		return theExecutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Database() {
		return (EReference)resultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Name() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Person() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_StartDate() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Runtime() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_ProblemNumber() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_EndDate() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Pattern() {
		return (EReference)resultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_MatchNumber() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_SplitResult() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResult__Export__String() {
		return resultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlResult() {
		return xmlResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlDataDatabase() {
		return xmlDataDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDataDatabase_Context() {
		return (EAttribute)xmlDataDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_RecordedAttributeValues() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_RecordedDataValues() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDataDatabase_Namespace() {
		return (EAttribute)xmlDataDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_XmlSchema() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_ElementNames() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_AttributeNames() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__AnalyseDatabase() {
		return xmlDataDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordAttributeValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordDataValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveAttributeValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveDataValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__Init() {
		return xmlDataDatabaseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__Open() {
		return xmlDataDatabaseEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordElementName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordAttributeName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveElementName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveAttributeName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalXmlDatabase() {
		return localXmlDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalXmlDatabase_DataPath() {
		return (EAttribute)localXmlDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalXmlDatabase__Create() {
		return localXmlDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerXmlDatabase() {
		return serverXmlDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabases() {
		return databasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabases_XmlDatabases() {
		return (EReference)databasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabases_XmlSchemata() {
		return (EReference)databasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToIntMap() {
		return stringToIntMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToIntMap_Key() {
		return (EAttribute)stringToIntMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToIntMap_Value() {
		return (EAttribute)stringToIntMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlSchemaDatabase() {
		return xmlSchemaDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlSchemaDatabase_XmlDatabases() {
		return (EReference)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlSchemaDatabase_SchemaContext() {
		return (EAttribute)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlSchemaDatabase_Namespace() {
		return (EAttribute)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlSchemaDatabase_AttributeNames() {
		return (EReference)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlSchemaDatabase_ElementNames() {
		return (EReference)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__AnalyseSchema() {
		return xmlSchemaDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__OpenSchemaDatabase() {
		return xmlSchemaDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__InitSchemaDatabase() {
		return xmlSchemaDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckFollowingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckParentInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckAncestorInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckPrecedingSiblingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckDescendantInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckChildInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckAttributeInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckKeyRefInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckPrecedingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckFollowingSiblingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetAncestorsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetDescendantsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetChildrenInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetFollowingInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetPrecedingInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetParentsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetAttributesInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetFollowingSiblingsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetPrecedingSiblingsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalXmlSchema() {
		return localXmlSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalXmlSchema_SchemaPath() {
		return (EAttribute)localXmlSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocalXmlSchema__CreateSchemaDatabase() {
		return localXmlSchemaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerXmlSchema() {
		return serverXmlSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlDatabase() {
		return xmlDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_Name() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Results() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Patterns() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabase__Execute__CompletePattern_String_String() {
		return databaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabase__CountMatches__CompletePattern() {
		return databaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseformat() {
		return databaseformatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBaseXExceptionWrapper() {
		return baseXExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBaseXContextWrapper() {
		return baseXContextWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQueryExceptionWrapper() {
		return queryExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQueryIOExceptionWrapper() {
		return queryIOExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionFactory getExecutionFactory() {
		return (ExecutionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resultEClass = createEClass(RESULT);
		createEReference(resultEClass, RESULT__DATABASE);
		createEAttribute(resultEClass, RESULT__NAME);
		createEAttribute(resultEClass, RESULT__PERSON);
		createEAttribute(resultEClass, RESULT__START_DATE);
		createEAttribute(resultEClass, RESULT__RUNTIME);
		createEAttribute(resultEClass, RESULT__PROBLEM_NUMBER);
		createEAttribute(resultEClass, RESULT__END_DATE);
		createEReference(resultEClass, RESULT__PATTERN);
		createEAttribute(resultEClass, RESULT__MATCH_NUMBER);
		createEAttribute(resultEClass, RESULT__SPLIT_RESULT);
		createEOperation(resultEClass, RESULT___EXPORT__STRING);

		xmlResultEClass = createEClass(XML_RESULT);

		xmlDataDatabaseEClass = createEClass(XML_DATA_DATABASE);
		createEAttribute(xmlDataDatabaseEClass, XML_DATA_DATABASE__CONTEXT);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__RECORDED_DATA_VALUES);
		createEAttribute(xmlDataDatabaseEClass, XML_DATA_DATABASE__NAMESPACE);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__XML_SCHEMA);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__ELEMENT_NAMES);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__ATTRIBUTE_NAMES);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___ANALYSE_DATABASE);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___INIT);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___OPEN);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING);

		localXmlDatabaseEClass = createEClass(LOCAL_XML_DATABASE);
		createEAttribute(localXmlDatabaseEClass, LOCAL_XML_DATABASE__DATA_PATH);
		createEOperation(localXmlDatabaseEClass, LOCAL_XML_DATABASE___CREATE);

		serverXmlDatabaseEClass = createEClass(SERVER_XML_DATABASE);

		databasesEClass = createEClass(DATABASES);
		createEReference(databasesEClass, DATABASES__XML_DATABASES);
		createEReference(databasesEClass, DATABASES__XML_SCHEMATA);

		stringToIntMapEClass = createEClass(STRING_TO_INT_MAP);
		createEAttribute(stringToIntMapEClass, STRING_TO_INT_MAP__KEY);
		createEAttribute(stringToIntMapEClass, STRING_TO_INT_MAP__VALUE);

		xmlSchemaDatabaseEClass = createEClass(XML_SCHEMA_DATABASE);
		createEReference(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__XML_DATABASES);
		createEAttribute(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__SCHEMA_CONTEXT);
		createEAttribute(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__NAMESPACE);
		createEReference(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES);
		createEReference(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__ELEMENT_NAMES);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___ANALYSE_SCHEMA);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___OPEN_SCHEMA_DATABASE);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___INIT_SCHEMA_DATABASE);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING);

		localXmlSchemaEClass = createEClass(LOCAL_XML_SCHEMA);
		createEAttribute(localXmlSchemaEClass, LOCAL_XML_SCHEMA__SCHEMA_PATH);
		createEOperation(localXmlSchemaEClass, LOCAL_XML_SCHEMA___CREATE_SCHEMA_DATABASE);

		serverXmlSchemaEClass = createEClass(SERVER_XML_SCHEMA);

		xmlDatabaseEClass = createEClass(XML_DATABASE);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__NAME);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__RESULTS);
		createEReference(databaseEClass, DATABASE__PATTERNS);
		createEOperation(databaseEClass, DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING);
		createEOperation(databaseEClass, DATABASE___COUNT_MATCHES__COMPLETEPATTERN);

		databaseformatEClass = createEClass(DATABASEFORMAT);

		// Create data types
		baseXExceptionWrapperEDataType = createEDataType(BASE_XEXCEPTION_WRAPPER);
		baseXContextWrapperEDataType = createEDataType(BASE_XCONTEXT_WRAPPER);
		queryExceptionWrapperEDataType = createEDataType(QUERY_EXCEPTION_WRAPPER);
		queryIOExceptionWrapperEDataType = createEDataType(QUERY_IO_EXCEPTION_WRAPPER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmlResultEClass.getESuperTypes().add(this.getResult());
		xmlDataDatabaseEClass.getESuperTypes().add(this.getXmlDatabase());
		xmlDataDatabaseEClass.getESuperTypes().add(this.getDatabase());
		localXmlDatabaseEClass.getESuperTypes().add(this.getXmlDataDatabase());
		serverXmlDatabaseEClass.getESuperTypes().add(this.getXmlDataDatabase());
		xmlSchemaDatabaseEClass.getESuperTypes().add(this.getXmlDatabase());
		xmlSchemaDatabaseEClass.getESuperTypes().add(this.getDatabaseformat());
		localXmlSchemaEClass.getESuperTypes().add(this.getXmlSchemaDatabase());
		serverXmlSchemaEClass.getESuperTypes().add(this.getXmlSchemaDatabase());

		// Initialize classes, features, and operations; add parameters
		initEClass(resultEClass, Result.class, "Result", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResult_Database(), this.getDatabase(), this.getDatabase_Results(), "database", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Name(), ecorePackage.getEString(), "name", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Person(), ecorePackage.getEString(), "person", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Runtime(), ecorePackage.getELong(), "runtime", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_ProblemNumber(), ecorePackage.getEInt(), "problemNumber", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_Pattern(), thePatternstructurePackage.getCompletePattern(), null, "pattern", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_MatchNumber(), ecorePackage.getEInt(), "matchNumber", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_SplitResult(), ecorePackage.getEString(), "splitResult", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getResult__Export__String(), null, "export", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlResultEClass, XmlResult.class, "XmlResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlDataDatabaseEClass, XmlDataDatabase.class, "XmlDataDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlDataDatabase_Context(), this.getBaseXContextWrapper(), "context", null, 0, 1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_RecordedAttributeValues(), this.getStringToIntMap(), null, "recordedAttributeValues", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_RecordedDataValues(), this.getStringToIntMap(), null, "recordedDataValues", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlDataDatabase_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_XmlSchema(), this.getXmlSchemaDatabase(), this.getXmlSchemaDatabase_XmlDatabases(), "xmlSchema", null, 0, 1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_ElementNames(), this.getStringToIntMap(), null, "elementNames", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_AttributeNames(), this.getStringToIntMap(), null, "attributeNames", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__AnalyseDatabase(), null, "analyseDatabase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__RecordAttributeValue__String(), null, "recordAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RecordDataValue__String(), null, "recordDataValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveAttributeValue__String(), null, "removeAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveDataValue__String(), null, "removeDataValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__Open(), null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__RecordElementName__String(), null, "recordElementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RecordAttributeName__String(), null, "recordAttributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveElementName__String(), null, "removeElementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveAttributeName__String(), null, "removeAttributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(localXmlDatabaseEClass, LocalXmlDatabase.class, "LocalXmlDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalXmlDatabase_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, LocalXmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocalXmlDatabase__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		initEClass(serverXmlDatabaseEClass, ServerXmlDatabase.class, "ServerXmlDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databasesEClass, Databases.class, "Databases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabases_XmlDatabases(), this.getXmlDataDatabase(), null, "xmlDatabases", null, 0, -1, Databases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabases_XmlSchemata(), this.getXmlSchemaDatabase(), null, "xmlSchemata", null, 0, -1, Databases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToIntMapEClass, Map.Entry.class, "StringToIntMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToIntMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToIntMap_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlSchemaDatabaseEClass, XmlSchemaDatabase.class, "XmlSchemaDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlSchemaDatabase_XmlDatabases(), this.getXmlDataDatabase(), this.getXmlDataDatabase_XmlSchema(), "xmlDatabases", null, 0, -1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlSchemaDatabase_SchemaContext(), this.getBaseXContextWrapper(), "schemaContext", null, 0, 1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlSchemaDatabase_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlSchemaDatabase_AttributeNames(), this.getStringToIntMap(), null, "attributeNames", null, 0, -1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlSchemaDatabase_ElementNames(), this.getStringToIntMap(), null, "elementNames", null, 0, -1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlSchemaDatabase__AnalyseSchema(), null, "analyseSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__OpenSchemaDatabase(), null, "openSchemaDatabase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__InitSchemaDatabase(), null, "initSchemaDatabase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckFollowingInSchema__String_String(), ecorePackage.getEBoolean(), "checkFollowingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckParentInSchema__String_String(), ecorePackage.getEBoolean(), "checkParentInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckAncestorInSchema__String_String(), ecorePackage.getEBoolean(), "checkAncestorInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckPrecedingSiblingInSchema__String_String(), ecorePackage.getEBoolean(), "checkPrecedingSiblingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckDescendantInSchema__String_String(), ecorePackage.getEBoolean(), "checkDescendantInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckChildInSchema__String_String(), ecorePackage.getEBoolean(), "checkChildInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckAttributeInSchema__String_String(), ecorePackage.getEBoolean(), "checkAttributeInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckKeyRefInSchema__String_String(), null, "checkKeyRefInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckPrecedingInSchema__String_String(), ecorePackage.getEBoolean(), "checkPrecedingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckFollowingSiblingInSchema__String_String(), ecorePackage.getEBoolean(), "checkFollowingSiblingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetAncestorsInSchema__String(), ecorePackage.getEString(), "getAncestorsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetDescendantsInSchema__String(), ecorePackage.getEString(), "getDescendantsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetChildrenInSchema__String(), ecorePackage.getEString(), "getChildrenInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetFollowingInSchema__String(), ecorePackage.getEString(), "getFollowingInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetPrecedingInSchema__String(), ecorePackage.getEString(), "getPrecedingInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetParentsInSchema__String(), ecorePackage.getEString(), "getParentsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetAttributesInSchema__String(), ecorePackage.getEString(), "getAttributesInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetFollowingSiblingsInSchema__String(), ecorePackage.getEString(), "getFollowingSiblingsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetPrecedingSiblingsInSchema__String(), ecorePackage.getEString(), "getPrecedingSiblingsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		initEClass(localXmlSchemaEClass, LocalXmlSchema.class, "LocalXmlSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalXmlSchema_SchemaPath(), ecorePackage.getEString(), "schemaPath", null, 0, 1, LocalXmlSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocalXmlSchema__CreateSchemaDatabase(), null, "createSchemaDatabase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		initEClass(serverXmlSchemaEClass, ServerXmlSchema.class, "ServerXmlSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlDatabaseEClass, XmlDatabase.class, "XmlDatabase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Results(), this.getResult(), this.getResult_Database(), "results", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Patterns(), thePatternstructurePackage.getCompletePattern(), thePatternstructurePackage.getCompletePattern_Database(), "patterns", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDatabase__Execute__CompletePattern_String_String(), this.getResult(), "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getCompletePattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "person", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getDatabase__CountMatches__CompletePattern(), ecorePackage.getEInt(), "countMatches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getCompletePattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		initEClass(databaseformatEClass, Databaseformat.class, "Databaseformat", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(baseXExceptionWrapperEDataType, BaseXException.class, "BaseXExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseXContextWrapperEDataType, Context.class, "BaseXContextWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(queryExceptionWrapperEDataType, QueryException.class, "QueryExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(queryIOExceptionWrapperEDataType, QueryIOException.class, "QueryIOExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExecutionPackageImpl
