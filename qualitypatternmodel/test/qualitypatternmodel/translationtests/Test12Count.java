package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.testutility.PatternTestPair;

public class Test12Count {
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternCountInPatternFinal());	
		completePatterns.add(getPatternCountInExists());	
		completePatterns.add(getPatternCountInForall());	
		completePatterns.add(getPatternCountNextToExists());
		completePatterns.add(getPatternCountNextToForall());
		completePatterns.add(getPatternCountInNot());
		completePatterns.add(getPatternCountNextToExistsNested());
		completePatterns.add(getPatternCountNextToForallNested());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternCountInPatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternCountInPattern();
		completePattern.createXMLAdaption();
		CountPattern countPattern = ((CountCondition) completePattern.getCondition()).getCountPattern();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		UntypedParameterValue untypedParameterValue = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text.setValue("demo:data");
		untypedParameterValue.replace(text);
		
		UntypedParameterValue untypedParameterValue2 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(4);
		TextLiteralParam text2 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text2.setValue("demo:x");
		untypedParameterValue2.replace(text2);
		
		return completePattern;
	}

	public static CompletePattern getPatternCountInPattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		try {
			completePattern.getGraph().getReturnNodes().get(0).addPrimitiveComparison();
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CountCondition countCondition = factory.createCountCondition();
		completePattern.setCondition(countCondition);		
		
		CountPattern countpattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countpattern);
		countCondition.setArgument2(numberElement);
		
		Node returnInCPattern = countpattern.getGraph().getNodes().get(0);
		Node nextToReturnInCPattern = graphstructureFactory.createNode();
		nextToReturnInCPattern.setGraph(countpattern.getGraph());
		try {
			nextToReturnInCPattern.addPrimitiveComparison();
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countpattern.getGraph());
		relation.setSource(returnInCPattern);
		relation.setTarget(nextToReturnInCPattern);
			
		countpattern.getGraph().getReturnNodes().clear();
		countpattern.getGraph().getReturnNodes().add(nextToReturnInCPattern);
				
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);		
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountInExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		completePattern.getGraph().getNodes().get(0).addPrimitiveComparison();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);		
		
		CountPattern countPattern = factory.createCountPattern();

