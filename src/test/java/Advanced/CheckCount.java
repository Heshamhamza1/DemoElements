package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckCount {
    public static WebDriverWait wait;
    public static WebDriver driver;
    public void getCount(WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='nav-ab-testing']")))).click();
        for (int i = 0 ; i < 5 ; i++) {
            driver.findElement(By.cssSelector("[data-test='variant-button']")).click();
        }
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div/div/div[2]"));
        for (WebElement a  : list)
        {
            a = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div/div/div[2]/ul/li[2]"));
                System.out.println(a.getText());
        }
    }

}
