package runner;


import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;


@Test

	//@RunWith(Cucumber.class) 
	@CucumberOptions(features ="src/test/resources/features",
	glue= {"RecipesAPI","GetUserAPI","UserAPI","MorbidityAPI","AppHooks"},
	plugin={"pretty","json:target/cucumber.json"},
	
	//"rerun:target/failedrerun.txt","html:target/HtmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    monochrome = true,
	dryRun = false,
	publish = true)


	public class MasterTestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests 
	{
	
    }
	