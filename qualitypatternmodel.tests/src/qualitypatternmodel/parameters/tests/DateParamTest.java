/**
 */
package qualitypatternmodel.parameters.tests;

import junit.textui.TestRunner;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.ParametersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateParamTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateParamTest.class);
	}

	/**
	 * Constructs a new Date Param test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateParamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date Param test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DateParam getFixture() {
		return (DateParam)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ParametersFactory.eINSTANCE.createDateParam());
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

} //DateTest