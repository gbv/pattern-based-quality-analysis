/**
 */
package qualitypatternmodel.inputfields.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.PropertyLocation;

import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.VariableList;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.PropertyOptionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.PropertyOptionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.PropertyOptionImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyOptionImpl extends InputImpl implements PropertyOption {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyLocation> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyLocation VALUE_EDEFAULT = PropertyLocation.DATA;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected PropertyLocation value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PropertyOptionImpl() {
		super();
		getOptions().add(PropertyLocation.TAG);
		getOptions().add(PropertyLocation.DATA);
		getOptions().add(PropertyLocation.ATTRIBUTE);
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return getValue().getLiteral();
	}
	
	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getOptions() == null) 
			throw new InvalidityException("options null");
		if (getOptions().size() < 1) 
			throw new InvalidityException("not enough options");
		super.isValidLocal(isDefinedPattern);
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && getOptions().contains(getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetVariableList(VariableList newVariableList, NotificationChain msgs) {		
		setProperty(null);
		return super.basicSetVariableList(newVariableList, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.PROPERTY_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyLocation> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<PropertyLocation>(PropertyLocation.class, this, InputfieldsPackage.PROPERTY_OPTION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyLocation getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(PropertyLocation newValue) {
		PropertyLocation oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.PROPERTY_OPTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InputfieldsPackage.PROPERTY_OPTION__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputfieldsPackage.PROPERTY_OPTION__PROPERTY, oldProperty, newProperty);
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
	public void setProperty(Property newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, GraphstructurePackage.PROPERTY__PROPERTY_OPTION, Property.class, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, GraphstructurePackage.PROPERTY__PROPERTY_OPTION, Property.class, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.PROPERTY_OPTION__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputfieldsPackage.PROPERTY_OPTION__PROPERTY:
				if (property != null)
					msgs = ((InternalEObject)property).eInverseRemove(this, GraphstructurePackage.PROPERTY__PROPERTY_OPTION, Property.class, msgs);
				return basicSetProperty((Property)otherEnd, msgs);
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
			case InputfieldsPackage.PROPERTY_OPTION__PROPERTY:
				return basicSetProperty(null, msgs);
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
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				return getOptions();
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
				return getValue();
			case InputfieldsPackage.PROPERTY_OPTION__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
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
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends PropertyLocation>)newValue);
				return;
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
				setValue((PropertyLocation)newValue);
				return;
			case InputfieldsPackage.PROPERTY_OPTION__PROPERTY:
				setProperty((Property)newValue);
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
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				getOptions().clear();
				return;
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InputfieldsPackage.PROPERTY_OPTION__PROPERTY:
				setProperty((Property)null);
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
			case InputfieldsPackage.PROPERTY_OPTION__OPTIONS:
				return options != null && !options.isEmpty();
			case InputfieldsPackage.PROPERTY_OPTION__VALUE:
				return value != VALUE_EDEFAULT;
			case InputfieldsPackage.PROPERTY_OPTION__PROPERTY:
				return property != null;
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
		return "prop " + getValue() + " (" + getShortPatternInternalId() + ")";
	}

} //PropertyOptionImpl
