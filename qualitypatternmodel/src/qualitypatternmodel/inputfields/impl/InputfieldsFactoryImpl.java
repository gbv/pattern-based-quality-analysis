/**
 */
package qualitypatternmodel.inputfields.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.inputfields.AxisOption;
import qualitypatternmodel.inputfields.ComparisonOption;
import qualitypatternmodel.inputfields.Date;
import qualitypatternmodel.inputfields.DateTime;
import qualitypatternmodel.inputfields.InputfieldsFactory;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.TextList;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.Time;
import qualitypatternmodel.inputfields.UnknownParameterValue;
import qualitypatternmodel.inputfields.ParameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputfieldsFactoryImpl extends EFactoryImpl implements InputfieldsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InputfieldsFactory init() {
		try {
			InputfieldsFactory theInputfieldsFactory = (InputfieldsFactory)EPackage.Registry.INSTANCE.getEFactory(InputfieldsPackage.eNS_URI);
			if (theInputfieldsFactory != null) {
				return theInputfieldsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InputfieldsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputfieldsFactoryImpl() {
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
			case InputfieldsPackage.COMPARISON_OPTION: return createComparisonOption();
			case InputfieldsPackage.PROPERTY_OPTION: return createPropertyOption();
			case InputfieldsPackage.PARAMETER_LIST: return createParameterList();
			case InputfieldsPackage.BOOLEAN: return createBoolean();
			case InputfieldsPackage.TEXT_LIST: return createTextList();
			case InputfieldsPackage.TEXT_LITERAL: return createTextLiteral();
			case InputfieldsPackage.NUMBER: return createNumber();
			case InputfieldsPackage.DATE: return createDate();
			case InputfieldsPackage.TIME: return createTime();
			case InputfieldsPackage.UNKNOWN_PARAMETER_VALUE: return createUnknownParameterValue();
			case InputfieldsPackage.DATE_TIME: return createDateTime();
			case InputfieldsPackage.AXIS_OPTION: return createAxisOption();
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
	public ComparisonOption createComparisonOption() {
		ComparisonOptionImpl comparisonOption = new ComparisonOptionImpl();
		return comparisonOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOption createPropertyOption() {
		PropertyOptionImpl propertyOption = new PropertyOptionImpl();
		return propertyOption;
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
	public qualitypatternmodel.inputfields.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextList createTextList() {
		TextListImpl textList = new TextListImpl();
		return textList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteral createTextLiteral() {
		TextLiteralImpl textLiteral = new TextLiteralImpl();
		return textLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.inputfields.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
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
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxisOption createAxisOption() {
		AxisOptionImpl axisOption = new AxisOptionImpl();
		return axisOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputfieldsPackage getInputfieldsPackage() {
		return (InputfieldsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InputfieldsPackage getPackage() {
		return InputfieldsPackage.eINSTANCE;
	}

} //InputfieldsFactoryImpl
