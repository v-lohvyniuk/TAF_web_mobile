package business.asserts;

import com.codeborne.selenide.Condition;
import pages.HomePage;
import pages.LoginPage;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAsserts {

    @Inject
    private HomePage homePage;
    @Inject
    private LoginPage loginPage;

    public void assertUserIsLoggedIn() {
        homePage.getProfilePic().shouldBe(Condition.visible);
    }
    public void assertValidationErrorsTexts(List<String> expectedErrorTexts) {
        List<String> actualErrorTexts = loginPage.getValidationErrors();

        Collections.sort(expectedErrorTexts);
        Collections.sort(actualErrorTexts);

        assertEquals(expectedErrorTexts, actualErrorTexts, "Error texts are not equal");
    }
}
