package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;

import qualitypatternmodel.evaluation.EvalUnique;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalUnique {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getUniqueAbstract());
		completePatterns.add(getUniqueIdentifier());
		
		try {
			CypherQueryPrinter.queryPrinterSys(completePatterns);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static CompletePattern getUniqueAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalUnique.getUniqueCondGeneric();
		completePattern.createNeo4jAdaption();
		//Maybe add the BEGINNING for the CONDITIOAN
		return completePattern;
	}
	
	private static CompletePattern getUniqueComplexAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalUnique.getUniqueCondComplexGeneric();
		completePattern.createNeo4jAdaption();
		//Maybe add the BEGINNING for the CONDITIOAN
		return completePattern;
	}
	
	private static CompletePattern getUniqueIdentifier() {
		CompletePattern completePattern = null;
		
		return completePattern;
	}
	
}
