package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Slider {
    private WebDriverWait wait;
    public void slide(WebDriver driver){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nav = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[data-test='nav-slider']"))));
        nav.click();
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.cssSelector("[data-test='slider']"))).moveByOffset(390,0).perform();

        WebElement value = driver.findElement(By.cssSelector("[data-test='slider-value']"));
        System.out.println(value.getText());
    }
}
