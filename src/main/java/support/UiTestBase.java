package support;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class UiTestBase extends TestBase {

    @BeforeAll
    public void configureDriver() {
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
