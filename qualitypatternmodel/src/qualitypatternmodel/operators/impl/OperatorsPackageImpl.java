/**
 */
package qualitypatternmodel.operators.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.exceptions.OperatorCycleException;

import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;

import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NumberOperator;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.ReferenceOperator;

import qualitypatternmodel.operators.util.OperatorsValidator;

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
public class OperatorsPackageImpl extends EPackageImpl implements OperatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operatorCycleExceptionWrapperEDataType = null;

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
	 * @see qualitypatternmodel.operators.OperatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OperatorsPackageImpl() {
		super(eNS_URI, OperatorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OperatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OperatorsPackage init() {
		if (isInited) return (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOperatorsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = registeredOperatorsPackage instanceof OperatorsPackageImpl ? (OperatorsPackageImpl)registeredOperatorsPackage : new OperatorsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		PatternstructurePackageImpl thePatternstructurePackage = (PatternstructurePackageImpl)(registeredPackage instanceof PatternstructurePackageImpl ? registeredPackage : PatternstructurePackage.eINSTANCE);

		// Create package meta-data objects
		theOperatorsPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();

		// Initialize created meta-data
		theOperatorsPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOperatorsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OperatorsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOperatorsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OperatorsPackage.eNS_URI, theOperatorsPackage);
		return theOperatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanOperator() {
		return booleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanOperator_Elements() {
		return (EReference)booleanOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__AddElement__Element() {
		return booleanOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__RemoveElement__Element() {
		return booleanOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__CreateParameters() {
		return booleanOperatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanOperator__RemoveParametersFromParameterList() {
		return booleanOperatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperator_OperatorList() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetAllOperators() {
		return operatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetRootBooleanOperators() {
		return operatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__IsCycleFree__EList() {
		return operatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__IsCycleFree() {
		return operatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__GetArguments() {
		return operatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperator__Validate__DiagnosticChain_Map() {
		return operatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOperator() {
		return numberOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Property() {
		return (EReference)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_Option() {
		return (EReference)matchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMatch_RegularExpression() {
		return (EReference)matchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMatch__GetElement() {
		return matchEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMatch__Copy() {
		return matchEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_Argument1() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_Argument2() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparison_Type() {
		return (EAttribute)comparisonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_Option() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparison_OptionParam() {
		return (EReference)comparisonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparison__IsPrimitive() {
		return comparisonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparison__GetElement() {
		return comparisonEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparison__Copy() {
		return comparisonEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatorList() {
		return operatorListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatorList_Graph() {
		return (EReference)operatorListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatorList_Operators() {
		return (EReference)operatorListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperatorList__Add__Operator() {
		return operatorListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceOperator() {
		return referenceOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceOperator_Property2() {
		return (EReference)referenceOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceOperator_Property1() {
		return (EReference)referenceOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceOperator_Type() {
		return (EAttribute)referenceOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferenceOperator__Copy() {
		return referenceOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOperatorCycleExceptionWrapper() {
		return operatorCycleExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorsFactory getOperatorsFactory() {
		return (OperatorsFactory)getEFactoryInstance();
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
		booleanOperatorEClass = createEClass(BOOLEAN_OPERATOR);
		createEReference(booleanOperatorEClass, BOOLEAN_OPERATOR__ELEMENTS);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___ADD_ELEMENT__ELEMENT);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___REMOVE_ELEMENT__ELEMENT);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___CREATE_PARAMETERS);
		createEOperation(booleanOperatorEClass, BOOLEAN_OPERATOR___REMOVE_PARAMETERS_FROM_PARAMETER_LIST);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__OPERATOR_LIST);
		createEOperation(operatorEClass, OPERATOR___GET_ALL_OPERATORS);
		createEOperation(operatorEClass, OPERATOR___GET_ROOT_BOOLEAN_OPERATORS);
		createEOperation(operatorEClass, OPERATOR___IS_CYCLE_FREE__ELIST);
		createEOperation(operatorEClass, OPERATOR___IS_CYCLE_FREE);
		createEOperation(operatorEClass, OPERATOR___GET_ARGUMENTS);
		createEOperation(operatorEClass, OPERATOR___VALIDATE__DIAGNOSTICCHAIN_MAP);

		numberOperatorEClass = createEClass(NUMBER_OPERATOR);

		matchEClass = createEClass(MATCH);
		createEReference(matchEClass, MATCH__PROPERTY);
		createEReference(matchEClass, MATCH__OPTION);
		createEReference(matchEClass, MATCH__REGULAR_EXPRESSION);
		createEOperation(matchEClass, MATCH___GET_ELEMENT);
		createEOperation(matchEClass, MATCH___COPY);

		comparisonEClass = createEClass(COMPARISON);
		createEReference(comparisonEClass, COMPARISON__ARGUMENT1);
		createEReference(comparisonEClass, COMPARISON__ARGUMENT2);
		createEAttribute(comparisonEClass, COMPARISON__TYPE);
		createEReference(comparisonEClass, COMPARISON__OPTION);
		createEReference(comparisonEClass, COMPARISON__OPTION_PARAM);
		createEOperation(comparisonEClass, COMPARISON___IS_PRIMITIVE);
		createEOperation(comparisonEClass, COMPARISON___GET_ELEMENT);
		createEOperation(comparisonEClass, COMPARISON___COPY);

		operatorListEClass = createEClass(OPERATOR_LIST);
		createEReference(operatorListEClass, OPERATOR_LIST__GRAPH);
		createEReference(operatorListEClass, OPERATOR_LIST__OPERATORS);
		createEOperation(operatorListEClass, OPERATOR_LIST___ADD__OPERATOR);

		referenceOperatorEClass = createEClass(REFERENCE_OPERATOR);
		createEReference(referenceOperatorEClass, REFERENCE_OPERATOR__PROPERTY2);
		createEReference(referenceOperatorEClass, REFERENCE_OPERATOR__PROPERTY1);
		createEAttribute(referenceOperatorEClass, REFERENCE_OPERATOR__TYPE);
		createEOperation(referenceOperatorEClass, REFERENCE_OPERATOR___COPY);

		// Create enums
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);

		// Create data types
		operatorCycleExceptionWrapperEDataType = createEDataType(OPERATOR_CYCLE_EXCEPTION_WRAPPER);
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
		GraphstructurePackage theGraphstructurePackage = (GraphstructurePackage)EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		booleanOperatorEClass.getESuperTypes().add(this.getOperator());
		operatorEClass.getESuperTypes().add(theGraphstructurePackage.getComparable());
		operatorEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		numberOperatorEClass.getESuperTypes().add(this.getOperator());
		matchEClass.getESuperTypes().add(this.getBooleanOperator());
		comparisonEClass.getESuperTypes().add(this.getBooleanOperator());
		operatorListEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		referenceOperatorEClass.getESuperTypes().add(this.getBooleanOperator());

		// Initialize classes, features, and operations; add parameters
		initEClass(booleanOperatorEClass, BooleanOperator.class, "BooleanOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanOperator_Elements(), theGraphstructurePackage.getElement(), theGraphstructurePackage.getElement_Predicates(), "elements", null, 0, -1, BooleanOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBooleanOperator__AddElement__Element(), null, "addElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBooleanOperator__RemoveElement__Element(), null, "removeElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBooleanOperator__CreateParameters(), null, "createParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBooleanOperator__RemoveParametersFromParameterList(), null, "removeParametersFromParameterList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_OperatorList(), this.getOperatorList(), this.getOperatorList_Operators(), "operatorList", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOperator__GetAllOperators(), this.getOperator(), "getAllOperators", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getOperator__GetRootBooleanOperators(), this.getBooleanOperator(), "getRootBooleanOperators", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperator__IsCycleFree__EList(), null, "isCycleFree", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperator(), "visitedOperators", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatorCycleExceptionWrapper());

		op = initEOperation(getOperator__IsCycleFree(), null, "isCycleFree", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getOperatorCycleExceptionWrapper());

		initEOperation(getOperator__GetArguments(), theGraphstructurePackage.getComparable(), "getArguments", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperator__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numberOperatorEClass, NumberOperator.class, "NumberOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatch_Property(), theGraphstructurePackage.getProperty(), theGraphstructurePackage.getProperty_Match(), "property", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_Option(), theParametersPackage.getBooleanParam(), theParametersPackage.getBooleanParam_Matches(), "option", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMatch_RegularExpression(), theParametersPackage.getTextLiteralParam(), theParametersPackage.getTextLiteralParam_Matches(), "regularExpression", null, 1, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMatch__GetElement(), theGraphstructurePackage.getElement(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMatch__Copy(), this.getMatch(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparison_Argument1(), theGraphstructurePackage.getComparable(), theGraphstructurePackage.getComparable_Comparison1(), "argument1", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_Argument2(), theGraphstructurePackage.getComparable(), theGraphstructurePackage.getComparable_Comparison2(), "argument2", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparison_Type(), theGraphstructurePackage.getReturnType(), "type", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparison_Option(), theParametersPackage.getComparisonOptionParam(), theParametersPackage.getComparisonOptionParam_Comparisons(), "option", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theParametersPackage.getOptionParam());
		g2 = createEGenericType(this.getComparisonOperator());
		g1.getETypeArguments().add(g2);
		initEReference(getComparison_OptionParam(), g1, theParametersPackage.getOptionParam_Comparison(), "optionParam", null, 1, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComparison__IsPrimitive(), ecorePackage.getEBoolean(), "isPrimitive", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparison__GetElement(), theGraphstructurePackage.getElement(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparison__Copy(), this.getComparison(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operatorListEClass, OperatorList.class, "OperatorList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatorList_Graph(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_OperatorList(), "graph", null, 1, 1, OperatorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorList_Operators(), this.getOperator(), this.getOperator_OperatorList(), "operators", null, 0, -1, OperatorList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOperatorList__Add__Operator(), null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperator(), "Operator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(referenceOperatorEClass, ReferenceOperator.class, "ReferenceOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceOperator_Property2(), theGraphstructurePackage.getProperty(), theGraphstructurePackage.getProperty_ReferenceOperator2(), "property2", null, 0, 1, ReferenceOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceOperator_Property1(), theGraphstructurePackage.getProperty(), theGraphstructurePackage.getProperty_ReferenceOperator1(), "property1", null, 0, 1, ReferenceOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceOperator_Type(), theGraphstructurePackage.getReturnType(), "type", null, 0, 1, ReferenceOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReferenceOperator__Copy(), this.getReferenceOperator(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATER);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESS);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATEROREQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LESSOREQUAL);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.NOTEQUAL);

		// Initialize data types
		initEDataType(operatorCycleExceptionWrapperEDataType, OperatorCycleException.class, "OperatorCycleExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OperatorsPackageImpl
