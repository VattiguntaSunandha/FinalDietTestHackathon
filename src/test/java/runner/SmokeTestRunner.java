package runner;

//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


//@RunWith(Cucumber.class)
@Test
@CucumberOptions(
	  plugin = {"pretty", "html:target/cucumber.html"},
	  monochrome=true, 
	  features = {"src/test/resources/features"}, 
	  tags = "@Smoke",
	  glue= {"MorbidityAPI","GetUserAPI","RecipesAPI","UserAPI","AppHooks"},
      dryRun = false,
	  publish = true)

public class SmokeTestRunner extends AbstractTestNGCucumberTests
{
	 
}

