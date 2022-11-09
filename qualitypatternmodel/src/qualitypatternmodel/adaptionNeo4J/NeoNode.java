/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.parameters.TextListParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoPlace <em>Neo Place</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoNode()
 * @model
 * @generated
 */
public interface NeoNode extends ComplexNode, NeoInterfaceNode {

	/**
	 * Returns the value of the '<em><b>Neo Node Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Node Labels</em>' reference.
	 * @see #setNeoNodeLabels(TextListParam)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoNode_NeoNodeLabels()
	 * @model
	 * @generated
	 */
	TextListParam getNeoNodeLabels();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoNodeLabels <em>Neo Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Node Labels</em>' reference.
	 * @throws InvalidityException 
	 * @see #getNeoNodeLabels()
	 * @generated NOT
	 */
	void setNeoNodeLabels(TextListParam value) throws InvalidityException;

	/**
	 * Returns the value of the '<em><b>Neo Place</b></em>' attribute.
	 * The default value is <code>"FOLLOWING"</code>.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionNeo4J.NeoPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPlace
	 * @see #setNeoPlace(NeoPlace)
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoNode_NeoPlace()
	 * @model default="FOLLOWING"
	 * @generated
	 */
	NeoPlace getNeoPlace();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionNeo4J.NeoNode#getNeoPlace <em>Neo Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neo Place</em>' attribute.
	 * @see qualitypatternmodel.adaptionNeo4J.NeoPlace
	 * @see #getNeoPlace()
	 * @generated
	 */
	void setNeoPlace(NeoPlace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void addLabel(String label) throws InvalidityException;

} // NeoNode
