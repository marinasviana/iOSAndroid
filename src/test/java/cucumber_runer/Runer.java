package cucumber_runer;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/feature", tags = "@equilatero", glue = "steps", monochrome = true, dryRun = false)
@CucumberOptions(features="src/test/java/feature", glue = "steps", plugin = {"pretty", "html:target/cucumber"})

public class Runer {
	
}
