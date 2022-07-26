package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@Test
@CucumberOptions(
		features = "src/test/resources/features/RecipeAPIFeatures", 
		glue = {"RecipesAPI","AppHooks"}, 
		monochrome = true, dryRun = false,
		plugin = { "pretty", "html:target/cucumber-reports.html"},	
		publish = true)


public class GetRecipesTest extends io.cucumber.testng.AbstractTestNGCucumberTests {
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = false) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}

	
	
	

	
