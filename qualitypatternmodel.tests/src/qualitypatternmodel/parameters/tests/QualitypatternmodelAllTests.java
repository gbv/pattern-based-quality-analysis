/**
 */
package qualitypatternmodel.parameters.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;
import qualitypatternmodel.adaptionNeo4J.tests.AdaptionNeo4JTests;
import qualitypatternmodel.adaptionrdf.tests.AdaptionrdfTests;
import qualitypatternmodel.adaptionxml.tests.AdaptionxmlTests;
import qualitypatternmodel.execution.tests.ExecutionTests;
import qualitypatternmodel.graphstructure.tests.GraphstructureTests;
import qualitypatternmodel.operators.tests.OperatorsTests;
import qualitypatternmodel.patternstructure.tests.PatternstructureTests;
import qualitypatternmodel.textrepresentation.tests.TextrepresentationTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Qualitypatternmodel</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitypatternmodelAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new QualitypatternmodelAllTests("Qualitypatternmodel Tests");
		suite.addTest(ParametersTests.suite());
		suite.addTest(OperatorsTests.suite());
		suite.addTest(GraphstructureTests.suite());
		suite.addTest(PatternstructureTests.suite());
		suite.addTest(AdaptionxmlTests.suite());
		suite.addTest(ExecutionTests.suite());
		suite.addTest(TextrepresentationTests.suite());
		suite.addTest(AdaptionrdfTests.suite());
		suite.addTest(AdaptionNeo4JTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitypatternmodelAllTests(String name) {
		super(name);
	}

} //QualitypatternmodelAllTests
