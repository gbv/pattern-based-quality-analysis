/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoEdgeImpl#getNeoPathParam <em>Neo Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoEdgeImpl extends NeoAbstractEdgeImpl implements NeoEdge {
	private static final String NEO_EDGE_NEEDS_A_NEO_PATH_PARAM = "NeoEdge needs a NeoPathParam";
	private static final String NEO_PATH_PARAM_NEED_TO_BE_SET = "NeoPathParam need to be set";
	/**
	 * The cached value of the '{@link #getNeoPathParam() <em>Neo Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPathParam()
	 * @generated
	 * @ordered
	 */
	protected NeoPathParam neoPathParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoEdgeImpl() {
		super();
	}
	
	 @Override
	 public PatternElement createNeo4jAdaption() throws InvalidityException {
		 return this;
	 }
	
	 @Override
	 public NeoEdge adaptAsNeoEdge() throws InvalidityException {
		 return this;
	 }
	
	
	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		if (getIncomingMapping() == null) {
			if(!translated && getNeoPathParam() != null) {
				cypher = getNeoPathParam().generateCypher();
				this.translated = true;
			} else if(getNeoPathParam() == null) {
				throw new InvalidityException(NEO_EDGE_NEEDS_A_NEO_PATH_PARAM);
			}
		}
		return cypher;
	}
	
	@Override
	public EMap<Integer, String> getCypherReturnVariable() throws InvalidityException {
		EMap<Integer, String> returnElement;
		if (getNeoPathParam() != null) {
			if (getNeoPathParam().getNeoPathPart() == null) {
				returnElement = null;
			} else {
				returnElement = super.getCypherReturnVariable();
				String cypher = getNeoPathParam().getCypherReturnVariable();
				returnElement.put(NeoAbstractEdgeImpl.CYPHER_RETURN_ID, cypher);
			}
		} else {
			throw new InvalidityException(NEO_PATH_PARAM_NEED_TO_BE_SET);
		}
		return returnElement;
	}
	
	@Override
	public String getReturnInnerEdgeNodes() throws InvalidityException {
		String cypher = null;
		if (getNeoPathParam() != null) {
			cypher = getNeoPathParam().getReturnInnerEdgeNodes();
		}
		return cypher;
	}
	
	@Override 
	public void createParameters() {
		if (getIncomingMapping() == null) {
			ParameterList pList = getParameterList();
			if (pList != null) {
				NeoPathParam neoPathParam = getNeoPathParam();
				if (neoPathParam == null) {
					neoPathParam = new NeoPathParamImpl();
					setNeoPathParam(neoPathParam);
					pList.add(neoPathParam);	
				}
				if (!pList.equals(neoPathParam.getParameterList())) {
					pList.add(neoPathParam);
				}
			}
		}
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPathParam basicGetNeoPathParam() {
		return neoPathParam;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_EDGE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPathParam getNeoPathParam() {
		if (neoPathParam != null && neoPathParam.eIsProxy()) {
			InternalEObject oldNeoPathParam = (InternalEObject)neoPathParam;
			neoPathParam = (NeoPathParam)eResolveProxy(oldNeoPathParam);
			if (neoPathParam != oldNeoPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM, oldNeoPathParam, neoPathParam));
			}
		}
		return neoPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPathParam(NeoPathParam newNeoPathParam) {
		if (newNeoPathParam != neoPathParam) {
			NotificationChain msgs = null;
			if (neoPathParam != null)
				msgs = ((InternalEObject)neoPathParam).eInverseRemove(this, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE, NeoPathParam.class, msgs);
			if (newNeoPathParam != null)
				msgs = ((InternalEObject)newNeoPathParam).eInverseAdd(this, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE, NeoPathParam.class, msgs);
			msgs = basicSetNeoPathParam(newNeoPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM, newNeoPathParam, newNeoPathParam));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPathParam(NeoPathParam newNeoPathParam, NotificationChain msgs) {
		NeoPathParam oldNeoPathParam = neoPathParam;
		neoPathParam = newNeoPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM, oldNeoPathParam, newNeoPathParam);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM:
				if (neoPathParam != null)
					msgs = ((InternalEObject)neoPathParam).eInverseRemove(this, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE, NeoPathParam.class, msgs);
				return basicSetNeoPathParam((NeoPathParam)otherEnd, msgs);
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
			case Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM:
				return basicSetNeoPathParam(null, msgs);
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
			case Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM:
				if (resolve) return getNeoPathParam();
				return basicGetNeoPathParam();
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
			case Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)newValue);
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
			case Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)null);
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
			case Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM:
				return neoPathParam != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String myToString() {
		String result = super.myToString();
		if (getNeoPathParam() != null) 
			result += " " + getNeoPathParam().myToString(); 
		return result;
	}
} //NeoEdgeImpl