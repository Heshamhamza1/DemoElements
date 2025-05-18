package Content;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DOMElements {
    WebDriverWait wait;
    public void FindDOM(WebDriver driver) throws InterruptedException {
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement DOMButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='nav-shadow-dom']")));
        DOMButton.click();
        WebElement Shadow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='shadow-host']")));
        SearchContext root =Shadow.getShadowRoot();

        WebElement shadowButton = wait.until(
                ExpectedConditions.elementToBeClickable(root.findElement(By.cssSelector("[data-test='shadow-button']")))
        );

        shadowButton.click();


        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();

    }
}
