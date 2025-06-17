package Advanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {
    public final static WebDriver driver=null;

    public WebDriverWait getwait() {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String print(String message) {
        System.out.println(message);  // Noncompliant, output directly to System.out without a logger
        return message;  // Return the message for further use
    }


    public void GetAlerts(WebDriver driver) {

        getwait().until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='nav-alerts']")))).click();

        WebElement getalert = driver.findElement(By.cssSelector("[data-test='alert-button'"));
        getalert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement alertresult = driver.findElement(By.cssSelector("[data-test='result-container'"));
        print(alertresult.getText());
        WebElement showconfirm = driver.findElement(By.cssSelector("[data-test='confirm-button'"));
        showconfirm.click();
        alert.accept();
        print(alertresult.getText());
        WebElement showprompt = driver.findElement(By.cssSelector("[data-test='prompt-button'"));
        showprompt.click();
        alert.sendKeys("aaaaaaa");
        alert.accept();
        print(alertresult.getText());
    }
}
