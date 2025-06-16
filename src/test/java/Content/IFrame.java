package Content;

import BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IFrame extends BaseClass {

    public IFrame(WebDriver driver) {
        super(driver);
    }

    public void iframe(WebDriver driver) {

        waitForElement("css", "[data-test='nav-iframes']", "clickable", 10).click();

        WebElement firstIframe = waitForElement("css", "[data-test='iframe-iframe1']", "visible", 10);
        switchToFrame(firstIframe);

        waitForElement("tag", "button", "clickable", 10).click();
        switchToDefaultContent();
    }
    public void iframe2(WebDriver driver)
    {
        switchToDefaultContent();
        WebElement secondFrame = waitForElement("css", "[data-test='iframe-iframe2']", "visible", 10);
        switchToFrame(secondFrame);

        waitForElement("tag", "button", "clickable", 10).click();
        switchToDefaultContent();
        List <WebElement> E = waitForElements("xpath","//*[@id=\"root\"]/div/div[3]/main/div/div/div[2]/ul", "visible", 10);
        for (WebElement s : E)
        {
         print(s.getText());
        }
    }
}
