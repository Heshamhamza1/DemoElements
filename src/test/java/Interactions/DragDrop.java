package Interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseClass.BaseClass;

public class DragDrop extends BaseClass {

    public DragDrop(WebDriver driver) {
        super(driver);
    }

    public void performDragAndDrop() {

        WebElement source = waitForElement("css", "[data-test='drag-handle-Item 1']", "visible", 1);
        WebElement target = waitForElement("css", "[data-test='drag-handle-Item 2']", "visible", 1);

        performAction("draganddrop",source, target);
    }
}
