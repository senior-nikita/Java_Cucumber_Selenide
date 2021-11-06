package Steps;

import Pages.MainPage;
import Pages.SignInPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class SignInSteps {

    @Given("I click {string} link-button on Main page")
    public void clickButton(String buttonName) {
        MainPage.linkButtonClick(buttonName);
    }

    @Then("current URL is: {string}")
    public void currentUrlIs(String url) {
        Assert.assertEquals(url, WebDriverRunner.getWebDriver().getCurrentUrl());
    }

    @When("I sign in with username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String pass) {
        SignInPage.usernameInputFill(username);
        SignInPage.passwordInputFill(pass);
        SignInPage.buttonClick("Sign In");
    }

    @And("username {string} is displayed")
    public void usernameIsDisplayed(String username) {
        MainPage.checkUsernameDisplayed(username);
    }
}
