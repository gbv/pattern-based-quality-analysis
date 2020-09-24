/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;

import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * A database identified through its <code>name</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.Database#getResults <em>Results</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Database#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Database#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase()
 * @model abstract="true"
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.execution.Result}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.Result#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase_Results()
	 * @see qualitypatternmodel.execution.Result#getDatabase
	 * @model opposite="database" containment="true"
	 * @generated
	 */
	EList<Result> getResults();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.patternstructure.CompletePattern}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase_Patterns()
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getDatabase
	 * @model opposite="database"
	 * @generated
	 */
	EList<CompletePattern> getPatterns();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Database#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the <code>Result</code> of the application of <code>pattern</code> to <code>this</code> <code>Database</code>.
	 * 
	 * @param pattern the <code>CompletePattern</code> to be executed
	 * @param name the name of the pattern application
	 * @param person the name of the person launching the pattern execution
	 * @return the <code>Result</code> of the application of <code>pattern</code> to <code>this</code> <code>Database</code>
	 * @throws InvalidityException if the <code>pattern</code> is invalid
	 * @throws OperatorCycleException if the <code>pattern</code> contains <code>Operators</code> that have themselves as direct or indirect arguments
	 * @throws MissingPatternContainerException if a component referenced from with the <code>pattern</code> is not contained in the <code>pattern</code> directly or indirectly
	 * @throws BaseXException
	 * @throws QueryException
	 * @throws QueryIOException
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	Result execute(CompletePattern pattern, String name, String person) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns the number of matches of <code>pattern</code> in <code>this</code> <code>Database</code>.
	 * 
	 * @param pattern the pattern whose number of matches in <code>this</code> <code>Database</code> is returned
	 * @throws InvalidityException if the <code>pattern</code> is invalid
	 * @throws OperatorCycleException if the <code>pattern</code> contains <code>Operators</code> that have themselves as direct or indirect arguments
	 * @throws MissingPatternContainerException if a component referenced from with the <code>pattern</code> is not contained in the <code>pattern</code> directly or indirectly
	 * @throws BaseXException
	 * @throws QueryException
	 * @throws QueryIOException
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	int countMatches(CompletePattern pattern) throws QueryException, InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException, QueryIOException;

} // Database
