package Advanced;

import BaseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class ExitIntent extends BaseClass {



    public ExitIntent(WebDriver driver) {
        super(driver);
    }

    public void PerformExitIntent(WebDriver driver) throws AWTException {
        waitForElement("css", "[data-test='nav-exit-intent']", "clickable", 10).click();
        Robot robot = new Robot();
        robot.mouseMove(600, 0);
        waitForElement("css", "[data-test='exit-modal']", "visible", 5);
        waitForElement("css", "[data-test='close-modal']", "clickable", 5);

    }
}
