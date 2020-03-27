/**
 */
package qualitypatternmodel.parameters.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.parameters.*;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.parameters.ParametersPackage
 * @generated
 */
public class ParametersSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParametersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersSwitch() {
		if (modelPackage == null) {
			modelPackage = ParametersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ParametersPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T1 result = caseParameter(parameter);
				if (result == null) result = caseComparable(parameter);
				if (result == null) result = casePatternElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.COMPARISON_OPTION_PARAM: {
				ComparisonOptionParam comparisonOptionParam = (ComparisonOptionParam)theEObject;
				T1 result = caseComparisonOptionParam(comparisonOptionParam);
				if (result == null) result = caseParameter(comparisonOptionParam);
				if (result == null) result = caseComparable(comparisonOptionParam);
				if (result == null) result = casePatternElement(comparisonOptionParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.PROPERTY_OPTION_PARAM: {
				PropertyOptionParam propertyOptionParam = (PropertyOptionParam)theEObject;
				T1 result = casePropertyOptionParam(propertyOptionParam);
				if (result == null) result = caseParameter(propertyOptionParam);
				if (result == null) result = caseComparable(propertyOptionParam);
				if (result == null) result = casePatternElement(propertyOptionParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.PARAMETER_LIST: {
				ParameterList parameterList = (ParameterList)theEObject;
				T1 result = caseParameterList(parameterList);
				if (result == null) result = casePatternElement(parameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.BOOLEAN_PARAM: {
				BooleanParam booleanParam = (BooleanParam)theEObject;
				T1 result = caseBooleanParam(booleanParam);
				if (result == null) result = caseParameterValue(booleanParam);
				if (result == null) result = caseParameter(booleanParam);
				if (result == null) result = caseComparable(booleanParam);
				if (result == null) result = casePatternElement(booleanParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.TEXT_LIST_PARAM: {
				TextListParam textListParam = (TextListParam)theEObject;
				T1 result = caseTextListParam(textListParam);
				if (result == null) result = caseParameterValue(textListParam);
				if (result == null) result = caseParameter(textListParam);
				if (result == null) result = caseComparable(textListParam);
				if (result == null) result = casePatternElement(textListParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.TEXT_LITERAL_PARAM: {
				TextLiteralParam textLiteralParam = (TextLiteralParam)theEObject;
				T1 result = caseTextLiteralParam(textLiteralParam);
				if (result == null) result = caseParameterValue(textLiteralParam);
				if (result == null) result = caseParameter(textLiteralParam);
				if (result == null) result = caseComparable(textLiteralParam);
				if (result == null) result = casePatternElement(textLiteralParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.NUMBER_PARAM: {
				NumberParam numberParam = (NumberParam)theEObject;
				T1 result = caseNumberParam(numberParam);
				if (result == null) result = caseParameterValue(numberParam);
				if (result == null) result = caseParameter(numberParam);
				if (result == null) result = caseComparable(numberParam);
				if (result == null) result = casePatternElement(numberParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.PARAMETER_VALUE: {
				ParameterValue parameterValue = (ParameterValue)theEObject;
				T1 result = caseParameterValue(parameterValue);
				if (result == null) result = caseParameter(parameterValue);
				if (result == null) result = caseComparable(parameterValue);
				if (result == null) result = casePatternElement(parameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.DATE_PARAM: {
				DateParam dateParam = (DateParam)theEObject;
				T1 result = caseDateParam(dateParam);
				if (result == null) result = caseParameterValue(dateParam);
				if (result == null) result = caseParameter(dateParam);
				if (result == null) result = caseComparable(dateParam);
				if (result == null) result = casePatternElement(dateParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.TIME_PARAM: {
				TimeParam timeParam = (TimeParam)theEObject;
				T1 result = caseTimeParam(timeParam);
				if (result == null) result = caseParameterValue(timeParam);
				if (result == null) result = caseParameter(timeParam);
				if (result == null) result = caseComparable(timeParam);
				if (result == null) result = casePatternElement(timeParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.UNKNOWN_PARAMETER_VALUE: {
				UnknownParameterValue unknownParameterValue = (UnknownParameterValue)theEObject;
				T1 result = caseUnknownParameterValue(unknownParameterValue);
				if (result == null) result = caseParameter(unknownParameterValue);
				if (result == null) result = caseComparable(unknownParameterValue);
				if (result == null) result = casePatternElement(unknownParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.DATE_TIME_PARAM: {
				DateTimeParam dateTimeParam = (DateTimeParam)theEObject;
				T1 result = caseDateTimeParam(dateTimeParam);
				if (result == null) result = caseParameterValue(dateTimeParam);
				if (result == null) result = caseParameter(dateTimeParam);
				if (result == null) result = caseComparable(dateTimeParam);
				if (result == null) result = casePatternElement(dateTimeParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.RELATION_OPTION_PARAM: {
				RelationOptionParam relationOptionParam = (RelationOptionParam)theEObject;
				T1 result = caseRelationOptionParam(relationOptionParam);
				if (result == null) result = caseParameter(relationOptionParam);
				if (result == null) result = caseComparable(relationOptionParam);
				if (result == null) result = casePatternElement(relationOptionParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.OPTION_PARAM: {
				OptionParam<?> optionParam = (OptionParam<?>)theEObject;
				T1 result = caseOptionParam(optionParam);
				if (result == null) result = caseParameter(optionParam);
				if (result == null) result = caseComparable(optionParam);
				if (result == null) result = casePatternElement(optionParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Option Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComparisonOptionParam(ComparisonOptionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Option Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyOptionParam(PropertyOptionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterList(ParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanParam(BooleanParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text List Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text List Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextListParam(TextListParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Literal Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Literal Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextLiteralParam(TextLiteralParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumberParam(NumberParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterValue(ParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDateParam(DateParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTimeParam(TimeParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnknownParameterValue(UnknownParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDateTimeParam(DateTimeParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Option Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationOptionParam(RelationOptionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseOptionParam(OptionParam<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComparable(qualitypatternmodel.graphstructure.Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //InputfieldsSwitch
