/**
 */
package qualitypatternmodel.functions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getRegularExpression <em>Regular Expression</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends BooleanOperatorImpl implements Match {
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
	 * The cached value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularExpression()
	 * @generated
	 * @ordered
	 */
	protected TextLiteral regularExpression;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected qualitypatternmodel.inputfields.Boolean option;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MatchImpl() {
		super();
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(option!=null && regularExpression != null && regularExpression.getValue() != null && property != null) {
			if (option.getValue()){
				return "matches(" + property.toXQuery(location) + ", \"" + regularExpression.getValue() + "\")";
			} else {
				return "not(matches(" + property.toXQuery(location) + ", \"" + regularExpression.getValue() + "\"))";
			}	
		} else {
			throw new InvalidityException("invalid option");
		}
	}
	
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		option.isValid(isDefinedPattern);		
		regularExpression.isValid(isDefinedPattern);		
		property.isValid(isDefinedPattern);
	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if (option == null)
			throw new InvalidityException("options null");
		if (regularExpression == null)
			throw new InvalidityException("regularExpression null");
		if (property == null)
			throw new InvalidityException("property null");		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> res = new BasicEList<Input>();
		res.add(regularExpression);
		res.add(option);
		return res;
	}

	@Override
	public boolean isTranslatable() throws InvalidityException {
		return property.isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {		
		return property.getAllArgumentElements();
	}
	
	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = new BasicEList<Comparable>();		
		list.add(property);
		list.add(regularExpression);
		list.add(option);
		return list;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.MATCH;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__PROPERTY, oldProperty, property));
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
	 * @generated NOT
	 */
	@Override
	public void setProperty(Property newProperty) {
		Property oldProperty = property;
		property = newProperty;
		if(newProperty != null || oldProperty != null) {
			for(BooleanOperator boolOp : getRootBooleanOperators()) {
				if(newProperty != null) {
					boolOp.addElement(newProperty.getElement());
				}
				if(oldProperty != null) {
					boolOp.removeElement(oldProperty.getElement());
				}
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteral getRegularExpression() {
		if (regularExpression != null && regularExpression.eIsProxy()) {
			InternalEObject oldRegularExpression = (InternalEObject)regularExpression;
			regularExpression = (TextLiteral)eResolveProxy(oldRegularExpression);
			if (regularExpression != oldRegularExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
			}
		}
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteral basicGetRegularExpression() {
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegularExpression(TextLiteral newRegularExpression) {
		TextLiteral oldRegularExpression = regularExpression;
		regularExpression = newRegularExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public qualitypatternmodel.inputfields.Boolean getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (qualitypatternmodel.inputfields.Boolean)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.inputfields.Boolean basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(qualitypatternmodel.inputfields.Boolean newOption) {
		qualitypatternmodel.inputfields.Boolean oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.MATCH__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				if (resolve) return getRegularExpression();
				return basicGetRegularExpression();
			case FunctionsPackage.MATCH__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
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
			case FunctionsPackage.MATCH__PROPERTY:
				setProperty((Property)newValue);
				return;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextLiteral)newValue);
				return;
			case FunctionsPackage.MATCH__OPTION:
				setOption((qualitypatternmodel.inputfields.Boolean)newValue);
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
			case FunctionsPackage.MATCH__PROPERTY:
				setProperty((Property)null);
				return;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((TextLiteral)null);
				return;
			case FunctionsPackage.MATCH__OPTION:
				setOption((qualitypatternmodel.inputfields.Boolean)null);
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
			case FunctionsPackage.MATCH__PROPERTY:
				return property != null;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				return regularExpression != null;
			case FunctionsPackage.MATCH__OPTION:
				return option != null;
		}
		return super.eIsSet(featureID);
	}

} //MatchImpl
