/**
 */
package qualitypatternmodel.inputfields.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.TextLiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.TextLiteralImpl#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextLiteralImpl extends TextImpl implements TextLiteral {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected Match match;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TextLiteralImpl() {
		super();
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(inputIsValid()) {
			return "\"" + getValue() + "\"";
		} else {
			throw new InvalidityException("invalid string");
		}
	}

	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && getValue() != "";
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.TEXT_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.TEXT_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Match getMatch() {
		if (match != null && match.eIsProxy()) {
			InternalEObject oldMatch = (InternalEObject)match;
			match = (Match)eResolveProxy(oldMatch);
			if (match != oldMatch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InputfieldsPackage.TEXT_LITERAL__MATCH, oldMatch, match));
			}
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match basicGetMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Match newMatch, NotificationChain msgs) {
		Match oldMatch = match;
		match = newMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputfieldsPackage.TEXT_LITERAL__MATCH, oldMatch, newMatch);
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
	public void setMatch(Match newMatch) {
		if (newMatch != match) {
			NotificationChain msgs = null;
			if (match != null)
				msgs = ((InternalEObject)match).eInverseRemove(this, FunctionsPackage.MATCH__REGULAR_EXPRESSION, Match.class, msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, FunctionsPackage.MATCH__REGULAR_EXPRESSION, Match.class, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.TEXT_LITERAL__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputfieldsPackage.TEXT_LITERAL__MATCH:
				if (match != null)
					msgs = ((InternalEObject)match).eInverseRemove(this, FunctionsPackage.MATCH__REGULAR_EXPRESSION, Match.class, msgs);
				return basicSetMatch((Match)otherEnd, msgs);
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
			case InputfieldsPackage.TEXT_LITERAL__MATCH:
				return basicSetMatch(null, msgs);
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
			case InputfieldsPackage.TEXT_LITERAL__VALUE:
				return getValue();
			case InputfieldsPackage.TEXT_LITERAL__MATCH:
				if (resolve) return getMatch();
				return basicGetMatch();
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
			case InputfieldsPackage.TEXT_LITERAL__VALUE:
				setValue((String)newValue);
				return;
			case InputfieldsPackage.TEXT_LITERAL__MATCH:
				setMatch((Match)newValue);
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
			case InputfieldsPackage.TEXT_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InputfieldsPackage.TEXT_LITERAL__MATCH:
				setMatch((Match)null);
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
			case InputfieldsPackage.TEXT_LITERAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case InputfieldsPackage.TEXT_LITERAL__MATCH:
				return match != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		return "" + getValue() + " (" + getShortPatternInternalId() + ")";
	}

} //TextLiteralImpl
