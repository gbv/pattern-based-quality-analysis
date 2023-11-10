/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.ContainerResult;
import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl#getCorrespondsTo <em>Corresponds To</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl#getSubresult <em>Subresult</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerResultImpl extends InterimResultImpl implements ContainerResult {
	/**
	 * The cached value of the '{@link #getCorrespondsTo() <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondsTo()
	 * @generated
	 * @ordered
	 */
	protected ContainerInterim correspondsTo;

	/**
	 * The cached value of the '{@link #getSubresult() <em>Subresult</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubresult()
	 * @generated
	 * @ordered
	 */
	protected EList<InterimResult> subresult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerResultImpl() {
		super();
	}
	
	@SuppressWarnings("unchecked")
	public ContainerResultImpl(List<Object> input) throws InvalidityException {
		super();
		for (Object inputobject: input) {
			if (inputobject instanceof List)
				getSubresult().add(new ContainerResultImpl((List<Object>) inputobject));
			else if (inputobject instanceof String)
				getSubresult().add(new ValueResultImpl((String) inputobject));
			else 
				throw new InvalidityException(inputobject.toString() + " cannot be transformed to an InterimResultObject.");
		}
	}

	@Override
	public void setCorresponding(InterimResultPart corresponding) throws InvalidityException {
		if (corresponding instanceof ContainerInterim) {
			int size = ((ContainerInterim) corresponding).getSize();
			if (size == -1) {
				VariableContainerInterim container = (VariableContainerInterim) corresponding;
				setCorrespondsTo(container);
				for(InterimResult a: getSubresult())
					a.setCorresponding(((VariableContainerInterim)container).getContained());
			}	
			else if (size == getSubresult().size()) {
				FixedContainerInterim container = (FixedContainerInterim) corresponding;
				setCorrespondsTo(container);
				for(int i= 0; i<size;i++) {
					getSubresult().get(i).setCorresponding(container.getContained().get(i));
				}
			}
			return;
		}
		throw new InvalidityException(corresponding.getClass().toString() + " is not of type ContainerInterim!");
	}
	
	@Override
	public Boolean isValidToCorresponding() {
		if (getCorrespondsTo() == null)
			return false;
		Integer size = getCorrespondsTo().getSize();
		return (size == -1 || size == getSubresult().size()); 
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.CONTAINER_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerInterim getCorrespondsTo() {
		if (correspondsTo != null && correspondsTo.eIsProxy()) {
			InternalEObject oldCorrespondsTo = (InternalEObject)correspondsTo;
			correspondsTo = (ContainerInterim)eResolveProxy(oldCorrespondsTo);
			if (correspondsTo != oldCorrespondsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryoutputPackage.CONTAINER_RESULT__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
			}
		}
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInterim basicGetCorrespondsTo() {
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondsTo(ContainerInterim newCorrespondsTo) {
		ContainerInterim oldCorrespondsTo = correspondsTo;
		correspondsTo = newCorrespondsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.CONTAINER_RESULT__CORRESPONDS_TO, oldCorrespondsTo, correspondsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResult> getSubresult() {
		if (subresult == null) {
			subresult = new EObjectContainmentEList<InterimResult>(InterimResult.class, this, JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT);
		}
		return subresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				return ((InternalEList<?>)getSubresult()).basicRemove(otherEnd, msgs);
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
			case JavaqueryoutputPackage.CONTAINER_RESULT__CORRESPONDS_TO:
				if (resolve) return getCorrespondsTo();
				return basicGetCorrespondsTo();
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				return getSubresult();
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
			case JavaqueryoutputPackage.CONTAINER_RESULT__CORRESPONDS_TO:
				setCorrespondsTo((ContainerInterim)newValue);
				return;
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				getSubresult().clear();
				getSubresult().addAll((Collection<? extends InterimResult>)newValue);
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
			case JavaqueryoutputPackage.CONTAINER_RESULT__CORRESPONDS_TO:
				setCorrespondsTo((ContainerInterim)null);
				return;
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				getSubresult().clear();
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
			case JavaqueryoutputPackage.CONTAINER_RESULT__CORRESPONDS_TO:
				return correspondsTo != null;
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				return subresult != null && !subresult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return "Container[" + getSubresult().toString() + "]";
	}

} //ContainerResultImpl
