package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class ExitIntent {
    public static WebDriverWait wait;
    public static WebDriver driver;
    public void PerformExitIntent(WebDriver driver) throws AWTException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='nav-exit-intent']")))).click();
        Robot robot = new Robot();
        robot.mouseMove(600, 0);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='exit-modal'")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='close-modal']")))).click();
    }
}
