package BaseClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BaseClass {

    protected WebDriver driver;
    public BaseClass(WebDriver driver) {
        this.driver = driver;  // Initialize the WebDriver instance
    }

    public WebElement waitForElement(String type, String locator, String waitType, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        By by = getBy(type, locator);

        switch (waitType.toLowerCase()) {
            case "clickable":
                return wait.until(ExpectedConditions.elementToBeClickable(by));
            case "visible":
                return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            default:
                throw new IllegalArgumentException("Invalid wait type: " + waitType);
        }
    }

    public List<WebElement> waitForElements(String type, String locator, String waitType, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        By by = getBy(type, locator);

        switch (waitType.toLowerCase()) {
            case "visible":
                return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            case "present":
                return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));


            default:
                throw new IllegalArgumentException("Invalid wait type for list: " + waitType);
        }
    }

    private By getBy(String type, String value) {
        switch (type.toLowerCase()) {
            case "id":
                return By.id(value);
            case "css":
                return By.cssSelector(value);
            case "xpath":
                return By.xpath(value);
            case "name":
                return By.name(value);
            case "class":
                return By.className(value);
                case "tag":
                return By.tagName(value);
            default:
                throw new IllegalArgumentException("Invalid locator type: " + type);
        }
    }

    public WebElement Element(String type, String locator) {
        By by = getBy(type, locator);
        return driver.findElement(by);  // Find and return the WebElement based on the locator
    }
    public String print(String message) {
        System.out.println(message);  // Noncompliant, output directly to System.out without a logger
        return message;  // Return the message for further use
    }

    public WebDriverWait getwait() {
        return new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void performAction(String actionType, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);

        switch (actionType.toLowerCase()) {
            case "clickandhold":
                actions.clickAndHold(source).moveByOffset(390,0).perform();
                break;

            case "draganddrop":
                actions.dragAndDrop(source, target).build().perform();
                break;

            case "movetoelement":
                actions.moveToElement(source).perform();
                break;

            case "movetoelementandclick":
                actions.moveToElement(source).click().perform();
                break;

            case "release":
                actions.release(source).perform();
                break;

            default:
                throw new IllegalArgumentException("Unsupported action type: " + actionType);
        }
    }
}
