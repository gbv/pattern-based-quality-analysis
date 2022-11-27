/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl.InternalCount;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
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
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getKeyValueParam <em>Key Value Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getNeoDirection <em>Neo Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getNeoEdgeLabel <em>Neo Edge Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getEdgeNumber <em>Edge Number</em>}</li>
 * </ul>
 *
 * @generated
 */

public class NeoSimpleEdgeImpl extends NeoPathPartImpl implements NeoSimpleEdge {
	private static final String EDGE_TARGET_NODE_LABELS = "Edge-Target-Node-Labels";
	private static final String EDGE_LABELS = "Edge-Labels:";
	private static final String NEO_DIRECTION_CAN_NOT_BE_NULL = "NeoDirection can not be null";
	private static final String SOMETHING_WENT_WRONG_IN_THE_SIMPLE_NEO_EDGE_DIRECTION_HAS_NOT_BEEN_SET_CORRECTLY = "Something went wrong in the SimpleNeoEdge - direction has not been set correctly";
	private static final String A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S = "A Label can not contain Whitespace(s)";
	private static final String NEO_SIMPLE_EDGE_S = "NeoSimpleEdge [%s] ";
	
	/**
	 * The cached value of the '{@link #getKeyValueParam() <em>Key Value Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValueParam()
	 * @generated
	 * @ordered
	 */
	protected KeyValueParam keyValueParam;

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
	 * The cached value of the '{@link #getNeoTargetNodeLabels() <em>Neo Target Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoTargetNodeLabels()
	 * @generated
	 * @ordered
	 */
	protected TextListParam neoTargetNodeLabels;

	/**
	 * The cached value of the '{@link #getNeoEdgeLabel() <em>Neo Edge Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam neoEdgeLabel;
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

	protected static final boolean IS_LAST_EDGE_EDEFAULT = true;

	protected boolean isLastEdge = IS_LAST_EDGE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoSimpleEdgeImpl() {
		super();
	}
	
	@Override
	public String generateCypher() throws InvalidityException {
		StringBuilder cypher = new StringBuilder();		
		generateInternalCypher(cypher, true);
		return cypher.toString();
	}
	
	//WITH Labels has been introduced if in future versions multiprinting should become a thing --> Further relation dev --> However can not be called from the outside
	//Extract the Strings to constances into the Utili packages
	private void generateInternalCypher(StringBuilder cypher, Boolean withLabels) throws InvalidityException {
		switch (this.neoDirection) {
		case IMPLICIT:
			cypher.append(CypherSpecificConstants.EDGE_CONNECTOR_LINE);
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append(CypherSpecificConstants.EDGE_CONNECTOR_LINE);
			break;
		case LEFT:
			cypher.append(CypherSpecificConstants.EDGE_CONNECTOR_LEFT);
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append(CypherSpecificConstants.EDGE_CONNECTOR_LINE);
			break;
		case RIGHT:
			cypher.append(CypherSpecificConstants.EDGE_CONNECTOR_LINE);
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append(CypherSpecificConstants.EDGE_CONNECTOR_RIGHT);
			break;
		default:
			throw new InvalidityException(SOMETHING_WENT_WRONG_IN_THE_SIMPLE_NEO_EDGE_DIRECTION_HAS_NOT_BEEN_SET_CORRECTLY);
		}
		
		//Always when a List exists create the NeoPropertyNode
		if (getNeoTargetNodeLabels() != null) {
			cypher.append(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET);
			cypher.append(getCypherInnerEdgeNodes(false));
			if (withLabels) {
				EList<String> labels = getNeoTargetNodeLabels().getValues();
				for (String label : labels) {
					if (!label.isEmpty()) {
						cypher.append(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL_IN_GRAPH_MATCHING_LABELING + label);
					}
				}
			}
			cypher.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
		}
	}
	
	//Considering the SOLID-Principle: If this methods need change then extend from NeoSimpleEdge and Override it, 
	//e.g., in future versions multi-labels in a Edge are Possible or the properties as labels should be considered
	private void generateInternalCypherLabelGenerator(StringBuilder cypher, Boolean withLabels) throws InvalidityException {
		cypher.append(CypherSpecificConstants.EDGE_OPENING_BRACKET);
		cypher.append(CypherSpecificConstants.VARIABLE_EGDE);
		
		NeoAbstractPathParamImpl param = (NeoAbstractPathParamImpl) getNeoParam();
		int relationID = param.getRelationNumber();
		cypher.append(relationID);
		
		if (edgeNumber != 0) {
			cypher.append(CypherSpecificConstants.LOCAL_ID_SEPERATOR + getEdgeNumber());
		}
		
		if (getNeoEdgeLabel() != null && withLabels) {
			cypher.append(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL_IN_GRAPH_MATCHING + getNeoEdgeLabel().getValue());
		}
		
		cypher.append(CypherSpecificConstants.EDGE_CLOSING_BRACKET);
	}
	
	@Override
	public String getCypherVariable() throws InvalidityException {
		String cypher = null;
		cypher = super.getCypherVariable() + ((NeoAbstractPathParamImpl) (NeoAbstractPathParamImpl) getNeoParam()).getRelationNumber();
		if (edgeNumber != 0) {
			cypher += CypherSpecificConstants.LOCAL_ID_SEPERATOR + edgeNumber;
		}
		return cypher;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Lukas Sebastian Hofmann
	 * Returns the InnerEdge used. However, the NeoPropertyNode is a special inner edge. For that reason is the isReturn argument.
	 * If the Method is used in the context of building the the string for the match clause all possible return elements will be returned.
	 * In the case that it is used in the RETURN-CLAUSE the NeoPropertyNode will be build first and not listed with the other intEdgeNodes.
	 * It has a higher significance as the other intEdgeNodes.
	 */
	@Override
	public String getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException {
		final NeoAbstractPathParamImpl neoAbstractPathParam = (NeoAbstractPathParamImpl) getNeoParam();
		String cypher = null;

		if (getNeoTargetNodeLabels() == null) {
			cypher =  null;
		} else if (isLastEdge && !isReturn && neoAbstractPathParam instanceof NeoPropertyPathParam) {
			//The relation number is needed since multiple relations can go into a NeoPropertyNode
			cypher = CypherSpecificConstants.VARIABLE_PROPERTY_NODE + ((NeoPropertyPathParam) neoAbstractPathParam).getNeoPropertyEdge().getTarget().getOriginalID() + CypherSpecificConstants.LOCAL_ID_SEPERATOR+ neoAbstractPathParam.getRelationNumber();
		}  else if (isLastEdge && neoAbstractPathParam instanceof NeoElementPathParam) {
			cypher = createInnerEdgeNumberingNames(neoAbstractPathParam);
		} else if (!isLastEdge){
			cypher = createInnerEdgeNumberingNames(neoAbstractPathParam);
		}
		return cypher;
	}

