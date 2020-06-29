/**
 */
package qualitypatternmodel.execution.impl;

import java.util.Map;
import org.basex.core.BaseXException;
import org.basex.core.Context;

import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.execution.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionFactoryImpl extends EFactoryImpl implements ExecutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExecutionFactory init() {
		try {
			ExecutionFactory theExecutionFactory = (ExecutionFactory)EPackage.Registry.INSTANCE.getEFactory(ExecutionPackage.eNS_URI);
			if (theExecutionFactory != null) {
				return theExecutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExecutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExecutionPackage.XML_RESULT: return createXmlResult();
			case ExecutionPackage.XML_DATABASE: return createXmlDatabase();
			case ExecutionPackage.LOCAL_XML_DATABASE: return createLocalXmlDatabase();
			case ExecutionPackage.SERVER_XML_DATABASE: return createServerXmlDatabase();
			case ExecutionPackage.DATABASES: return createDatabases();
			case ExecutionPackage.STRING_TO_INT_MAP: return (EObject)createStringToIntMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutionPackage.BASE_XEXCEPTION_WRAPPER:
				return createBaseXExceptionWrapperFromString(eDataType, initialValue);
			case ExecutionPackage.BASE_XCONTEXT_WRAPPER:
				return createBaseXContextWrapperFromString(eDataType, initialValue);
			case ExecutionPackage.QUERY_EXCEPTION_WRAPPER:
				return createQueryExceptionWrapperFromString(eDataType, initialValue);
			case ExecutionPackage.QUERY_IO_EXCEPTION_WRAPPER:
				return createQueryIOExceptionWrapperFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutionPackage.BASE_XEXCEPTION_WRAPPER:
				return convertBaseXExceptionWrapperToString(eDataType, instanceValue);
			case ExecutionPackage.BASE_XCONTEXT_WRAPPER:
				return convertBaseXContextWrapperToString(eDataType, instanceValue);
			case ExecutionPackage.QUERY_EXCEPTION_WRAPPER:
				return convertQueryExceptionWrapperToString(eDataType, instanceValue);
			case ExecutionPackage.QUERY_IO_EXCEPTION_WRAPPER:
				return convertQueryIOExceptionWrapperToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlResult createXmlResult() {
		XmlResultImpl xmlResult = new XmlResultImpl();
		return xmlResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlDatabase createXmlDatabase() {
		XmlDatabaseImpl xmlDatabase = new XmlDatabaseImpl();
		return xmlDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalXmlDatabase createLocalXmlDatabase() {
		LocalXmlDatabaseImpl localXmlDatabase = new LocalXmlDatabaseImpl();
		return localXmlDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerXmlDatabase createServerXmlDatabase() {
		ServerXmlDatabaseImpl serverXmlDatabase = new ServerXmlDatabaseImpl();
		return serverXmlDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Databases createDatabases() {
		DatabasesImpl databases = DatabasesImpl.getInstance();
		return databases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Integer> createStringToIntMap() {
		StringToIntMapImpl stringToIntMap = new StringToIntMapImpl();
		return stringToIntMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseXException createBaseXExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (BaseXException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseXExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createBaseXContextWrapperFromString(EDataType eDataType, String initialValue) {
		return (Context)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseXContextWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryException createQueryExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (QueryException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryIOException createQueryIOExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (QueryIOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryIOExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionPackage getExecutionPackage() {
		return (ExecutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExecutionPackage getPackage() {
		return ExecutionPackage.eINSTANCE;
	}

} //ExecutionFactoryImpl
