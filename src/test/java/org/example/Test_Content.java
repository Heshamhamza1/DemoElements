package org.example;

import BaseClass.RetryAnalyzer;
import BaseClass.TestListener;
import Content.*;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;

@Listeners(TestListener.class)
public class Test_Content {
    WebDriver driver;

    @BeforeTest
    public void setup() throws IOException, InterruptedException {
        Main.startReport();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop");
        driver.manage().window().maximize();
    }
@Test(retryAnalyzer = RetryAnalyzer.class)
public void File() throws InterruptedException, AWTException, IOException {
    Main.test = Main.extent.createTest("Upload files");
    FileUpload obj = new FileUpload(driver);
    obj.SelectFile(driver);
    obj.DragDropFile(driver);
    Main.test.log(Status.PASS, "Uploaded files completed.");

}
@Test(retryAnalyzer = RetryAnalyzer.class)
public void Fileup()
{
    Main.test = Main.extent.createTest("Download files");
    FileDownload obj = new FileDownload(driver);
    obj.Download(driver);
    Main.test.log(Status.PASS, "Files Download completed.");
}
@Test(retryAnalyzer = RetryAnalyzer.class)
public void Iframe()
{
    Main.test = Main.extent.createTest("Iframe tests");
    IFrame obj = new IFrame(driver);
    obj.iframe(driver);
    obj.iframe2(driver);
    Main.test.log(Status.PASS, "Iframes test completed.");
}
@Test(retryAnalyzer = RetryAnalyzer.class)
public void BrokenImage()
{
    Main.test = Main.extent.createTest("Broken Image test");
    UploadImage obj = new UploadImage(driver);
    obj.Image(driver);
    Main.test.log(Status.PASS, "Broken images test completed.");
}
@Test(retryAnalyzer = RetryAnalyzer.class)
public void Alert() throws InterruptedException {
    Main.test = Main.extent.createTest("Check Alert test");
    DOMElements a = new DOMElements(driver);
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
