import java.util.ArrayList;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.inputfields.*;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.exceptions.*;

public class test05_quantorcombinations_cond {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getPatternExistsInExistsCond());
		patterns.add(getPatternForallInExistsCond());
		patterns.add(getPatternExistsInForallCond());
		patterns.add(getPatternForallInForallCond());

		test00.test(patterns);
	}

	public static Pattern getPatternExistsInExistsCond() {
		// Factory
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
		InputfieldsPackage.eINSTANCE.eClass();
		InputfieldsFactory inputFactory = InputfieldsFactory.eINSTANCE;
		
		// PatternStructure
		Pattern pattern = test04_quantorcombinations.getPatternExistsInExists();
		VariableList varlist = pattern.getVariableList();
		Graph graph = ((QuantifiedCondition)((QuantifiedCondition) pattern.getCondition()).getCondition()).getGraph();
		OperatorList oplist = graph.getOperatorList();
		
		// Property
		SingleElement se = graph.getRootElement().getNextSingle().get(0).getNextSingle().get(0).getNextSingle().get(0);
		Property prop = graphFactory.createProperty();
		se.getProperties().add(prop);
//		prop.getAttributeName().setValue("abc");
		
		// Comparison
		Comparison comp = functionFactory.createComparison();
		oplist.add(comp);
		
		TextLiteral tl = inputFactory.createTextLiteral();
		varlist.add(tl);
		tl.setValue("def");		
		
		comp.setArgument1(prop);
		comp.setArgument2(tl);
		
		return pattern;
	}
	
	public static Pattern getPatternForallInExistsCond() {
		Pattern pattern = getPatternExistsInExistsCond();
		((QuantifiedCondition)((QuantifiedCondition) pattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;		
	}

	public static Pattern getPatternExistsInForallCond() {
		Pattern pattern = getPatternExistsInExistsCond();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	public static Pattern getPatternForallInForallCond() {
		Pattern pattern = getPatternForallInExistsCond();
		((QuantifiedCondition) pattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return pattern;
	}
	
}
