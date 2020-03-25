/**
 */
package qualitypatternmodel.parameters.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>inputfields</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametersTests extends TestSuite {

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
		TestSuite suite = new ParametersTests("parameters Tests");
		suite.addTestSuite(ComparisonOptionParamTest.class);
		suite.addTestSuite(PropertyOptionParamTest.class);
		suite.addTestSuite(ParameterListTest.class);
		suite.addTestSuite(BooleanParamTest.class);
		suite.addTestSuite(TextListParamTest.class);
		suite.addTestSuite(TextLiteralParamTest.class);
		suite.addTestSuite(NumberParamTest.class);
		suite.addTestSuite(DateParamTest.class);
		suite.addTestSuite(TimeParamTest.class);
		suite.addTestSuite(UnknownParameterValueTest.class);
		suite.addTestSuite(DateTimeParamTest.class);
		suite.addTestSuite(RelationOptionParamTest.class);
		suite.addTestSuite(OptionParamTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersTests(String name) {
		super(name);
	}

} //InputfieldsTests
