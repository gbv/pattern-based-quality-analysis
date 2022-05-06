/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlElementNavigationImpl extends XmlNavigationImpl implements XmlElementNavigation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlElementNavigationImpl() {
		super();
	}
	
	@Override
	public XmlPropertyNavigation adaptAsXMLPropertyNavigation() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXMLPropertyNavigation();
		} else {
			throw new InvalidityException("XmlElementNavigation with a non-modifiable target cannot be adapted as an XmlPropertyNavigation.");
		}
	}
	
	@Override
	public XmlElementNavigation adaptAsXMLElementNavigation() {
		return this;
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getOriginalID() > -1) {
				name = "XmlElementNavigation " + getOriginalID();
				return name;
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_ELEMENT_NAVIGATION;
	}
} //XMLNavigationImpl
