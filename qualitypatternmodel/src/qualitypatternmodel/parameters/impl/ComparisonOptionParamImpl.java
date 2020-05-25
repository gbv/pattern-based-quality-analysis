/**
 */
package qualitypatternmodel.parameters.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getComparisons <em>Comparisons</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getCountCondition <em>Count Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonOptionParamImpl extends ParameterImpl implements ComparisonOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparisonOperator> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator VALUE_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparisons() <em>Comparisons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisons()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparisons;

	/**
	 * The cached value of the '{@link #getCountCondition() <em>Count Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<CountCondition> countCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComparisonOptionParamImpl() {
		super();
		getOptions().add(ComparisonOperator.EQUAL);
//		getOptions().add(ComparisonOperator.LESS);
//		getOptions().add(ComparisonOperator.GREATER);
//		getOptions().add(ComparisonOperator.GREATEROREQUAL);
//		getOptions().add(ComparisonOperator.LESSOREQUAL);
		getOptions().add(ComparisonOperator.NOTEQUAL);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getOptions() == null) 
			throw new InvalidityException("options null");
		if (getOptions().size() < 1) 
			throw new InvalidityException("not enough options");
		super.isValidLocal(abstractionLevel);
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		return getValue().getLiteral();
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && options.contains(getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.COMPARISON_OPTION_PARAM;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetVariableList(ParameterList newVariableList, NotificationChain msgs) {
		getComparisons().clear();
		return super.basicSetParameterList(newVariableList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComparisonOperator> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<ComparisonOperator>(ComparisonOperator.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(ComparisonOperator newValue) {
		ComparisonOperator oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.COMPARISON_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparisons() {
		if (comparisons == null) {
			comparisons = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, OperatorsPackage.COMPARISON__OPTION);
		}
		return comparisons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountCondition> getCountCondition() {
		if (countCondition == null) {
			countCondition = new EObjectWithInverseResolvingEList<CountCondition>(CountCondition.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION, PatternstructurePackage.COUNT_CONDITION__OPTION);
		}
		return countCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparisons()).basicAdd(otherEnd, msgs);
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCountCondition()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return ((InternalEList<?>)getComparisons()).basicRemove(otherEnd, msgs);
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION:
				return ((InternalEList<?>)getCountCondition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return getComparisons();
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION:
				return getCountCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ComparisonOperator>)newValue);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				setValue((ComparisonOperator)newValue);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				getComparisons().clear();
				getComparisons().addAll((Collection<? extends Comparison>)newValue);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION:
				getCountCondition().clear();
				getCountCondition().addAll((Collection<? extends CountCondition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				getComparisons().clear();
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION:
				getCountCondition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return comparisons != null && !comparisons.isEmpty();
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITION:
				return countCondition != null && !countCondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		return "comp [" + getInternalId() + "] " + getValue();
	}
	
	@Override
	public void generateDescription() {
		String res = "Angabe des Vergleichsoperators";
		try {
			for(Comparison comp : getComparisons()) {
				Comparable arg1 = comp.getArgument1();
				Comparable arg2 = comp.getArgument2();
				String argument1 = arg1.getClass().getCanonicalName() + " " + arg1.getInternalId();
				String argument2 = arg2.getClass().getCanonicalName() + " " + arg1.getInternalId();
				res += " zum Vergleich von " + argument1 + " und " + argument2;
			}
		} catch (Exception e) {}
		setDescription(res);
	}

} //CompOptionImpl
