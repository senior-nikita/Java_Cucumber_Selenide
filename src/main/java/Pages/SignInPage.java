package Pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage extends  BasicPage{

    private static final SelenideElement usernameInput = $(By.id("username"));
    private static final SelenideElement passwordInput = $(By.id("password"));
    private static final SelenideElement signInButton  = $(By.xpath("//button[text() = \"Sign In\"]"));

    public static void usernameInputFill(String usernameEmail){
        usernameInput.sendKeys(usernameEmail);
    }

    public static void passwordInputFill(String password){
        passwordInput.sendKeys(password);
    }

    //click button by text
    public static void buttonClick(String text){
        $(By.xpath("//button[text() = \"" + text + "\"]")).click();
    }
}
