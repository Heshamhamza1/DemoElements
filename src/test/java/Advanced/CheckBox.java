package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class CheckBox {

    public static WebDriverWait wait;
    public static WebDriver driver;
    public void PerformCheck(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the login button and click it
        WebElement CheckNav = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='nav-checkboxes']")));
        CheckNav.click();

        WebElement check1 = driver.findElement(By.cssSelector("[data-test='checkbox-checkbox1'"));
        WebElement check2 = driver.findElement(By.cssSelector("[data-test='checkbox-checkbox2'"));
        WebElement check3 = driver.findElement(By.cssSelector("[data-test='checkbox-checkbox3'"));
        List<WebElement> checkboxes = Arrays.asList(check1, check2, check3);
        for (WebElement checkbox : checkboxes) {
            if (checkbox.getAttribute("checked") == null) {
                checkbox.click();
            } else {
                System.out.println(checkbox +"is already checked");
            }
        }
    }
}
