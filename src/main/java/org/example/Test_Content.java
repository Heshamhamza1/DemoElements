package org.example;

import Content.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;

public class Test_Content {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop");
        driver.manage().window().maximize();
    }
@Test
public void File() throws InterruptedException, AWTException, IOException {
    FileUpload obj = new FileUpload();
    obj.SelectFile(driver);
    obj.DragDropFile(driver);
    }
@Test
public void Fileup()
{
    FileDownload obj = new FileDownload();
    obj.Download(driver);
}
@Test
public void Iframe()
{
    IFrame obj = new IFrame();
    obj.iframe(driver);
    obj.iframe2(driver);
}
@Test
public void BrokenImage()
{
    UploadImage I = new UploadImage();
    I.Image(driver);
}
@Test
public void Alert() throws InterruptedException {
    DOMElements a = new DOMElements();
    a.FindDOM(driver);
}
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
