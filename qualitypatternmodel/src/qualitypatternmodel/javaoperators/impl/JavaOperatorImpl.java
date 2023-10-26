/**
 */
package qualitypatternmodel.javaoperators.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.javaoperators.JavaOperator;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;

import qualitypatternmodel.operators.impl.BooleanOperatorImpl;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class JavaOperatorImpl extends BooleanOperatorImpl implements JavaOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.JAVA_OPERATOR;
	}
	
	@Override
	public boolean isTranslatable() {
		return false;
	}

	@Override
	abstract public EList<PatternElement> prepareParameterUpdates();

} //JavaOperatorImpl
