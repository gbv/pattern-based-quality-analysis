/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage
 * @generated
 */
public interface AdaptionxmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptionxmlFactory eINSTANCE = qualitypatternmodel.adaptionxml.impl.AdaptionxmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Xml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Element</em>'.
	 * @generated
	 */
	XmlElement createXmlElement();

	/**
	 * Returns a new object of class '<em>Xml Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Navigation</em>'.
	 * @generated
	 */
	XmlNavigation createXmlNavigation();

	/**
	 * Returns a new object of class '<em>Xml Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Reference</em>'.
	 * @generated
	 */
	XmlReference createXmlReference();

	/**
	 * Returns a new object of class '<em>Xml Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Property</em>'.
	 * @generated
	 */
	XmlProperty createXmlProperty();

	/**
	 * Returns a new object of class '<em>Xml Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Root</em>'.
	 * @generated
	 */
	XmlRoot createXmlRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptionxmlPackage getAdaptionxmlPackage();

} //AdaptionxmlFactory
