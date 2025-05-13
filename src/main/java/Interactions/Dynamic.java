package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Dynamic {
    WebDriver driver;

    public Dynamic(WebDriver driver) {
        this.driver = driver;
    }

    public void task() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait and click the navigation link
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("[data-test='nav-dynamic-elements']")
        ));
        element.click();


        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.cssSelector("[class*='space-y-2']")
        ));

        for (WebElement data : list) {
            System.out.println(data.getText());
            break;
        }
    }
}
