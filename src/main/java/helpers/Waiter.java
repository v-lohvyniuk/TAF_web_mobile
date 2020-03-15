package helpers;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.JavascriptExecutor;

public class Waiter {

    public static void untilPageReady(){
        Selenide.Wait() //
                .until(dr -> (Boolean) ((JavascriptExecutor) dr).executeScript("return document.readyState == \"complete\""));
    }
}