//		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
//		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countPattern);
		countCondition.setArgument2(numberElement);
		
		Node element2InCPattern = countPattern.getGraph().getNodes().get(1);
		element2InCPattern.addPrimitiveComparison();
		Node nextToElement2InCPattern = graphstructureFactory.createNode();
		nextToElement2InCPattern.setGraph(countPattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countPattern.getGraph());
		relation.setSource(element2InCPattern);
		relation.setTarget(nextToElement2InCPattern);
		
		countPattern.getGraph().getReturnNodes().clear();
		countPattern.getGraph().getReturnNodes().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countPattern.setCondition(truecondition);
		
		completePattern.createXMLAdaption();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) countPattern.getGraph().getNodes().get(2).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(2).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
				
		UntypedParameterValue untypedParameterValue = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text.setValue("demo:data");
		untypedParameterValue.replace(text);	
		
		UntypedParameterValue untypedParameterValue2 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(4);
		TextLiteralParam text2 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text2.setValue("demo:data");
		untypedParameterValue2.replace(text2);		
		
		UntypedParameterValue untypedParameterValue3 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam text3 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text3.setValue("demo:building");
		untypedParameterValue3.replace(text3);
		
		((NumberParam) completePattern.getParameterList().getParameters().get(3)).setValue(3.0);
		
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountInForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternCountInExists();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}
	
	public static CompletePattern getPatternCountInNot() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		
		NotCondition n = factory.createNotCondition();
		completePattern.setCondition(n);
		TrueElement t = factory.createTrueElement();
		n.setCondition(t);
		
		CountCondition countCondition = factory.createCountCondition();
		n.setCondition(countCondition);		
		
		CountPattern countPattern = countCondition.getCountPattern();

		NumberElement numberElement = factory.createNumberElement();

		countCondition.setArgument2(numberElement);
		
		Node returnInCPattern = countPattern.getGraph().getReturnNodes().get(0);
		Node nextToElement2InCPattern = graphstructureFactory.createNode();
		nextToElement2InCPattern.setGraph(countPattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countPattern.getGraph());
		relation.setSource(returnInCPattern);
		relation.setTarget(nextToElement2InCPattern);
		
		countPattern.getGraph().getReturnNodes().clear();
		countPattern.getGraph().getReturnNodes().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countPattern.setCondition(truecondition);
		
		completePattern.createXMLAdaption();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();		
		
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		UntypedParameterValue untypedParameterValue = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(2);
		TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text.setValue("demo:building");
		untypedParameterValue.replace(text);
				
		return completePattern;		
	}
	

	public static CompletePattern getPatternCountNextToExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).addPrimitiveComparison();
		Formula formula = factory.createFormula();
		completePattern.setCondition(formula);
		formula.setOperator(LogicalOperator.AND);		
		
		CountCondition countCondition = factory.createCountCondition();
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		formula.setCondition1(countCondition);
		formula.setCondition2(quantifiedCondition2);	
		
		CountPattern countPattern = factory.createCountPattern();
		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countPattern);
		countCondition.setArgument2(numberElement);
		
		Node returnInCPattern = countPattern.getGraph().getReturnNodes().get(0);
		Node nextToElement2InCPattern = graphstructureFactory.createNode();
		nextToElement2InCPattern.setGraph(countPattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(countPattern.getGraph());
		relation.setSource(returnInCPattern);
		relation.setTarget(nextToElement2InCPattern);
		
		Node element3 = graphstructureFactory.createNode();
		element3.setGraph(countPattern.getGraph());
		element3.addPrimitiveComparison();
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(countPattern.getGraph());
		relation2.setSource(nextToElement2InCPattern);
		relation2.setTarget(element3);
		
		countPattern.getGraph().getReturnNodes().clear();
		countPattern.getGraph().getReturnNodes().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countPattern.setCondition(truecondition);
		
		Node returnInQC = quantifiedCondition2.getGraph().getReturnNodes().get(0);
		Node nextToElement2InQC = graphstructureFactory.createNode();
		nextToElement2InQC.setGraph(quantifiedCondition2.getGraph());
		nextToElement2InQC.addPrimitiveComparison();
		
		Relation relation3 = graphstructureFactory.createRelation();
		relation3.setGraph(quantifiedCondition2.getGraph());
		relation3.setSource(returnInQC);
		relation3.setTarget(nextToElement2InQC);
		
		Condition truecondition2 = factory.createTrueElement();
		quantifiedCondition2.setCondition(truecondition2);
		
		completePattern.createXMLAdaption();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		quantifiedCondition2.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(1).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) countPattern.getGraph().getNodes().get(2).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(2).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) quantifiedCondition2.getGraph().getNodes().get(1).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) quantifiedCondition2.getGraph().getNodes().get(1).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
					
		UntypedParameterValue untypedParameterValue = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text.setValue("demo:data");
		untypedParameterValue.replace(text);	

		UntypedParameterValue untypedParameterValue2 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(4);
		TextLiteralParam text2 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text2.setValue("demo:building");
		untypedParameterValue2.replace(text2);		
		
		UntypedParameterValue untypedParameterValue3 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam text3 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text3.setValue("demo:name");
		untypedParameterValue3.replace(text3);		
	
		UntypedParameterValue untypedParameterValue4 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(8);
		TextLiteralParam text4 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text4.setValue("demo:painting");
		untypedParameterValue4.replace(text4);
		
		((NumberParam) completePattern.getParameterList().getParameters().get(3)).setValue(3.0);
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountNextToForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getPatternCountNextToExists();
		((QuantifiedCondition) ((Formula) pattern.getCondition()).getCondition2()).setQuantifier(Quantifier.FORALL);		
		return pattern;
	}
	
	
	public static CompletePattern getPatternCountNextToExistsNested() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).addPrimitiveComparison();
		QuantifiedCondition quantifiedCondition1 = factory.createQuantifiedCondition();
		Formula formula = factory.createFormula();
		completePattern.setCondition(quantifiedCondition1);
		quantifiedCondition1.setCondition(formula);
		formula.setOperator(LogicalOperator.AND);		
		
		Graph graph = quantifiedCondition1.getGraph();
		Node returnInQc1 = graph.getNodes().get(0);
		Node element1 = graphstructureFactory.createNode();
		element1.setGraph(graph);
		element1.addPrimitiveComparison();
		
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(returnInQc1);
		relation.setTarget(element1);
		
		CountCondition countCondition = factory.createCountCondition();
		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
		formula.setCondition1(countCondition);
		formula.setCondition2(quantifiedCondition2);	
		
		CountPattern countPattern = factory.createCountPattern();
		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countPattern);
		countCondition.setArgument2(numberElement);
		
		Node element1InCPattern = countPattern.getGraph().getNodes().get(1);
		Node nextToElement2InCPattern = graphstructureFactory.createNode();
		nextToElement2InCPattern.setGraph(countPattern.getGraph());
		nextToElement2InCPattern.addPrimitiveComparison();
		Node element3 = graphstructureFactory.createNode();
		element3.setGraph(countPattern.getGraph());
		element3.addPrimitiveComparison();
		
		Relation relation0 = graphstructureFactory.createRelation();
		relation0.setGraph(countPattern.getGraph());
		relation0.setSource(element1InCPattern);
		relation0.setTarget(nextToElement2InCPattern);
		
		Relation relation1 = graphstructureFactory.createRelation();
		relation1.setGraph(countPattern.getGraph());
		relation1.setSource(nextToElement2InCPattern);
		relation1.setTarget(element3);
		
		countPattern.getGraph().getReturnNodes().clear();
		countPattern.getGraph().getReturnNodes().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countPattern.setCondition(truecondition);
		
		Node element1InQC = quantifiedCondition2.getGraph().getNodes().get(1);
		Node nextToElement2InQC = graphstructureFactory.createNode();
		nextToElement2InQC.setGraph(quantifiedCondition2.getGraph());
		nextToElement2InQC.addPrimitiveComparison();
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(quantifiedCondition2.getGraph());
		relation2.setSource(element1InQC);
		relation2.setTarget(nextToElement2InQC);
		
		Condition truecondition2 = factory.createTrueElement();
		quantifiedCondition2.setCondition(truecondition2);
		
		completePattern.createXMLAdaption();
		quantifiedCondition1.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		countPattern.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		quantifiedCondition2.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();
		
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) completePattern.getGraph().getNodes().get(0).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) quantifiedCondition1.getGraph().getNodes().get(1).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) quantifiedCondition1.getGraph().getNodes().get(1).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) countPattern.getGraph().getNodes().get(2).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(2).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) countPattern.getGraph().getNodes().get(3).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) countPattern.getGraph().getNodes().get(3).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		((XmlProperty) quantifiedCondition2.getGraph().getNodes().get(2).getProperties().get(0)).getOption().getOptions().add(PropertyKind.TAG);
		((XmlProperty) quantifiedCondition2.getGraph().getNodes().get(2).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
		
		UntypedParameterValue untypedParameterValue = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text.setValue("demo:data");
		untypedParameterValue.replace(text);
		
		UntypedParameterValue untypedParameterValue2 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(2);
		TextLiteralParam text2 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text2.setValue("demo:building");
		untypedParameterValue2.replace(text2);
		
		
		UntypedParameterValue untypedParameterValue3 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(6);
		TextLiteralParam text3 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text3.setValue("demo:address");
		untypedParameterValue3.replace(text3);
		
		UntypedParameterValue untypedParameterValue4 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(8);
		TextLiteralParam text4 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text4.setValue("demo:city");
		untypedParameterValue4.replace(text4);
		
		UntypedParameterValue untypedParameterValue5 = (UntypedParameterValue) completePattern.getParameterList().getParameters().get(10);
		TextLiteralParam text5 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		text5.setValue("demo:name");
		untypedParameterValue5.replace(text5);
		
		((NumberParam) completePattern.getParameterList().getParameters().get(5)).setValue(1.0);
		
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountNextToForallNested() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternCountNextToExistsNested();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		((QuantifiedCondition) ((Formula) ((QuantifiedCondition) completePattern.getCondition()).getCondition()).getCondition2()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	
//	public static CompletePattern getPatternCountInQuantifiedConditionExistsNested() {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getPatternCountInExists();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		
//		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
//		quantifiedCondition.setCondition(quantifiedCondition2);
//		
//		Element singleElement2InGraph2 = graphstructureFactory.createNode();
//		singleElement2InGraph2.setPreviousElement(quantifiedCondition2.getGraph().getReturnElements().get(0).getNextElements().get(0));
//		
//		
//		Condition truecondition = factory.createTrueElement();
//		quantifiedCondition2.setCondition(truecondition);
//		
//		return completePattern;
//	}
	
//	public static CompletePattern getPatternCountInQuantifiedConditionForallNested() {
//		CompletePattern completePattern = getPatternCountInQuantifiedConditionExistsNested();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		quantifiedCondition.setQuantifier(Quantifier.FORALL);
//		return completePattern;		
//	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("COUNTPAT", getPatternCountInPatternFinal(), "/*[name()='demo:data' and count(./*[name()='demo:x']) = 0.0]"));
		testPairs.add(new PatternTestPair("COUNTEX", getPatternCountInExists(), "/*[name()='demo:data' and count(./*[name()='demo:building']) = 3.0]"));
		testPairs.add(new PatternTestPair("COUNTFOR", getPatternCountInForall(), "/*[name()='demo:data' and (every $x in /* satisfies $x[name()='demo:data' and count(./*[name()='demo:building']) = 3.0])]"));
		testPairs.add(new PatternTestPair("COUNTNEX", getPatternCountNextToExists(), "/*[name()='demo:data' and count(for $x in ./*[name()='demo:building'] for $y in $x/*[name()='demo:name'] return $x) = 3.0 and ./*[name()='demo:painting']]"));
		testPairs.add(new PatternTestPair("COUNTNFOR", getPatternCountNextToForall(), "/*[name()='demo:data' and count(for $x in ./*[name()='demo:building'] for $y in $x/*[name()='demo:name'] return $x) = 3.0]"));
		testPairs.add(new PatternTestPair("COUNTNOT", getPatternCountInNot(), "/*[not(count(./*[name()='demo:building']) = 0.0)]"));
		testPairs.add(new PatternTestPair("COUNTNEXNEST", getPatternCountNextToExistsNested(), "/*[name()='demo:data' and ./*[name()='demo:building' and count(for $x in ./*[name()='demo:address'] for $y in $x/*[name()='demo:city'] return $x) =1.0 and ./*[name()='demo:name']]]"));
		testPairs.add(new PatternTestPair("COUNTNFORNEST", getPatternCountNextToForallNested(), "/*[name()='demo:data' and ./*[name()='demo:building' and count(for $x in ./*[name()='demo:address'] for $y in $x/*[name()='demo:city'] return $x) =1.0]]"));
		
		return testPairs;
	}
}