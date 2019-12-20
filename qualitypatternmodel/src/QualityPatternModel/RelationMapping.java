/**
 */
package QualityPatternModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.RelationMapping#getTo <em>To</em>}</li>
 *   <li>{@link QualityPatternModel.RelationMapping#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getRelationMapping()
 * @model
 * @generated
 */
public interface RelationMapping extends Mapping {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.Relation#getMappingTo <em>Mapping To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Relation)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelationMapping_To()
	 * @see QualityPatternModel.Relation#getMappingTo
	 * @model opposite="mappingTo"
	 * @generated
	 */
	Relation getTo();

	/**
	 * Sets the value of the '{@link QualityPatternModel.RelationMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Relation value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QualityPatternModel.Relation#getMappingFrom <em>Mapping From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Relation)
	 * @see QualityPatternModel.QualityPatternModelPackage#getRelationMapping_From()
	 * @see QualityPatternModel.Relation#getMappingFrom
	 * @model opposite="mappingFrom"
	 * @generated
	 */
	Relation getFrom();

	/**
	 * Sets the value of the '{@link QualityPatternModel.RelationMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Relation value);

} // RelationMapping
