/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.patternstructure.Location;
import static qualitypatternmodel.utilityclasses.Constants.*;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text
 * List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextListParamImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextListParamImpl extends TextParamImpl implements TextListParam {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TextListParamImpl() {
		super();
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return getListVar();
	}
	

	@Override
	public boolean inputIsValid() {
		if (getValues() == null || getValues().isEmpty())
			return false;
		for (String val : getValues())
			if (val.equals(""))
				return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TEXT_LIST_PARAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, ParametersPackage.TEXT_LIST_PARAM__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getListDeclaration() {
		String res = LET + getListVar() + " := (";
		for (int i = 0; i<getValues().size(); i++) {
			if (i!=0) res += ", ";
			res += "'" + getValues().get(i) + "'";
		}
		return res + ")" + "\n";
		//let $sequence := ("apple", 'banana', "carrot", 'dog', "egg", 'fig')
	}




	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getListVar() {
		return LISTVARIABLE + getInternalId();
	}




	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
				return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
				getValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.TEXT_LIST_PARAM___GET_LIST_DECLARATION:
				return getListDeclaration();
			case ParametersPackage.TEXT_LIST_PARAM___GET_LIST_VAR:
				return getListVar();
		}
		return super.eInvoke(operationID, arguments);
	}




	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		String res = "list " + getInternalId() + "[";
		for (int i = 0; i < getValues().size(); i++) {
			if (i>0) res += ", ";
			res += "'" + getValues().get(i) + "'";
		}
		return res + "]";
	}
	
	@Override
	public void generateDescription() {
		String res = "Textfeld";
		try {} catch (Exception e) {}
		setDescription(res);
	}

} // TextListImpl