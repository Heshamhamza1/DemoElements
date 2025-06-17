package Content;

import BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDownload extends BaseClass {


    public FileDownload(WebDriver driver) {
        super(driver);
    }

    public void Download(WebDriver driver)
    {
        waitForElement("css", "[data-test='nav-file-download']", "clickable", 10).click();

        waitForElement("css", "[data-test='download-button-0']", "clickable", 3).click();
        WebElement DownloadedFile = waitForElement("xpath", "//*[@id=\"root\"]/div/div[3]/main/div/div/div/div/div[1]/div/div/div/h3", "visible", 3);
        print(DownloadedFile.getText()+ " " + "File Downloaded Successfully !");
    }
}
