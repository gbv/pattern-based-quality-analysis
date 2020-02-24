/**
 */
package qualitypatternmodel.inputfields.impl;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TextImpl extends InputValueImpl implements Text {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
	}
//	
//	@Override
//	public String toXQuery(Location location) throws InvalidityException {
//		if(getValue() != null) {
//			return "\"" + getValue() + "\"";
//		} else {
//			throw new InvalidityException("invalid number");
//		}
//	}
//	
//	@Override
//	public String toXQuery(Location location, int depth) throws InvalidityException {
//		if(getValue() != null) {
//			return "\"" + getValue() + "\"";
//		} else {
//			throw new InvalidityException("invalid number");
//		}
//	}
	
//	@Override
//	public boolean inputIsValid() {
//		return getValue() != null && getValue() != "";
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.TEXT;
	}

} //TextImpl
