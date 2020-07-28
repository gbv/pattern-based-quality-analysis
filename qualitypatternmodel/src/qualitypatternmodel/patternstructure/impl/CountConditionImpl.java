/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getCountPattern <em>Count Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountConditionImpl extends ConditionImpl implements CountCondition {
	/**
	 * The cached value of the '{@link #getCountPattern() <em>Count Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountPattern()
	 * @generated
	 * @ordered
	 */
	protected CountPattern countPattern;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOptionParam option;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected CountConditionArgument argument2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountConditionImpl() {
		super();
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		String argument1 = getCountPattern().generateQuery();
		String argument2 = getArgument2().generateQuery();
		if(getOption() != null && getOption().getValue() != null) {
			return argument1 + " " + getOption().getValue() + " " + argument2;
		} else {
			throw new InvalidityException("invalid option");
		}
		
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(abstractionLevel);
		getCountPattern().isValid(abstractionLevel);
		getArgument2().isValid(abstractionLevel);
		if(getOption() != null) {
			getOption().isValid(abstractionLevel);
		} else {
			throw new InvalidityException("invalid option");
		}
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if(getCountPattern() == null) {
			throw new InvalidityException("argument1 missing");
		} 		
		if(getArgument2() == null) {
			throw new InvalidityException("argument2 missing");
		}
		if(getOption() == null) {
			throw new InvalidityException("invalid option");
		} 		
	}
	
	@Override
	public PatternElement createXMLAdaption() {
		getCountPattern().createXMLAdaption();
		getArgument2().createXMLAdaption();
		return this;
	}
	
	@Override
	public void finalizeXMLAdaption() {
		getCountPattern().finalizeXMLAdaption();
		getArgument2().finalizeXMLAdaption();
	}
	
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {		
		BasicEList<MorphismContainer> result = new BasicEList<MorphismContainer>();
		if(getCountPattern() instanceof CountPattern) {
			result.add((MorphismContainer) getCountPattern());
		}
		if(getArgument2() instanceof CountPattern) {
			result.add((MorphismContainer) getArgument2());
		}
		return result;
	}	

//	public CountConditionArgument getArgument2() throws InvalidityException {		
//		if(getCount2() != null) {
//			return getCount2();
//		} else if(getNumberParam() != null){
//			return getNumberParam();
//		} else {
//			throw new InvalidityException("argument2 missing");
//		}		
//	}
//
//	public CountConditionArgument getArgument1() throws InvalidityException {		
//		if(getCount1() != null) {
//			return getCount1();
//		} else {
//			throw new InvalidityException("argument1 missing");
//		}		
//	}
	
	@Override
	public void recordValues(XmlDatabase database) {
		getCountPattern().recordValues(database);
		getArgument2().recordValues(database);
	}
	
	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		if(getOption() != null) {
			res.add(getOption());
		}		
		res.addAll(getCountPattern().getAllInputs());
		res.addAll(getArgument2().getAllInputs());		
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COUNT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountPattern getCountPattern() {
		return countPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountPattern(CountPattern newCountPattern, NotificationChain msgs) {		
		CountPattern oldCountPattern = countPattern;
		countPattern = newCountPattern;
		
		if(newCountPattern != null) {
			newCountPattern.updateParameters(newCountPattern.getParameterList());
		}
		if(oldCountPattern != null) {
			oldCountPattern.updateParameters(null);
		}
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, oldCountPattern, newCountPattern);
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
	public void setCountPattern(CountPattern newCountPattern) {
		if (newCountPattern != countPattern) {
			NotificationChain msgs = null;
			if (countPattern != null)
				msgs = ((InternalEObject)countPattern).eInverseRemove(this, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION, CountPattern.class, msgs);
			if (newCountPattern != null)
				msgs = ((InternalEObject)newCountPattern).eInverseAdd(this, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION, CountPattern.class, msgs);
			msgs = basicSetCountPattern(newCountPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, newCountPattern, newCountPattern));
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public NotificationChain basicSetNumberParam(NumberParam newNumberParam, NotificationChain msgs) {
//		NumberParam oldNumberParam = numberParam;
//		numberParam = newNumberParam;
//		
//		try {
//			CompletePattern completePattern;
//			completePattern = (CompletePattern) getAncestor(CompletePattern.class);
//			ParameterList varlist = completePattern.getParameterList();
//			if(oldNumberParam != null) {				
//				varlist.getParameters().remove(oldNumberParam);
//			}
//			if(newNumberParam != null) {
//				varlist.add(newNumberParam);
//			}
//		} catch (MissingPatternContainerException e) {
//			// do nothing
//		}	
//		
//		if (eNotificationRequired()) {
//			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__NUMBER_PARAM, oldNumberParam, newNumberParam);
//			if (msgs == null) msgs = notification; else msgs.add(notification);
//		}
//		return msgs;
//	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public NotificationChain basicSetQuantifiedConditionCount(QuantifiedCondition newQuantifiedConditionCount, NotificationChain msgs) {		
//		if(getOption() != null) {
//			getOption().setParameterList(null);
//		}
//		
//		msgs = eBasicSetContainer((InternalEObject)newQuantifiedConditionCount, PatternstructurePackage.COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT, msgs);
//		
//		setOption(new ComparisonOptionParamImpl());
//		getParameterList().add(getOption());
//		
//		return msgs;
//	}
	
	@Override
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		if(getOption() != null) {
			getOption().setParameterList(null);
		}

		msgs = super.basicSetPattern(newPattern, msgs);
		
		if(newPattern != null) {
			setCountPattern(new CountPatternImpl());
			setOption(new ComparisonOptionParamImpl());
			getParameterList().add(getOption());
		}			
		
		return msgs;
	}
	
	@Override
	public NotificationChain basicSetFormula1(Formula newFormula, NotificationChain msgs) {
		if(getOption() != null) {
			getOption().setParameterList(null);
		}

		msgs = super.basicSetFormula1(newFormula, msgs);
		
		if(newFormula != null) {
			setCountPattern(new CountPatternImpl());
			setOption(new ComparisonOptionParamImpl());
			getParameterList().add(getOption());
		}			

		return msgs;
	}
	
	@Override
	public NotificationChain basicSetFormula2(Formula newFormula, NotificationChain msgs) {
		if(getOption() != null) {
			getOption().setParameterList(null);
		}

		msgs = super.basicSetFormula2(newFormula, msgs);
		
		if(newFormula != null) {
			setCountPattern(new CountPatternImpl());
			setOption(new ComparisonOptionParamImpl());
			getParameterList().add(getOption());
		}			

		return msgs;
	}
	
	@Override
	public NotificationChain basicSetNotCondition(NotCondition newNotCondition, NotificationChain msgs) {
		if(getOption() != null) {
			getOption().setParameterList(null);
		}

		msgs = super.basicSetNotCondition(newNotCondition, msgs);
		
		if(newNotCondition != null) {
			setCountPattern(new CountPatternImpl());
			setOption(new ComparisonOptionParamImpl());
			getParameterList().add(getOption());
		}			

		return msgs;
	}
	
	@Override 
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition, NotificationChain msgs) {
		if(getOption() != null) {
			getOption().setParameterList(null);
		}
		
		msgs = super.basicSetQuantifiedCondition(newQuantifiedCondition, msgs);
		
		if(newQuantifiedCondition != null) {
			setCountPattern(new CountPatternImpl());
			setOption(new ComparisonOptionParamImpl());
			getParameterList().add(getOption());
		}			
		
		
		return msgs;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (ComparisonOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COUNT_CONDITION__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(ComparisonOptionParam newOption, NotificationChain msgs) {
		ComparisonOptionParam oldOption = option;
		option = newOption;
		if(option != null) {
			option.getOptions().clear();
			option.getOptions().addAll(ComparisonOperator.VALUES);
		}
		
		try {
			CompletePattern completePattern;
			completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			varlist.remove(oldOption);			
			varlist.add(newOption);			
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION, oldOption, newOption);
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
	public void setOption(ComparisonOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS, ComparisonOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS, ComparisonOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountConditionArgument getArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument2(CountConditionArgument newArgument2, NotificationChain msgs) {		
		CountConditionArgument oldArgument2 = argument2;
		argument2 = newArgument2;
		
		if(newArgument2 != null) {
			newArgument2.updateParameters(newArgument2.getParameterList());
		}
		if(oldArgument2 != null) {
			oldArgument2.updateParameters(null);
		}
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, oldArgument2, newArgument2);
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
	public void setArgument2(CountConditionArgument newArgument2) {
		if (newArgument2 != argument2) {
			NotificationChain msgs = null;
			if (argument2 != null)
				msgs = ((InternalEObject)argument2).eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2, CountConditionArgument.class, msgs);
			if (newArgument2 != null)
				msgs = ((InternalEObject)newArgument2).eInverseAdd(this, PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2, CountConditionArgument.class, msgs);
			msgs = basicSetArgument2(newArgument2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, newArgument2, newArgument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				if (countPattern != null)
					msgs = ((InternalEObject)countPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, null, msgs);
				return basicSetCountPattern((CountPattern)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS, ComparisonOptionParam.class, msgs);
				return basicSetOption((ComparisonOptionParam)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				if (argument2 != null)
					msgs = ((InternalEObject)argument2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, null, msgs);
				return basicSetArgument2((CountConditionArgument)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				return basicSetCountPattern(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				return basicSetOption(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				return basicSetArgument2(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				return getCountPattern();
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				return getArgument2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				setCountPattern((CountPattern)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				setOption((ComparisonOptionParam)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				setArgument2((CountConditionArgument)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				setCountPattern((CountPattern)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				setOption((ComparisonOptionParam)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				setArgument2((CountConditionArgument)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				return countPattern != null;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				return option != null;
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				return argument2 != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String myToString() {
		String res = "CountCondition [" + getInternalId() + "]";
		res += " " + getOption().getValue().getLiteral() + " [" + getOption().getInternalId() + "]";
		res += ("\n" + getCountPattern().myToString()).replace("\n", "\n#  ");
		res += ("\n" + getArgument2().myToString()).replace("\n", "\n#  ");
		return res;
	}

} //CountComparisonImpl
