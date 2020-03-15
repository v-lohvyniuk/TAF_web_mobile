package pages;

import com.codeborne.selenide.Condition;
import helpers.Waiter;
import org.openqa.selenium.By;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    public List<String> getValidationErrors() {
        Waiter.untilPageReady();
        return $$(By.xpath("//*[@role='alert']"))
                .filter(Condition.visible) //
                .texts() //
                .stream() //
                .map(this::unescapeString) //
                .collect(Collectors.toList());
    }

    private String unescapeString(String string) {
        try {
            return new String(string.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new RuntimeException("Cannot unescape string : " + string);
        }
    }
}
