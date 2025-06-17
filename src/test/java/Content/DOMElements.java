package Content;

import BaseClass.BaseClass;
import org.openqa.selenium.*;

public class DOMElements extends BaseClass {

    public DOMElements(WebDriver driver) {
        super(driver);
    }
    public void FindDOM(WebDriver driver) throws InterruptedException {
        waitForElement("css", "[data-test='nav-shadow-dom']", "clickable", 5).click();

        WebElement Shadow = waitForElement("css", "[data-test='shadow-host']", "visible", 3);
        SearchContext root =Shadow.getShadowRoot();

        WebElement shadowButton = root.findElement(By.cssSelector("[data-test='shadow-button']"));
        shadowButton.click();

        Thread.sleep(1000);

        acceptAlert();

    }
}
