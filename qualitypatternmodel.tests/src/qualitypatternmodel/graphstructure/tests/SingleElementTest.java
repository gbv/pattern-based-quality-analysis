/**
 */
package qualitypatternmodel.graphstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.SingleElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleElementTest.class);
	}

	/**
	 * Constructs a new Single Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleElement getFixture() {
		return (SingleElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphstructureFactory.eINSTANCE.createSingleElement());
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

} //SingleElementTest
