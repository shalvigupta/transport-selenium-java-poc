package commonUtils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHtmlReport"},
        glue = {"stepdefs","commonUtils"},
        features = {"src/test/resource"}
)
public class RunCukesTest {


}
