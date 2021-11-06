package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasicPage{

    private static final SelenideElement signInButton  = $(By.xpath("//a[text() = \"sign in\"]"));
    private static final SelenideElement usernameLabel = $(By.xpath("//div[@class = \"Dropdown NavbarUserMenu\"]/div/span[1]"));

    //click <a>-element, which is used as button, by text
    public static void linkButtonClick(String text){
        $(By.xpath("//a[text() = \"" + text + "\"]")).click();
    }

    //click button by text
    public static void buttonClick(String text){
        $(By.xpath("//button[text() = \"" + text + "\"]")).click();
    }

    public static void checkUsernameDisplayed(String username){
        Assert.assertEquals(username, usernameLabel.getOwnText());
    }
}
