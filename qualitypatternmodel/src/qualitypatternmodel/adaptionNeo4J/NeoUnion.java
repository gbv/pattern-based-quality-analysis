/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.NeoUnion#getNeoPath <em>Neo Path</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoUnion()
 * @model
 * @generated
 */
public interface NeoUnion extends NeoPathPart {
	/**
	 * Returns the value of the '<em><b>Neo Path</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionNeo4J.NeoPathPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neo Path</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoUnion_NeoPath()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<NeoPathPart> getNeoPath();

} // NeoUnion
