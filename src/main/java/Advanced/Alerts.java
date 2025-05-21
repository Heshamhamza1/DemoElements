package Advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {
    public static WebDriverWait wait;
    public static WebDriver driver;

    public void GetAlerts(WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='nav-alerts']")))).click();

        WebElement getalert = driver.findElement(By.cssSelector("[data-test='alert-button'"));
        getalert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement alertresult = driver.findElement(By.cssSelector("[data-test='result-container'"));
        System.out.println(alertresult.getText());
        WebElement showconfirm = driver.findElement(By.cssSelector("[data-test='confirm-button'"));
        showconfirm.click();
        alert.accept();
        System.out.println(alertresult.getText());
        WebElement showprompt = driver.findElement(By.cssSelector("[data-test='prompt-button'"));
        showprompt.click();
        alert.sendKeys("aaaaaaa");
        alert.accept();
        System.out.println(alertresult.getText());
    }
}
