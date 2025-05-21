package Advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Notify {
    public static WebDriverWait wait;
    public static WebDriver driver;
    public void getNotifications(WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='nav-notifications']")))).click();
        driver.findElement(By.cssSelector("[data-test='add-success'")).click();
        WebElement data = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[data-test='notification-container']"))));
        System.out.println(data.getText());

    }
}
