package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

    WebDriver driver;

    // Constructor to accept driver from outside
    public DragDrop(WebDriver driver) {
        this.driver = driver;
    }

    public void performDragAndDrop() {
        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.cssSelector("[data-test='drag-handle-Item 1']"));
        WebElement target = driver.findElement(By.cssSelector("[data-test='sortable-item-Item 2']"));

        actions.dragAndDrop(source, target).build().perform();
    }
}
