package qualitypatternmodel.evaluationquality;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;

import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests.CypherTest11CountCondition;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalCard {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getCard2Generic());
		completePatterns.add(getCard2PlusGeneric());
		completePatterns.add(getCard2CondGeneric());
		completePatterns.add(getCard2CondPlusGeneric());
		
		for (CompletePattern cp: completePatterns) {
			Test00.printGenericPatternExampleXQuery(cp);			
		}
	}
	
	public static CompletePattern getCard2Generic() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		// Context graph of pattern:
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(countCondition);
		
		// Graph of quantified condition:
		countCondition.createCountPattern();
		Node element0Copy = countCondition.getCountPattern().getGraph().getReturnNodes().get(0);
		
		
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		
		element0Copy.addOutgoing().getTarget(); //.makePrimitive();
		
		return completePattern;	
	}
	
	public static CompletePattern getCard2PlusGeneric() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		
		Node e0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
//		e0.addOutgoing().getTarget().addPrimitiveComparison();
		
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		completePattern.setCondition(countCondition);
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		NumberElement numberElement = patternStructureFactory.createNumberElement();
		countCondition.setArgument2(numberElement);
//		NumberParam numberParam = parametersFactory.createNumberParam();
		numberElement.getNumberParam().setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);		
		
		Graph graph2 = countPattern.getGraph();
		
		Node e1g2 = e0.getOutgoingMappings().get(0).getTarget();
		Node e2g2 = e1g2.addOutgoing().getTarget().makeComplex();
		graph2.getReturnNodes().get(0).setReturnNode(false);
		e2g2.setReturnNode(true);
//		e2g2.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition quantifiedCondition2 = patternStructureFactory.createQuantifiedCondition();
		countPattern.setCondition(quantifiedCondition2);
		Node e2g3 = e2g2.getOutgoingMappings().get(0).getTarget();
		e2g3.addOutgoing().getTarget();
				
		return completePattern;
	}
	
	
	public static CompletePattern getCard2CondGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		Node r = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		r.addOutgoing().getTarget().addPrimitiveComparison();
		
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(countCondition);
		
		countCondition.createCountPattern();
		ComplexNode element0Copy = countCondition.getCountPattern().getGraph().getReturnNodes().get(0).makeComplex();
				
		element0Copy.addOutgoing().getTarget().addPrimitiveComparison();
		
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		
		return completePattern;	
	}
	
	public static CompletePattern getCard2CondPlusGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory patternStructureFactory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		
		Node e0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		e0.addOutgoing().getTarget().addPrimitiveComparison();
		
		CountCondition countCondition = patternStructureFactory.createCountCondition();
		completePattern.setCondition(countCondition);
		CountPattern countPattern = patternStructureFactory.createCountPattern();
		countCondition.setCountPattern(countPattern);

		NumberElement numberElement = patternStructureFactory.createNumberElement();
		countCondition.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(1.0);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);		
		
		Graph graph2 = countPattern.getGraph();
		
		Node e1g2 = e0.getOutgoingMappings().get(0).getTarget();
		Node e2g2 = e1g2.addOutgoing().getTarget().makeComplex();
		graph2.getReturnNodes().get(0).setReturnNode(false);
		e2g2.setReturnNode(true);
		e2g2.addOutgoing().getTarget().addPrimitiveComparison();
		

		QuantifiedCondition quantifiedCondition2 = patternStructureFactory.createQuantifiedCondition();
		countPattern.setCondition(quantifiedCondition2);
		Node e2g3 = e2g2.getOutgoingMappings().get(0).getTarget();
		e2g3.addOutgoing().getTarget().addPrimitiveComparison();
				
		return completePattern;
	}
	
	public static CompletePattern getCARD1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest11CountCondition.getComplexBasePattern();
		completePattern.getGraph().getReturnNodes().get(0).setName("Return");
		
		CountCondition countCond = PatternstructureFactory.eINSTANCE.createCountCondition();
		countCond.setPattern(completePattern);
		
		PrimitiveNode primitiveNode = countCond.getCountPattern().getGraph().addPrimitiveNode();
		primitiveNode.setReturnNode(true);
		primitiveNode.setName("Property");
		countCond.getCountPattern().getGraph().addRelation((ComplexNode) countCond.getCountPattern().getGraph().getNodes().get(0), (Node) primitiveNode);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCond.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(0.);
				
		return completePattern;
	}

}
