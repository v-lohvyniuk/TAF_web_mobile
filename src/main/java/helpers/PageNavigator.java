package helpers;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

public class PageNavigator {

    public void navigateTo(String pageUrl) {
        open(pageUrl);
    }

    public void navigateBack() {
        Selenide.back();
    }
}
