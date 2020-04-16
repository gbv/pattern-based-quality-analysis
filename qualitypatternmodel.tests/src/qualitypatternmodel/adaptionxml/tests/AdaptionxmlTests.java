/**
 */
package qualitypatternmodel.adaptionxml.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>adaptionxml</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionxmlTests extends TestSuite {

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
		TestSuite suite = new AdaptionxmlTests("adaptionxml Tests");
		suite.addTestSuite(XMLElementTest.class);
		suite.addTestSuite(XMLNavigationTest.class);
		suite.addTestSuite(XMLReferenceTest.class);
		suite.addTestSuite(XMLPropertyTest.class);
		suite.addTestSuite(XMLRootTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionxmlTests(String name) {
		super(name);
	}

} //AdaptionxmlTests
