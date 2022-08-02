package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.evaluation.EvalCompval;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalCompval {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompval2RdfAbstract());
		completePatterns.add(getCompvalWiki());
		RdfTest00.test(completePatterns);
		
	}
	
	public static CompletePattern getCompval2RdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCompval.getCompval2Generic();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompvalWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompval2RdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));

		DateParam dateValue = ParametersFactory.eINSTANCE.createDateParam();
		dateValue.setValue("2022-12-31");
		p0.replace(dateValue);
		p1.setValue(ComparisonOperator.GREATER);
		
		IriParam p4iri = new IriParamImpl();
		p4iri.setPrefix("wdt");
		p4iri.setSuffix("P569");
		((RdfSinglePredicate) p3.getRdfPathPart()).setIriParam(p4iri);
								
		return completePattern;
	}
}
