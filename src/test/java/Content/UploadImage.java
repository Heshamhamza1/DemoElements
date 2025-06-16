package Content;

import BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadImage extends BaseClass {

    WebDriverWait wait;

    public UploadImage(WebDriver driver) {
        super(driver);
    }

    public void Image(WebDriver driver) {
        waitForElement("css", "[data-test='nav-broken-images']", "clickable", 10).click();

        WebElement image1 =waitForElement("css", "[data-test='image-0']", "visible", 10);
        print(image1.getAttribute("src") + "\n" + "Image Found !");

        WebElement image2 = waitForElement("css", "[data-test='image-1']", "visible", 10);
        print(image2.getAttribute("src") + "\n" + "This image URL does not exist");

        WebElement image3 = waitForElement("css", "[data-test='image-2']", "visible", 10);
        print(image3.getAttribute("src") + "\n" + "This invalid URL format");
    }
    }


