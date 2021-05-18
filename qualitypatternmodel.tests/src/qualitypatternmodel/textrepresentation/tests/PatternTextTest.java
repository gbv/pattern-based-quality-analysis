/**
 */
package qualitypatternmodel.textrepresentation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pattern Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternTextTest extends TestCase {

	/**
	 * The fixture for this Pattern Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternText fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatternTextTest.class);
	}

	/**
	 * Constructs a new Pattern Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternTextTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pattern Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PatternText fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pattern Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternText getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextrepresentationFactory.eINSTANCE.createPatternText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PatternTextTest
