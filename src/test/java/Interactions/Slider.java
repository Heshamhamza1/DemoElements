package Interactions;

import BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Slider extends BaseClass {
    public Slider(WebDriver driver) {
        super(driver);
    }
    public void slide(WebDriver driver){

        waitForElement("css", "[data-test='nav-slider']", "clickable", 10).click();
        performAction("clickandhold",Element("css", "[data-test='slider']"), null);

        WebElement value = Element("css","[data-test='slider-value']");
        print(value.getText());
    }
}
