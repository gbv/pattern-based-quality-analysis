/**
 */
package qualitypatternmodel.inputfields;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.PropertyLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.PropertyOption#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.PropertyOption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getPropertyOption()
 * @model
 * @generated
 */
public interface PropertyOption extends Input {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getPropertyOption_Options()
	 * @model
	 * @generated
	 */
	EList<PropertyLocation> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.PropertyLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #setValue(PropertyLocation)
	 * @see qualitypatternmodel.inputfields.InputfieldsPackage#getPropertyOption_Value()
	 * @model
	 * @generated
	 */
	PropertyLocation getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.inputfields.PropertyOption#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.PropertyLocation
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PropertyLocation value);

} // PropertyOption
