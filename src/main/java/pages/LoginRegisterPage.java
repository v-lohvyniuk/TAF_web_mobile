package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginRegisterPage {

    public SelenideElement getEmailInput() {
        return $(By.id("email"));
    }

    public SelenideElement getPasswordInput() {
        return $(By.id("pass"));
    }

    public void clickOnLoginButton() {
        getLoginButton().click();
    }

    private SelenideElement getLoginButton() {
        return $("[data-testid='royal_login_button']");
    }
}
