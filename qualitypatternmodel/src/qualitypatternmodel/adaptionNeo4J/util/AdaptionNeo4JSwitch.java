/**
 */
package qualitypatternmodel.adaptionNeo4J.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.adaptionNeo4J.*;

import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;

import qualitypatternmodel.parameters.Parameter;

import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage
 * @generated
 */
public class AdaptionNeo4JSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptionNeo4JPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionNeo4JSwitch() {
		if (modelPackage == null) {
			modelPackage = AdaptionNeo4JPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AdaptionNeo4JPackage.NEO_ABSTRACT_NODE: {
				NeoAbstractNode neoAbstractNode = (NeoAbstractNode)theEObject;
				T result = caseNeoAbstractNode(neoAbstractNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_NODE: {
				NeoNode neoNode = (NeoNode)theEObject;
				T result = caseNeoNode(neoNode);
				if (result == null) result = caseComplexNode(neoNode);
				if (result == null) result = caseNeoAbstractNode(neoNode);
				if (result == null) result = caseNode(neoNode);
				if (result == null) result = caseComparable(neoNode);
				if (result == null) result = caseAdaptable(neoNode);
				if (result == null) result = casePatternElement(neoNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_EDGE: {
				NeoEdge neoEdge = (NeoEdge)theEObject;
				T result = caseNeoEdge(neoEdge);
				if (result == null) result = caseNeoAbstractEdge(neoEdge);
				if (result == null) result = caseRelation(neoEdge);
				if (result == null) result = caseAdaptable(neoEdge);
				if (result == null) result = casePatternElement(neoEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE: {
				NeoComplexEdge neoComplexEdge = (NeoComplexEdge)theEObject;
				T result = caseNeoComplexEdge(neoComplexEdge);
				if (result == null) result = caseNeoPathPart(neoComplexEdge);
				if (result == null) result = casePatternElement(neoComplexEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE: {
				NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge)theEObject;
				T result = caseNeoSimpleEdge(neoSimpleEdge);
				if (result == null) result = caseNeoPathPart(neoSimpleEdge);
				if (result == null) result = casePatternElement(neoSimpleEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_PATH_PART: {
				NeoPathPart neoPathPart = (NeoPathPart)theEObject;
				T result = caseNeoPathPart(neoPathPart);
				if (result == null) result = casePatternElement(neoPathPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE: {
				NeoPropertyNode neoPropertyNode = (NeoPropertyNode)theEObject;
				T result = caseNeoPropertyNode(neoPropertyNode);
				if (result == null) result = casePrimitiveNode(neoPropertyNode);
				if (result == null) result = caseNeoAbstractNode(neoPropertyNode);
				if (result == null) result = caseNode(neoPropertyNode);
				if (result == null) result = caseComparable(neoPropertyNode);
				if (result == null) result = caseAdaptable(neoPropertyNode);
				if (result == null) result = casePatternElement(neoPropertyNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_PATH_PARAM: {
				NeoPathParam neoPathParam = (NeoPathParam)theEObject;
				T result = caseNeoPathParam(neoPathParam);
				if (result == null) result = caseNeoAbstractPathParam(neoPathParam);
				if (result == null) result = caseParameter(neoPathParam);
				if (result == null) result = caseAdaptable(neoPathParam);
				if (result == null) result = casePatternElement(neoPathParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM: {
				NeoPropertyPathParam neoPropertyPathParam = (NeoPropertyPathParam)theEObject;
				T result = caseNeoPropertyPathParam(neoPropertyPathParam);
				if (result == null) result = caseNeoAbstractPathParam(neoPropertyPathParam);
				if (result == null) result = caseParameter(neoPropertyPathParam);
				if (result == null) result = caseAdaptable(neoPropertyPathParam);
				if (result == null) result = casePatternElement(neoPropertyPathParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE: {
				NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge)theEObject;
				T result = caseNeoPropertyEdge(neoPropertyEdge);
				if (result == null) result = caseNeoAbstractEdge(neoPropertyEdge);
				if (result == null) result = caseRelation(neoPropertyEdge);
				if (result == null) result = caseAdaptable(neoPropertyEdge);
				if (result == null) result = casePatternElement(neoPropertyEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_ABSTRACT_EDGE: {
				NeoAbstractEdge neoAbstractEdge = (NeoAbstractEdge)theEObject;
				T result = caseNeoAbstractEdge(neoAbstractEdge);
				if (result == null) result = caseRelation(neoAbstractEdge);
				if (result == null) result = caseAdaptable(neoAbstractEdge);
				if (result == null) result = casePatternElement(neoAbstractEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM: {
				NeoAbstractPathParam neoAbstractPathParam = (NeoAbstractPathParam)theEObject;
				T result = caseNeoAbstractPathParam(neoAbstractPathParam);
				if (result == null) result = caseParameter(neoAbstractPathParam);
				if (result == null) result = caseAdaptable(neoAbstractPathParam);
				if (result == null) result = casePatternElement(neoAbstractPathParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Abstract Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Abstract Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoAbstractNode(NeoAbstractNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoNode(NeoNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoEdge(NeoEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Complex Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Complex Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoComplexEdge(NeoComplexEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Simple Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Simple Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoSimpleEdge(NeoSimpleEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Path Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Path Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoPathPart(NeoPathPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Property Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Property Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoPropertyNode(NeoPropertyNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Path Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoPathParam(NeoPathParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Property Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Property Path Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoPropertyPathParam(NeoPropertyPathParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Property Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Property Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoPropertyEdge(NeoPropertyEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Abstract Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Abstract Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoAbstractEdge(NeoAbstractEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neo Abstract Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neo Abstract Path Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeoAbstractPathParam(NeoAbstractPathParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(qualitypatternmodel.graphstructure.Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexNode(ComplexNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveNode(PrimitiveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AdaptionNeo4JSwitch
