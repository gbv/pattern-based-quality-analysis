/**
 */
package qualitypatternmodel.graphstructure;

import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getAxis <em>Axis</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Relation#getRelationTo <em>Relation To</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctMappingOfContainment'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot correctMappingOfContainment='self.mappingTo-&gt;forAll(m | m.to.relationTo.oclIsTypeOf(SingleElement) implies m.to.relationTo.oclAsType(SingleElement).mappingFrom.from = self.relationTo)'"
 * @generated
 */
public interface Relation extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Mapping To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.RelationMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping To</em>' reference.
	 * @see #setMappingTo(RelationMapping)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_MappingTo()
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	RelationMapping getMappingTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getMappingTo <em>Mapping To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping To</em>' reference.
	 * @see #getMappingTo()
	 * @generated
	 */
	void setMappingTo(RelationMapping value);

	/**
	 * Returns the value of the '<em><b>Mapping From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.RelationMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping From</em>' reference.
	 * @see #setMappingFrom(RelationMapping)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_MappingFrom()
	 * @see qualitypatternmodel.patternstructure.RelationMapping#getTo
	 * @model opposite="to"
	 * @generated
	 */
	RelationMapping getMappingFrom();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getMappingFrom <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping From</em>' reference.
	 * @see #getMappingFrom()
	 * @generated
	 */
	void setMappingFrom(RelationMapping value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see #setAxis(Axis)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_Axis()
	 * @model
	 * @generated
	 */
	Axis getAxis();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.Axis
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Axis value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	int getGraphDepth() throws InvalidityException;

	/**
	 * Returns the value of the '<em><b>Relation To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getRelationFromPrevious <em>Relation From Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation To</em>' container reference.
	 * @see #setRelationTo(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getRelation_RelationTo()
	 * @see qualitypatternmodel.graphstructure.Element#getRelationFromPrevious
	 * @model opposite="relationFromPrevious" required="true" transient="false"
	 * @generated
	 */
	Element getRelationTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Relation#getRelationTo <em>Relation To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation To</em>' container reference.
	 * @see #getRelationTo()
	 * @generated
	 */
	void setRelationTo(Element value);

} // Relation
