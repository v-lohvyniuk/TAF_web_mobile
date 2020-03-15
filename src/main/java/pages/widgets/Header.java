package pages.widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class Header {

    public SelenideElement getProfilePic(){
        return $(By.xpath("//img[contains(@id, 'profile_pic_header')]"));
    }
}
