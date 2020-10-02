/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Schema</b></em>'.
 * A BaseX XML database containing an XML schema definition.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getXmlDatabases <em>Xml Databases</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getAttributeNames <em>Attribute Names</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase()
 * @model
 * @generated
 */
public interface XmlSchemaDatabase extends XmlDatabase, Databaseformat {
	/**
	 * Returns the value of the '<em><b>Xml Databases</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.execution.XmlDataDatabase}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema <em>Xml Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Databases</em>' reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_XmlDatabases()
	 * @see qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema
	 * @model opposite="xmlSchema"
	 * @generated
	 */
	EList<XmlDataDatabase> getXmlDatabases();

	/**
	 * Returns the value of the '<em><b>Element Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Names</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_ElementNames()
	 * @model
	 * @generated
	 */
	EList<String> getElementNames();

	/**
	 * Returns the value of the '<em><b>Attribute Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Names</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_AttributeNames()
	 * @model
	 * @generated
	 */
	EList<String> getAttributeNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void checkKeyRefInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkChildInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkParentInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkDescendantInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkAncestorInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkAttributeInSchema(String elementName, String attributeName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkFollowingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkPrecedingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkFollowingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkPrecedingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getChildrenInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getDescendantsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getParentsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getAncestorsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getAttributesInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getFollowingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getPrecedingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getFollowingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getPrecedingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

} // XmlSchema
