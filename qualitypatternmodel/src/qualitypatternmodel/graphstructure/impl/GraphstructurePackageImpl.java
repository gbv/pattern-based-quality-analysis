/**
 */
package qualitypatternmodel.graphstructure.impl;

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
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.impl.FunctionsPackageImpl;

import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
import qualitypatternmodel.inputfields.InputfieldsPackage;

import qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl;

import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphstructurePackageImpl extends EPackageImpl implements GraphstructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfElementsEDataType = null;

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
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphstructurePackageImpl() {
		super(eNS_URI, GraphstructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphstructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphstructurePackage init() {
		if (isInited) return (GraphstructurePackage)EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphstructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = registeredGraphstructurePackage instanceof GraphstructurePackageImpl ? (GraphstructurePackageImpl)registeredGraphstructurePackage : new GraphstructurePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InputfieldsPackage.eNS_URI);
		InputfieldsPackageImpl theInputfieldsPackage = (InputfieldsPackageImpl)(registeredPackage instanceof InputfieldsPackageImpl ? registeredPackage : InputfieldsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(registeredPackage instanceof FunctionsPackageImpl ? registeredPackage : FunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		PatternstructurePackageImpl thePatternstructurePackage = (PatternstructurePackageImpl)(registeredPackage instanceof PatternstructurePackageImpl ? registeredPackage : PatternstructurePackage.eINSTANCE);

		// Create package meta-data objects
		theGraphstructurePackage.createPackageContents();
		theInputfieldsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();

		// Initialize created meta-data
		theGraphstructurePackage.initializePackageContents();
		theInputfieldsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGraphstructurePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return GraphstructureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGraphstructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphstructurePackage.eNS_URI, theGraphstructurePackage);
		return theGraphstructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_MappingTo() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_MappingFrom() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelation_Axis() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_RelationTo() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__GetGraphDepth() {
		return relationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_PropertyOption() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_Element() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_AttributeName() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleElement() {
		return singleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleElement_MappingFrom() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleElement_MappingTo() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleElement_Root() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleElement_NextSingle() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleElement_Previous() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleElement_NextSet() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSingleElement__GetOriginalID() {
		return singleElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSingleElement__GetXQueryVariable() {
		return singleElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSingleElement__TranslatePredicates__Location() {
		return singleElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSingleElement__TranslatePathFromPrevious() {
		return singleElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSingleElement__CopyNextElements() {
		return singleElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSingleElement__CopyNextElement__SingleElement() {
		return singleElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSingleElement__RemoveElementFromPreviousGraphs() {
		return singleElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetElement() {
		return setElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetElement_NestingDepth() {
		return (EAttribute)setElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetElement_Next() {
		return (EReference)setElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetElement_PreviousSet() {
		return (EReference)setElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetElement_PreviousSingle() {
		return (EReference)setElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetElement_BeingTranslated() {
		return (EAttribute)setElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetElement_Count() {
		return (EReference)setElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSetElement__TranslatePathFromPrevious__int() {
		return setElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSetElement__TranslatePredicates__Location_int() {
		return setElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSetElement__GetPathToPreviousSingleElement() {
		return setElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSetElement__GetAllArgumentElementsSetOperation() {
		return setElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Predicates() {
		return (EReference)elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_RelationFromPrevious() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Translated() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Properties() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_PredicatesAreBeingTranslated() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_GetAllElements() {
		return (EReference)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_GetAllRelations() {
		return (EReference)elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetNextElements() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetPreviousElement() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetAllOperators() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetAllVariables() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetXQueryRepresentation__Location_int() {
		return elementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetContextRepresentation__int() {
		return elementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetGraphDepth() {
		return elementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__TranslateElementExistencePredicates__Location_int() {
		return elementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_ReturnElements() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_RootElement() {
		return (EReference)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_OperatorList() {
		return (EReference)graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraph_GraphDepth() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraph_ReturnGraph() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_GetAllElements() {
		return (EReference)graphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_GetAllRelations() {
		return (EReference)graphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_QuantifiedCondition() {
		return (EReference)graphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Pattern() {
		return (EReference)graphEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__GetAllOperators() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__CopyGraph__Graph() {
		return graphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparable_Comparison1() {
		return (EReference)comparableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparable_Comparison2() {
		return (EReference)comparableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__GetReturnType() {
		return comparableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__IsTranslatable() {
		return comparableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__ToXQuery__Location_int() {
		return comparableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__GetAllArgumentElements() {
		return comparableEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__Validate__DiagnosticChain_Map() {
		return comparableEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyLocation() {
		return propertyLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAxis() {
		return axisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReturnType() {
		return returnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getListOfElements() {
		return listOfElementsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphstructureFactory getGraphstructureFactory() {
		return (GraphstructureFactory)getEFactoryInstance();
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
		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__MAPPING_FROM);
		createEReference(relationEClass, RELATION__MAPPING_TO);
		createEAttribute(relationEClass, RELATION__AXIS);
		createEReference(relationEClass, RELATION__RELATION_TO);
		createEOperation(relationEClass, RELATION___GET_GRAPH_DEPTH);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__PROPERTY_OPTION);
		createEReference(propertyEClass, PROPERTY__ELEMENT);
		createEReference(propertyEClass, PROPERTY__ATTRIBUTE_NAME);

		singleElementEClass = createEClass(SINGLE_ELEMENT);
		createEReference(singleElementEClass, SINGLE_ELEMENT__MAPPING_TO);
		createEReference(singleElementEClass, SINGLE_ELEMENT__MAPPING_FROM);
		createEReference(singleElementEClass, SINGLE_ELEMENT__ROOT);
		createEReference(singleElementEClass, SINGLE_ELEMENT__NEXT_SINGLE);
		createEReference(singleElementEClass, SINGLE_ELEMENT__PREVIOUS);
		createEReference(singleElementEClass, SINGLE_ELEMENT__NEXT_SET);
		createEOperation(singleElementEClass, SINGLE_ELEMENT___GET_ORIGINAL_ID);
		createEOperation(singleElementEClass, SINGLE_ELEMENT___GET_XQUERY_VARIABLE);
		createEOperation(singleElementEClass, SINGLE_ELEMENT___TRANSLATE_PREDICATES__LOCATION);
		createEOperation(singleElementEClass, SINGLE_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS);
		createEOperation(singleElementEClass, SINGLE_ELEMENT___COPY_NEXT_ELEMENTS);
		createEOperation(singleElementEClass, SINGLE_ELEMENT___COPY_NEXT_ELEMENT__SINGLEELEMENT);
		createEOperation(singleElementEClass, SINGLE_ELEMENT___REMOVE_ELEMENT_FROM_PREVIOUS_GRAPHS);

		setElementEClass = createEClass(SET_ELEMENT);
		createEAttribute(setElementEClass, SET_ELEMENT__NESTING_DEPTH);
		createEReference(setElementEClass, SET_ELEMENT__NEXT);
		createEReference(setElementEClass, SET_ELEMENT__PREVIOUS_SET);
		createEReference(setElementEClass, SET_ELEMENT__PREVIOUS_SINGLE);
		createEAttribute(setElementEClass, SET_ELEMENT__BEING_TRANSLATED);
		createEReference(setElementEClass, SET_ELEMENT__COUNT);
		createEOperation(setElementEClass, SET_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS__INT);
		createEOperation(setElementEClass, SET_ELEMENT___TRANSLATE_PREDICATES__LOCATION_INT);
		createEOperation(setElementEClass, SET_ELEMENT___GET_PATH_TO_PREVIOUS_SINGLE_ELEMENT);
		createEOperation(setElementEClass, SET_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS_SET_OPERATION);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__RELATION_FROM_PREVIOUS);
		createEAttribute(elementEClass, ELEMENT__TRANSLATED);
		createEReference(elementEClass, ELEMENT__PROPERTIES);
		createEAttribute(elementEClass, ELEMENT__PREDICATES_ARE_BEING_TRANSLATED);
		createEReference(elementEClass, ELEMENT__GET_ALL_ELEMENTS);
		createEReference(elementEClass, ELEMENT__GET_ALL_RELATIONS);
		createEReference(elementEClass, ELEMENT__PREDICATES);
		createEOperation(elementEClass, ELEMENT___GET_NEXT_ELEMENTS);
		createEOperation(elementEClass, ELEMENT___GET_PREVIOUS_ELEMENT);
		createEOperation(elementEClass, ELEMENT___GET_ALL_OPERATORS);
		createEOperation(elementEClass, ELEMENT___GET_ALL_VARIABLES);
		createEOperation(elementEClass, ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION_INT);
		createEOperation(elementEClass, ELEMENT___GET_CONTEXT_REPRESENTATION__INT);
		createEOperation(elementEClass, ELEMENT___GET_GRAPH_DEPTH);
		createEOperation(elementEClass, ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__RETURN_ELEMENTS);
		createEReference(graphEClass, GRAPH__ROOT_ELEMENT);
		createEReference(graphEClass, GRAPH__OPERATOR_LIST);
		createEAttribute(graphEClass, GRAPH__GRAPH_DEPTH);
		createEAttribute(graphEClass, GRAPH__RETURN_GRAPH);
		createEReference(graphEClass, GRAPH__GET_ALL_ELEMENTS);
		createEReference(graphEClass, GRAPH__GET_ALL_RELATIONS);
		createEReference(graphEClass, GRAPH__QUANTIFIED_CONDITION);
		createEReference(graphEClass, GRAPH__PATTERN);
		createEOperation(graphEClass, GRAPH___GET_ALL_OPERATORS);
		createEOperation(graphEClass, GRAPH___COPY_GRAPH__GRAPH);

		comparableEClass = createEClass(COMPARABLE);
		createEReference(comparableEClass, COMPARABLE__COMPARISON1);
		createEReference(comparableEClass, COMPARABLE__COMPARISON2);
		createEOperation(comparableEClass, COMPARABLE___GET_RETURN_TYPE);
		createEOperation(comparableEClass, COMPARABLE___IS_TRANSLATABLE);
		createEOperation(comparableEClass, COMPARABLE___TO_XQUERY__LOCATION_INT);
		createEOperation(comparableEClass, COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS);
		createEOperation(comparableEClass, COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP);

		// Create enums
		propertyLocationEEnum = createEEnum(PROPERTY_LOCATION);
		axisEEnum = createEEnum(AXIS);
		returnTypeEEnum = createEEnum(RETURN_TYPE);

		// Create data types
		listOfElementsEDataType = createEDataType(LIST_OF_ELEMENTS);
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
		InputfieldsPackage theInputfieldsPackage = (InputfieldsPackage)EPackage.Registry.INSTANCE.getEPackage(InputfieldsPackage.eNS_URI);
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		propertyEClass.getESuperTypes().add(this.getComparable());
		propertyEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		singleElementEClass.getESuperTypes().add(this.getElement());
		setElementEClass.getESuperTypes().add(this.getElement());
		elementEClass.getESuperTypes().add(this.getComparable());
		elementEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		graphEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		comparableEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_MappingFrom(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_To(), "mappingFrom", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_MappingTo(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_From(), "mappingTo", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Axis(), this.getAxis(), "axis", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_RelationTo(), this.getElement(), this.getElement_RelationFromPrevious(), "relationTo", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRelation__GetGraphDepth(), ecorePackage.getEInt(), "getGraphDepth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_PropertyOption(), theInputfieldsPackage.getPropertyOption(), null, "propertyOption", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Element(), this.getElement(), this.getElement_Properties(), "element", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_AttributeName(), theInputfieldsPackage.getTextLiteral(), null, "attributeName", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleElementEClass, SingleElement.class, "SingleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleElement_MappingTo(), thePatternstructurePackage.getSingleElementMapping(), thePatternstructurePackage.getSingleElementMapping_From(), "mappingTo", null, 0, -1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_MappingFrom(), thePatternstructurePackage.getSingleElementMapping(), thePatternstructurePackage.getSingleElementMapping_To(), "mappingFrom", null, 0, 1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_Root(), this.getGraph(), this.getGraph_RootElement(), "root", null, 0, 1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_NextSingle(), this.getSingleElement(), this.getSingleElement_Previous(), "nextSingle", null, 0, -1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_Previous(), this.getSingleElement(), this.getSingleElement_NextSingle(), "previous", null, 0, 1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_NextSet(), this.getSetElement(), this.getSetElement_PreviousSingle(), "nextSet", null, 0, -1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSingleElement__GetOriginalID(), ecorePackage.getEInt(), "getOriginalID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSingleElement__GetXQueryVariable(), ecorePackage.getEString(), "getXQueryVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSingleElement__TranslatePredicates__Location(), ecorePackage.getEString(), "translatePredicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getSingleElement__TranslatePathFromPrevious(), ecorePackage.getEString(), "translatePathFromPrevious", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSingleElement__CopyNextElements(), null, "copyNextElements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		op = initEOperation(getSingleElement__CopyNextElement__SingleElement(), null, "copyNextElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSingleElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		initEOperation(getSingleElement__RemoveElementFromPreviousGraphs(), null, "removeElementFromPreviousGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(setElementEClass, SetElement.class, "SetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetElement_NestingDepth(), ecorePackage.getEInt(), "nestingDepth", null, 1, 1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetElement_Next(), this.getSetElement(), this.getSetElement_PreviousSet(), "next", null, 0, -1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetElement_PreviousSet(), this.getSetElement(), this.getSetElement_Next(), "previousSet", null, 0, 1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetElement_PreviousSingle(), this.getSingleElement(), this.getSingleElement_NextSet(), "previousSingle", null, 0, 1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetElement_BeingTranslated(), ecorePackage.getEBoolean(), "beingTranslated", null, 1, 1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetElement_Count(), theFunctionsPackage.getCount(), theFunctionsPackage.getCount_Argument(), "count", null, 0, 1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSetElement__TranslatePathFromPrevious__int(), ecorePackage.getEString(), "translatePathFromPrevious", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depth", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSetElement__TranslatePredicates__Location_int(), ecorePackage.getEString(), "translatePredicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getSetElement__GetPathToPreviousSingleElement(), this.getListOfElements(), "getPathToPreviousSingleElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getSetElement__GetAllArgumentElementsSetOperation(), this.getListOfElements(), "getAllArgumentElementsSetOperation", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_RelationFromPrevious(), this.getRelation(), this.getRelation_RelationTo(), "relationFromPrevious", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Translated(), ecorePackage.getEBoolean(), "translated", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Properties(), this.getProperty(), this.getProperty_Element(), "properties", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_PredicatesAreBeingTranslated(), ecorePackage.getEBoolean(), "predicatesAreBeingTranslated", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_GetAllElements(), this.getElement(), null, "getAllElements", null, 0, -1, Element.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_GetAllRelations(), this.getRelation(), null, "getAllRelations", null, 0, -1, Element.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Predicates(), theFunctionsPackage.getBooleanOperator(), theFunctionsPackage.getBooleanOperator_Elements(), "predicates", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElement__GetNextElements(), this.getElement(), "getNextElements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__GetPreviousElement(), this.getElement(), "getPreviousElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__GetAllOperators(), theFunctionsPackage.getOperator(), "getAllOperators", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getElement__GetAllVariables(), theInputfieldsPackage.getInput(), "getAllVariables", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getElement__GetXQueryRepresentation__Location_int(), ecorePackage.getEString(), "getXQueryRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getElement__GetContextRepresentation__int(), ecorePackage.getEString(), "getContextRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getElement__GetGraphDepth(), ecorePackage.getEInt(), "getGraphDepth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getElement__TranslateElementExistencePredicates__Location_int(), ecorePackage.getEString(), "translateElementExistencePredicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_ReturnElements(), this.getSingleElement(), null, "returnElements", null, 1, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_RootElement(), this.getSingleElement(), this.getSingleElement_Root(), "rootElement", null, 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_OperatorList(), theFunctionsPackage.getOperatorList(), theFunctionsPackage.getOperatorList_Graph(), "operatorList", null, 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_GraphDepth(), ecorePackage.getEInt(), "graphDepth", "-1", 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_ReturnGraph(), ecorePackage.getEBoolean(), "returnGraph", "false", 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_GetAllElements(), this.getElement(), null, "getAllElements", null, 0, -1, Graph.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraph_GetAllRelations(), this.getRelation(), null, "getAllRelations", null, 0, -1, Graph.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGraph_QuantifiedCondition(), thePatternstructurePackage.getQuantifiedCondition(), thePatternstructurePackage.getQuantifiedCondition_Graph(), "quantifiedCondition", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Pattern(), thePatternstructurePackage.getPattern(), thePatternstructurePackage.getPattern_ReturnGraph(), "pattern", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGraph__GetAllOperators(), theFunctionsPackage.getOperator(), "getAllOperators", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getGraph__CopyGraph__Graph(), null, "copyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		initEClass(comparableEClass, qualitypatternmodel.graphstructure.Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparable_Comparison1(), theFunctionsPackage.getComparison(), theFunctionsPackage.getComparison_Argument1(), "comparison1", null, 0, -1, qualitypatternmodel.graphstructure.Comparable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparable_Comparison2(), theFunctionsPackage.getComparison(), theFunctionsPackage.getComparison_Argument2(), "comparison2", null, 0, -1, qualitypatternmodel.graphstructure.Comparable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComparable__GetReturnType(), this.getReturnType(), "getReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComparable__IsTranslatable(), ecorePackage.getEBoolean(), "isTranslatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getComparable__ToXQuery__Location_int(), ecorePackage.getEString(), "toXQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depth", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getComparable__GetAllArgumentElements(), this.getListOfElements(), "getAllArgumentElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getComparable__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyLocationEEnum, PropertyLocation.class, "PropertyLocation");
		addEEnumLiteral(propertyLocationEEnum, PropertyLocation.DATA);
		addEEnumLiteral(propertyLocationEEnum, PropertyLocation.TAG);
		addEEnumLiteral(propertyLocationEEnum, PropertyLocation.ATTRIBUTE);

		initEEnum(axisEEnum, Axis.class, "Axis");
		addEEnumLiteral(axisEEnum, Axis.CHILD);
		addEEnumLiteral(axisEEnum, Axis.DESCENDANT);
		addEEnumLiteral(axisEEnum, Axis.PARENT);
		addEEnumLiteral(axisEEnum, Axis.ANCESTOR);
		addEEnumLiteral(axisEEnum, Axis.FOLLOWING);
		addEEnumLiteral(axisEEnum, Axis.FOLLOWING_SIBLING);
		addEEnumLiteral(axisEEnum, Axis.PRECEDING);
		addEEnumLiteral(axisEEnum, Axis.PRECEDING_SIBLING);
		addEEnumLiteral(axisEEnum, Axis.ANCESTOR_OR_SELF);
		addEEnumLiteral(axisEEnum, Axis.DESCENDANT_OR_SELF);

		initEEnum(returnTypeEEnum, ReturnType.class, "ReturnType");
		addEEnumLiteral(returnTypeEEnum, ReturnType.UNSPECIFIED);
		addEEnumLiteral(returnTypeEEnum, ReturnType.STRING);
		addEEnumLiteral(returnTypeEEnum, ReturnType.BOOLEAN);
		addEEnumLiteral(returnTypeEEnum, ReturnType.ELEMENT);
		addEEnumLiteral(returnTypeEEnum, ReturnType.DATE);
		addEEnumLiteral(returnTypeEEnum, ReturnType.TIME);
		addEEnumLiteral(returnTypeEEnum, ReturnType.NUMBER);
		addEEnumLiteral(returnTypeEEnum, ReturnType.DATETIME);

		// Initialize data types
		initEDataType(listOfElementsEDataType, ListOfElements.class, "ListOfElements", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (relationEClass,
		   source,
		   new String[] {
			   "constraints", "correctMappingOfContainment"
		   });
		addAnnotation
		  (singleElementEClass,
		   source,
		   new String[] {
			   "constraints", "hasPreviousOrIsRoot correctMappingOfContainment"
		   });
		addAnnotation
		  (setElementEClass,
		   source,
		   new String[] {
			   "constraints", "hasPrevious"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (relationEClass,
		   source,
		   new String[] {
			   "correctMappingOfContainment", "self.mappingTo->forAll(m | m.to.relationTo.oclIsTypeOf(SingleElement) implies m.to.relationTo.oclAsType(SingleElement).mappingFrom.from = self.relationTo)"
		   });
		addAnnotation
		  (singleElementEClass,
		   source,
		   new String[] {
			   "hasPreviousOrIsRoot", "self.previous->notEmpty() or self.root->notEmpty()",
			   "correctMappingOfContainment", "self.previous->notEmpty() implies self.mappingTo->forAll(m | m.to.previous.mappingFrom.from = self.previous)"
		   });
		addAnnotation
		  (setElementEClass,
		   source,
		   new String[] {
			   "hasPrevious", "self.previousSet->notEmpty() or self.previousSingle->notEmpty()"
		   });
		addAnnotation
		  (getElement_GetAllElements(),
		   source,
		   new String[] {
			   "derivation", "\n\t\t\t\t self.getNextElements()->collect(e: Element | e.getAllElements)->asSet()->including(self)"
		   });
		addAnnotation
		  (getElement_GetAllRelations(),
		   source,
		   new String[] {
			   "derivation", "\n\t\t\t\t self.getNextElements()->collect(e: Element | e.getAllRelations)->asSet()->including(self.relationFromPrevious)"
		   });
		addAnnotation
		  (getGraph_GetAllElements(),
		   source,
		   new String[] {
			   "derivation", "\n\t\t\t\tself.rootElement.getAllElements"
		   });
		addAnnotation
		  (getGraph_GetAllRelations(),
		   source,
		   new String[] {
			   "derivation", "\n\t\t\t\tself.rootElement.getAllRelations"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getElement_GetAllElements(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getElement_GetAllRelations(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getGraph_GetAllElements(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getGraph_GetAllRelations(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //GraphstructurePackageImpl
