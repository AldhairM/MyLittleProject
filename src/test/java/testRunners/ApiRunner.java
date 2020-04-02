package testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/apiFeatureFile",
		glue = {"apiStepDefinitions"}
		
		)
public class ApiRunner extends AbstractTestNGCucumberTests{
	
}
