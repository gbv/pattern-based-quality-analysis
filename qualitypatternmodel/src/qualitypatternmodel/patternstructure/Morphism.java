/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMappings <em>Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Morphism#getMorphDepth <em>Morph Depth</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism()
 * @model
 * @generated
 */
public interface Morphism extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.Mapping}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Mapping#getMorphism <em>Morphism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_Mappings()
	 * @see qualitypatternmodel.patternstructure.Mapping#getMorphism
	 * @model opposite="morphism" containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_From()
	 * @model required="true"
	 * @generated
	 */
	Graph getFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Graph value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_To()
	 * @model required="true"
	 * @generated
	 */
	Graph getTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Graph value);

	/**
	 * Returns the value of the '<em><b>Morph Depth</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Morph Depth</em>' attribute.
	 * @see #setMorphDepth(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphism_MorphDepth()
	 * @model default="-1"
	 * @generated
	 */
	int getMorphDepth();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Morphism#getMorphDepth <em>Morph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Morph Depth</em>' attribute.
	 * @see #getMorphDepth()
	 * @generated
	 */
	void setMorphDepth(int value);

} // Morphism
