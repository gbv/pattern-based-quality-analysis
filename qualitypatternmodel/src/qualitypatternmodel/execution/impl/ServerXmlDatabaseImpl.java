/**
 */
package qualitypatternmodel.execution.impl;

import org.basex.core.BaseXException;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.ServerXmlDatabase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Xml Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServerXmlDatabaseImpl extends XmlDatabaseImpl implements ServerXmlDatabase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerXmlDatabaseImpl() {
		super();
	}
	
	@Override
	public void init() throws BaseXException {
		open();
		analyseDatabase();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.SERVER_XML_DATABASE;
	}

} //ServerXmlDatabaseImpl
