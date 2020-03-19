/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ParameterValueImpl extends ParameterImpl implements ParameterValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETER_VALUE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return true;
	}


	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

} //XSTypeImpl
