package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.operators.impl.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test08ParameterValues {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		for (PropertyKind pl : PropertyKind.VALUES) {
				for (ParameterValue parameter : getTestParameters()) {					
					CompletePattern completePattern = getConcreteComparisonPattern(pl, parameter);
					completePatterns.add(completePattern);		
			}
		}

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getConcreteComparisonPattern(PropertyKind propertyKind, ParameterValue parameterValue) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test00.getBasePattern();
		completePattern.getGraph().getNodes().get(0).addPrimitiveComparison(ComparisonOperator.EQUAL, parameterValue);
//		completePattern.getGraph().getElements().get(0).addPrimitiveComparison(ComparisonOperator.NOTEQUAL, parameter);
		
		completePattern.createXMLAdaption();
		
		XmlProperty property = (XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0);
		property.getAttributeName().setValue("*");
		property.getOption().getOptions().add(propertyKind);
		property.getOption().setValue(propertyKind);
		
		completePattern.finalizeXMLAdaption();
		
		((XmlElementNavigation)completePattern.getGraph().getRelations().get(0)).getPathParam().setAxis(AxisKind.DESCENDANT, "");
		
		return completePattern;
	}

	public static ArrayList<ParameterValue> getTestParameters() {

		ArrayList<ParameterValue> parameters = new ArrayList<ParameterValue>();

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputFactory = ParametersFactory.eINSTANCE;
		TextLiteralParam input1 = inputFactory.createTextLiteralParam();
		input1.setValue("USA");
		TextListParam input2 = inputFactory.createTextListParam();
		input2.getValues().add("unknown");
		input2.getValues().add("USA");
		NumberParam input3 = inputFactory.createNumberParam();
		input3.setValue(1452.);
		BooleanParam input4 = inputFactory.createBooleanParam();
		input4.setValue(true);
		DateParam input5 = inputFactory.createDateParam();
		input5.setValue("2020-10-03");
		TimeParam input6 = inputFactory.createTimeParam();
		input6.setValue("09:00:00");
		DateTimeParam input7 = inputFactory.createDateTimeParam();
		input7.setValue("2020-10-03T09:00:00");

		parameters.add(input1);
		parameters.add(input2);
		parameters.add(input3);
		parameters.add(input4);
		parameters.add(input5);
		parameters.add(input6);
		parameters.add(input7);

		return parameters;
	}

//	public static CompletePattern getPrimCondPattern(PropertyLocation pl, LogicalOperator op, ParameterValue parameter) {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//
//		CompletePattern completePattern = Test00.getBasePattern();
//		Element ret = completePattern.getGraph().getElements().get(0);
//		ret.addPrimitiveComparison(parameter);
//		
//		completePattern.createXMLAdaption();
//		completePattern.finalizeXMLAdaption();
//		
//		return completePattern;
//	}

	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<ParameterValue> parameter = getTestParameters();

		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();	

		testPairs.add(new PatternTestPair("DataTextLiteral", getConcreteComparisonPattern(PropertyKind.DATA, parameter.get(0)), "//*[data()='USA']"));
		testPairs.add(new PatternTestPair("DataTextList", getConcreteComparisonPattern(PropertyKind.DATA, parameter.get(1)), "//*[data()='USA' or data()='unknown']"));
		testPairs.add(new PatternTestPair("DataNumber", getConcreteComparisonPattern(PropertyKind.DATA, parameter.get(2)), "//*[if(string(number(data())) != 'NaN') then xs:double(data())=1452.0]"));
		testPairs.add(new PatternTestPair("DataBoolean", getConcreteComparisonPattern(PropertyKind.ATTRIBUTE, parameter.get(3)), "//*[@*[try {xs:boolean(data()) = true()} catch err:FORG0001 {false()}]]"));
		testPairs.add(new PatternTestPair("DataDate", getConcreteComparisonPattern(PropertyKind.ATTRIBUTE, parameter.get(4)), "//*[@*[try {xs:date(data()) = xs:date(\"2020-10-03\")} catch err:FORG0001 {false()}]]"));
		testPairs.add(new PatternTestPair("DataTime", getConcreteComparisonPattern(PropertyKind.ATTRIBUTE, parameter.get(5)), "//*[@*[try {xs:time(data()) = xs:time(\"09:00:00\")} catch err:FORG0001 {false()}]]"));
		testPairs.add(new PatternTestPair("DataDateTime", getConcreteComparisonPattern(PropertyKind.ATTRIBUTE, parameter.get(6)), "//*[@*[try {xs:dateTime(data()) = xs:dateTime(\"2020-10-03T09:00:00\")} catch err:FORG0001 {false()}]]"));
		
		// TODO: complete
		
		return testPairs;
	}

}
