package Content;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileDownload {
    WebDriverWait wait;

    public void Download(WebDriver driver)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='nav-file-download']")))).click();

        WebElement DownloadBTN = driver.findElement(By.cssSelector("[data-test='download-button-0']"));
        DownloadBTN.click();
        WebElement DownloadedFile = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/main/div/div/div/div/div[1]/div/div/div/h3"));
        System.out.println(DownloadedFile.getText()+ " " + "File Downloaded Successfully !");
    }
}
