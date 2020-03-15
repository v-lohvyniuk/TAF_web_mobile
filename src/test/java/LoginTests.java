import business.actions.LoginAction;
import business.asserts.LoginAsserts;
import helpers.PageNavigator;
import models.User;
import org.junit.jupiter.api.Test;
import support.UiTestBase;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class LoginTests extends UiTestBase {

    User validUser = new User("volodymyr.lohvyniuk@gmail.com", "asdsdefsdfwed");
    User userWithoutEmail = new User("", "Vovazjambo18");
    @Inject
    private LoginAction loginAction;
    @Inject
    private LoginAsserts loginAsserts;
    @Inject
    private PageNavigator pageNavigator;

    @Test
    public void login_positive_TC() {
        loginAction.login(validUser);
        loginAsserts.assertUserIsLoggedIn();
    }

    @Test
    public void login_negative_TC() {
        loginAction.login(userWithoutEmail);

        List<String> expectedErrorTexts = new ArrayList<>();
        expectedErrorTexts.add("The email or phone number you’ve entered doesn’t match any account. Sign up for an account.");
        loginAsserts.assertValidationErrorsTexts(expectedErrorTexts);

        pageNavigator.navigateBack();
        loginAction.login(validUser);

        loginAsserts.assertUserIsLoggedIn();
    }
}
