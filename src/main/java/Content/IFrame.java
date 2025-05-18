package Content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class IFrame {
    WebDriverWait wait;

    public void iframe(WebDriver driver) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement navIframeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='nav-iframes']")));
        navIframeButton.click();

        WebElement firstIframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='iframe-iframe1']")));
        driver.switchTo().frame(firstIframe);

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
        button.click();
        driver.switchTo().defaultContent();
    }
    public void iframe2(WebDriver driver)
    {
        driver.switchTo().defaultContent();
        WebElement secondFrame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='iframe-iframe2']")));
        driver.switchTo().frame(secondFrame);

        WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
        button1.click();
        driver.switchTo().defaultContent();
        List <WebElement> E = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div/div/div[2]/ul"))));
        for (WebElement s : E)
        {
            System.out.println(s.getText());
        }
    }
}
