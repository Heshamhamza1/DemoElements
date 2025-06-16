package Interactions;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hover extends BaseClass {

    private Actions action;

    public Hover(WebDriver driver) {
        super(driver);
    }

    public void PerformHover(WebDriver driver)
    {
        WebElement nav =waitForElement("css", "[data-test='nav-hover']", "visible", 5);
        nav.click();
        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("[alt='Figure 1']"))).perform();

        WebElement hover1 = waitForElement("css", "div[data-test='hover-caption-1']", "visible", 5);
        print("First-Hover :" + hover1.getText());
    }
    public void PerformHover2(WebDriver driver)
    {

        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("[alt='Figure 2']"))).perform();

        WebElement hover2 = waitForElement("css", "div[data-test='hover-caption-2']", "visible", 5);
        print("second hover :" + hover2.getText());

    }
    public void PerformHover3(WebDriver driver)
    {
        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("[alt='Figure 3']"))).perform();
        WebElement hover3 = waitForElement("css", "div[data-test='hover-caption-3']", "visible", 1);
        print("Third hover :" + hover3.getText());

    }

}
