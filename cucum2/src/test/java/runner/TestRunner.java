package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resources//Login//Login.feature"},
glue= {"StepDefinition"},
dryRun = false,
plugin = {"html:testoutput/anant1.html","junit:testoutput/anant2.xml","json:testoutput/anant3.json"})


public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}