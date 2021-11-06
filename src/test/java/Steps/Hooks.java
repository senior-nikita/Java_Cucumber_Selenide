package Steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setTimeout(){
        Configuration.pageLoadTimeout = 15000;  //wait loading of pages for 15 secs
   }
}
