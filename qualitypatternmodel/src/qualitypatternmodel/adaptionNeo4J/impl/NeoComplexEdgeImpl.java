/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoInEdgeTargedNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl#getNeoPath <em>Neo Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoComplexEdgeImpl extends NeoPathPartImpl implements NeoComplexEdge {
	/**
	 * The cached value of the '{@link #getNeoPath() <em>Neo Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPath()
	 * @generated
	 * @ordered
	 */
	protected EList<NeoPathPart> neoPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoComplexEdgeImpl() {
		super();
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		if (getNeoPath().size() < 2) 
			return null;
		
		StringBuilder cypher = new StringBuilder();
		NeoPathPart previewesPart = null;
		NeoInEdgeTargedNode node = null;
		int edgeCounter = 1;
		int edges = getSimpleEdges().size();
		
		for(NeoPathPart part : getSimpleEdges()) {
			if(previewesPart != null && edgeCounter <= edges) {
				node = null; 
				for(NeoInEdgeTargedNode inEdgeTargedNode : getNeoInEdgeTargedNode()) 
					if(inEdgeTargedNode.getNeoSimpleEdgeSource() == previewesPart) node = inEdgeTargedNode;
				if (node != null) cypher.append(node.generateCypher());
				else cypher.append("()");
				
			}
			cypher.append(part.generateCypher());
			previewesPart = part;
			edgeCounter++;
		}
		previewesPart = null;

		return cypher.toString();
	}
	
	@Override
	public String getCypherVariable() {
		StringBuilder variables = new StringBuilder();
		EList<NeoPathPart> neoPath = this.getNeoPath();
		EList<NeoInEdgeTargedNode> neoTargedEdge = this.getNeoInEdgeTargedNode();
		for(NeoPathPart path : neoPath) variables.append(path.getCypherVariable());
		for(NeoInEdgeTargedNode innerNode: neoTargedEdge) variables.append(innerNode.getCypherVariable());
		return variables.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_COMPLEX_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoPathPart> getNeoPath() {
		if (neoPath == null) {
			neoPath = new EObjectContainmentEList<NeoPathPart>(NeoPathPart.class, this, AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH);
		}
		return neoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				return ((InternalEList<?>)getNeoPath()).basicRemove(otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				return getNeoPath();
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				getNeoPath().clear();
				getNeoPath().addAll((Collection<? extends NeoPathPart>)newValue);
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				getNeoPath().clear();
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				return neoPath != null && !neoPath.isEmpty();
		}
		return super.eIsSet(featureID);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NeoAbstractEdge.class) {
			switch (baseOperationID) {
				case AdaptionNeo4JPackage.NEO_ABSTRACT_EDGE___SET_TARGET_NODE_LABEL__TEXTLITERALPARAM: return AdaptionNeo4JPackage.NEO_COMPLEX_EDGE___SET_TARGET_NODE_LABEL__TEXTLITERALPARAM;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE___VALIDATE_COMPLEX_EDGE:
				return validateComplexEdge();
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE___SET_TARGET_NODE_LABEL__TEXTLITERALPARAM:
				setTargetNodeLabel((TextLiteralParam)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<NeoSimpleEdge> getSimpleEdges() {
		EList<NeoSimpleEdge> list = new BasicEList<NeoSimpleEdge>();
		for(NeoPathPart neoPath : getNeoPath()) {
			list.addAll(neoPath.getSimpleEdges());
		}
		return list;
	}
	
	@Override
	public EList<NeoInEdgeTargedNode> getNeoInEdgeTargedNode() {
		EList<NeoInEdgeTargedNode> list = new BasicEList<NeoInEdgeTargedNode>();
		for(NeoInEdgeTargedNode node : getNeoTargedEdge()) {
			list.add(node);
		}
		return list;
	}
	
	@Override
	public String myToString() {
		String result = "NeoComplexEdge [" + getId() + "] (";
		int i = 0;
		for (NeoPathPart part : getNeoPath()) {
			if (i > 0)
				result += ",";
			result += part.myToString();
		}
		return result;
	}

	@Override
	public boolean validateComplexEdge() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNodeLabel(TextLiteralParam targetNodeLabel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //SequenceEdgeImpl
