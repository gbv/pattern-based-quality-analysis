/**
 */
package qualitypatternmodel.execution.impl;

import org.basex.core.BaseXException;
import org.basex.core.Context;

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
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.LocalXmlDatabase;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.ServerXmlDatabase;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.execution.XmlResult;

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
	private EClass databaseEClass = null;

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
	private EClass xmlDatabaseEClass = null;

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
	private EDataType baseXExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseXContextWrapperEDataType = null;

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
	public EAttribute getDatabase_Name() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(2);
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
	public EOperation getDatabase__CountProblems__CompletePattern() {
		return databaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabase__CountMatches__CompletePattern() {
		return databaseEClass.getEOperations().get(2);
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
	public EAttribute getResult_QueryResult() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResult__Split() {
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
	public EClass getXmlDatabase() {
		return xmlDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_ElementNames() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_AttributeNames() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_RecordedAttributeValues() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_RecordedDataValues() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_Context() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__AnalyseDatabase() {
		return xmlDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__AnalyseSchema() {
		return xmlDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__RecordAttributeValue() {
		return xmlDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__RecordDataValue() {
		return xmlDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__RemoveAttributeValue() {
		return xmlDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__RemoveDataValue() {
		return xmlDatabaseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Init() {
		return xmlDatabaseEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Open() {
		return xmlDatabaseEClass.getEOperations().get(7);
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
	public EAttribute getLocalXmlDatabase_SchemaPath() {
		return (EAttribute)localXmlDatabaseEClass.getEStructuralFeatures().get(1);
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
		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__RESULTS);
		createEReference(databaseEClass, DATABASE__PATTERNS);
		createEAttribute(databaseEClass, DATABASE__NAME);
		createEOperation(databaseEClass, DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING);
		createEOperation(databaseEClass, DATABASE___COUNT_PROBLEMS__COMPLETEPATTERN);
		createEOperation(databaseEClass, DATABASE___COUNT_MATCHES__COMPLETEPATTERN);

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
		createEAttribute(resultEClass, RESULT__QUERY_RESULT);
		createEOperation(resultEClass, RESULT___SPLIT);

		xmlResultEClass = createEClass(XML_RESULT);

		xmlDatabaseEClass = createEClass(XML_DATABASE);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__ELEMENT_NAMES);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__ATTRIBUTE_NAMES);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__RECORDED_ATTRIBUTE_VALUES);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__RECORDED_DATA_VALUES);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__CONTEXT);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___ANALYSE_DATABASE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___ANALYSE_SCHEMA);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___RECORD_ATTRIBUTE_VALUE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___RECORD_DATA_VALUE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___REMOVE_ATTRIBUTE_VALUE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___REMOVE_DATA_VALUE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___INIT);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___OPEN);

		localXmlDatabaseEClass = createEClass(LOCAL_XML_DATABASE);
		createEAttribute(localXmlDatabaseEClass, LOCAL_XML_DATABASE__DATA_PATH);
		createEAttribute(localXmlDatabaseEClass, LOCAL_XML_DATABASE__SCHEMA_PATH);
		createEOperation(localXmlDatabaseEClass, LOCAL_XML_DATABASE___CREATE);

		serverXmlDatabaseEClass = createEClass(SERVER_XML_DATABASE);

		databasesEClass = createEClass(DATABASES);
		createEReference(databasesEClass, DATABASES__XML_DATABASES);

		// Create data types
		baseXExceptionWrapperEDataType = createEDataType(BASE_XEXCEPTION_WRAPPER);
		baseXContextWrapperEDataType = createEDataType(BASE_XCONTEXT_WRAPPER);
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
		xmlDatabaseEClass.getESuperTypes().add(this.getDatabase());
		localXmlDatabaseEClass.getESuperTypes().add(this.getXmlDatabase());
		serverXmlDatabaseEClass.getESuperTypes().add(this.getXmlDatabase());

		// Initialize classes, features, and operations; add parameters
		initEClass(databaseEClass, Database.class, "Database", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Results(), this.getResult(), this.getResult_Database(), "results", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Patterns(), thePatternstructurePackage.getCompletePattern(), thePatternstructurePackage.getCompletePattern_Database(), "patterns", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDatabase__Execute__CompletePattern_String_String(), this.getResult(), "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getCompletePattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "person", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getDatabase__CountProblems__CompletePattern(), ecorePackage.getEInt(), "countProblems", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getCompletePattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDatabase__CountMatches__CompletePattern(), ecorePackage.getEInt(), "countMatches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getCompletePattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEAttribute(getResult_QueryResult(), ecorePackage.getEString(), "queryResult", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResult__Split(), ecorePackage.getEString(), "split", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlResultEClass, XmlResult.class, "XmlResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlDatabaseEClass, XmlDatabase.class, "XmlDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlDatabase_ElementNames(), ecorePackage.getEString(), "elementNames", null, 0, -1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlDatabase_AttributeNames(), ecorePackage.getEString(), "attributeNames", null, 0, -1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlDatabase_RecordedAttributeValues(), ecorePackage.getEString(), "recordedAttributeValues", null, 0, -1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlDatabase_RecordedDataValues(), ecorePackage.getEString(), "recordedDataValues", null, 0, -1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlDatabase_Context(), this.getBaseXContextWrapper(), "context", null, 0, 1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlDatabase__AnalyseDatabase(), null, "analyseDatabase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDatabase__AnalyseSchema(), null, "analyseSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		initEOperation(getXmlDatabase__RecordAttributeValue(), null, "recordAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlDatabase__RecordDataValue(), null, "recordDataValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlDatabase__RemoveAttributeValue(), null, "removeAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlDatabase__RemoveDataValue(), null, "removeDataValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDatabase__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDatabase__Open(), null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		initEClass(localXmlDatabaseEClass, LocalXmlDatabase.class, "LocalXmlDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalXmlDatabase_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, LocalXmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalXmlDatabase_SchemaPath(), ecorePackage.getEString(), "schemaPath", null, 0, 1, LocalXmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocalXmlDatabase__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		initEClass(serverXmlDatabaseEClass, ServerXmlDatabase.class, "ServerXmlDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databasesEClass, Databases.class, "Databases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabases_XmlDatabases(), this.getXmlDatabase(), null, "xmlDatabases", null, 0, -1, Databases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(baseXExceptionWrapperEDataType, BaseXException.class, "BaseXExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(baseXContextWrapperEDataType, Context.class, "BaseXContextWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExecutionPackageImpl