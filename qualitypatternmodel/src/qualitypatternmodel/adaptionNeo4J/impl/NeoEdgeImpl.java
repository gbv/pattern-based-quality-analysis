/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl#getNeoPathParam <em>Neo Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoEdgeImpl extends NeoAbstractEdgeImpl implements NeoEdge {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_EDGE;
	}

	//Translates just the Edge
	@Override
	public String generateCypher() throws InvalidityException {
		StringBuilder cypher = new StringBuilder("");
		if(!translated) {
			EList<NeoSimpleEdge> neoSimpleEdges = getNeoPathParam().getNeoPath().getSimpleEdges();
			if (neoSimpleEdges == null || neoSimpleEdges.size() == 0) throw new InvalidityException();
			this.translated = true;
			
			if (neoSimpleEdges.size() > 1) {
				NeoSimpleEdge lastEdge = null;
				//Every ComplexEdge needs a last SimpleEdge
				for (NeoSimpleEdge possibleLast : neoSimpleEdges) {
					if(possibleLast.isLastSimpleEdge()) { 
						lastEdge = possibleLast;
					}
				}
				
				boolean doopleEdge = false;
				for (TextLiteralParam label : neoSimpleEdges.get(0).getNeoTargetNodeLabels()) {
					if (label.getValue() == CypherSpecificConstants.REPLACING_SEQUENCES_DOPPLE_CONNECTION) {
						cypher.append(CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES);
						doopleEdge = true;
						break;
					}
				}
				
				if (doopleEdge) {
					cypher.append(getNeoPathParam().generateCypher() + CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES);
					int start = cypher.indexOf(":" + CypherSpecificConstants.REPLACING_SEQUENCES_DOPPLE_CONNECTION.length());
					cypher.replace(start, CypherSpecificConstants.REPLACING_SEQUENCES_DOPPLE_CONNECTION.length(), "");	//replace(":" + CypherSpecificConstants.REPLACING_SEQUENCES_DOPPLE_CONNECTION, "");
				} else {
					EList<TextLiteralParam> neoLastTargetLabels = null;
					if (lastEdge != null) neoLastTargetLabels = lastEdge.getNeoTargetNodeLabels();
					
					//For handling a not suitable suffix like -() or -(:AnyLabels)
					//Since structures like -()() or -(:AnyLabels)() are a not valid syntax for Cypher
					if (getTarget() != null && getTarget() instanceof NeoNode ) {
						if (neoLastTargetLabels != null && neoLastTargetLabels.size() != 0) {
							NeoNodeImpl nni = (NeoNodeImpl) getTarget();
							EList<TextLiteralParam> nodeLabels = nni.getNeoNodeLabels();
							boolean labelEqual = true;
							boolean labelIncluded;
							if (nodeLabels != null && nodeLabels.size() == neoLastTargetLabels.size()) {
								for (TextLiteralParam edgeTargetLabel : neoLastTargetLabels) {
									labelIncluded = false;
									for (TextLiteralParam nodeLabel : nodeLabels) {
										if (nodeLabel.getValue().compareTo(edgeTargetLabel.getValue()) == 0) {
											labelIncluded = true;
											break;
										}
									}
									if (labelIncluded == false) {
										labelEqual = false;
										break;
									}
								}
							} else {
								labelEqual = false;
							}
							
							String cypherEdge = getNeoPathParam().generateCypher();
							if (lastEdge.generateCypher().subSequence(lastEdge.generateCypher().length() - 2, 
									lastEdge.generateCypher().length() - 1) == "()") {
								cypher.append(CypherSpecificConstants.CONNECTION);
							} else {						
								if(labelEqual) {
									int until = (cypherEdge.indexOf("[" + lastEdge.getCypherVariable() + "]") - 1) + (lastEdge.getCypherVariable().length() - 1); //The three is for the symbos []-
									cypher.append(cypherEdge.substring(0, until));
								} else {
									//For connecting the last node of the NeoEdge with the following Complex node
									cypher.append(cypherEdge + CypherSpecificConstants.CONNECTION);
								}
							}
						}
					} else {
						throw new InvalidityException("No traget was specified");
					}
				}
			} else if (neoSimpleEdges.size() == 1) {
				cypher.append(neoSimpleEdges.get(0).generateCypher());
				boolean doopleEdge = false;
				for (TextLiteralParam label : neoSimpleEdges.get(0).getNeoTargetNodeLabels()) {
					if (label.getValue() == CypherSpecificConstants.REPLACING_SEQUENCES_DOPPLE_CONNECTION) {
						cypher.append(CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES);
						doopleEdge = true;
						break;
					}
				}
				if (neoSimpleEdges.get(0).getNeoTargetNodeLabels().size() != 0 && !doopleEdge) cypher.append(CypherSpecificConstants.CONNECTION); 
			}
		}
		return cypher.toString();		
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, oldNeoPathParam, neoPathParam));
			}
		}
		return neoPathParam;
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
	public NotificationChain basicSetNeoPathParam(NeoPathParam newNeoPathParam, NotificationChain msgs) {
		NeoPathParam oldNeoPathParam = neoPathParam;
		neoPathParam = newNeoPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, oldNeoPathParam, newNeoPathParam);
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
	public void setNeoPathParam(NeoPathParam newNeoPathParam) {
		if (newNeoPathParam != neoPathParam) {
			NotificationChain msgs = null;
			if (neoPathParam != null)
				msgs = ((InternalEObject)neoPathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, NeoPathParam.class, msgs);
			if (newNeoPathParam != null)
				msgs = ((InternalEObject)newNeoPathParam).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, NeoPathParam.class, msgs);
			msgs = basicSetNeoPathParam(newNeoPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, newNeoPathParam, newNeoPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM:
				if (neoPathParam != null)
					msgs = ((InternalEObject)neoPathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, NeoPathParam.class, msgs);
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM:
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM:
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM:
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM:
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM:
				return neoPathParam != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String myToString() {
		String result = super.myToString();
		if (getNeoPathParam() != null) 
			result += " " + getNeoPathParam().myToString() ; 
		return result;
	}
} //NeoEdgeImpl
