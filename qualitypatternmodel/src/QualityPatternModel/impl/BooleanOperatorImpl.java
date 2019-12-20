/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.BooleanOperator;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.ReturnType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BooleanOperatorImpl extends OperatorImpl implements BooleanOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOperatorImpl() {
		super();
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.BOOLEAN_OPERATOR;
	}

} //BooleanOperatorImpl
