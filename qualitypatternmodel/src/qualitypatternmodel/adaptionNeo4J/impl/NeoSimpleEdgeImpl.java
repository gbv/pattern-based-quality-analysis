/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoInEdgeTargedNode;
import qualitypatternmodel.adaptionNeo4J.NeoLabel;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getKeyvalueparam <em>Keyvalueparam</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getNeoEdgeLabel <em>Neo Edge Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getNeoDirection <em>Neo Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getEdgeNumber <em>Edge Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoSimpleEdgeImpl extends NeoPathPartImpl implements NeoSimpleEdge {
	/**
	 * The cached value of the '{@link #getKeyvalueparam() <em>Keyvalueparam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyvalueparam()
	 * @generated
	 * @ordered
	 */
	protected KeyValueParam keyvalueparam;
	/**
	 * The cached value of the '{@link #getNeoEdgeLabel() <em>Neo Edge Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected NeoLabel neoEdgeLabel;
	/**
	 * The default value of the '{@link #getNeoDirection() <em>Neo Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoDirection()
	 * @generated
	 * @ordered
	 */
	protected static final NeoDirection NEO_DIRECTION_EDEFAULT = NeoDirection.IMPLICIT;
	/**
	 * The cached value of the '{@link #getNeoDirection() <em>Neo Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoDirection()
	 * @generated
	 * @ordered
	 */
	protected NeoDirection neoDirection = NEO_DIRECTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getEdgeNumber() <em>Edge Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int EDGE_NUMBER_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getEdgeNumber() <em>Edge Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeNumber()
	 * @generated
	 * @ordered
	 */
	protected int edgeNumber = EDGE_NUMBER_EDEFAULT;
	/**
	 * This is true if the Edge Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeNumberESet;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected NeoSimpleEdgeImpl() {
		super();
		this.setEdgeNumber(NeoPathPartImpl.COUNTER);
		increaseClassCounter();
		//NeoPathPartImpl.EDGES.add(this);
	} 
	
	@Override
	public String generateCypher() throws InvalidityException {
		StringBuilder cypher = new StringBuilder();		
		switch (this.neoDirection) {
		case IMPLICIT:
			cypher.append("-");
			this.generateCypher(cypher);
			cypher.append("-");
			break;
		case LEFT:
			cypher.append("<-");
			this.generateCypher(cypher);
			cypher.append("-");
			break;
		case RIGHT:
			cypher.append("-");
			this.generateCypher(cypher);
			cypher.append("->");
			break;
		default:
			throw new InvalidityException("Something went wronge in the SimpleNeoEdge - direction has not been set correctly");
		}
		return cypher.toString();
	}
	
	//Considering the SOLID-Principle: If this methods need change then extend from NeoSimpleEdge and Override it, 
	//e.g., in future versions multi-labels in a Edge are Possible or the properties as labels should be considered
	private void generateCypher(StringBuilder cypher) throws InvalidityException {
		cypher.append("[");
		cypher.append(CypherSpecificConstants.VARIABLE_EGDE);
		cypher.append(getEdgeNumber());
		if (getNeoEdgeLabel() != null) cypher.append(getNeoEdgeLabel().generateCypher());
		cypher.append("]");
	}
	
	@Override
	public EList<NeoInEdgeTargedNode> getNeoInEdgeTargedNode() {
		return null;
	}
	
	@Override
	public String getCypherVariable() {
		return super.getCypherVariable() + edgeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_SIMPLE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueParam getKeyvalueparam() {
		if (keyvalueparam != null && keyvalueparam.eIsProxy()) {
			InternalEObject oldKeyvalueparam = (InternalEObject)keyvalueparam;
			keyvalueparam = (KeyValueParam)eResolveProxy(oldKeyvalueparam);
			if (keyvalueparam != oldKeyvalueparam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM, oldKeyvalueparam, keyvalueparam));
			}
		}
		return keyvalueparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueParam basicGetKeyvalueparam() {
		return keyvalueparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyvalueparam(KeyValueParam newKeyvalueparam) {
		KeyValueParam oldKeyvalueparam = keyvalueparam;
		keyvalueparam = newKeyvalueparam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM, oldKeyvalueparam, keyvalueparam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoLabel getNeoEdgeLabel() {
		if (neoEdgeLabel != null && neoEdgeLabel.eIsProxy()) {
			InternalEObject oldNeoEdgeLabel = (InternalEObject)neoEdgeLabel;
			neoEdgeLabel = (NeoLabel)eResolveProxy(oldNeoEdgeLabel);
			if (neoEdgeLabel != oldNeoEdgeLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, oldNeoEdgeLabel, neoEdgeLabel));
			}
		}
		return neoEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoLabel basicGetNeoEdgeLabel() {
		return neoEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoEdgeLabel(NeoLabel newNeoEdgeLabel) {
		NeoLabel oldNeoEdgeLabel = neoEdgeLabel;
		neoEdgeLabel = newNeoEdgeLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, oldNeoEdgeLabel, neoEdgeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoDirection getNeoDirection() {
		return neoDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEdgeNumber() {
		return edgeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdgeNumber(int newEdgeNumber) {
		int oldEdgeNumber = edgeNumber;
		edgeNumber = newEdgeNumber;
		boolean oldEdgeNumberESet = edgeNumberESet;
		edgeNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, edgeNumber, !oldEdgeNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEdgeNumber() {
		int oldEdgeNumber = edgeNumber;
		boolean oldEdgeNumberESet = edgeNumberESet;
		edgeNumber = EDGE_NUMBER_EDEFAULT;
		edgeNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, EDGE_NUMBER_EDEFAULT, oldEdgeNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEdgeNumber() {
		return edgeNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNeoDirection(NeoDirection neoDirection) {
		if (neoDirection == null)
			return;
		this.neoDirection = neoDirection;
	}

	//Inserted Method
	@Override 
	public EList<NeoSimpleEdge> getSimpleEdges() {
		EList<NeoSimpleEdge> l = new BasicEList<NeoSimpleEdge>();
		l.add(this);
		return  l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				if (resolve) return getKeyvalueparam();
				return basicGetKeyvalueparam();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				if (resolve) return getNeoEdgeLabel();
				return basicGetNeoEdgeLabel();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return getNeoDirection();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				return getEdgeNumber();
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				setKeyvalueparam((KeyValueParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				setNeoEdgeLabel((NeoLabel)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				setEdgeNumber((Integer)newValue);
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				setKeyvalueparam((KeyValueParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				setNeoEdgeLabel((NeoLabel)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				unsetEdgeNumber();
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				return keyvalueparam != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				return neoEdgeLabel != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return neoDirection != NEO_DIRECTION_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				return isSetEdgeNumber();
		}
		return super.eIsSet(featureID);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION:
				setNeoDirection((NeoDirection)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (neoDirection: ");
		result.append(neoDirection);
		result.append(", edgeNumber: ");
		if (edgeNumberESet) result.append(edgeNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	public void isValidLocal(AbstractionLevel abstractionLevel) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		//TODO
	}
	
//	  It can not just be done like this, since the id's of the other edges also have to be changed
//	  Maybe introduce something like an observer? 	
//	@Override
//    protected void finalize() {
//        System.out.print("Set the counter down by 1.");
//        fillTheGapWithLastElement(this);
//        NeoPathPartImpl.COUNTER--;
//    }
} //SimpleEdgeImpl
