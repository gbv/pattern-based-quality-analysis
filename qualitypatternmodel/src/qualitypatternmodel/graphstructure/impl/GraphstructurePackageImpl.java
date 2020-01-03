/**
 */
package qualitypatternmodel.graphstructure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.functions.FunctionsPackage;

import qualitypatternmodel.functions.impl.FunctionsPackageImpl;

import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphElement;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.graphstructure.VariableList;

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
	private EClass graphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableListEClass = null;

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
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Axis() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_RelationOptions() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_MappingTo() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_MappingFrom() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Element() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_AttributeName() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Location() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_PropertyOptions() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleElement() {
		return singleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElement_MappingFrom() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElement_MappingTo() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElement_Previous() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElement_Next() {
		return (EReference)singleElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetElement() {
		return setElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetElement_Next() {
		return (EReference)setElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetElement_Previous() {
		return (EReference)setElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Predicates() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_RelationFromPrevious() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_IsTranslated() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_IsRoot() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GenerateXPredicates() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GenerateXPathExpression() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetNextElements() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetPreviousElement() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_ReturnElement() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_VariableList() {
		return (EReference)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_RootElement() {
		return (EReference)graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphElement() {
		return graphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraphElement__GetReturnType() {
		return graphElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableList() {
		return variableListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableList_Variables() {
		return (EReference)variableListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyLocation() {
		return propertyLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAxis() {
		return axisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReturnType() {
		return returnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		createEAttribute(relationEClass, RELATION__AXIS);
		createEReference(relationEClass, RELATION__RELATION_OPTIONS);
		createEReference(relationEClass, RELATION__MAPPING_TO);
		createEReference(relationEClass, RELATION__MAPPING_FROM);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__ELEMENT);
		createEAttribute(propertyEClass, PROPERTY__ATTRIBUTE_NAME);
		createEAttribute(propertyEClass, PROPERTY__LOCATION);
		createEReference(propertyEClass, PROPERTY__PROPERTY_OPTIONS);

		singleElementEClass = createEClass(SINGLE_ELEMENT);
		createEReference(singleElementEClass, SINGLE_ELEMENT__MAPPING_FROM);
		createEReference(singleElementEClass, SINGLE_ELEMENT__MAPPING_TO);
		createEReference(singleElementEClass, SINGLE_ELEMENT__PREVIOUS);
		createEReference(singleElementEClass, SINGLE_ELEMENT__NEXT);

		setElementEClass = createEClass(SET_ELEMENT);
		createEReference(setElementEClass, SET_ELEMENT__NEXT);
		createEReference(setElementEClass, SET_ELEMENT__PREVIOUS);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__PREDICATES);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEReference(elementEClass, ELEMENT__RELATION_FROM_PREVIOUS);
		createEAttribute(elementEClass, ELEMENT__IS_TRANSLATED);
		createEAttribute(elementEClass, ELEMENT__IS_ROOT);
		createEOperation(elementEClass, ELEMENT___GENERATE_XPREDICATES);
		createEOperation(elementEClass, ELEMENT___GENERATE_XPATH_EXPRESSION);
		createEOperation(elementEClass, ELEMENT___GET_NEXT_ELEMENTS);
		createEOperation(elementEClass, ELEMENT___GET_PREVIOUS_ELEMENT);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__RETURN_ELEMENT);
		createEReference(graphEClass, GRAPH__VARIABLE_LIST);
		createEReference(graphEClass, GRAPH__ROOT_ELEMENT);

		graphElementEClass = createEClass(GRAPH_ELEMENT);
		createEOperation(graphElementEClass, GRAPH_ELEMENT___GET_RETURN_TYPE);

		variableListEClass = createEClass(VARIABLE_LIST);
		createEReference(variableListEClass, VARIABLE_LIST__VARIABLES);

		// Create enums
		propertyLocationEEnum = createEEnum(PROPERTY_LOCATION);
		axisEEnum = createEEnum(AXIS);
		returnTypeEEnum = createEEnum(RETURN_TYPE);
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
		propertyEClass.getESuperTypes().add(this.getGraphElement());
		singleElementEClass.getESuperTypes().add(this.getElement());
		setElementEClass.getESuperTypes().add(this.getElement());
		elementEClass.getESuperTypes().add(this.getGraphElement());
		graphEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		graphElementEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_Axis(), this.getAxis(), "axis", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theInputfieldsPackage.getOption());
		EGenericType g2 = createEGenericType(this.getAxis());
		g1.getETypeArguments().add(g2);
		initEReference(getRelation_RelationOptions(), g1, null, "relationOptions", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_MappingTo(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_To(), "mappingTo", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_MappingFrom(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_From(), "mappingFrom", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Element(), this.getElement(), null, "element", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_AttributeName(), ecorePackage.getEString(), "attributeName", "", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Location(), this.getPropertyLocation(), "location", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theInputfieldsPackage.getOption());
		g2 = createEGenericType(this.getPropertyLocation());
		g1.getETypeArguments().add(g2);
		initEReference(getProperty_PropertyOptions(), g1, null, "propertyOptions", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleElementEClass, SingleElement.class, "SingleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleElement_MappingFrom(), thePatternstructurePackage.getSingleElementMapping(), thePatternstructurePackage.getSingleElementMapping_From(), "mappingFrom", null, 0, 1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_MappingTo(), thePatternstructurePackage.getSingleElementMapping(), thePatternstructurePackage.getSingleElementMapping_To(), "mappingTo", null, 0, 1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_Previous(), this.getSingleElement(), null, "previous", null, 0, 1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElement_Next(), this.getElement(), null, "next", null, 0, -1, SingleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setElementEClass, SetElement.class, "SetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetElement_Next(), this.getSetElement(), null, "next", null, 0, -1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetElement_Previous(), this.getElement(), null, "previous", null, 1, 1, SetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Predicates(), theFunctionsPackage.getBooleanOperator(), null, "predicates", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_RelationFromPrevious(), this.getRelation(), null, "relationFromPrevious", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_IsTranslated(), ecorePackage.getEBoolean(), "isTranslated", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_IsRoot(), ecorePackage.getEBoolean(), "isRoot", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElement__GenerateXPredicates(), ecorePackage.getEString(), "generateXPredicates", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__GenerateXPathExpression(), ecorePackage.getEString(), "generateXPathExpression", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__GetNextElements(), this.getElement(), "getNextElements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__GetPreviousElement(), this.getElement(), "getPreviousElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_ReturnElement(), this.getSingleElement(), null, "returnElement", null, 1, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_VariableList(), this.getVariableList(), null, "variableList", null, 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_RootElement(), this.getSingleElement(), null, "rootElement", null, 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphElementEClass, GraphElement.class, "GraphElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGraphElement__GetReturnType(), this.getReturnType(), "getReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableListEClass, VariableList.class, "VariableList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableList_Variables(), theInputfieldsPackage.getInput(), theInputfieldsPackage.getInput_VariableList(), "variables", null, 0, -1, VariableList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(returnTypeEEnum, ReturnType.NUMBER);
		addEEnumLiteral(returnTypeEEnum, ReturnType.STRING);
		addEEnumLiteral(returnTypeEEnum, ReturnType.BOOLEAN);
		addEEnumLiteral(returnTypeEEnum, ReturnType.NONE);
		addEEnumLiteral(returnTypeEEnum, ReturnType.ELEMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphstructurePackageImpl
