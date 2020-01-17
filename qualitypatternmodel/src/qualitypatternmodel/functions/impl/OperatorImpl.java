/**
 */
package qualitypatternmodel.functions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;

import qualitypatternmodel.graphstructure.impl.GraphElementImpl;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OperatorImpl extends GraphElementImpl implements Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() throws InvalidityException {
		BasicEList<Operator> operators = new BasicEList<Operator>();
		operators.add(this);
		return operators;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Input> getAllVariables() throws InvalidityException {
		return new BasicEList<Input>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FunctionsPackage.OPERATOR___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //OperatorImpl
