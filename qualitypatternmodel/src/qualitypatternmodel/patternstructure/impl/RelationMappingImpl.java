/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.RelationMappingImpl#getTo <em>To</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.RelationMappingImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationMappingImpl extends MappingImpl implements RelationMapping {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Relation to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Relation from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationMappingImpl() {
		super();
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidTranslationException {
		if (from == null) throw new InvalidTranslationException ("from null");
		if (to == null) throw new InvalidTranslationException ("to null");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.RELATION_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Relation)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.RELATION_MAPPING__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Relation newTo, NotificationChain msgs) {
		Relation oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Relation newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, GraphstructurePackage.RELATION__MAPPING_TO, Relation.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, GraphstructurePackage.RELATION__MAPPING_TO, Relation.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Relation)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.RELATION_MAPPING__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Relation newFrom, NotificationChain msgs) {
		Relation oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Relation newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, GraphstructurePackage.RELATION__MAPPING_FROM, Relation.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, GraphstructurePackage.RELATION__MAPPING_FROM, Relation.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.RELATION_MAPPING__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.RELATION_MAPPING__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, GraphstructurePackage.RELATION__MAPPING_TO, Relation.class, msgs);
				return basicSetTo((Relation)otherEnd, msgs);
			case PatternstructurePackage.RELATION_MAPPING__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, GraphstructurePackage.RELATION__MAPPING_FROM, Relation.class, msgs);
				return basicSetFrom((Relation)otherEnd, msgs);
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
			case PatternstructurePackage.RELATION_MAPPING__TO:
				return basicSetTo(null, msgs);
			case PatternstructurePackage.RELATION_MAPPING__FROM:
				return basicSetFrom(null, msgs);
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
			case PatternstructurePackage.RELATION_MAPPING__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case PatternstructurePackage.RELATION_MAPPING__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
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
			case PatternstructurePackage.RELATION_MAPPING__TO:
				setTo((Relation)newValue);
				return;
			case PatternstructurePackage.RELATION_MAPPING__FROM:
				setFrom((Relation)newValue);
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
			case PatternstructurePackage.RELATION_MAPPING__TO:
				setTo((Relation)null);
				return;
			case PatternstructurePackage.RELATION_MAPPING__FROM:
				setFrom((Relation)null);
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
			case PatternstructurePackage.RELATION_MAPPING__TO:
				return to != null;
			case PatternstructurePackage.RELATION_MAPPING__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationMappingImpl
