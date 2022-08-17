package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl;
import qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import static qualitypatternmodel.xmltranslationtests.Test00.*;

public class CypherTest00 {
	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
//				completePattern.isValid(AbstractionLevel.CONCRETE); // TODO: allow technology-dependent validation
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateCypher());
			} catch (Exception e) {
				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternCondConcrete("2022-12-31")); //--> adapte
		//completePatterns.add(getBasePatternMatchConcrete("^2022")); //--> adapte
		//completePatterns.add(getBasePatternMatchNotConcrete("^2022")); //--> adapte
		CypherTest00.test(completePatterns);
	}
	
	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern(); //PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePattern() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		Node node2 = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode1, node2);
	
		return completePattern;
		
//		LinkedList<TextLiteralParamImpl> labelList = new LinkedList<TextLiteralParamImpl>();
//		TextLiteralParamImpl t = new TextLiteralParamImpl();
//		t.setValue("Regesta");
//		labelList.add(t);
//		((NeoNodeImpl) complexNode1).setLabel(labelList);
		
	}	
	
	
	//More adaption needed
	public static CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);
		NeoEdge relation = (NeoEdge) completePattern.getGraph().getRelations().get(0);
//		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
//		((RdfSinglePredicate) relation.getRdfPathParam().getRdfPathPart()).setIriParam(iriParam);
//		iriParam.setPrefix("wdt");
//		iriParam.setSuffix("P569");
		return completePattern;	
	}
	
	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveComparison(comp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
}
