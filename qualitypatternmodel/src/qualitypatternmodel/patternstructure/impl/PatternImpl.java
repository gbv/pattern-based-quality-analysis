/**
 */
package qualitypatternmodel.patternstructure.impl;

import static qualitypatternmodel.utilityclasses.Constants.*;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.graphstructure.impl.SingleElementImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParameterListImpl;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends PatternElementImpl implements Pattern {
	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList parameterList;

	/**
	 * The cached setting delegate for the '{@link #isCheckMorphismOfNextGraph() <em>Check Morphism Of Next Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckMorphismOfNextGraph()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph graph;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The default value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected int elementCounter = ELEMENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected PatternImpl() {
		super();
		setGraph(new GraphImpl());
		SingleElementImpl rootElement = new SingleElementImpl();
		getGraph().setRootElement(rootElement);
		SingleElementImpl returnElement = new SingleElementImpl();
		returnElement.setPrevious(getGraph().getRootElement());
		getGraph().getReturnElements().add(returnElement);
		
		rootElement.setName("Root");
		returnElement.setName("Return");

		setParameterList(new ParameterListImpl(this));
		getInternalId();
	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		parameterList.isValid(isDefinedPattern);
		graph.isValid(isDefinedPattern);
		condition.isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (parameterList == null)
			throw new InvalidityException("variableList null" + " (" + getInternalId() + ")");
		if (graph == null)
			throw new InvalidityException("Graph null" + " (" + getInternalId() + ")");
		if (condition == null)
			throw new InvalidityException("condition null" + " (" + getInternalId() + ")");
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		String res = getParameterList().toXQuery(location);

		if (graph.getReturnElements() == null || graph.getReturnElements().isEmpty()) {
			throw new InvalidityException("return elements missing");
		}
		res += graph.toXQuery(Location.RETURN);

		res += WHERE + condition.toXQuery(Location.OUTSIDE); // TODO: schachteln!

		res += RETURN + "(";
		EList<SingleElement> returnElements = graph.getReturnElements();
		for (int i = 0; i < returnElements.size(); i++) {
			if (i != 0)
				res += ", ";
			res += VARIABLE + returnElements.get(i).getOriginalID();
		}
		return res + ")";
	}

	public String toXQuery() throws InvalidityException {
		return toXQuery(Location.OUTSIDE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getNewRefNo() {
		return elementCounter++;
	}

	@Override
	public void prepareTranslation() {
		graph.prepareTranslation();
		condition.prepareTranslation();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> parameters = graph.getAllInputs();
		if (condition != null)
			parameters.addAll(condition.getAllInputs());
		return parameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		ParameterList oldParameterList = parameterList;
		parameterList = newParameterList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__PARAMETER_LIST, oldParameterList, newParameterList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != parameterList) {
			NotificationChain msgs = null;
			if (parameterList != null)
				msgs = ((InternalEObject)parameterList).eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__PARAMETER_LIST, newParameterList, newParameterList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		if(getGraph() != null) {
			getGraph().setMorphismFrom(null);
			getGraph().getMorphismTo().clear();
		}
		Graph oldGraph = graph;
		graph = newGraph;
		if (graph != null) {
			graph.setReturnGraph(true);
			graph.setGraphDepth(0);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.PATTERN__GRAPH, oldGraph, newGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (condition != null) {
			condition.setCondDepth(1);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.PATTERN__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, PatternstructurePackage.CONDITION__PATTERN, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, PatternstructurePackage.CONDITION__PATTERN, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getElementCounter() {
		return elementCounter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCounter(int newElementCounter) {
		int oldElementCounter = elementCounter;
		elementCounter = newElementCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__ELEMENT_COUNTER, oldElementCounter, elementCounter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckMorphismOfNextGraph() {
		return (Boolean)CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__PARAMETER_LIST:
				if (parameterList != null)
					msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__PARAMETER_LIST, null, msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case PatternstructurePackage.PATTERN__GRAPH:
				if (graph != null)
					msgs = ((InternalEObject)graph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__GRAPH, null, msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case PatternstructurePackage.PATTERN__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__CONDITION, null, msgs);
				return basicSetCondition((Condition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case PatternstructurePackage.PATTERN__GRAPH:
				return basicSetGraph(null, msgs);
			case PatternstructurePackage.PATTERN__CONDITION:
				return basicSetCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__PARAMETER_LIST:
				return getParameterList();
			case PatternstructurePackage.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return isCheckMorphismOfNextGraph();
			case PatternstructurePackage.PATTERN__GRAPH:
				return getGraph();
			case PatternstructurePackage.PATTERN__CONDITION:
				return getCondition();
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				return getElementCounter();
			case PatternstructurePackage.PATTERN__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case PatternstructurePackage.PATTERN__GRAPH:
				setGraph((Graph)newValue);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				setElementCounter((Integer)newValue);
				return;
			case PatternstructurePackage.PATTERN__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case PatternstructurePackage.PATTERN__GRAPH:
				setGraph((Graph)null);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				setElementCounter(ELEMENT_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__PARAMETER_LIST:
				return parameterList != null;
			case PatternstructurePackage.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternstructurePackage.PATTERN__GRAPH:
				return graph != null;
			case PatternstructurePackage.PATTERN__CONDITION:
				return condition != null;
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				return elementCounter != ELEMENT_COUNTER_EDEFAULT;
			case PatternstructurePackage.PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternstructurePackage.PATTERN___TO_XQUERY:
				try {
					return toXQuery();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN___GET_NEW_REF_NO:
				return getNewRefNo();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (elementCounter: ");
		result.append(elementCounter);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "Pattern " + getInternalId() + " " + name +" ("; 
		res += getParameterList().myToString().replace("\n", "\n  ");
		res += "\n  " + getGraph().myToString().replace("\n", "\n  ");
		res += "\n  " + getCondition().myToString().replace("\n", "\n  ") + "\n)";
		return res;
	}

} // PatternImpl
