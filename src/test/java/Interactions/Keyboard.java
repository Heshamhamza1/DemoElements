package Interactions;

import BaseClass.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Keyboard extends BaseClass {
    public Keyboard(WebDriver driver) {
        super(driver);
    }

    public void CheckKeys(WebDriver driver)
    {
         waitForElement("css", "[data-test='nav-key-press']", "clickable",10).click();

            WebElement body = Element("tag", "body");
            body.sendKeys(Keys.ARROW_DOWN);
            body.sendKeys(Keys.ARROW_UP);
            body.sendKeys(Keys.CONTROL);
            body.sendKeys(Keys.ENTER);

        WebElement Performed = waitForElement("css", "[data-test='key-history']", "visible", 1);
        print("Added data :" + "\n" +Performed.getText());
    }
}
