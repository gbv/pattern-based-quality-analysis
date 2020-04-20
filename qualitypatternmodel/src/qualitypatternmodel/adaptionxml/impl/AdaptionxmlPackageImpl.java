/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XMLElement;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.adaptionxml.XMLProperty;
import qualitypatternmodel.adaptionxml.XMLReference;
import qualitypatternmodel.adaptionxml.XMLRoot;

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
public class AdaptionxmlPackageImpl extends EPackageImpl implements AdaptionxmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationKindEEnum = null;

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
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptionxmlPackageImpl() {
		super(eNS_URI, AdaptionxmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptionxmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptionxmlPackage init() {
		if (isInited) return (AdaptionxmlPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdaptionxmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdaptionxmlPackageImpl theAdaptionxmlPackage = registeredAdaptionxmlPackage instanceof AdaptionxmlPackageImpl ? (AdaptionxmlPackageImpl)registeredAdaptionxmlPackage : new AdaptionxmlPackageImpl();

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

		// Create package meta-data objects
		theAdaptionxmlPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();

		// Initialize created meta-data
		theAdaptionxmlPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptionxmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptionxmlPackage.eNS_URI, theAdaptionxmlPackage);
		return theAdaptionxmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLElement() {
		return xmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXMLElement__GetXQueryRepresentation__Location() {
		return xmlElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXMLElement__GetXQueryVariable() {
		return xmlElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXMLElement__TranslatePredicates__Location() {
		return xmlElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLNavigation() {
		return xmlNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLNavigation_Option() {
		return (EReference)xmlNavigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLNavigation_OptionParam() {
		return (EReference)xmlNavigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLReference() {
		return xmlReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLReference_SourceProperty() {
		return (EReference)xmlReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLReference_TargetProperty() {
		return (EReference)xmlReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLReference_Type() {
		return (EAttribute)xmlReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXMLReference__IsTranslatable() {
		return xmlReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLProperty() {
		return xmlPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLProperty_OptionParam() {
		return (EReference)xmlPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLProperty_Option() {
		return (EReference)xmlPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLProperty_AttributeName() {
		return (EReference)xmlPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLRoot() {
		return xmlRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyKind() {
		return propertyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationKind() {
		return relationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptionxmlFactory getAdaptionxmlFactory() {
		return (AdaptionxmlFactory)getEFactoryInstance();
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
		xmlElementEClass = createEClass(XML_ELEMENT);
		createEOperation(xmlElementEClass, XML_ELEMENT___GET_XQUERY_REPRESENTATION__LOCATION);
		createEOperation(xmlElementEClass, XML_ELEMENT___GET_XQUERY_VARIABLE);
		createEOperation(xmlElementEClass, XML_ELEMENT___TRANSLATE_PREDICATES__LOCATION);

		xmlNavigationEClass = createEClass(XML_NAVIGATION);
		createEReference(xmlNavigationEClass, XML_NAVIGATION__OPTION);
		createEReference(xmlNavigationEClass, XML_NAVIGATION__OPTION_PARAM);

		xmlReferenceEClass = createEClass(XML_REFERENCE);
		createEReference(xmlReferenceEClass, XML_REFERENCE__SOURCE_PROPERTY);
		createEReference(xmlReferenceEClass, XML_REFERENCE__TARGET_PROPERTY);
		createEAttribute(xmlReferenceEClass, XML_REFERENCE__TYPE);
		createEOperation(xmlReferenceEClass, XML_REFERENCE___IS_TRANSLATABLE);

		xmlPropertyEClass = createEClass(XML_PROPERTY);
		createEReference(xmlPropertyEClass, XML_PROPERTY__OPTION_PARAM);
		createEReference(xmlPropertyEClass, XML_PROPERTY__OPTION);
		createEReference(xmlPropertyEClass, XML_PROPERTY__ATTRIBUTE_NAME);

		xmlRootEClass = createEClass(XML_ROOT);

		// Create enums
		propertyKindEEnum = createEEnum(PROPERTY_KIND);
		relationKindEEnum = createEEnum(RELATION_KIND);
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
		xmlElementEClass.getESuperTypes().add(theGraphstructurePackage.getElement());
		xmlNavigationEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		xmlReferenceEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		xmlPropertyEClass.getESuperTypes().add(theGraphstructurePackage.getProperty());
		xmlRootEClass.getESuperTypes().add(theGraphstructurePackage.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(xmlElementEClass, XMLElement.class, "XMLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getXMLElement__GetXQueryRepresentation__Location(), ecorePackage.getEString(), "getXQueryRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getXMLElement__GetXQueryVariable(), ecorePackage.getEString(), "getXQueryVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXMLElement__TranslatePredicates__Location(), ecorePackage.getEString(), "translatePredicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(xmlNavigationEClass, XMLNavigation.class, "XMLNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLNavigation_Option(), theParametersPackage.getRelationOptionParam(), theParametersPackage.getRelationOptionParam_Relations(), "option", null, 0, 1, XMLNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLNavigation_OptionParam(), theParametersPackage.getOptionParam(), theParametersPackage.getOptionParam_Relation(), "optionParam", null, 0, 1, XMLNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlReferenceEClass, XMLReference.class, "XMLReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLReference_SourceProperty(), this.getXMLProperty(), null, "sourceProperty", null, 1, 1, XMLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLReference_TargetProperty(), this.getXMLProperty(), null, "targetProperty", null, 1, 1, XMLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLReference_Type(), theGraphstructurePackage.getReturnType(), "type", null, 0, 1, XMLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXMLReference__IsTranslatable(), ecorePackage.getEBoolean(), "isTranslatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(xmlPropertyEClass, XMLProperty.class, "XMLProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLProperty_OptionParam(), theParametersPackage.getOptionParam(), theParametersPackage.getOptionParam_Property(), "optionParam", null, 0, 1, XMLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLProperty_Option(), theParametersPackage.getPropertyOptionParam(), theParametersPackage.getPropertyOptionParam_Properties(), "option", null, 0, 1, XMLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLProperty_AttributeName(), theParametersPackage.getTextLiteralParam(), theParametersPackage.getTextLiteralParam_Properties(), "attributeName", null, 0, 1, XMLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlRootEClass, XMLRoot.class, "XMLRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(propertyKindEEnum, PropertyKind.class, "PropertyKind");
		addEEnumLiteral(propertyKindEEnum, PropertyKind.DATA);
		addEEnumLiteral(propertyKindEEnum, PropertyKind.TAG);
		addEEnumLiteral(propertyKindEEnum, PropertyKind.ATTRIBUTE);

		initEEnum(relationKindEEnum, RelationKind.class, "RelationKind");
		addEEnumLiteral(relationKindEEnum, RelationKind.CHILD);
		addEEnumLiteral(relationKindEEnum, RelationKind.DESCENDANT);
		addEEnumLiteral(relationKindEEnum, RelationKind.PARENT);
		addEEnumLiteral(relationKindEEnum, RelationKind.ANCESTOR);
		addEEnumLiteral(relationKindEEnum, RelationKind.FOLLOWING);
		addEEnumLiteral(relationKindEEnum, RelationKind.FOLLOWING_SIBLING);
		addEEnumLiteral(relationKindEEnum, RelationKind.PRECEDING);
		addEEnumLiteral(relationKindEEnum, RelationKind.PRECEDING_SIBLING);
		addEEnumLiteral(relationKindEEnum, RelationKind.ANCESTOR_OR_SELF);
		addEEnumLiteral(relationKindEEnum, RelationKind.DESCENDANT_OR_SELF);
		addEEnumLiteral(relationKindEEnum, RelationKind.SELF);
		addEEnumLiteral(relationKindEEnum, RelationKind.TWOCHILD);
		addEEnumLiteral(relationKindEEnum, RelationKind.THREECHILD);
		addEEnumLiteral(relationKindEEnum, RelationKind.FOURCHILD);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptionxmlPackageImpl