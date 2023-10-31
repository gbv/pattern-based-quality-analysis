/**
 */
package qualitypatternmodel.outputstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualitypatternmodel.outputstructure.InterimResultParam;
import qualitypatternmodel.outputstructure.InterimResultsStructure;
import qualitypatternmodel.outputstructure.OutputstructurePackage;
import qualitypatternmodel.outputstructure.RecordInterimResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Results Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.outputstructure.impl.InterimResultsStructureImpl#getSubstructure <em>Substructure</em>}</li>
 *   <li>{@link qualitypatternmodel.outputstructure.impl.InterimResultsStructureImpl#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterimResultsStructureImpl extends MinimalEObjectImpl.Container implements InterimResultsStructure {
	/**
	 * The cached value of the '{@link #getSubstructure() <em>Substructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstructure()
	 * @generated
	 * @ordered
	 */
	protected InterimResultParam substructure;

	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected RecordInterimResult record;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterimResultsStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OutputstructurePackage.Literals.INTERIM_RESULTS_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterimResultParam getSubstructure() {
		return substructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstructure(InterimResultParam newSubstructure, NotificationChain msgs) {
		InterimResultParam oldSubstructure = substructure;
		substructure = newSubstructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE, oldSubstructure, newSubstructure);
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
	public void setSubstructure(InterimResultParam newSubstructure) {
		if (newSubstructure != substructure) {
			NotificationChain msgs = null;
			if (substructure != null)
				msgs = ((InternalEObject)substructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE, null, msgs);
			if (newSubstructure != null)
				msgs = ((InternalEObject)newSubstructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE, null, msgs);
			msgs = basicSetSubstructure(newSubstructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE, newSubstructure, newSubstructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordInterimResult getRecord() {
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecord(RecordInterimResult newRecord, NotificationChain msgs) {
		RecordInterimResult oldRecord = record;
		record = newRecord;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD, oldRecord, newRecord);
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
	public void setRecord(RecordInterimResult newRecord) {
		if (newRecord != record) {
			NotificationChain msgs = null;
			if (record != null)
				msgs = ((InternalEObject)record).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD, null, msgs);
			if (newRecord != null)
				msgs = ((InternalEObject)newRecord).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD, null, msgs);
			msgs = basicSetRecord(newRecord, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD, newRecord, newRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE:
				return basicSetSubstructure(null, msgs);
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD:
				return basicSetRecord(null, msgs);
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
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE:
				return getSubstructure();
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD:
				return getRecord();
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
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE:
				setSubstructure((InterimResultParam)newValue);
				return;
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD:
				setRecord((RecordInterimResult)newValue);
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
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE:
				setSubstructure((InterimResultParam)null);
				return;
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD:
				setRecord((RecordInterimResult)null);
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
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__SUBSTRUCTURE:
				return substructure != null;
			case OutputstructurePackage.INTERIM_RESULTS_STRUCTURE__RECORD:
				return record != null;
		}
		return super.eIsSet(featureID);
	}

} //InterimResultsStructureImpl
