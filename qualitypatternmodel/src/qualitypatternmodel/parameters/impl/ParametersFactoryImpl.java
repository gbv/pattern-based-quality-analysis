/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.AxisOptionParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.PropertyOptionParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.UnknownParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametersFactoryImpl extends EFactoryImpl implements ParametersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParametersFactory init() {
		try {
			ParametersFactory theParametersFactory = (ParametersFactory)EPackage.Registry.INSTANCE.getEFactory(ParametersPackage.eNS_URI);
			if (theParametersFactory != null) {
				return theParametersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParametersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersFactoryImpl() {
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
			case ParametersPackage.COMPARISON_OPTION_PARAM: return createComparisonOptionParam();
			case ParametersPackage.PROPERTY_OPTION_PARAM: return createPropertyOptionParam();
			case ParametersPackage.PARAMETER_LIST: return createParameterList();
			case ParametersPackage.BOOLEAN_PARAM: return createBooleanParam();
			case ParametersPackage.TEXT_LIST_PARAM: return createTextListParam();
			case ParametersPackage.TEXT_LITERAL_PARAM: return createTextLiteralParam();
			case ParametersPackage.NUMBER_PARAM: return createNumberParam();
			case ParametersPackage.DATE_PARAM: return createDateParam();
			case ParametersPackage.TIME_PARAM: return createTimeParam();
			case ParametersPackage.UNKNOWN_PARAMETER_VALUE: return createUnknownParameterValue();
			case ParametersPackage.DATE_TIME_PARAM: return createDateTimeParam();
			case ParametersPackage.AXIS_OPTION_PARAM: return createAxisOptionParam();
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
	public ComparisonOptionParam createComparisonOptionParam() {
		ComparisonOptionParamImpl comparisonOptionParam = new ComparisonOptionParamImpl();
		return comparisonOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOptionParam createPropertyOptionParam() {
		PropertyOptionParamImpl propertyOptionParam = new PropertyOptionParamImpl();
		return propertyOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanParam createBooleanParam() {
		BooleanParamImpl booleanParam = new BooleanParamImpl();
		return booleanParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextListParam createTextListParam() {
		TextListParamImpl textListParam = new TextListParamImpl();
		return textListParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam createTextLiteralParam() {
		TextLiteralParamImpl textLiteralParam = new TextLiteralParamImpl();
		return textLiteralParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberParam createNumberParam() {
		NumberParamImpl numberParam = new NumberParamImpl();
		return numberParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateParam createDateParam() {
		DateParamImpl dateParam = new DateParamImpl();
		return dateParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeParam createTimeParam() {
		TimeParamImpl timeParam = new TimeParamImpl();
		return timeParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownParameterValue createUnknownParameterValue() {
		UnknownParameterValueImpl unknownParameterValue = new UnknownParameterValueImpl();
		return unknownParameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimeParam createDateTimeParam() {
		DateTimeParamImpl dateTimeParam = new DateTimeParamImpl();
		return dateTimeParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisOptionParam createAxisOptionParam() {
		AxisOptionParamImpl axisOptionParam = new AxisOptionParamImpl();
		return axisOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersPackage getParametersPackage() {
		return (ParametersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParametersPackage getPackage() {
		return ParametersPackage.eINSTANCE;
	}

} //InputfieldsFactoryImpl