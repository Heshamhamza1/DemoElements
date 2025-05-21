package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContextMenu {
    public static WebDriverWait wait;
    public static WebDriver driver;

    public void PerformRightClick(WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='nav-context-menu']")))).click();
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.cssSelector("[data-test='context-menu-trigger']"))).perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[data-test='context-menu']"))));
        driver.findElement(By.cssSelector("[data-test='context-menu-edit'")).click();
    }
}
