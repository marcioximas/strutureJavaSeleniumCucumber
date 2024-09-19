package runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"src/test/java/stepDefinitions", "src/test/java/utility"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:cucumber.json"},
        monochrome = true
)
public class TestRunner {

}
