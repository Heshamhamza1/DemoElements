package Interactions;

import BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Dynamic extends BaseClass {

    public Dynamic(WebDriver driver) {
        super(driver);
    }


    public void task() {

        // Wait and click the navigation link
        WebElement element = waitForElement("css", "[data-test='nav-dynamic-elements']", "visible", 1);
        element.click();


        List<WebElement> list = waitForElements("css","[class*='space-y-2']", "present", 10);

        for (WebElement data : list) {
            print(data.getText());
            break;
        }
    }
}
