package org.example;
import Advanced.*;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.awt.*;
import java.io.IOException;

public class Test_Advanced {
    WebDriver driver;

    @BeforeTest
    public void setup() throws IOException, InterruptedException {
        Thread.sleep(10000);
        Main.startReport();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop");
        driver.manage().window().maximize();
    }
    @Test
    public void TestRightclick()
    {
        Main.test = Main.extent.createTest("Test Right Click Context Menu");
        ContextMenu test = new ContextMenu();
        test.PerformRightClick(driver);
        Main.test.log(Status.PASS, "Test Right Click Context Menu completed.");

    }

    @Test
    public void TestNotifications()
    {
        Main.test = Main.extent.createTest("Test Notifications");
        Notify obj = new Notify();
        obj.getNotifications(driver);
        Main.test.log(Status.PASS, "Test Notifications completed.");
    }

    @Test
    public void Count()
    {
        Main.test = Main.extent.createTest("Test Count");
        CheckCount obj = new CheckCount();
        obj.getCount(driver);
        Main.test.log(Status.PASS, "Test Count completed.");
    }
@Test
public void AuthTest()
{
    Main.test = Main.extent.createTest("Test Authentication");
    Authentication auth = new Authentication();
    auth.login(driver,"admin","admin");
    Main.test.log(Status.PASS, "Test Authentication completed.");
}
@Test
public void CheckBoxTest()
{
    Main.test = Main.extent.createTest("Test CheckBox");
    CheckBox obj = new CheckBox();
    obj.PerformCheck(driver);
    Main.test.log(Status.PASS, "Test CheckBox completed.");
}
@Test
public void ExitIntentTest() throws AWTException {
    Main.test = Main.extent.createTest("Test Exit Intent");
    ExitIntent obj = new ExitIntent(driver);
    obj.PerformExitIntent(driver);
    Main.test.log(Status.PASS, "Test Exit Intent completed.");
}
@Test
public void getalertTest() throws AWTException {
    Main.test = Main.extent.createTest("Get Alerts Test");
    Alerts obj = new Alerts();
    obj.GetAlerts(driver);
    Main.test.log(Status.PASS, "Get Alerts Test completed.");
}
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
            Main.flushReport();
        }
    }
}
