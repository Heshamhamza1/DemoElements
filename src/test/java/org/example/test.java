package org.example;

import BaseClass.RetryAnalyzer;
import BaseClass.TestListener;
import Interactions.DragDrop;
import Interactions.Slider;
import Interactions.Dynamic;
import Interactions.Hover;
import Interactions.Keyboard;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

@Listeners(TestListener.class)
public class test {
    WebDriver driver;
    @BeforeTest
    public void setup() throws IOException {
        Main.startReport();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop");
        driver.manage().window().maximize();
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void DragTest() {
        Main.test = Main.extent.createTest("Test Drag and Drop Elements");
        DragDrop obj = new DragDrop(driver);
        obj.performDragAndDrop();
        Main.test.log(Status.PASS, "Test Drag and Drop Elements completed.");
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void Handle(){
        Main.test = Main.extent.createTest("Handle Elements");
        Dynamic object = new Dynamic(driver);
        object.task();
        Main.test.log(Status.PASS, "Handle Elements completed.");
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void hover()
    {
        Main.test = Main.extent.createTest("Hover Elements");
        Hover e = new Hover(driver);
        e.PerformHover(driver);
        e.PerformHover2(driver);
        e.PerformHover3(driver);
        Main.test.log(Status.PASS, "Hover Elements completed.");
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void key()
    {
        Main.test = Main.extent.createTest("Perform Keys Elements");
        Keyboard click = new Keyboard(driver);
        click.CheckKeys(driver);
        Main.test.log(Status.PASS, "Perform Keys completed.");
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void Slide()
    {
        Main.test = Main.extent.createTest("Sliding Elements");
        Slider slide = new Slider(driver);
        slide.slide(driver);
        Main.test.log(Status.PASS, "Sliding Elements completed.");
    }
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
            Main.flushReport();
        }
    }
}