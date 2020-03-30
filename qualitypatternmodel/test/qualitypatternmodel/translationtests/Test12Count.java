package qualitypatternmodel.translationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class Test12Count {
	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternCountAsPatternCondition());	
		completePatterns.add(getPatternCountAsQuantifiedConditionExistsCondition());	
		completePatterns.add(getPatternCountAsQuantifiedConditionForallCondition());	
		// TODO: getPatternCountAsFormulaCondition
		// TODO: getPatternCountAsNotConditionCondition
		
//		completePatterns.add(getPatternCountInQuantifiedConditionExists());
//		completePatterns.add(getPatternCountInQuantifiedConditionForall());
//		completePatterns.add(getPatternCountInQuantifiedConditionExistsNested());
//		completePatterns.add(getPatternCountInQuantifiedConditionForallNested());
//		completePatterns.add(getPatternCountInQuantifiedConditionExistsIntermediateElementNested());
//		completePatterns.add(getPatternCountInQuantifiedConditionExistsIntermediateAndFollowingElementNested());
		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternCountAsPatternCondition() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		
		CountCondition countCondition = factory.createCountCondition();
		completePattern.setCondition(countCondition);		
		
		CountPattern countpattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setArgument1(countpattern);
		countCondition.setArgument2(numberElement);
		
		Element returnInCPattern = countpattern.getGraph().getReturnElements().get(0);
		Element nextToReturnInCPattern = graphstructureFactory.createElement();
		nextToReturnInCPattern.setPreviousElement(returnInCPattern);
		
		countpattern.getGraph().getReturnElements().clear();
		countpattern.getGraph().getReturnElements().add(nextToReturnInCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountAsQuantifiedConditionExistsCondition() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		CountCondition countCondition = factory.createCountCondition();
		quantifiedCondition.setCondition(countCondition);		
		
		CountPattern countpattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setArgument1(countpattern);
		countCondition.setArgument2(numberElement);
		
		Element returnInCPattern = countpattern.getGraph().getReturnElements().get(0);
		Element element2InCPattern = returnInCPattern.getNextElements().get(0);
		Element nextToElement2InCPattern = graphstructureFactory.createElement();
		nextToElement2InCPattern.setPreviousElement(element2InCPattern);
		
		countpattern.getGraph().getReturnElements().clear();
		countpattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
		
		Condition truecondition = factory.createTrueElement();
		countpattern.setCondition(truecondition);
		
		return completePattern;
	}
	
	public static CompletePattern getPatternCountAsQuantifiedConditionForallCondition() {
		CompletePattern completePattern = getPatternCountAsQuantifiedConditionExistsCondition();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}
	
//	public static CompletePattern getPatternCountInQuantifiedConditionExists() {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = Test03Quantor.getPatternExists();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		
//		CountCondition countCondition = factory.createCountCondition();
//		quantifiedCondition.setCountCondition(countCondition);	
//		
//		CountPattern countpattern = factory.createCountPattern();
//
//		NumberParam numberParam = parametersFactory.createNumberParam();
//		NumberElement numberElement = factory.createNumberElement();
//		numberElement.setNumberParam(numberParam);
//		countCondition.setArgument1(countpattern);
//		countCondition.setArgument2(numberElement);
//		
//		Element returnInCPattern = countpattern.getGraph().getReturnElements().get(0);
//		Element element2InCPattern = returnInCPattern.getNextElements().get(0);
//		Element nextToElement2InCPattern = graphstructureFactory.createElement();
//		nextToElement2InCPattern.setPreviousElement(element2InCPattern);
//		
//		countpattern.getGraph().getReturnElements().clear();
//		countpattern.getGraph().getReturnElements().add(nextToElement2InCPattern);
//		
//		Condition truecondition = factory.createTrueElement();
//		countpattern.setCondition(truecondition);
//		
//		return completePattern;
//	}
//	
//	public static CompletePattern getPatternCountInQuantifiedConditionForall() {
//		CompletePattern completePattern = getPatternCountInQuantifiedConditionExists();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		quantifiedCondition.setQuantifier(Quantifier.FORALL);
//		return completePattern;
//	}
//	
//	public static CompletePattern getPatternCountInQuantifiedConditionExistsNested() {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getPatternCountInQuantifiedConditionExists();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		
//		QuantifiedCondition quantifiedCondition2 = factory.createQuantifiedCondition();
//		quantifiedCondition.setCondition(quantifiedCondition2);
//		
//		Element singleElement2InGraph2 = graphstructureFactory.createElement();
//		singleElement2InGraph2.setPreviousElement(quantifiedCondition2.getGraph().getReturnElements().get(0).getNextElements().get(0));
//		
//		
//		Condition truecondition = factory.createTrueElement();
//		quantifiedCondition2.setCondition(truecondition);
//		
//		return completePattern;
//	}
//	
//	public static CompletePattern getPatternCountInQuantifiedConditionForallNested() {
//		CompletePattern completePattern = getPatternCountInQuantifiedConditionExistsNested();
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		quantifiedCondition.setQuantifier(Quantifier.FORALL);
//		return completePattern;		
//	}
//	
////	public static CompletePattern getPatternCountInQuantifiedConditionExistsIntermediateElementNested() {
////		PatternstructurePackage.eINSTANCE.eClass();
////		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
////		
////		GraphstructurePackage.eINSTANCE.eClass();
////		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
////		
////		CompletePattern completePattern = getPatternCountInQuantifiedConditionExistsNested();
////		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
////		
////		CountPattern countPattern = ((Count) quantifiedCondition.getCountCondition().getArgument1()).getPattern();
////		Element element1 = countPattern.getGraph().getReturnElements().get(0);
////		Element element2 = graphstructureFactory.createElement();
////		element2.setPreviousElement(element1);
////		countPattern.getGraph().getReturnElements().remove(element1);
////		countPattern.getGraph().getReturnElements().add(element2);
////		
////		
////		return completePattern;
////	}
////	
////	public static CompletePattern getPatternCountInQuantifiedConditionExistsIntermediateAndFollowingElementNested() {
////		PatternstructurePackage.eINSTANCE.eClass();
////		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
////		
////		GraphstructurePackage.eINSTANCE.eClass();
////		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
////		
////		CompletePattern completePattern = getPatternCountInQuantifiedConditionExistsIntermediateElementNested();
////		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
////		
////		CountPattern countPattern = ((Count) quantifiedCondition.getCountCondition().getArgument1()).getPattern();
////		Element element2 = countPattern.getGraph().getReturnElements().get(0);
////		Element element3 = graphstructureFactory.createElement();
////		element3.setPreviousElement(element2);	
////		
////		return completePattern;
////	}
}