package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Keyboard {
    private static WebDriverWait wait;

    public void CheckKeys(WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[data-test='nav-key-press']"))));
        driver.findElement(By.cssSelector("[data-test='nav-key-press']")).click();
        WebElement body = driver.findElement(By.tagName("body"));
            body.sendKeys(Keys.ARROW_DOWN);
            body.sendKeys(Keys.ARROW_UP);
            body.sendKeys(Keys.CONTROL);
            body.sendKeys(Keys.ENTER);

        WebElement Performed = driver.findElement(By.cssSelector("[data-test='key-history']"));
        System.out.println("Added data :" + "\n" +Performed.getText());
    }
}
