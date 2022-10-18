package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public interface CypherTranslationeInterface {
	void buildPatterns(ArrayList<CompletePattern> completePatterns) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;
	void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;
}