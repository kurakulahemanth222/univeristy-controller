package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {".//src//test//java"},
		glue = "stepdefinition",
		dryRun = false,
		monochrome = true,
		plugin= {
				"pretty"
		}
		)

public class Runner_University extends AbstractTestNGCucumberTests{

}
