/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JPath Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl#getNeoEdge <em>Neo Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathParamImpl#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPathParamImpl extends NeoAbstractPathParamImpl implements NeoPathParam {
	private static final String WRONG_TYPE_OF_EDGE = "Wrong type of Edge";
	private static final String NEO_PARTS_CAN_NOT_BE_EMPTY = "NeoParts can not be empty";
	private static final String NEO_PATH_PARAM = "NeoPathParam [%s]";

	/**
	 * The cached value of the '{@link #getNeoEdge() <em>Neo Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoEdge neoEdge;

	/**
	 * The cached value of the '{@link #getNeoPathPart() <em>Neo Path Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPathPart()
	 * @generated
	 * @ordered
	 */
	protected NeoPathPart neoPathPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected NeoPathParamImpl() {
		super();
		createParameters();
	}

	// --> Specific behaviour which can not be necessarily generalised
	@Override
	public String generateCypher() throws InvalidityException {
		if (neoPathPart != null) {
			final StringBuilder cypher = new StringBuilder();
			final EList<NeoPathPart> neoPathParts = getNeoPathPart().getNeoPathPartEdgeLeafs();
			
			if (neoPathParts == null || neoPathParts.size() == 0) {
				throw new InvalidityException(NEO_PARTS_CAN_NOT_BE_EMPTY);
			}
			if (neoPathParts.size() > 1) {
					generateMultiEdgeCypher(cypher);
			} else {
				generateSingeEdgeCypher(cypher, neoPathParts);
			} 
			return cypher.toString();
		}
		return CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES;	
	}

	private void generateSingeEdgeCypher(final StringBuilder cypher, final EList<NeoPathPart> neoPathParts)
			throws InvalidityException {
		if (!(neoPathParts.get(0) instanceof NeoSimpleEdgeImpl)) {
			throw new InvalidityException(WRONG_TYPE_OF_EDGE);
		}
		cypher.append(neoPathParts.get(0).generateCypher());
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParts.get(0);
		if (existsTargetNode(neoSimpleEdge)) { 
			cypher.append(CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES); 
		}
	}

	private void generateMultiEdgeCypher(final StringBuilder cypher) throws InvalidityException {
		final NeoPathPart neoPathPart = getNeoPathPart();
		cypher.append(neoPathPart.generateCypher());

		NeoPathPart lastEdge = null;
		lastEdge = neoPathPart.getNeoLastEdge();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) lastEdge;
		if (existsTargetNode(neoSimpleEdge)) {
			cypher.append(CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		NeoSimpleEdgeImpl nse = new NeoSimpleEdgeImpl();
		setNeoPathPart(nse);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public NotificationChain basicSetNeoEdge(NeoEdge newNeoEdge, NotificationChain msgs) {
		triggerParameterUpdates(newNeoEdge);
		NeoEdge oldNeoEdge = neoEdge;
		neoEdge = newNeoEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE, oldNeoEdge, newNeoEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	@Override
	public boolean inputIsValid() {
		try {
			getNeoPathPart().isValid(AbstractionLevel.CONCRETE);
			return true; 
		} catch (Exception e) {
			return false;
		}
	}

	@Override 
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String myToString() {
		String result = String.format(NEO_PATH_PARAM, getInternalId());
		try {
			result += " " + generateCypher();
		} catch (InvalidityException e) {}
		return result;
	}

	//
	@Override
	protected int getRelationNumber() {
		if (getNeoEdge() == null) {
			return -1;
		}
		return getNeoEdge().getOriginalID();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_PATH_PARAM;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoEdge getNeoEdge() {
		if (neoEdge != null && neoEdge.eIsProxy()) {
			InternalEObject oldNeoEdge = (InternalEObject)neoEdge;
			neoEdge = (NeoEdge)eResolveProxy(oldNeoEdge);
			if (neoEdge != oldNeoEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE, oldNeoEdge, neoEdge));
			}
		}
		return neoEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoEdge basicGetNeoEdge() {
		return neoEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoEdge(NeoEdge newNeoEdge) {
		if (newNeoEdge != neoEdge) {
			NotificationChain msgs = null;
			if (neoEdge != null)
				msgs = ((InternalEObject)neoEdge).eInverseRemove(this, Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			if (newNeoEdge != null)
				msgs = ((InternalEObject)newNeoEdge).eInverseAdd(this, Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			msgs = basicSetNeoEdge(newNeoEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE, newNeoEdge, newNeoEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPathPart getNeoPathPart() {
		return neoPathPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPathPart(NeoPathPart newNeoPathPart, NotificationChain msgs) {
		NeoPathPart oldNeoPathPart = neoPathPart;
		neoPathPart = newNeoPathPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART, oldNeoPathPart, newNeoPathPart);
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
	public void setNeoPathPart(NeoPathPart newNeoPathPart) {
		if (newNeoPathPart != neoPathPart) {
			NotificationChain msgs = null;
			if (neoPathPart != null)
				msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM, NeoPathPart.class, msgs);
			if (newNeoPathPart != null)
				msgs = ((InternalEObject)newNeoPathPart).eInverseAdd(this, Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM, NeoPathPart.class, msgs);
			msgs = basicSetNeoPathPart(newNeoPathPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART, newNeoPathPart, newNeoPathPart));
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
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE:
				if (neoEdge != null)
					msgs = ((InternalEObject)neoEdge).eInverseRemove(this, Adaptionneo4jPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
				return basicSetNeoEdge((NeoEdge)otherEnd, msgs);
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				if (neoPathPart != null)
					msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART, null, msgs);
				return basicSetNeoPathPart((NeoPathPart)otherEnd, msgs);
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
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE:
				return basicSetNeoEdge(null, msgs);
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				return basicSetNeoPathPart(null, msgs);
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
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE:
				if (resolve) return getNeoEdge();
				return basicGetNeoEdge();
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				return getNeoPathPart();
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
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE:
				setNeoEdge((NeoEdge)newValue);
				return;
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				setNeoPathPart((NeoPathPart)newValue);
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
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE:
				setNeoEdge((NeoEdge)null);
				return;
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				setNeoPathPart((NeoPathPart)null);
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
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_EDGE:
				return neoEdge != null;
			case Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				return neoPathPart != null;
		}
		return super.eIsSet(featureID);
	}
} //Neo4JPathParamImpl