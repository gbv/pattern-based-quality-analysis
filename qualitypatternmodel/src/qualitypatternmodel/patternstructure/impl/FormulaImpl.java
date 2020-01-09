/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.TranslationLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaImpl extends ConditionImpl implements Formula {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> arguments;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator OPERATOR_EDEFAULT = LogicalOperator.NOT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaImpl() {
		super();
	}
	
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidTranslationException  {
//		if(operator == null || arguments == null) {
//			return false;
//		}
//		if(operator == LogicalOperator.NOT) {
//			return arguments.size() == 1 && arguments.get(0) != null && arguments.get(0).isValid(isDefinedPattern);
//		} else {
//			return arguments.size() == 2 && arguments.get(0) != null && arguments.get(0).isValid(isDefinedPattern) && arguments.get(1) != null && arguments.get(1).isValid(isDefinedPattern);
//		}

		if(operator == null) 
			throw new InvalidTranslationException("operator null");
		if(arguments == null) 
			throw new InvalidTranslationException("arguments null");
		
		if(operator == LogicalOperator.NOT) {
			if (arguments.size() != 1 || arguments.get(0) == null)
				throw new InvalidTranslationException("argument invalid (op:NOT)");
			arguments.get(0).isValid(isDefinedPattern);
		} else 
			if (arguments.size() != 2 || arguments.get(0) == null || arguments.get(1) == null)
				throw new InvalidTranslationException("arguments invalid");
			arguments.get(0).isValid(isDefinedPattern);
			arguments.get(1).isValid(isDefinedPattern);
//			if(!(arguments.size() == 2 && arguments.get(0) != null && arguments.get(0).isValid(isDefinedPattern) && arguments.get(1) != null && arguments.get(1).isValid(isDefinedPattern)))
	}
	
	@Override
	public String toXQuery(TranslationLocation translationLocation) throws InvalidTranslationException {
		if(operator == LogicalOperator.NOT) {
			return operator.getLiteral() + "(" + arguments.get(0).toXQuery(translationLocation) + ")";
		} else {
			return "(" + arguments.get(0).toXQuery(translationLocation) + ") " + operator.getLiteral() + " (" + arguments.get(1).toXQuery(translationLocation) + ")";
		}
	}
	
	@Override
	public EList<Input> getAllVariables() throws InvalidTranslationException {
		EList<Input> inputs = new BasicEList<Input>();
		for(Condition condition : arguments) {
			inputs.addAll(condition.getAllVariables());
		}	
		return inputs;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Condition>(Condition.class, this, PatternstructurePackage.FORMULA__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(LogicalOperator newOperator) {
		LogicalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				return getArguments();
			case PatternstructurePackage.FORMULA__OPERATOR:
				return getOperator();
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
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Condition>)newValue);
				return;
			case PatternstructurePackage.FORMULA__OPERATOR:
				setOperator((LogicalOperator)newValue);
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
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				getArguments().clear();
				return;
			case PatternstructurePackage.FORMULA__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case PatternstructurePackage.FORMULA__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //FormulaImpl
