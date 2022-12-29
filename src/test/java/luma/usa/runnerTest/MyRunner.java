package luma.usa.runnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	plugin = { "pretty","json:target/cucumber.json" }, 
	features = ".//Features/", 
	glue = {"luma.usa.stepDefinition","luma.usa.hoosTest"},
	tags = "@Sanity", 
	monochrome = true,
	dryRun = false
		
		)
		
public class MyRunner extends AbstractTestNGCucumberTests {

	
}
