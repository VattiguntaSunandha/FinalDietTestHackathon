package runner;

    import io.cucumber.testng.CucumberOptions;
	import org.testng.annotations.Test;


	//@RunWith(Cucumber.class)
	@Test
	@CucumberOptions(
		  plugin = {"pretty", "html:target/cucumber.html"},
		  monochrome=true, 
		  features = {"src/test/resources/features"}, 
		  tags = "@Functional",
		  glue= {"MorbidityAPI","GetUserAPI","RecipesAPI","UserAPI","AppHooks"},
	      dryRun = false,
		  publish = true)

	public class SanityTestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests
	{
		 
	}



