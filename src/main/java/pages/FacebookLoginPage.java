package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import support.BaseGuiceModule;

import static com.codeborne.selenide.Selenide.*;

public class FacebookLoginPage {

    public SelenideElement getEmailInput(){
        return $(By.id("email"));
    }

    public SelenideElement getPasswordInput(){
        return $(By.id("pass"));
    }
}
