/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.ParameterValueImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getXmlNavigation <em>Xml Navigation</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getPropertyOptionParam <em>Property Option Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getAxisPair <em>Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.PathParamImpl#getXmlPropertyNavigation <em>Xml Property Navigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathParamImpl extends ParameterValueImpl implements PathParam {
	/**
	 * The cached value of the '{@link #getXmlNavigation() <em>Xml Navigation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlNavigation()
	 * @generated
	 * @ordered
	 */
	protected XmlNavigation xmlNavigation;

	/**
	 * The cached value of the '{@link #getPropertyOptionParam() <em>Property Option Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyOptionParam()
	 * @generated
	 * @ordered
	 */
	protected PropertyOptionParam propertyOptionParam;

	/**
	 * The cached value of the '{@link #getAxisPair() <em>Axis Pair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisPair()
	 * @generated
	 * @ordered
	 */
	protected EList<AxisPair> axisPair;

	/**
	 * The cached value of the '{@link #getXmlPropertyNavigation() <em>Xml Property Navigation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlPropertyNavigation()
	 * @generated
	 * @ordered
	 */
	protected XmlPropertyNavigation xmlPropertyNavigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathParamImpl() {
		super();
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		if (axisPair != null) {
			for(AxisPair a : axisPair) {
				a.isValid(abstractionLevel);
			}
		}
		if (propertyOptionParam != null) 
			propertyOptionParam.isValid(abstractionLevel);
	}
	
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (propertyOptionParam == null) 
			throw new InvalidityException("propertyOptionParam is null");
		if (axisPair == null) 
			throw new InvalidityException("axisPair is null");
		if (axisPair.isEmpty()) 
			throw new InvalidityException("axisPair is empty");
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (axisPair != null) {
			for(AxisPair a : axisPair) {
				res.addAll(a.getAllParameters());
			}			
		}
		if (propertyOptionParam != null) {
			res.add(propertyOptionParam);
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlNavigation getXmlNavigation() {
		if (xmlNavigation != null && xmlNavigation.eIsProxy()) {
			InternalEObject oldXmlNavigation = (InternalEObject)xmlNavigation;
			xmlNavigation = (XmlNavigation)eResolveProxy(oldXmlNavigation);
			if (xmlNavigation != oldXmlNavigation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, oldXmlNavigation, xmlNavigation));
			}
		}
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlNavigation basicGetXmlNavigation() {
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlNavigation(XmlNavigation newXmlNavigation, NotificationChain msgs) {
		XmlNavigation oldXmlNavigation = xmlNavigation;
		xmlNavigation = newXmlNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, oldXmlNavigation, newXmlNavigation);
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
	public void setXmlNavigation(XmlNavigation newXmlNavigation) {
		if (newXmlNavigation != xmlNavigation) {
			NotificationChain msgs = null;
			if (xmlNavigation != null)
				msgs = ((InternalEObject)xmlNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, XmlNavigation.class, msgs);
			if (newXmlNavigation != null)
				msgs = ((InternalEObject)newXmlNavigation).eInverseAdd(this, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, XmlNavigation.class, msgs);
			msgs = basicSetXmlNavigation(newXmlNavigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, newXmlNavigation, newXmlNavigation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOptionParam getPropertyOptionParam() {
		return propertyOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyOptionParam(PropertyOptionParam newPropertyOptionParam, NotificationChain msgs) {
		PropertyOptionParam oldPropertyOptionParam = propertyOptionParam;
		propertyOptionParam = newPropertyOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM, oldPropertyOptionParam, newPropertyOptionParam);
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
	public void setPropertyOptionParam(PropertyOptionParam newPropertyOptionParam) {
		if (newPropertyOptionParam != propertyOptionParam) {
			NotificationChain msgs = null;
			if (propertyOptionParam != null)
				msgs = ((InternalEObject)propertyOptionParam).eInverseRemove(this, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM, PropertyOptionParam.class, msgs);
			if (newPropertyOptionParam != null)
				msgs = ((InternalEObject)newPropertyOptionParam).eInverseAdd(this, AdaptionxmlPackage.PROPERTY_OPTION_PARAM__PATH_PARAM, PropertyOptionParam.class, msgs);
			msgs = basicSetPropertyOptionParam(newPropertyOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM, newPropertyOptionParam, newPropertyOptionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AxisPair> getAxisPair() {
		if (axisPair == null) {
			axisPair = new EObjectContainmentWithInverseEList<AxisPair>(AxisPair.class, this, AdaptionxmlPackage.PATH_PARAM__AXIS_PAIR, AdaptionxmlPackage.AXIS_PAIR__PATH_PARAM);
		}
		return axisPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPropertyNavigation getXmlPropertyNavigation() {
		if (xmlPropertyNavigation != null && xmlPropertyNavigation.eIsProxy()) {
			InternalEObject oldXmlPropertyNavigation = (InternalEObject)xmlPropertyNavigation;
			xmlPropertyNavigation = (XmlPropertyNavigation)eResolveProxy(oldXmlPropertyNavigation);
			if (xmlPropertyNavigation != oldXmlPropertyNavigation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, oldXmlPropertyNavigation, xmlPropertyNavigation));
			}
		}
		return xmlPropertyNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPropertyNavigation basicGetXmlPropertyNavigation() {
		return xmlPropertyNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlPropertyNavigation(XmlPropertyNavigation newXmlPropertyNavigation, NotificationChain msgs) {
		XmlPropertyNavigation oldXmlPropertyNavigation = xmlPropertyNavigation;
		xmlPropertyNavigation = newXmlPropertyNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, oldXmlPropertyNavigation, newXmlPropertyNavigation);
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
	public void setXmlPropertyNavigation(XmlPropertyNavigation newXmlPropertyNavigation) {
		if (newXmlPropertyNavigation != xmlPropertyNavigation) {
			NotificationChain msgs = null;
			if (xmlPropertyNavigation != null)
				msgs = ((InternalEObject)xmlPropertyNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, XmlPropertyNavigation.class, msgs);
			if (newXmlPropertyNavigation != null)
				msgs = ((InternalEObject)newXmlPropertyNavigation).eInverseAdd(this, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, XmlPropertyNavigation.class, msgs);
			msgs = basicSetXmlPropertyNavigation(newXmlPropertyNavigation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION, newXmlPropertyNavigation, newXmlPropertyNavigation));
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				if (xmlNavigation != null)
					msgs = ((InternalEObject)xmlNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, XmlNavigation.class, msgs);
				return basicSetXmlNavigation((XmlNavigation)otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				if (propertyOptionParam != null)
					msgs = ((InternalEObject)propertyOptionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM, null, msgs);
				return basicSetPropertyOptionParam((PropertyOptionParam)otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAxisPair()).basicAdd(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				if (xmlPropertyNavigation != null)
					msgs = ((InternalEObject)xmlPropertyNavigation).eInverseRemove(this, AdaptionxmlPackage.XML_PROPERTY_NAVIGATION__PATH_PARAM, XmlPropertyNavigation.class, msgs);
				return basicSetXmlPropertyNavigation((XmlPropertyNavigation)otherEnd, msgs);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				return basicSetXmlNavigation(null, msgs);
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return basicSetPropertyOptionParam(null, msgs);
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIR:
				return ((InternalEList<?>)getAxisPair()).basicRemove(otherEnd, msgs);
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				return basicSetXmlPropertyNavigation(null, msgs);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				if (resolve) return getXmlNavigation();
				return basicGetXmlNavigation();
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return getPropertyOptionParam();
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIR:
				return getAxisPair();
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				if (resolve) return getXmlPropertyNavigation();
				return basicGetXmlPropertyNavigation();
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				setXmlNavigation((XmlNavigation)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				setPropertyOptionParam((PropertyOptionParam)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIR:
				getAxisPair().clear();
				getAxisPair().addAll((Collection<? extends AxisPair>)newValue);
				return;
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				setXmlPropertyNavigation((XmlPropertyNavigation)newValue);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				setXmlNavigation((XmlNavigation)null);
				return;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				setPropertyOptionParam((PropertyOptionParam)null);
				return;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIR:
				getAxisPair().clear();
				return;
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				setXmlPropertyNavigation((XmlPropertyNavigation)null);
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
			case AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION:
				return xmlNavigation != null;
			case AdaptionxmlPackage.PATH_PARAM__PROPERTY_OPTION_PARAM:
				return propertyOptionParam != null;
			case AdaptionxmlPackage.PATH_PARAM__AXIS_PAIR:
				return axisPair != null && !axisPair.isEmpty();
			case AdaptionxmlPackage.PATH_PARAM__XML_PROPERTY_NAVIGATION:
				return xmlPropertyNavigation != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //PathParamImpl
