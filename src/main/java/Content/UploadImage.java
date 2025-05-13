package Content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UploadImage {
    WebDriverWait wait;
    public void Image(WebDriver driver) {
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ImageButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='nav-broken-images']")));
        ImageButton.click();

        WebElement image1 = driver.findElement(By.cssSelector("[data-test='image-0'"));
        System.out.println(image1.getAttribute("src") + "\n" + "Image Found !");

        WebElement image2 = driver.findElement(By.cssSelector("[data-test='image-1'"));
        System.out.println(image2.getAttribute("src") + "\n" + "This image URL does not exist");

        WebElement image3 = driver.findElement(By.cssSelector("[data-test='image-2'"));
        System.out.println(image3.getAttribute("src") + "\n" + "This invalid URL format");
    }
    }


