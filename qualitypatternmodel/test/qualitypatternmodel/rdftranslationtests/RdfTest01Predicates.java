package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.adaptionrdf.RdfSequence;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.RdfXor;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class RdfTest01Predicates {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getSinglePredicatePattern());
		completePatterns.add(getSinglePredicateUriPattern());
		completePatterns.add(getSinglePredicateZeroOrOnePattern());
		completePatterns.add(getSinglePredicateZeroPlusPattern());
		completePatterns.add(getSinglePredicateOnePlusPattern());
		completePatterns.add(getWildcardPattern());
		completePatterns.add(getSequencePattern());
		completePatterns.add(getSequenceZeroOrOnePattern());
		completePatterns.add(getXorPattern());
		RdfTest00.test(completePatterns);
	}
	
	public static CompletePattern getBasePatternPredicates() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		completePattern.createRdfAdaption();
		return completePattern;
	}
	
	public static CompletePattern getSinglePredicateZeroOrOnePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		RdfSinglePredicate rdfSinglePredicate = (RdfSinglePredicate) relation.getRdfPathParam();
		rdfSinglePredicate.setIriParam(iriParam);
		rdfSinglePredicate.setQuantifier(RdfQuantifier.ZERO_OR_ONE);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P569");
		
		return completePattern;		
	}
	
	public static CompletePattern getSinglePredicateZeroPlusPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		RdfSinglePredicate rdfSinglePredicate = (RdfSinglePredicate) relation.getRdfPathParam();
		rdfSinglePredicate.setIriParam(iriParam);
		rdfSinglePredicate.setQuantifier(RdfQuantifier.ZERO_PLUS);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P569");
		return completePattern;		
	}
	
	public static CompletePattern getSinglePredicateOnePlusPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		RdfSinglePredicate rdfSinglePredicate = (RdfSinglePredicate) relation.getRdfPathParam();
		rdfSinglePredicate.setIriParam(iriParam);
		rdfSinglePredicate.setQuantifier(RdfQuantifier.ONE_PLUS);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P569");
		return completePattern;		
	}
	
	public static CompletePattern getSinglePredicatePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		((RdfSinglePredicate) relation.getRdfPathParam()).setIriParam(iriParam);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P569");
		return completePattern;		
	}
	
	public static CompletePattern getSinglePredicateUriPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		((RdfSinglePredicate) relation.getRdfPathParam()).setIriParam(iriParam);
		iriParam.setUri("thisisatesturi");
		return completePattern;		
	}
	
	public static CompletePattern getWildcardPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		return completePattern;		
	}
	
	public static CompletePattern getSequencePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		
		RdfSequence seq = AdaptionrdfFactory.eINSTANCE.createRdfSequence();
		relation.setRdfPathParam(seq);
		
		RdfSinglePredicate pred = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred.setIriParam(iriParam);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P19");
		
		RdfSinglePredicate pred2 = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred2);
		IriParam iriParam2 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred2.setIriParam(iriParam2);
		iriParam2.setPrefix("wdt");
		iriParam2.setSuffix("P361");
		
		
		return completePattern;		
	}
	
	public static CompletePattern getSequenceZeroOrOnePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		
		RdfSequence seq = AdaptionrdfFactory.eINSTANCE.createRdfSequence();
		relation.setRdfPathParam(seq);
		seq.setQuantifier(RdfQuantifier.ZERO_OR_ONE);
		
		RdfSinglePredicate pred = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred.setIriParam(iriParam);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P19");
		
		RdfSinglePredicate pred2 = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred2);
		IriParam iriParam2 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred2.setIriParam(iriParam2);
		iriParam2.setPrefix("wdt");
		iriParam2.setSuffix("P361");
		
		
		return completePattern;		
	}
	
	public static CompletePattern getXorPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		
		RdfXor seq = AdaptionrdfFactory.eINSTANCE.createRdfXor();
		relation.setRdfPathParam(seq);
		
		RdfSinglePredicate pred = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred.setIriParam(iriParam);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P19");
		
		RdfSinglePredicate pred2 = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
		seq.getItems().add(pred2);
		IriParam iriParam2 = AdaptionrdfFactory.eINSTANCE.createIriParam();
		pred2.setIriParam(iriParam2);
		iriParam2.setPrefix("wdt");
		iriParam2.setSuffix("P361");
		
		
		return completePattern;		
	}
	


}
