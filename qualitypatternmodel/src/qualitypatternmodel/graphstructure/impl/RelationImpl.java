/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.RelationOptionParamImpl;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.PatternImpl;
import qualitypatternmodel.patternstructure.impl.RelationMappingImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Relation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getMappingFrom <em>Mapping From</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getMappingTo <em>Mapping To</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.RelationImpl#getOptionParam <em>Option Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends PatternElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getMappingFrom() <em>Mapping From</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingFrom()
	 * @generated
	 * @ordered
	 */
	protected RelationMapping mappingFrom;

	/**
	 * The cached value of the '{@link #getMappingTo() <em>Mapping To</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappingTo()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationMapping> mappingTo;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected RelationOptionParam option;

	/**
	 * The cached value of the '{@link #getOptionParam() <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionParam()
	 * @generated
	 * @ordered
	 */
	protected OptionParam<Axis> optionParam;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getMappingFrom() == null && option == null)
			throw new InvalidityException("axis missing");
		if (getMappingFrom() != null && option != null)
			throw new InvalidityException("axis redundant");
		
		try {
			Pattern pattern;
			pattern = (Pattern) getAncestor(Pattern.class);
			if (getGraphDepth() == 0 && mappingFrom != null && pattern.getCount() == null) // depth=0 => ReturnGraph
				throw new InvalidityException("invalid RelationMapping to returnGraph: " + mappingFrom + " "
						+ mappingFrom.getId() + " - (" + mappingTo + ")");
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(RelationMapping mapping : getMappingTo()) {
			if(!mapping.getTo().getElement().getMappingFrom().getFrom().equals(getElement())) {
				throw new InvalidityException("mapping invalid");
			}
		}
	
	}

	@Override
	public String generateQuery(Location location) throws InvalidityException {
		if (option != null) {
			return option.generateQuery(location);
		} else {
			throw new InvalidityException("option null");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		if (getOption() != null) {
			res.add(option);
		} else if (getMappingFrom() == null) {
			throw new InvalidityException("option null" + " (" + getInternalId() + ")");
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationMapping> getMappingTo() {
		if (mappingTo == null) {
			mappingTo = new EObjectWithInverseResolvingEList<RelationMapping>(RelationMapping.class, this, GraphstructurePackage.RELATION__MAPPING_TO, PatternstructurePackage.RELATION_MAPPING__FROM);
		}
		return mappingTo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationMapping getMappingFrom() {
		if (mappingFrom != null && mappingFrom.eIsProxy()) {
			InternalEObject oldMappingFrom = (InternalEObject)mappingFrom;
			mappingFrom = (RelationMapping)eResolveProxy(oldMappingFrom);
			if (mappingFrom != oldMappingFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__MAPPING_FROM, oldMappingFrom, mappingFrom));
			}
		}
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping basicGetMappingFrom() {
		return mappingFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetMappingFrom(RelationMapping newMappingFrom, NotificationChain msgs) {
		RelationMapping oldMappingFrom = mappingFrom;
		mappingFrom = newMappingFrom;
		if (newMappingFrom != null) {
			removeInputsFromVariableList();
			setOption(null);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphstructurePackage.RELATION__MAPPING_FROM, oldMappingFrom, newMappingFrom);
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
	public void setMappingFrom(RelationMapping newMappingFrom) {
		if (newMappingFrom != mappingFrom) {
			NotificationChain msgs = null;
			if (mappingFrom != null)
				msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
			if (newMappingFrom != null)
				msgs = ((InternalEObject)newMappingFrom).eInverseAdd(this, PatternstructurePackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
			msgs = basicSetMappingFrom(newMappingFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__MAPPING_FROM, newMappingFrom, newMappingFrom));
	}

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	@Override
//	public void setAxis(Axis newAxis) {
//		Axis oldAxis = axis;
//		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
//		
//		for(RelationMapping mapping : getMappingTo()) {
//			Relation relation = mapping.getTo();
//			if(relation.getAxis() != axis) {
//				relation.setAxis(newAxis);
//			}
//		}
//		if(getMappingFrom() != null) {
//			Relation relation = getMappingFrom().getFrom();
//			if(relation.getAxis() != axis) {
//				relation.setAxis(newAxis);	
//			}
//		}
//		
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__AXIS, oldAxis, axis));
//	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws InvalidityException
	 */
	@Override
	public int getGraphDepth() throws InvalidityException {
		return getElement().getGraphDepth();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getElement() {
		if (eContainerFeatureID() != GraphstructurePackage.RELATION__ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, GraphstructurePackage.RELATION__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(Element newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.RELATION__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, Element.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetRelationTo(Element newRelationTo, NotificationChain msgs) {
		removeRelationFromPreviousGraphs();
		removeMappingsToNext();
		if (getElement() != null) {
			removeInputsFromVariableList();
		}
		if (newRelationTo != null) {
			copyToNewNextGraphs(newRelationTo);
		}
		msgs = eBasicSetContainer((InternalEObject) newRelationTo, GraphstructurePackage.RELATION__ELEMENT, msgs);
		if (newRelationTo != null && getMappingFrom() == null) {
			createInputs();
		}
		return msgs;
	}

	@Override
	public void copyToNewNextGraphs(Element newRelationTo) {
		if (newRelationTo instanceof Element) {
			Element element = (Element) newRelationTo;
			if (element.getMappingFrom() != null) {
				Element correspondingElement = element.getMappingFrom().getFrom();
				Relation newCorrespondingRelation;
				if (correspondingElement.getRelationFromPrevious() != null) {
					newCorrespondingRelation = correspondingElement.getRelationFromPrevious();
				} else {
					newCorrespondingRelation = new RelationImpl();
				}
//				newCorrespondingRelation.setAxis(getAxis());
				RelationMapping mapping = new RelationMappingImpl();
				element.getMappingFrom().getMorphism().getMappings().add(mapping);
				mapping.setFrom(newCorrespondingRelation);
				mapping.setTo(this);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void createInputs() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);

			if (getOption() == null) {
				RelationOptionParam relationOptionParam = new RelationOptionParamImpl();
				pattern.getParameterList().add(relationOptionParam);
				setOption(relationOptionParam);
			} else {
				pattern.getParameterList().add(getOption());
			}
		} catch (MissingPatternContainerException e) {
			// since this comparison is not contained in a pattern, do nothing
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void removeInputsFromVariableList() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getParameterList().getParameters().remove(getOption());
		} catch (MissingPatternContainerException e) {
			// since this comparison is not contained in a pattern, do nothing
			e.printStackTrace();
		}
	}

	@Override
	public void removeMappingsToNext() {
		EList<RelationMapping> mappingToCopy = new BasicEList<RelationMapping>();
		mappingToCopy.addAll(getMappingTo());
		for (RelationMapping mapping : mappingToCopy) {
			mapping.setFrom(null);
			mapping.setTo(null);
			mapping.getMorphism().getMappings().remove(mapping);
		}
	}

	@Override
	public void removeRelationFromPreviousGraphs() {
		if (getMappingFrom() != null) {
			Relation correspondingRelation = getMappingFrom().getFrom();
			correspondingRelation.getElement().setRelationFromPrevious(null);
//			getMappingFrom().setFrom(null);
//			if(getMappingFrom().getMorphism() != null) {
//				getMappingFrom().getMorphism().getMappings().remove(getMappingFrom());
//				getMappingFrom().setTo(null);
//			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (RelationOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RelationOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(RelationOptionParam newOption, NotificationChain msgs) {
		RelationOptionParam oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__OPTION, oldOption, newOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(RelationOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.RELATION_OPTION_PARAM__RELATIONS, RelationOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.RELATION_OPTION_PARAM__RELATIONS, RelationOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public OptionParam<Axis> getOptionParam() {
		if (optionParam != null && optionParam.eIsProxy()) {
			InternalEObject oldOptionParam = (InternalEObject)optionParam;
			optionParam = (OptionParam<Axis>)eResolveProxy(oldOptionParam);
			if (optionParam != oldOptionParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.RELATION__OPTION_PARAM, oldOptionParam, optionParam));
			}
		}
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionParam<Axis> basicGetOptionParam() {
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionParam(OptionParam<Axis> newOptionParam, NotificationChain msgs) {
		OptionParam<Axis> oldOptionParam = optionParam;
		optionParam = newOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__OPTION_PARAM, oldOptionParam, newOptionParam);
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
	public void setOptionParam(OptionParam<Axis> newOptionParam) {
		if (newOptionParam != optionParam) {
			NotificationChain msgs = null;
			if (optionParam != null)
				msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__RELATION, OptionParam.class, msgs);
			if (newOptionParam != null)
				msgs = ((InternalEObject)newOptionParam).eInverseAdd(this, ParametersPackage.OPTION_PARAM__RELATION, OptionParam.class, msgs);
			msgs = basicSetOptionParam(newOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.RELATION__OPTION_PARAM, newOptionParam, newOptionParam));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				if (mappingFrom != null)
					msgs = ((InternalEObject)mappingFrom).eInverseRemove(this, PatternstructurePackage.RELATION_MAPPING__TO, RelationMapping.class, msgs);
				return basicSetMappingFrom((RelationMapping)otherEnd, msgs);
			case GraphstructurePackage.RELATION__MAPPING_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMappingTo()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.RELATION__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((Element)otherEnd, msgs);
			case GraphstructurePackage.RELATION__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.RELATION_OPTION_PARAM__RELATIONS, RelationOptionParam.class, msgs);
				return basicSetOption((RelationOptionParam)otherEnd, msgs);
			case GraphstructurePackage.RELATION__OPTION_PARAM:
				if (optionParam != null)
					msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__RELATION, OptionParam.class, msgs);
				return basicSetOptionParam((OptionParam<Axis>)otherEnd, msgs);
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
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				return basicSetMappingFrom(null, msgs);
			case GraphstructurePackage.RELATION__MAPPING_TO:
				return ((InternalEList<?>)getMappingTo()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.RELATION__ELEMENT:
				return basicSetElement(null, msgs);
			case GraphstructurePackage.RELATION__OPTION:
				return basicSetOption(null, msgs);
			case GraphstructurePackage.RELATION__OPTION_PARAM:
				return basicSetOptionParam(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphstructurePackage.RELATION__ELEMENT:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				if (resolve) return getMappingFrom();
				return basicGetMappingFrom();
			case GraphstructurePackage.RELATION__MAPPING_TO:
				return getMappingTo();
			case GraphstructurePackage.RELATION__ELEMENT:
				return getElement();
			case GraphstructurePackage.RELATION__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case GraphstructurePackage.RELATION__OPTION_PARAM:
				if (resolve) return getOptionParam();
				return basicGetOptionParam();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				setMappingFrom((RelationMapping)newValue);
				return;
			case GraphstructurePackage.RELATION__MAPPING_TO:
				getMappingTo().clear();
				getMappingTo().addAll((Collection<? extends RelationMapping>)newValue);
				return;
			case GraphstructurePackage.RELATION__ELEMENT:
				setElement((Element)newValue);
				return;
			case GraphstructurePackage.RELATION__OPTION:
				setOption((RelationOptionParam)newValue);
				return;
			case GraphstructurePackage.RELATION__OPTION_PARAM:
				setOptionParam((OptionParam<Axis>)newValue);
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
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				setMappingFrom((RelationMapping)null);
				return;
			case GraphstructurePackage.RELATION__MAPPING_TO:
				getMappingTo().clear();
				return;
			case GraphstructurePackage.RELATION__ELEMENT:
				setElement((Element)null);
				return;
			case GraphstructurePackage.RELATION__OPTION:
				setOption((RelationOptionParam)null);
				return;
			case GraphstructurePackage.RELATION__OPTION_PARAM:
				setOptionParam((OptionParam<Axis>)null);
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
			case GraphstructurePackage.RELATION__MAPPING_FROM:
				return mappingFrom != null;
			case GraphstructurePackage.RELATION__MAPPING_TO:
				return mappingTo != null && !mappingTo.isEmpty();
			case GraphstructurePackage.RELATION__ELEMENT:
				return getElement() != null;
			case GraphstructurePackage.RELATION__OPTION:
				return option != null;
			case GraphstructurePackage.RELATION__OPTION_PARAM:
				return optionParam != null;
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
			case GraphstructurePackage.RELATION___GET_GRAPH_DEPTH:
				try {
					return getGraphDepth();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS:
				removeRelationFromPreviousGraphs();
				return null;
			case GraphstructurePackage.RELATION___REMOVE_MAPPINGS_TO_NEXT:
				removeMappingsToNext();
				return null;
			case GraphstructurePackage.RELATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT:
				copyToNewNextGraphs((Element)arguments.get(0));
				return null;
			case GraphstructurePackage.RELATION___CREATE_INPUTS:
				createInputs();
				return null;
			case GraphstructurePackage.RELATION___REMOVE_INPUTS_FROM_VARIABLE_LIST:
				removeInputsFromVariableList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		if (getOption() != null) {
			return getOption().getValue().getLiteral() + " (" + getInternalId() + ")";
		} else {
			return "no axis option " + " (" + getInternalId() + ")";
		}
	}

} // RelationImpl
