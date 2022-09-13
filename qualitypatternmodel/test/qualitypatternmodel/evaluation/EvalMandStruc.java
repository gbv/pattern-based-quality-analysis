package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalMandStruc {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getMandstrucGeneric());
		completePatterns.add(getMandstruc3Generic());
		completePatterns.add(getMandstruc3CondGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getMandstrucGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		g0.getReturnNodes().get(0).makeComplex();
		
		NotCondition not = factory.createNotCondition();
		completePattern.setCondition(not);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		not.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node return1 = g1.getReturnNodes().get(0).makeComplex();
		return1.addOutgoing().getTarget().makeComplex();
		return completePattern;
	}
	
	public static CompletePattern getMandstruc3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node n0 = g0.getReturnNodes().get(0).makeComplex();

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);
		
		Node n0g1 = n0.getOutgoingMappings().get(0).getTarget();
		Node n1g1 = n0g1.addOutgoing().getTarget().makeComplex();
		
		NotCondition not = factory.createNotCondition();
		qc1.setCondition(not);
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		not.setCondition(qc2);
		
		Node n1g2 = n1g1.getOutgoingMappings().get(0).getTarget(); 
		n1g2.addOutgoing().getTarget().makeComplex();
		return completePattern;
	}
	
	public static CompletePattern getMandstruc3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node n0 = g0.getReturnNodes().get(0).makeComplex();
		n0.addOutgoing().getTarget().addPrimitiveComparison();

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);
		
		Node n0g1 = n0.getOutgoingMappings().get(0).getTarget();
		Node n1g1 = n0g1.addOutgoing().getTarget().makeComplex();
		n1g1.addOutgoing().getTarget().addPrimitiveComparison();
		
		NotCondition not = factory.createNotCondition();
		qc1.setCondition(not);
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		not.setCondition(qc2);
		
		Node n1g2 = n1g1.getOutgoingMappings().get(0).getTarget(); 
		Node n2g2 = n1g2.addOutgoing().getTarget().makeComplex();
		n2g2.addOutgoing().getTarget().addPrimitiveComparison();
		return completePattern;
	}
}
