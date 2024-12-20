/**
 */
package qualitypatternmodel.javaquery;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;
import qualitypatternmodel.patternstructure.Language;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getFilter <em>Filter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getStructure <em>Structure</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getInterimResults <em>Interim Results</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getQuery <em>Query</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getLanguage <em>Language</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getPatternName <em>Pattern Name</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.JavaFilter#getPatternId <em>Pattern Id</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter()
 * @model
 * @generated
 */
public interface JavaFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(BooleanFilterPart)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_Filter()
	 * @model containment="true"
	 * @generated
	 */
	BooleanFilterPart getFilter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(BooleanFilterPart value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(InterimResultStructure)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterimResultStructure getStructure();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(InterimResultStructure value);

	/**
	 * Returns the value of the '<em><b>Interim Results</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaqueryoutput.InterimResultContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interim Results</em>' reference list.
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_InterimResults()
	 * @model
	 * @generated
	 */
	EList<InterimResultContainer> getInterimResults();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Language
	 * @see #setLanguage(Language)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Pattern Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Name</em>' attribute.
	 * @see #setPatternName(String)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_PatternName()
	 * @model
	 * @generated
	 */
	String getPatternName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getPatternName <em>Pattern Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Name</em>' attribute.
	 * @see #getPatternName()
	 * @generated
	 */
	void setPatternName(String value);

	/**
	 * Returns the value of the '<em><b>Pattern Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Id</em>' attribute.
	 * @see #setPatternId(String)
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilter_PatternId()
	 * @model
	 * @generated
	 */
	String getPatternId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaquery.JavaFilter#getPatternId <em>Pattern Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Id</em>' attribute.
	 * @see #getPatternId()
	 * @generated
	 */
	void setPatternId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<String> filterQueryResults() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" objectListDataType="qualitypatternmodel.javaquery.ObjectListWrapper"
	 * @generated
	 */
	void createInterimResultContainer(List<Object> objectList) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.javaquery.StringListWrapper" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated NOT
	 */
	List<String> executeXQueryJava(String datapath) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.javaquery.StringListWrapper" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated NOT
	 */
	List<String> execute(String datapath) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.textrepresentation.JSONObjectWrapper"
	 * @generated
	 */
	JSONObject toJson();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" objectListDataType="qualitypatternmodel.javaquery.StringListWrapper"
	 * @generated NOT
	 */
	void createInterimResultContainerXQuery(List<String> list) throws InvalidityException;

} // JavaFilter
