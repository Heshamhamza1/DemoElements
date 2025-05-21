package org.example;

import Content.*;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;

public class Test_Content {
    WebDriver driver;

    @BeforeTest
    public void setup() throws IOException {
        Main.startReport();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop");
        driver.manage().window().maximize();
    }
@Test
public void File() throws InterruptedException, AWTException, IOException {
    Main.test = Main.extent.createTest("Upload files");

    FileUpload obj = new FileUpload();
    obj.SelectFile(driver);
    obj.DragDropFile(driver);
    Main.test.log(Status.PASS, "Uploaded files completed.");

}
@Test
public void Fileup()
{
    Main.test = Main.extent.createTest("Download files");
    FileDownload obj = new FileDownload();
    obj.Download(driver);
    Main.test.log(Status.PASS, "Files Download completed.");
}
@Test
public void Iframe()
{
    Main.test = Main.extent.createTest("Iframe tests");
    IFrame obj = new IFrame();
    obj.iframe(driver);
    obj.iframe2(driver);
    Main.test.log(Status.PASS, "Iframes test completed.");
}
@Test
public void BrokenImage()
{
    Main.test = Main.extent.createTest("Broken Image test");
    UploadImage I = new UploadImage();
    I.Image(driver);
    Main.test.log(Status.PASS, "Broken images test completed.");
}
@Test
public void Alert() throws InterruptedException {
    Main.test = Main.extent.createTest("Check Alert test");
    DOMElements a = new DOMElements();
    a.FindDOM(driver);
    Main.test.log(Status.PASS, "Alert test Completed");
}
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
            Main.flushReport();
        }
    }
}
