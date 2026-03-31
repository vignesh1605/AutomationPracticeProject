package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature/practice.feature"},
        glue = {"StepDefination"},
        plugin = {"pretty",
                "html:target/testreports/cucumber-reports.html"},
        tags = "@TestCase18"

)

public class RegressionTestRunner {
}
