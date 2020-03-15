package pages;

import com.codeborne.selenide.SelenideElement;
import pages.widgets.Header;

import javax.inject.Inject;

public class HomePage {

    @Inject
    private Header header;

    public SelenideElement getProfilePic(){
        return header.getProfilePic();
    }
}
