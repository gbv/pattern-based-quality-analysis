/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.patternstructure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternstructureFactoryImpl extends EFactoryImpl implements PatternstructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternstructureFactory init() {
		try {
			PatternstructureFactory thePatternstructureFactory = (PatternstructureFactory)EPackage.Registry.INSTANCE.getEFactory(PatternstructurePackage.eNS_URI);
			if (thePatternstructureFactory != null) {
				return thePatternstructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternstructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternstructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PatternstructurePackage.RELATION_MAPPING: return createRelationMapping();
			case PatternstructurePackage.QUANTIFIED_CONDITION: return createQuantifiedCondition();
			case PatternstructurePackage.MORPHISM: return createMorphism();
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING: return createSingleElementMapping();
			case PatternstructurePackage.FORMULA: return createFormula();
			case PatternstructurePackage.TRUE: return createTrue();
			case PatternstructurePackage.PATTERN: return createPattern();
			case PatternstructurePackage.VARIABLE_LIST: return createVariableList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PatternstructurePackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			case PatternstructurePackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case PatternstructurePackage.LOCATION:
				return createLocationFromString(eDataType, initialValue);
			case PatternstructurePackage.INVALID_TRANSLATION_EXCEPTION_WRAPPER:
				return createInvalidTranslationExceptionWrapperFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PatternstructurePackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			case PatternstructurePackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case PatternstructurePackage.LOCATION:
				return convertLocationToString(eDataType, instanceValue);
			case PatternstructurePackage.INVALID_TRANSLATION_EXCEPTION_WRAPPER:
				return convertInvalidTranslationExceptionWrapperToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping createRelationMapping() {
		RelationMappingImpl relationMapping = new RelationMappingImpl();
		return relationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedCondition createQuantifiedCondition() {
		QuantifiedConditionImpl quantifiedCondition = new QuantifiedConditionImpl();
		return quantifiedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Morphism createMorphism() {
		MorphismImpl morphism = new MorphismImpl();
		return morphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementMapping createSingleElementMapping() {
		SingleElementMappingImpl singleElementMapping = new SingleElementMappingImpl();
		return singleElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula createFormula() {
		FormulaImpl formula = new FormulaImpl();
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public True createTrue() {
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableList createVariableList() {
		VariableListImpl variableList = new VariableListImpl();
		return variableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocationFromString(EDataType eDataType, String initialValue) {
		Location result = Location.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidTranslationException createInvalidTranslationExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (InvalidTranslationException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidTranslationExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternstructurePackage getPatternstructurePackage() {
		return (PatternstructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternstructurePackage getPackage() {
		return PatternstructurePackage.eINSTANCE;
	}

} //PatternstructureFactoryImpl