	protected String createInnerEdgeNumberingNames(final NeoAbstractPathParamImpl neoAbstractPathParam) {
		String cypher = new String();
		if (edgeNumber != 0) {
			cypher = CypherSpecificConstants.INTERNAL_EDGE_NODE + neoAbstractPathParam.getRelationNumber() + CypherSpecificConstants.LOCAL_ID_SEPERATOR + getEdgeNumber();
		} else {
			cypher = CypherSpecificConstants.INTERNAL_EDGE_NODE + neoAbstractPathParam.getRelationNumber();
		}
		return cypher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void addNeoEdgeLabel(String label) throws InvalidityException {
		if (label == null)
			return;		
		if (this.neoEdgeLabel == null) {
			this.neoEdgeLabel = new TextLiteralParamImpl();
		}
		if (this.neoEdgeLabel.getValue() == null || this.neoEdgeLabel.getValue().compareTo(label) != 0) {
			checkForWhitespaceInLabel(label);
			this.neoEdgeLabel.setValue(label);
		}
	}

	@Override
	public NeoPathPart getNeoLastEdge() {
		NeoPathPart lastEdge = null;
		if (isLastEdge) {
			lastEdge = this;
		}
		return lastEdge;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_SIMPLE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueParam getKeyValueParam() {
		if (keyValueParam != null && keyValueParam.eIsProxy()) {
			InternalEObject oldKeyValueParam = (InternalEObject)keyValueParam;
			keyValueParam = (KeyValueParam)eResolveProxy(oldKeyValueParam);
			if (keyValueParam != oldKeyValueParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, oldKeyValueParam, keyValueParam));
			}
		}
		return keyValueParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueParam basicGetKeyValueParam() {
		return keyValueParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setKeyValueParam(KeyValueParam newKeyValueParam) {
		throw new UnsupportedOperationException();
//		KeyValueParam oldKeyValueParam = keyValueParam;
//		keyValueParam = newKeyValueParam;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, oldKeyValueParam, keyValueParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getNeoEdgeLabel() {
		if (neoEdgeLabel != null && neoEdgeLabel.eIsProxy()) {
			InternalEObject oldNeoEdgeLabel = (InternalEObject)neoEdgeLabel;
			neoEdgeLabel = (TextLiteralParam)eResolveProxy(oldNeoEdgeLabel);
			if (neoEdgeLabel != oldNeoEdgeLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, oldNeoEdgeLabel, neoEdgeLabel));
			}
		}
		return neoEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetNeoEdgeLabel() {
		return neoEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void setNeoEdgeLabel(TextLiteralParam newNeoEdgeLabel) throws InvalidityException {
		if (newNeoEdgeLabel != null) {
			if (newNeoEdgeLabel.getValue() != null) {
				checkForWhitespaceInLabel(newNeoEdgeLabel.getValue());
			}
		}
		TextLiteralParam oldNeoEdgeLabel = neoEdgeLabel;
		neoEdgeLabel = newNeoEdgeLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, oldNeoEdgeLabel, neoEdgeLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, edgeNumber, !oldEdgeNumberESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, EDGE_NUMBER_EDEFAULT, oldEdgeNumberESet));
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
	
	protected void setIsLastEdge(boolean newIsLastEdge) {
		isLastEdge = newIsLastEdge;
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
	public TextListParam getNeoTargetNodeLabels() {
		if (neoTargetNodeLabels != null && neoTargetNodeLabels.eIsProxy()) {
			InternalEObject oldNeoTargetNodeLabels = (InternalEObject)neoTargetNodeLabels;
			neoTargetNodeLabels = (TextListParam)eResolveProxy(oldNeoTargetNodeLabels);
			if (neoTargetNodeLabels != oldNeoTargetNodeLabels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, oldNeoTargetNodeLabels, neoTargetNodeLabels));
			}
		}
		return neoTargetNodeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListParam basicGetNeoTargetNodeLabels() {
		return neoTargetNodeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNeoTargetNodeLabels(TextListParam newNeoTargetNodeLabels) throws InvalidityException {
		if (newNeoTargetNodeLabels != null) {
			for (String s : newNeoTargetNodeLabels.getValues()) {
				checkForWhitespaceInLabel(s);
			}
		}
		TextListParam oldNeoTargetNodeLabels = neoTargetNodeLabels;
		neoTargetNodeLabels = newNeoTargetNodeLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, oldNeoTargetNodeLabels, neoTargetNodeLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNeoDirection(NeoDirection neoDirection) throws InvalidityException {
		if (neoDirection == null) {
			throw new InvalidityException(NEO_DIRECTION_CAN_NOT_BE_NULL);
		}
		this.neoDirection = neoDirection;
	}

	@Override
	protected boolean isLastEdge() {
		return isLastEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addNeoTargetNodeLabel(String label) throws InvalidityException {
		if (this.neoTargetNodeLabels == null) {
			this.neoTargetNodeLabels = new TextListParamImpl();
		}
		
		if (!this.neoTargetNodeLabels.getValues().contains(label)) {
			checkForWhitespaceInLabel(label);
			this.neoTargetNodeLabels.addStringValue(label);
		}
	}

	private void checkForWhitespaceInLabel(String label) throws InvalidityException {
		if (label.contains(CypherSpecificConstants.ONE_WHITESPACE)) {
			throw new InvalidityException(A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S);
		}
	}

	@Override 
	public EList<NeoPathPart> getNeoPathPartEdgeLeafs() {
		EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
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
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				if (resolve) return getKeyValueParam();
				return basicGetKeyValueParam();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return getNeoDirection();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				if (resolve) return getNeoTargetNodeLabels();
				return basicGetNeoTargetNodeLabels();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				if (resolve) return getNeoEdgeLabel();
				return basicGetNeoEdgeLabel();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				return getEdgeNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				setKeyValueParam((KeyValueParam)newValue);
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				try {
					setNeoTargetNodeLabels((TextListParam)newValue);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				try {
					setNeoEdgeLabel((TextLiteralParam)newValue);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				setEdgeNumber((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				setKeyValueParam((KeyValueParam)null);
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				try {
					setNeoTargetNodeLabels((TextListParam)null);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				try {
					setNeoEdgeLabel((TextLiteralParam)null);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
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
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				return keyValueParam != null;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return neoDirection != NEO_DIRECTION_EDEFAULT;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				return neoTargetNodeLabels != null;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				return neoEdgeLabel != null;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
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
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION:
				try {
					setNeoDirection((NeoDirection)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE___ADD_NEO_TARGET_NODE_LABEL__STRING:
				try {
					addNeoTargetNodeLabel((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE___ADD_NEO_EDGE_LABEL__STRING:
				try {
					addNeoEdgeLabel((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		final String temp = NEO_SIMPLE_EDGE_S + CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET;
		final StringBuilder cypher = new StringBuilder(String.format(temp, getId()));
		if (!neoEdgeLabel.getValueAsString().isEmpty()) {
			cypher.append(EDGE_LABELS + CypherSpecificConstants.EDGE_OPENING_BRACKET + neoEdgeLabel.getValueAsString() + CypherSpecificConstants.EDGE_CLOSING_BRACKET);
			cypher.append(CypherSpecificConstants.ONE_WHITESPACE);
		}
		boolean isFirst = true;
		for (String label : getNeoTargetNodeLabels().getValues()) {
			if (!isFirst) {
				cypher.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
			} else {
				cypher.append(EDGE_TARGET_NODE_LABELS + CypherSpecificConstants.EDGE_OPENING_BRACKET);
			}
			cypher.append(label);
			isFirst = false;
		}
		if (cypher.toString().contains(EDGE_TARGET_NODE_LABELS)) {
			cypher.append(CypherSpecificConstants.EDGE_CLOSING_BRACKET);
		}
			
		cypher.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
		return cypher.toString();
	}

	@Override 
	public void isValidLocal(AbstractionLevel abstractionLevel) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		// TODO Auto-generated method stub
	}
	
	@Override
	protected void setCount(InternalCount count) {
		setEdgeNumber(count.getCount());		
	}
} //SimpleEdgeImpl
