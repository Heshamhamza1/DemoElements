package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hover {
    private static WebDriverWait wait;
    private Actions action;

    public void PerformHover(WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[data-test='nav-hover']"))));
        driver.findElement(By.cssSelector("[data-test='nav-hover']")).click();
        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("[alt='Figure 1']"))).perform();

        WebElement hover1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[data-test='hover-caption-1']")));
        System.out.println("First-Hover :" + hover1.getText());
    }
    public void PerformHover2(WebDriver driver)
    {
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("[alt='Figure 2']"))).perform();

        WebElement hover2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[data-test='hover-caption-2']")));
        System.out.println("Second-Hover :" + hover2.getText());
    }
    public void PerformHover3(WebDriver driver)
    {
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("[alt='Figure 3']"))).perform();
        WebElement hover3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[data-test='hover-caption-3']")));
        System.out.println("Second-Hover :" + hover3.getText());
    }

}
