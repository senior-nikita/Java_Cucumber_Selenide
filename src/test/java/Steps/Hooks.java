package Steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import dataProviders.ConfigFileReader;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    ConfigFileReader configFileReader = new ConfigFileReader();

    @Before
    public void setTimeout(){
        Configuration.pageLoadTimeout = 15000;  //wait loading of pages for 15 secs
   }

    //open main page before UI test execution
   @Before("@UI")
    public void openMainPage(){
       Configuration.baseUrl = configFileReader.getApplicationUrl();    //set base url value from config-file
       Configuration.pageLoadStrategy = "eager";   //because main page is loading by WebDriver infinitely :(
       open("/");
       Configuration.pageLoadStrategy = "normal";  //return default value
   }
}
