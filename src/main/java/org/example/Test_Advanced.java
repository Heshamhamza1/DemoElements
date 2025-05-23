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
    public void setup() throws IOException {
        Main.startReport();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop");
        driver.manage().window().maximize();
    }
    @Test
    public void TestRightclick()
    {
        ContextMenu test = new ContextMenu();
        test.PerformRightClick(driver);

    }

    @Test
    public void TestNotifications()
    {
        Notify obj = new Notify();
        obj.getNotifications(driver);
    }

    @Test
    public void Count()
    {
        CheckCount obj = new CheckCount();
        obj.getCount(driver);
    }
@Test
public void AuthTest()
{
    Authentication auth = new Authentication();
    auth.login(driver,"admin","admin");
}
@Test
public void CheckBoxTest()
{
    CheckBox obj = new CheckBox();
    obj.PerformCheck(driver);
}
@Test
public void ExitIntentTest() throws AWTException {
    ExitIntent obj = new ExitIntent();
    obj.PerformExitIntent(driver);
}
@Test
public void getalertTest() throws AWTException {
    Alerts obj = new Alerts();
    obj.GetAlerts(driver);
}
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
