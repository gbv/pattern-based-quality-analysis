/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.OperatorList;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.graphstructure.VariableList;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getReturnElement <em>Return Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getVariableList <em>Variable List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.GraphImpl#getOperatorlist <em>Operatorlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends PatternElementImpl implements Graph {
	/**
	 * The cached value of the '{@link #getReturnElement() <em>Return Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleElement> returnElement;

	/**
	 * The cached value of the '{@link #getVariableList() <em>Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableList()
	 * @generated
	 * @ordered
	 */
	protected VariableList variableList;

	/**
	 * The cached value of the '{@link #getRootElement() <em>Root Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElement()
	 * @generated
	 * @ordered
	 */
	protected SingleElement rootElement;

	/**
	 * The cached value of the '{@link #getOperatorlist() <em>Operatorlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorlist()
	 * @generated
	 * @ordered
	 */
	protected OperatorList operatorlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}
	
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidTranslationException {
//		if(!(returnElement != null && !returnElement.isEmpty())) {
//			return false;
//		}
//		for(SingleElement returnElements : returnElement) {
//			if(!returnElements.isValid(isDefinedPattern)) {
//				return false;
//			}
//		}
//		return rootElement != null && rootElement.isValid(isDefinedPattern) && variableList != null;
		if(!(returnElement != null && !returnElement.isEmpty())) 
			throw new InvalidTranslationException("returnElement empty");
		
//		for(SingleElement retElem : returnElement) {
//			if(!retElem.isValid(isDefinedPattern)) 
//				throw new InvalidTranslationException("returnElement invalid ("+ retElem + ")");
//		}
		if (rootElement == null) 
			throw new InvalidTranslationException("rootElement null");
		rootElement.isValid(isDefinedPattern);
		if (variableList == null) 
			throw new InvalidTranslationException("variableList null");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleElement> getReturnElement() {
		if (returnElement == null) {
			returnElement = new EObjectResolvingEList<SingleElement>(SingleElement.class, this, GraphstructurePackage.GRAPH__RETURN_ELEMENT);
		}
		return returnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableList getVariableList() {
		return variableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableList(VariableList newVariableList, NotificationChain msgs) {
		VariableList oldVariableList = variableList;
		variableList = newVariableList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__VARIABLE_LIST, oldVariableList, newVariableList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableList(VariableList newVariableList) {
		if (newVariableList != variableList) {
			NotificationChain msgs = null;
			if (variableList != null)
				msgs = ((InternalEObject)variableList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__VARIABLE_LIST, null, msgs);
			if (newVariableList != null)
				msgs = ((InternalEObject)newVariableList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__VARIABLE_LIST, null, msgs);
			msgs = basicSetVariableList(newVariableList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__VARIABLE_LIST, newVariableList, newVariableList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElement getRootElement() {
		return rootElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootElement(SingleElement newRootElement, NotificationChain msgs) {
		SingleElement oldRootElement = rootElement;
		rootElement = newRootElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__ROOT_ELEMENT, oldRootElement, newRootElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootElement(SingleElement newRootElement) {
		if (newRootElement != rootElement) {
			NotificationChain msgs = null;
			if (rootElement != null)
				msgs = ((InternalEObject)rootElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__ROOT_ELEMENT, null, msgs);
			if (newRootElement != null)
				msgs = ((InternalEObject)newRootElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__ROOT_ELEMENT, null, msgs);
			msgs = basicSetRootElement(newRootElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__ROOT_ELEMENT, newRootElement, newRootElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorList getOperatorlist() {
		return operatorlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatorlist(OperatorList newOperatorlist, NotificationChain msgs) {
		OperatorList oldOperatorlist = operatorlist;
		operatorlist = newOperatorlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATORLIST, oldOperatorlist, newOperatorlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorlist(OperatorList newOperatorlist) {
		if (newOperatorlist != operatorlist) {
			NotificationChain msgs = null;
			if (operatorlist != null)
				msgs = ((InternalEObject)operatorlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__OPERATORLIST, null, msgs);
			if (newOperatorlist != null)
				msgs = ((InternalEObject)newOperatorlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.GRAPH__OPERATORLIST, null, msgs);
			msgs = basicSetOperatorlist(newOperatorlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.GRAPH__OPERATORLIST, newOperatorlist, newOperatorlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.GRAPH__VARIABLE_LIST:
				return basicSetVariableList(null, msgs);
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return basicSetRootElement(null, msgs);
			case GraphstructurePackage.GRAPH__OPERATORLIST:
				return basicSetOperatorlist(null, msgs);
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENT:
				return getReturnElement();
			case GraphstructurePackage.GRAPH__VARIABLE_LIST:
				return getVariableList();
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return getRootElement();
			case GraphstructurePackage.GRAPH__OPERATORLIST:
				return getOperatorlist();
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENT:
				getReturnElement().clear();
				getReturnElement().addAll((Collection<? extends SingleElement>)newValue);
				return;
			case GraphstructurePackage.GRAPH__VARIABLE_LIST:
				setVariableList((VariableList)newValue);
				return;
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				setRootElement((SingleElement)newValue);
				return;
			case GraphstructurePackage.GRAPH__OPERATORLIST:
				setOperatorlist((OperatorList)newValue);
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENT:
				getReturnElement().clear();
				return;
			case GraphstructurePackage.GRAPH__VARIABLE_LIST:
				setVariableList((VariableList)null);
				return;
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				setRootElement((SingleElement)null);
				return;
			case GraphstructurePackage.GRAPH__OPERATORLIST:
				setOperatorlist((OperatorList)null);
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
			case GraphstructurePackage.GRAPH__RETURN_ELEMENT:
				return returnElement != null && !returnElement.isEmpty();
			case GraphstructurePackage.GRAPH__VARIABLE_LIST:
				return variableList != null;
			case GraphstructurePackage.GRAPH__ROOT_ELEMENT:
				return rootElement != null;
			case GraphstructurePackage.GRAPH__OPERATORLIST:
				return operatorlist != null;
		}
		return super.eIsSet(featureID);
	}

} //GraphImpl
