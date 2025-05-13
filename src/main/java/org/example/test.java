package org.example;

import Interactions.DragDrop;
import Interactions.Slider;
import Interactions.Dynamic;
import Interactions.Hover;
import Interactions.Keyboard;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class test {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/drag-drop");
        driver.manage().window().maximize();
    }

    @Test
    public void DragTest() {
        DragDrop obj = new DragDrop(driver);
        obj.performDragAndDrop();
    }
    @Test
    public void Handle(){
        Dynamic object = new Dynamic(driver);
        object.task();
    }
    @Test
    public void hover()
    {
        Hover e = new Hover();
        e.PerformHover(driver);
        e.PerformHover2(driver);
        e.PerformHover3(driver);
    }
    @Test
    public void key()
    {
        Keyboard click = new Keyboard();
        click.CheckKeys(driver);
    }
    @Test
    public void Slide()
    {
        Slider slide = new Slider();
        slide.slide(driver);
    }
    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}