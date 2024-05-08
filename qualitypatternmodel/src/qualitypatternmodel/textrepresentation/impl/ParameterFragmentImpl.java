/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.textrepresentation.ValueMap;
import qualitypatternmodel.utility.Constants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getExampleValue <em>Example Value</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getValueMap <em>Value Map</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl#getUserValue <em>User Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterFragmentImpl extends FragmentImpl implements ParameterFragment {
	
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * The parameter represented by this fragment of a textual representation of the pattern.
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getExampleValue() <em>Example Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExampleValue() <em>Example Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleValue()
	 * @generated
	 * @ordered
	 */
	protected String exampleValue = EXAMPLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueMap() <em>Value Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMap()
	 * @generated
	 * @ordered
	 */
	protected ValueMap valueMap;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserValue() <em>User Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserValue()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserValue() <em>User Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserValue()
	 * @generated
	 * @ordered
	 */
	protected String userValue = USER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterFragmentImpl() {
		super();
	}
	
	@Override
	public String getPreview() {	
		return " [" + getParameter().get(0).eClass().getName() + "] ";
	}
	
	@Override
	public String generateSparqlTemplate() throws InvalidityException {
		return "?" + getId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextrepresentationPackage.Literals.PARAMETER_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectWithInverseResolvingEList.ManyInverse<Parameter>(Parameter.class, this, TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER, ParametersPackage.PARAMETER__PARAMETER_REFERENCES);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExampleValue() {
		return exampleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExampleValue(String newExampleValue) {
		String oldExampleValue = exampleValue;
		exampleValue = newExampleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE, oldExampleValue, exampleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserValue() {
		return userValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserValue(String newUserValue) {
		String oldUserValue = userValue;
		userValue = newUserValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__USER_VALUE, oldUserValue, userValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueMap getValueMap() {
		return valueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMap(ValueMap newValueMap, NotificationChain msgs) {
		ValueMap oldValueMap = valueMap;
		valueMap = newValueMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP, oldValueMap, newValueMap);
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
	public void setValueMap(ValueMap newValueMap) {
		if (newValueMap != valueMap) {
			NotificationChain msgs = null;
			if (valueMap != null)
				msgs = ((InternalEObject)valueMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP, null, msgs);
			if (newValueMap != null)
				msgs = ((InternalEObject)newValueMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP, null, msgs);
			msgs = basicSetValueMap(newValueMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP, newValueMap, newValueMap));
	}
	
	@Override
	public void setComparisonOperatorValueMap() {
		ValueMap map = new ValueMapImpl();
		map.put(ComparisonOperator.EQUAL.getName(), "equal to");
		map.put(ComparisonOperator.NOTEQUAL.getName(), "not equal to");
		map.put(ComparisonOperator.LESS.getName(), "less than");
		map.put(ComparisonOperator.GREATER.getName(), "greater than");
		map.put(ComparisonOperator.GREATEROREQUAL.getName(), "greater than or equal to");
		map.put(ComparisonOperator.LESSOREQUAL.getName(), "less than or equal to");
		setValueMap(map);
	}

	@Override
	public String generateJSON() {
		String patternName = getPatternText().getPattern().getPatternId();
		List<String> urls = new ArrayList<String>();
		for(Parameter p : getParameter()) {
			int parameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(p);
			String url = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(parameterID);
			urls.add(url);
		}
		Parameter parameter = getParameter().get(0);
		String urlsJSON = generateJSONList(urls);
		String id = getId();
		String value = parameter.getValueAsString();
		String type = getType();
		String role = getRole();
		String exampleValue = getExampleValue();		
		String json = "{\"Name\": \"" + id + "\", \"URLs\": " + urlsJSON + ", \"Type\": \"" + type + "\", \"Role\": \"" + role + "\"";
		if(value != null) {
			if(!(parameter instanceof TextListParamImpl) && !(parameter instanceof NumberParamImpl) && !(parameter instanceof BooleanParamImpl)) {
				value = "\"" + value + "\"";
			}
			json += ", \"Value\": " + value + "";
		}
		if (exampleValue != null) {
			try {
				Double.parseDouble(exampleValue);
				Integer.parseInt(exampleValue);				
			} catch (NumberFormatException e) {
				if(!(exampleValue.equals("true") || exampleValue.equals("false") || exampleValue.matches("^\\[(\".*\",( )?)*(\".*\"(,)?( )?)?\\]$"))) {					
					exampleValue = "\"" + exampleValue + "\"";
				}
			}			
			json += ", \"ExampleValue\": " + exampleValue + "";
		}
		if (type.equals("Enumeration")) {
			JSONArray options = parameter.getOptionsAsJsonArray();
			json += ", \"Options\": " + options + "";
		}
		if (parameter instanceof ParameterValue) {
			ParameterValue parameterValue = (ParameterValue) parameter;
			if(parameterValue.isTypeModifiable()) {
				json += ", \"TypeModifiable\": true";				
			}
		}
		if (parameter instanceof TextLiteralParamImpl) {
			TextLiteralParamImpl textLiteral = (TextLiteralParamImpl) parameter;
			if(textLiteral.getXmlPropertyOptionParam() != null && textLiteral.getMatches().isEmpty() && textLiteral.getComparison1().isEmpty() && textLiteral.getComparison2().isEmpty()) {
				json += ", \"Dependent\": true";
			}
		}
		if (parameter instanceof XmlPropertyOptionParamImpl) {
			XmlPropertyOptionParamImpl propertyOption = (XmlPropertyOptionParamImpl) parameter;
//			Node node = propertyOption.getXmlPathParam().getXmlNavigation().getTarget();
//			XmlProperty xmlProperty = (XmlProperty) node;
			TextLiteralParam textLiteral = propertyOption.getAttributeName();
			if(textLiteral.getMatches().isEmpty() && textLiteral.getComparison1().isEmpty() && textLiteral.getComparison2().isEmpty()) {
				int dependentParameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(textLiteral);
				String uri = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(dependentParameterID);
				String cond = XmlPropertyKind.ATTRIBUTE.getLiteral();
				json += ", \"Enable\": {";
				json += "\"Parameter\": \"" + uri + "\"";
				json += ", \"If\": \"" + cond + "\"";
				json += "}";
				
			}			
		}
		json += "}";
		return json;
	}
	
	@Override
	public JSONObject generateJSONObject() {
		String patternName = getPatternText().getPattern().getPatternId();
		List<String> urls = new ArrayList<String>();
		for(Parameter p : getParameter()) {
			int parameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(p);
			String url = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(parameterID);
			urls.add(url);
		}
		Parameter parameter = getParameter().get(0);
//		String urlsJSON = generateJSONList(urls);
		JSONObject json = new JSONObject();
		try {
			json.put("id", getId());
			json.put("name", getName());
			json.put("type", getType());
			json.put("role", getRole());
			if (getValue() != null)
				json.put("value", getValue());
			if (getUserValue() != null)
				json.put("userValue", getUserValue());
			json.put("exampleValue", getExampleValue());
			
			if (getValueMap() != null) {
				json.put("options", getValueMap().getValuesAsJsonArray());
			}	
			else if (getType().equals("Enumeration")) {
				json.put("options", parameter.getOptionsAsJsonArray());
			}
			if (parameter instanceof ParameterValue) {
				ParameterValue parameterValue = (ParameterValue) parameter;
				if(parameterValue.isTypeModifiable()) {
					json.put("typeModifiable", true);
				}
			}
			if (parameter instanceof TextLiteralParamImpl) {
				TextLiteralParamImpl textLiteral = (TextLiteralParamImpl) parameter;
				if(textLiteral.getXmlPropertyOptionParam() != null && textLiteral.getMatches().isEmpty() && textLiteral.getComparison1().isEmpty() && textLiteral.getComparison2().isEmpty()) {
					json.put("dependant", true);
				}
			}
			if (parameter instanceof XmlPropertyOptionParamImpl) {
				XmlPropertyOptionParamImpl propertyOption = (XmlPropertyOptionParamImpl) parameter;
//				Node node = propertyOption.getXmlPathParam().getXmlNavigation().getTarget();
//				XmlProperty xmlProperty = (XmlProperty) node;
				TextLiteralParam textLiteral = propertyOption.getAttributeName();
				if(textLiteral.getMatches().isEmpty() && textLiteral.getComparison1().isEmpty() && textLiteral.getComparison2().isEmpty()) {
					int dependentParameterID = getPatternText().getPattern().getParameterList().getParameters().indexOf(textLiteral);
					String id = "/concrete-patterns/parameter/" + patternName + "/" + Integer.toString(dependentParameterID);
					String cond = XmlPropertyKind.ATTRIBUTE.getLiteral();
					
					JSONObject enable = new JSONObject();
					enable.put("parameter", id);
					enable.put("if", cond);
					json.put("enable", enable);
				}	
			}
		} catch (JSONException e) {}
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public String getType() {
//		return getParameter().getClass().toString();
		Parameter param = getParameter().get(0);
		Class<?> type = param.getClass();
		if (getValueMap() != null)
			return Constants.PARAMETER_TYPE_ENUMERATION;
		if (type.equals(DateParamImpl.class)) {
			return Constants.PARAMETER_TYPE_DATE;			
		} else if(type.equals(TimeParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TIME;
		} else if (type.equals(DateTimeParamImpl.class)) {
			return Constants.PARAMETER_TYPE_DATE_TIME;
		} else if (type.equals(TextLiteralParamImpl.class)) {
			if (!((TextLiteralParamImpl) param).getMatches().isEmpty())
				return Constants.PARAMETER_TYPE_REGEX;
			else 
				return Constants.PARAMETER_TYPE_TEXT;
		} else if (type.equals(BooleanParamImpl.class)) {
			return Constants.PARAMETER_TYPE_BOOLEAN;
		} else if (type.equals(NumberParamImpl.class)) {
			return Constants.PARAMETER_TYPE_NUMBER;
		} else if (type.equals(TextListParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TEXT_LIST;
		} else if (type.equals(UntypedParameterValueImpl.class)) {
			return Constants.PARAMETER_TYPE_UNTYPED;
		} else if (type.equals(ComparisonOptionParamImpl.class) || type.equals(TypeOptionParamImpl.class)) {
			return Constants.PARAMETER_TYPE_ENUMERATION;
		} else if (type.equals(XmlPathParamImpl.class)) {
			return Constants.PARAMETER_TYPE_XML_PATH;
		} else {
			return null;
		}		
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public String getValue() {
		String value;
		try {
			value = getParameter().get(0).getValueAsString();
		} catch (NullPointerException e) {
			value = null;
		}
		if (getValueMap() != null)
			value = getValueMap().get(value);
//		Map<String, String> valueMap = new HashMap<String, String>();
//		if (valueMap != null && valueMap.containsKey(value))
//			return valueMap.get(value);
		return value;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getRole() {
		Class<?> type = getParameter().get(0).getClass();
		if (type.equals(DateParamImpl.class)) {
			return Constants.PARAMETER_TYPE_DATE;			
		} else if(type.equals(TimeParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TIME;
		} else if (type.equals(DateTimeParamImpl.class)) {
			return Constants.PARAMETER_TYPE_DATE_TIME;
		} else if (type.equals(TextLiteralParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TEXT;
		} else if (type.equals(BooleanParamImpl.class)) {
			return Constants.PARAMETER_TYPE_BOOLEAN;
		} else if (type.equals(NumberParamImpl.class)) {
			return Constants.PARAMETER_TYPE_NUMBER;
		} else if (type.equals(TextListParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TEXT_LIST;
		} else if (type.equals(UntypedParameterValueImpl.class)) {
			return Constants.PARAMETER_TYPE_UNTYPED;
		} else if (type.equals(ComparisonOptionParamImpl.class)) {
			return Constants.PARAMETER_TYPE_COMPARISON;
		} else if (type.equals(TypeOptionParamImpl.class)) {
			return Constants.PARAMETER_TYPE_TYPE;
		} else if (type.equals(XmlPathParamImpl.class)) {
			XmlNavigation nav = ((XmlPathParamImpl) getParameter().get(0)).getXmlNavigation();
			if (nav instanceof XmlPropertyNavigation)
				return Constants.PARAMETER_TYPE_PROPERTY;
			if (nav instanceof XmlElementNavigation)
				return Constants.PARAMETER_TYPE_RELATION;
		} 
		ServletUtilities.log("No Role for class " + type.getSimpleName());
		return "";
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(String value) throws InvalidityException {
		String myValue = value;

		if (getValueMap() != null)
			myValue = getValueMap().getKey(value);
		
		
//		Map<String, String> valueMap = new HashMap<String, String>();
//		if (valueMap != null && valueMap.containsValue(value)) {
//			for (String key: valueMap.keySet()) {
//				if (valueMap.get(key).equals(value)) {
//					myValue = key;
//					break;
//				}
//			}
//		}
		for (Parameter p: getParameter())
			p.setValueFromString(myValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (abstractionLevel.equals(AbstractionLevel.CONCRETE)) {
			String firstValue;
			try {
				firstValue = getParameter().get(0).getValueAsString();
			} catch (NullPointerException e) {
				firstValue = null;
			}
			EClass firstEClass = getParameter().get(0).eClass();
			
			
			for(Parameter p : getParameter()) {
				String value;
				try {
					value = p.getValueAsString();
				} catch (NullPointerException e) {
					value = null;
				}
				EClass myEClass = p.eClass();
				
				if(!value.equals(firstValue))
					throw new InvalidityException("Referenced parameters have different values '" + value + "' != '" + firstValue + "'");
				
				if(!myEClass.equals(firstEClass))
					throw new InvalidityException("Referenced parameters have different types ");
				
//				if(value != null && !value.equals(firstValue) || value == null && firstValue != null) {
//					String types = "";
//					for (Parameter p2 : getParameter()) {
//						String p2val;
//						try {
//							p2val = p2.getValueAsString();
//						} catch (NullPointerException e) {
//							p2val = null;
//						}
//						types += ", " + p2.getClass().getSimpleName() + ":" + p2val;
//					}
//					throw new InvalidityException("Referenced parameters have different values: " + types);
//				}
//				
//				if(!p.eClass().equals(firstEClass)) {
//					throw new InvalidityException("Referenced parameters are not of same type");
//				}
//				
//				try {
//					if(getExampleValue() != null && abstractionLevel != AbstractionLevel.CONCRETE) {
//						p.validateExampleValue(getExampleValue());
//					}	
//				} catch (Exception e) {
//					e.printStackTrace();
//					throw new InvalidityException("Example value '" + getExampleValue() + "' has wrong type");
//				}
			}
		}
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameter()).basicAdd(otherEnd, msgs);
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP:
				return basicSetValueMap(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public static String generateJSONList(List<String> list) {		
		String s = "[";
		for(String value : list) {
			s += "\"" + value + "\", ";
		}
		s = s.substring(0, s.length()-2);
		s += "]";
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				return getParameter();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				return getExampleValue();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				return getName();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP:
				return getValueMap();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__ID:
				return getId();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__USER_VALUE:
				return getUserValue();
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				setExampleValue((String)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				setName((String)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP:
				setValueMap((ValueMap)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__ID:
				setId((String)newValue);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__USER_VALUE:
				setUserValue((String)newValue);
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				getParameter().clear();
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				setExampleValue(EXAMPLE_VALUE_EDEFAULT);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP:
				setValueMap((ValueMap)null);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__USER_VALUE:
				setUserValue(USER_VALUE_EDEFAULT);
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
			case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case TextrepresentationPackage.PARAMETER_FRAGMENT__EXAMPLE_VALUE:
				return EXAMPLE_VALUE_EDEFAULT == null ? exampleValue != null : !EXAMPLE_VALUE_EDEFAULT.equals(exampleValue);
			case TextrepresentationPackage.PARAMETER_FRAGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextrepresentationPackage.PARAMETER_FRAGMENT__VALUE_MAP:
				return valueMap != null;
			case TextrepresentationPackage.PARAMETER_FRAGMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TextrepresentationPackage.PARAMETER_FRAGMENT__USER_VALUE:
				return USER_VALUE_EDEFAULT == null ? userValue != null : !USER_VALUE_EDEFAULT.equals(userValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterReference.class) {
			switch (derivedFeatureID) {
				case TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER: return TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterReference.class) {
			switch (baseFeatureID) {
				case TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER: return TextrepresentationPackage.PARAMETER_FRAGMENT__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterReference.class) {
			switch (baseOperationID) {
				case TextrepresentationPackage.PARAMETER_REFERENCE___IS_VALID__ABSTRACTIONLEVEL: return TextrepresentationPackage.PARAMETER_FRAGMENT___IS_VALID__ABSTRACTIONLEVEL;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TextrepresentationPackage.PARAMETER_FRAGMENT___GET_TYPE:
				return getType();
			case TextrepresentationPackage.PARAMETER_FRAGMENT___GET_ROLE:
				return getRole();
			case TextrepresentationPackage.PARAMETER_FRAGMENT___SET_VALUE__STRING:
				try {
					setValue((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case TextrepresentationPackage.PARAMETER_FRAGMENT___GET_VALUE:
				return getValue();
			case TextrepresentationPackage.PARAMETER_FRAGMENT___SET_COMPARISON_OPERATOR_VALUE_MAP:
				setComparisonOperatorValueMap();
				return null;
			case TextrepresentationPackage.PARAMETER_FRAGMENT___IS_VALID__ABSTRACTIONLEVEL:
				try {
					isValid((AbstractionLevel)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (exampleValue: ");
		result.append(exampleValue);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", userValue: ");
		result.append(userValue);
		result.append(')');
		return result.toString();
	}

} //ParameterFragmentImpl
