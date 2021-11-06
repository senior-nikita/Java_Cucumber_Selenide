package Steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Hooks {
    @Before
    public void setTimeout(){
        Configuration.pageLoadTimeout = 15000;  //wait loading of pages for 15 secs
    }
}
