/**
 */
package qualitypatternmodel.inputfields.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.inputfields.Date;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.Text;
import qualitypatternmodel.inputfields.TextList;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.Time;
import qualitypatternmodel.inputfields.VariableList;
import qualitypatternmodel.inputfields.XSType;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.inputfields.InputfieldsPackage
 * @generated
 */
public class InputfieldsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InputfieldsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputfieldsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InputfieldsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputfieldsSwitch<Adapter> modelSwitch =
		new InputfieldsSwitch<Adapter>() {
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseCompOption(CompOption object) {
				return createCompOptionAdapter();
			}
			@Override
			public Adapter casePropertyOption(PropertyOption object) {
				return createPropertyOptionAdapter();
			}
			@Override
			public Adapter caseVariableList(VariableList object) {
				return createVariableListAdapter();
			}
			@Override
			public Adapter caseBoolean(qualitypatternmodel.inputfields.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseTextList(TextList object) {
				return createTextListAdapter();
			}
			@Override
			public Adapter caseTextLiteral(TextLiteral object) {
				return createTextLiteralAdapter();
			}
			@Override
			public Adapter caseNumber(qualitypatternmodel.inputfields.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseXSType(XSType object) {
				return createXSTypeAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter casePatternElement(PatternElement object) {
				return createPatternElementAdapter();
			}
			@Override
			public Adapter caseComparable(qualitypatternmodel.graphstructure.Comparable object) {
				return createComparableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.CompOption <em>Comp Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.CompOption
	 * @generated
	 */
	public Adapter createCompOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.PropertyOption <em>Property Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.PropertyOption
	 * @generated
	 */
	public Adapter createPropertyOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.VariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.VariableList
	 * @generated
	 */
	public Adapter createVariableListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.TextList <em>Text List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.TextList
	 * @generated
	 */
	public Adapter createTextListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.TextLiteral <em>Text Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.TextLiteral
	 * @generated
	 */
	public Adapter createTextLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.XSType <em>XS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.XSType
	 * @generated
	 */
	public Adapter createXSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.inputfields.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.inputfields.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.patternstructure.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.patternstructure.PatternElement
	 * @generated
	 */
	public Adapter createPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.graphstructure.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.graphstructure.Comparable
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InputfieldsAdapterFactory
