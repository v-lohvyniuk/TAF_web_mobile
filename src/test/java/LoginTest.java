import org.junit.jupiter.api.Test;
import pages.FacebookLoginPage;

import javax.inject.Inject;

public class LoginTest {

    @Inject
    private FacebookLoginPage facebookLoginPage;

    @Test
    public void login_test_positive_TC(){
        facebookLoginPage.getEmailInput().sendKeys("volodymyr.lohvyniuk@gmail.com");
        facebookLoginPage.getPasswordInput().sendKeys("Vovazjambo18");
    }
}
