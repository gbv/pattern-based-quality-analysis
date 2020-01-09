/**
 */
package qualitypatternmodel.graphstructure;

import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.inputfields.Text;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getPropertyOptions <em>Property Options</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Element#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(Element)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_Element()
	 * @see qualitypatternmodel.graphstructure.Element#getProperties
	 * @model opposite="properties" required="true" transient="false"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' reference.
	 * @see #setAttributeName(Text)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_AttributeName()
	 * @model required="true"
	 * @generated
	 */
	Text getAttributeName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getAttributeName <em>Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' reference.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(Text value);

	/**
	 * Returns the value of the '<em><b>Property Options</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Options</em>' reference.
	 * @see #setPropertyOptions(Option)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getProperty_PropertyOptions()
	 * @model required="true"
	 * @generated
	 */
	Option<PropertyLocation> getPropertyOptions();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.Property#getPropertyOptions <em>Property Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Options</em>' reference.
	 * @see #getPropertyOptions()
	 * @generated
	 */
	void setPropertyOptions(Option<PropertyLocation> value);

} // Property
