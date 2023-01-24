package junittests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import qualitypatternmodel.cypherclasstests.TestSuiteClassTests;
import qualitypatternmodel.cyphertranslationtests.CypherTestSuiteTranslationWithDbTests;
import qualitypatternmodel.cyphertranslationtests.CypherTestSuiteTranslationWithoutDbTests;

@Suite
@SuiteDisplayName("Component/Systemt-TestSuite")
@SelectClasses({
				TestSuiteClassTests.class, 
				CypherTestSuiteTranslationWithDbTests.class,
				CypherTestSuiteTranslationWithoutDbTests.class
			})
public class Neo4JUnitTests {
	
}