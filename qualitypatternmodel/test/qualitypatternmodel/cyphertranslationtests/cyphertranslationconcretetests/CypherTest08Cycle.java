package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.cyphertranslationtests.CypherTranslationAbstract;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.patternstructure.CompletePattern;


public class CypherTest08Cycle extends CypherTranslationAbstract {
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CypherTest08Cycle cycle = new CypherTest08Cycle();
		cycle.generalizedTests();         
		cycle.generalizedInvalidtyExceptionTests(); 
    }

	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getCyclePattern(2));
        completePatterns.add(getCyclePattern(3));
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}
    
	private static CompletePattern getCyclePattern(int nodesInCycle) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		ComplexNode newNode0 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		ComplexNode[] newNode = new ComplexNode[nodesInCycle];
		for (int i = 0; i < nodesInCycle; i++) {
			newNode[i] = completePattern.getGraph().addComplexNode();
			if (i == 0) {
				completePattern.getGraph().addRelation(newNode0, newNode[i]);
			} else {
				completePattern.getGraph().addRelation(newNode[i - 1], newNode[i]);
			}
		}
		
		newNode0.addComparison(newNode[nodesInCycle - 1]);
		
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
}