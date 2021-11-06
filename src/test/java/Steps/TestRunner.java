package Steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/ecp_user/workspace/self repos/Java_Cucumber_Selenide/src/test/java/Features/SignInFeature.feature",
        plugin = {"pretty", "html:report.html"}
)

public class TestRunner {

}