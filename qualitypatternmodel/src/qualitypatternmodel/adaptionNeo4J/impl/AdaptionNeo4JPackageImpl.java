/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionNeo4J.NeoAbstractNode;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;

import qualitypatternmodel.adaptionNeo4J.NeoUnspecifiedEdge;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;

import qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;

import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;

import qualitypatternmodel.execution.ExecutionPackage;

import qualitypatternmodel.execution.impl.ExecutionPackageImpl;

import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;

import qualitypatternmodel.operators.OperatorsPackage;

import qualitypatternmodel.operators.impl.OperatorsPackageImpl;

import qualitypatternmodel.parameters.ParametersPackage;

import qualitypatternmodel.parameters.impl.ParametersPackageImpl;

import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;

import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

import qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionNeo4JPackageImpl extends EPackageImpl implements AdaptionNeo4JPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoAbstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoComplexEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoSimpleEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPathPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPropertyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPropertyPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPropertyEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoAbstractEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoAbstractPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoUnspecifiedEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neoDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neoPlaceEEnum = null;

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
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptionNeo4JPackageImpl() {
		super(eNS_URI, AdaptionNeo4JFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptionNeo4JPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptionNeo4JPackage init() {
		if (isInited) return (AdaptionNeo4JPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionNeo4JPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdaptionNeo4JPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdaptionNeo4JPackageImpl theAdaptionNeo4JPackage = registeredAdaptionNeo4JPackage instanceof AdaptionNeo4JPackageImpl ? (AdaptionNeo4JPackageImpl)registeredAdaptionNeo4JPackage : new AdaptionNeo4JPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(registeredPackage instanceof ExecutionPackageImpl ? registeredPackage : ExecutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TextrepresentationPackage.eNS_URI);
		TextrepresentationPackageImpl theTextrepresentationPackage = (TextrepresentationPackageImpl)(registeredPackage instanceof TextrepresentationPackageImpl ? registeredPackage : TextrepresentationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);
		AdaptionrdfPackageImpl theAdaptionrdfPackage = (AdaptionrdfPackageImpl)(registeredPackage instanceof AdaptionrdfPackageImpl ? registeredPackage : AdaptionrdfPackage.eINSTANCE);

		// Create package meta-data objects
		theAdaptionNeo4JPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptionNeo4JPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptionNeo4JPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptionNeo4JPackage.eNS_URI, theAdaptionNeo4JPackage);
		return theAdaptionNeo4JPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoAbstractNode() {
		return neoAbstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoAbstractNode_NodePlace() {
		return (EAttribute)neoAbstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoAbstractNode__GetCypherVariable() {
		return neoAbstractNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoNode() {
		return neoNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoNode_NeoNodeLabels() {
		return (EReference)neoNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoNode__AddStringLabel__String() {
		return neoNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoEdge() {
		return neoEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoEdge_NeoPathParam() {
		return (EReference)neoEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoComplexEdge() {
		return neoComplexEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoComplexEdge_NeoPath() {
		return (EReference)neoComplexEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoComplexEdge__ValidateComplexEdge() {
		return neoComplexEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoSimpleEdge() {
		return neoSimpleEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_KeyValueParam() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_NeoEdgeLabel() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoSimpleEdge_IsLastSimpleEdge() {
		return (EAttribute)neoSimpleEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPathPart() {
		return neoPathPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoPathPart_Translated() {
		return (EAttribute)neoPathPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetSimpleEdges() {
		return neoPathPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetCypherVariable() {
		return neoPathPartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPropertyNode() {
		return neoPropertyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPropertyNode__GenerateCypherPropertyAddressing() {
		return neoPropertyNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoSimpleEdge_NeoDirection() {
		return (EAttribute)neoSimpleEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoSimpleEdge_EdgeNumber() {
		return (EAttribute)neoSimpleEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_NeoTargetNodeLabels() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__SetNeoDirection__NeoDirection() {
		return neoSimpleEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__IsLastSimpleEdge() {
		return neoSimpleEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__AddStrubgTargetNodeLabel__String() {
		return neoSimpleEdgeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__GetCypherInnerEdgeVariable() {
		return neoSimpleEdgeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPathParam() {
		return neoPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPathParam_NeoEdge() {
		return (EReference)neoPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPathParam_NeoPathPart() {
		return (EReference)neoPathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPropertyPathParam() {
		return neoPropertyPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPropertyPathParam_NeoPathPart() {
		return (EReference)neoPropertyPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPropertyPathParam_NeoPropertyEdge() {
		return (EReference)neoPropertyPathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPropertyPathParam_NeoPropertyName() {
		return (EReference)neoPropertyPathParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPropertyPathParam__SetNeoPropertyName__String() {
		return neoPropertyPathParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPropertyEdge() {
		return neoPropertyEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPropertyEdge_NeoPropertyPathParam() {
		return (EReference)neoPropertyEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPropertyEdge__GenerateCypherPropertyAddressing() {
		return neoPropertyEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoAbstractEdge() {
		return neoAbstractEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoAbstractEdge_ReturnElement() {
		return (EAttribute)neoAbstractEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoAbstractEdge__SetIsReturnElement__boolean() {
		return neoAbstractEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoAbstractPathParam() {
		return neoAbstractPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoAbstractPathParam__GetLastRelations() {
		return neoAbstractPathParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoUnspecifiedEdge() {
		return neoUnspecifiedEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoUnspecifiedEdge_NeoTargetNodeLabels() {
		return (EReference)neoUnspecifiedEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoUnspecifiedEdge_StepsInBetween() {
		return (EAttribute)neoUnspecifiedEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoUnspecifiedEdge__SetSteps__String() {
		return neoUnspecifiedEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeoDirection() {
		return neoDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeoPlace() {
		return neoPlaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptionNeo4JFactory getAdaptionNeo4JFactory() {
		return (AdaptionNeo4JFactory)getEFactoryInstance();
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
		neoAbstractNodeEClass = createEClass(NEO_ABSTRACT_NODE);
		createEAttribute(neoAbstractNodeEClass, NEO_ABSTRACT_NODE__NODE_PLACE);
		createEOperation(neoAbstractNodeEClass, NEO_ABSTRACT_NODE___GET_CYPHER_VARIABLE);

		neoNodeEClass = createEClass(NEO_NODE);
		createEReference(neoNodeEClass, NEO_NODE__NEO_NODE_LABELS);
		createEOperation(neoNodeEClass, NEO_NODE___ADD_STRING_LABEL__STRING);

		neoEdgeEClass = createEClass(NEO_EDGE);
		createEReference(neoEdgeEClass, NEO_EDGE__NEO_PATH_PARAM);

		neoComplexEdgeEClass = createEClass(NEO_COMPLEX_EDGE);
		createEReference(neoComplexEdgeEClass, NEO_COMPLEX_EDGE__NEO_PATH);
		createEOperation(neoComplexEdgeEClass, NEO_COMPLEX_EDGE___VALIDATE_COMPLEX_EDGE);

		neoSimpleEdgeEClass = createEClass(NEO_SIMPLE_EDGE);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__KEY_VALUE_PARAM);
		createEAttribute(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_DIRECTION);
		createEAttribute(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__EDGE_NUMBER);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_EDGE_LABEL);
		createEAttribute(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__IS_LAST_SIMPLE_EDGE);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___IS_LAST_SIMPLE_EDGE);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___ADD_STRUBG_TARGET_NODE_LABEL__STRING);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___GET_CYPHER_INNER_EDGE_VARIABLE);

		neoPathPartEClass = createEClass(NEO_PATH_PART);
		createEAttribute(neoPathPartEClass, NEO_PATH_PART__TRANSLATED);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_SIMPLE_EDGES);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_CYPHER_VARIABLE);

		neoPropertyNodeEClass = createEClass(NEO_PROPERTY_NODE);
		createEOperation(neoPropertyNodeEClass, NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING);

		neoPathParamEClass = createEClass(NEO_PATH_PARAM);
		createEReference(neoPathParamEClass, NEO_PATH_PARAM__NEO_EDGE);
		createEReference(neoPathParamEClass, NEO_PATH_PARAM__NEO_PATH_PART);

		neoPropertyPathParamEClass = createEClass(NEO_PROPERTY_PATH_PARAM);
		createEReference(neoPropertyPathParamEClass, NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART);
		createEReference(neoPropertyPathParamEClass, NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE);
		createEReference(neoPropertyPathParamEClass, NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME);
		createEOperation(neoPropertyPathParamEClass, NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING);

		neoPropertyEdgeEClass = createEClass(NEO_PROPERTY_EDGE);
		createEReference(neoPropertyEdgeEClass, NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM);
		createEOperation(neoPropertyEdgeEClass, NEO_PROPERTY_EDGE___GENERATE_CYPHER_PROPERTY_ADDRESSING);

		neoAbstractEdgeEClass = createEClass(NEO_ABSTRACT_EDGE);
		createEAttribute(neoAbstractEdgeEClass, NEO_ABSTRACT_EDGE__RETURN_ELEMENT);
		createEOperation(neoAbstractEdgeEClass, NEO_ABSTRACT_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN);

		neoAbstractPathParamEClass = createEClass(NEO_ABSTRACT_PATH_PARAM);
		createEOperation(neoAbstractPathParamEClass, NEO_ABSTRACT_PATH_PARAM___GET_LAST_RELATIONS);

		neoUnspecifiedEdgeEClass = createEClass(NEO_UNSPECIFIED_EDGE);
		createEReference(neoUnspecifiedEdgeEClass, NEO_UNSPECIFIED_EDGE__NEO_TARGET_NODE_LABELS);
		createEAttribute(neoUnspecifiedEdgeEClass, NEO_UNSPECIFIED_EDGE__STEPS_IN_BETWEEN);
		createEOperation(neoUnspecifiedEdgeEClass, NEO_UNSPECIFIED_EDGE___SET_STEPS__STRING);

		// Create enums
		neoDirectionEEnum = createEEnum(NEO_DIRECTION);
		neoPlaceEEnum = createEEnum(NEO_PLACE);
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
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		neoNodeEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		neoNodeEClass.getESuperTypes().add(this.getNeoAbstractNode());
		neoEdgeEClass.getESuperTypes().add(this.getNeoAbstractEdge());
		neoComplexEdgeEClass.getESuperTypes().add(this.getNeoPathPart());
		neoSimpleEdgeEClass.getESuperTypes().add(this.getNeoPathPart());
		neoPathPartEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		neoPropertyNodeEClass.getESuperTypes().add(theGraphstructurePackage.getPrimitiveNode());
		neoPropertyNodeEClass.getESuperTypes().add(this.getNeoAbstractNode());
		neoPathParamEClass.getESuperTypes().add(this.getNeoAbstractPathParam());
		neoPropertyPathParamEClass.getESuperTypes().add(this.getNeoAbstractPathParam());
		neoPropertyEdgeEClass.getESuperTypes().add(this.getNeoAbstractEdge());
		neoAbstractEdgeEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		neoAbstractPathParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		neoAbstractPathParamEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		neoUnspecifiedEdgeEClass.getESuperTypes().add(this.getNeoPathPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(neoAbstractNodeEClass, NeoAbstractNode.class, "NeoAbstractNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeoAbstractNode_NodePlace(), this.getNeoPlace(), "nodePlace", "FOLLOWING", 0, 1, NeoAbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNeoAbstractNode__GetCypherVariable(), ecorePackage.getEString(), "getCypherVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoNodeEClass, NeoNode.class, "NeoNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoNode_NeoNodeLabels(), theParametersPackage.getTextListParam(), null, "neoNodeLabels", null, 0, 1, NeoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNeoNode__AddStringLabel__String(), null, "addStringLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoEdgeEClass, NeoEdge.class, "NeoEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoEdge_NeoPathParam(), this.getNeoPathParam(), this.getNeoPathParam_NeoEdge(), "neoPathParam", null, 0, 1, NeoEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoComplexEdgeEClass, NeoComplexEdge.class, "NeoComplexEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoComplexEdge_NeoPath(), this.getNeoPathPart(), null, "neoPath", null, 2, -1, NeoComplexEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNeoComplexEdge__ValidateComplexEdge(), ecorePackage.getEBoolean(), "validateComplexEdge", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoSimpleEdgeEClass, NeoSimpleEdge.class, "NeoSimpleEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoSimpleEdge_KeyValueParam(), theParametersPackage.getKeyValueParam(), null, "keyValueParam", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoSimpleEdge_NeoDirection(), this.getNeoDirection(), "neoDirection", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoSimpleEdge_EdgeNumber(), ecorePackage.getEInt(), "edgeNumber", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoSimpleEdge_NeoTargetNodeLabels(), theParametersPackage.getTextListParam(), null, "neoTargetNodeLabels", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoSimpleEdge_NeoEdgeLabel(), theParametersPackage.getTextLiteralParam(), null, "neoEdgeLabel", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoSimpleEdge_IsLastSimpleEdge(), ecorePackage.getEBoolean(), "isLastSimpleEdge", "false", 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoSimpleEdge__SetNeoDirection__NeoDirection(), null, "setNeoDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNeoDirection(), "neoDirection", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNeoSimpleEdge__IsLastSimpleEdge(), ecorePackage.getEBoolean(), "isLastSimpleEdge", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeoSimpleEdge__AddStrubgTargetNodeLabel__String(), null, "addStrubgTargetNodeLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeoSimpleEdge__GetCypherInnerEdgeVariable(), ecorePackage.getEString(), "getCypherInnerEdgeVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoPathPartEClass, NeoPathPart.class, "NeoPathPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeoPathPart_Translated(), ecorePackage.getEBoolean(), "translated", null, 0, 1, NeoPathPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNeoPathPart__GetSimpleEdges(), this.getNeoSimpleEdge(), "getSimpleEdges", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNeoPathPart__GetCypherVariable(), ecorePackage.getEString(), "getCypherVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoPropertyNodeEClass, NeoPropertyNode.class, "NeoPropertyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNeoPropertyNode__GenerateCypherPropertyAddressing(), ecorePackage.getEString(), "generateCypherPropertyAddressing", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoPathParamEClass, NeoPathParam.class, "NeoPathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPathParam_NeoEdge(), this.getNeoEdge(), this.getNeoEdge_NeoPathParam(), "neoEdge", null, 0, 1, NeoPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoPathParam_NeoPathPart(), this.getNeoPathPart(), null, "neoPathPart", null, 0, 1, NeoPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoPropertyPathParamEClass, NeoPropertyPathParam.class, "NeoPropertyPathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPropertyPathParam_NeoPathPart(), this.getNeoPathPart(), null, "neoPathPart", null, 0, 1, NeoPropertyPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoPropertyPathParam_NeoPropertyEdge(), this.getNeoPropertyEdge(), this.getNeoPropertyEdge_NeoPropertyPathParam(), "neoPropertyEdge", null, 0, 1, NeoPropertyPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoPropertyPathParam_NeoPropertyName(), theParametersPackage.getTextLiteralParam(), null, "neoPropertyName", null, 0, 1, NeoPropertyPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoPropertyPathParam__SetNeoPropertyName__String(), null, "setNeoPropertyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "neoPropertyName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoPropertyEdgeEClass, NeoPropertyEdge.class, "NeoPropertyEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPropertyEdge_NeoPropertyPathParam(), this.getNeoPropertyPathParam(), this.getNeoPropertyPathParam_NeoPropertyEdge(), "neoPropertyPathParam", null, 0, 1, NeoPropertyEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNeoPropertyEdge__GenerateCypherPropertyAddressing(), ecorePackage.getEString(), "generateCypherPropertyAddressing", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoAbstractEdgeEClass, NeoAbstractEdge.class, "NeoAbstractEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeoAbstractEdge_ReturnElement(), ecorePackage.getEBoolean(), "returnElement", null, 0, 1, NeoAbstractEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoAbstractEdge__SetIsReturnElement__boolean(), null, "setIsReturnElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "returnElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoAbstractPathParamEClass, NeoAbstractPathParam.class, "NeoAbstractPathParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNeoAbstractPathParam__GetLastRelations(), this.getNeoAbstractEdge(), "getLastRelations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoUnspecifiedEdgeEClass, NeoUnspecifiedEdge.class, "NeoUnspecifiedEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoUnspecifiedEdge_NeoTargetNodeLabels(), theParametersPackage.getTextLiteralParam(), null, "neoTargetNodeLabels", null, 0, -1, NeoUnspecifiedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoUnspecifiedEdge_StepsInBetween(), ecorePackage.getEBoolean(), "stepsInBetween", null, 0, 1, NeoUnspecifiedEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoUnspecifiedEdge__SetSteps__String(), null, "setSteps", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "stepsInBetween", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(neoDirectionEEnum, NeoDirection.class, "NeoDirection");
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.IMPLICIT);
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.RIGHT);
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.LEFT);

		initEEnum(neoPlaceEEnum, NeoPlace.class, "NeoPlace");
		addEEnumLiteral(neoPlaceEEnum, NeoPlace.BEGINNING);
		addEEnumLiteral(neoPlaceEEnum, NeoPlace.ENDING);
		addEEnumLiteral(neoPlaceEEnum, NeoPlace.FOLLOWING);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptionNeo4JPackageImpl
