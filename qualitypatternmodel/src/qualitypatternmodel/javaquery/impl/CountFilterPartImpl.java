/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.CountFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.NumberFilterPart;
import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResultParam;
import qualitypatternmodel.operators.ComparisonOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getSubfilter1 <em>Subfilter1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getSubfilter2 <em>Subfilter2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterPartImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountFilterPartImpl extends BooleanFilterPartImpl implements CountFilterPart {
	/**
	 * The cached value of the '{@link #getSubfilter1() <em>Subfilter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter1()
	 * @generated
	 * @ordered
	 */
	protected NumberFilterPart subfilter1;

	/**
	 * The cached value of the '{@link #getSubfilter2() <em>Subfilter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter2()
	 * @generated
	 * @ordered
	 */
	protected NumberFilterPart subfilter2;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator OPERATOR_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected ContainerInterim argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountFilterPartImpl() {
		super();
	}

	public CountFilterPartImpl(ComparisonOperator value, NumberFilterPart arg1filter, NumberFilterPart arg2filter) {
		super();
		setOperator(value);
		setSubfilter1(arg1filter);
		setSubfilter2(arg2filter);
	}

	@Override
	public Boolean apply() throws InvalidityException {
		Double result1 = getSubfilter1().apply();
		Double result2 = getSubfilter2().apply();
		return ComparisonOperator.evaluate(getOperator(), result1, result2);
	}

	@Override
	public EList<InterimResultParam> getArguments() {
		return new BasicEList<InterimResultParam>();
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.COUNT_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberFilterPart getSubfilter1() {
		return subfilter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubfilter1(NumberFilterPart newSubfilter1, NotificationChain msgs) {
		NumberFilterPart oldSubfilter1 = subfilter1;
		subfilter1 = newSubfilter1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1, oldSubfilter1, newSubfilter1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubfilter1(NumberFilterPart newSubfilter1) {
		if (newSubfilter1 != subfilter1) {
			NotificationChain msgs = null;
			if (subfilter1 != null)
				msgs = ((InternalEObject)subfilter1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1, null, msgs);
			if (newSubfilter1 != null)
				msgs = ((InternalEObject)newSubfilter1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1, null, msgs);
			msgs = basicSetSubfilter1(newSubfilter1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1, newSubfilter1, newSubfilter1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberFilterPart getSubfilter2() {
		return subfilter2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubfilter2(NumberFilterPart newSubfilter2, NotificationChain msgs) {
		NumberFilterPart oldSubfilter2 = subfilter2;
		subfilter2 = newSubfilter2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2, oldSubfilter2, newSubfilter2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubfilter2(NumberFilterPart newSubfilter2) {
		if (newSubfilter2 != subfilter2) {
			NotificationChain msgs = null;
			if (subfilter2 != null)
				msgs = ((InternalEObject)subfilter2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2, null, msgs);
			if (newSubfilter2 != null)
				msgs = ((InternalEObject)newSubfilter2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2, null, msgs);
			msgs = basicSetSubfilter2(newSubfilter2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2, newSubfilter2, newSubfilter2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(ComparisonOperator newOperator) {
		ComparisonOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerInterim getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (ContainerInterim)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInterim basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(ContainerInterim newArgument) {
		ContainerInterim oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1:
				return basicSetSubfilter1(null, msgs);
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2:
				return basicSetSubfilter2(null, msgs);
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
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1:
				return getSubfilter1();
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2:
				return getSubfilter2();
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				return getOperator();
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
				if (resolve) return getArgument();
				return basicGetArgument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1:
				setSubfilter1((NumberFilterPart)newValue);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2:
				setSubfilter2((NumberFilterPart)newValue);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				setOperator((ComparisonOperator)newValue);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
				setArgument((ContainerInterim)newValue);
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
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1:
				setSubfilter1((NumberFilterPart)null);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2:
				setSubfilter2((NumberFilterPart)null);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
				setArgument((ContainerInterim)null);
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
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER1:
				return subfilter1 != null;
			case JavaqueryPackage.COUNT_FILTER_PART__SUBFILTER2:
				return subfilter2 != null;
			case JavaqueryPackage.COUNT_FILTER_PART__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case JavaqueryPackage.COUNT_FILTER_PART__ARGUMENT:
				return argument != null;
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
} //CountFilterPartImpl
