package business.actions;

import helpers.PageNavigator;
import models.User;
import pages.LoginRegisterPage;

import javax.inject.Inject;

public class LoginAction {

    @Inject
    private LoginRegisterPage loginRegisterPage;
    @Inject
    private PageNavigator pageNavigator;

    public void login(User user){
        pageNavigator.navigateTo("https://facebook.com");
        loginRegisterPage.getEmailInput().sendKeys(user.getLogin());
        loginRegisterPage.getPasswordInput().sendKeys(user.getPassword());
        loginRegisterPage.clickOnLoginButton();
    }
}
