package qualitypatternmodel.evaluation;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalAppDup {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getAppDup2Generic());
		completePatterns.add(getAppDup3Generic());
		completePatterns.add(getAppDupCountGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}

	public static CompletePattern getAppDup2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("main");
		
		ComplexNode main = (ComplexNode) completePattern.getGraph().getReturnNodes().get(0);
		ComplexNode other = graphFactory.createComplexNode();
		other.setName("other");
		other.setReturnNode(true);
		other.setGraph(completePattern.getGraph());
		Comparison c = main.addComparison(other);
		
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);
		
		Graph g1 = qc1.getGraph();
		Node main1 = g1.getNodes().get(0);
		Node other1 = g1.getNodes().get(1);
		
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);
		
		Node n1 = main1.addOutgoing().getTarget().makePrimitive();
		other1.addOutgoing(n1);

		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		qc1.setCondition(qc2);
		
		Graph g2 = qc2.getGraph();
		Node main2 = g2.getNodes().get(0);
		Node other2 = g2.getNodes().get(1);
		
		Node n2 = main2.addOutgoing().getTarget().makePrimitive();
		other2.addOutgoing(n2);
		
		return completePattern;
	}

	public static CompletePattern getAppDup3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = getAppDup2Generic();

		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) qc1.getCondition();
		
		QuantifiedCondition qc3 = factory.createQuantifiedCondition();
		qc2.setCondition(qc3);
		
		Graph g2 = qc3.getGraph();
		Node main2 = g2.getNodes().get(0);
		Node other2 = g2.getNodes().get(1);
		
		Node n2 = main2.addOutgoing().getTarget().makePrimitive();
		other2.addOutgoing(n2);
		
		return completePattern;
	}

	public static CompletePattern getAppDupCountGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		Node main = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		ComplexNode other = graphFactory.createComplexNode();
		other.setGraph(completePattern.getGraph());
		other.setName("other");
		other.setReturnNode(true);
		
		Comparison c = main.addComparison(other);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
				
		CountCondition cc = factory.createCountCondition();
		completePattern.setCondition(cc);
		cc.createCountPattern();
		CountPattern cp = cc.getCountPattern();
		Graph g = cp.getGraph();
		
		Node n1 = g.getNodes().get(0);
		Node n2 = g.getNodes().get(1);
		Node n3 = n1.addOutgoing().getTarget().makePrimitive();
		n1.setReturnNode(false);
		n3.setReturnNode(true);
		n2.addOutgoing(n3);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		cc.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(10.);
		cc.getOption().setValue(ComparisonOperator.GREATER);
		
		return completePattern;		
	}
}
