/**
 */
package qualitypatternmodel.parameters.tests;

import junit.textui.TestRunner;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TimeParam;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeParamTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeParamTest.class);
	}

	/**
	 * Constructs a new Time Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeParam getFixture() {
		return (TimeParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParametersFactory.eINSTANCE.createTimeParam());
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

} //TimeTest