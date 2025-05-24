package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Authentication {
    public static WebDriverWait wait;
    public static WebDriver driver;

    public void login(WebDriver driver, String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the login button and click it
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='nav-auth']")));
        loginBtn.click();

        // Wait for username field to be visible
        WebElement usernameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='username-input']")));
        usernameInput.sendKeys(username);

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='password-input']")));
        passwordInput.sendKeys(password);

        WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='login-button']")));
        submitBtn.click();

        WebElement valid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='auth-success']")));
        System.out.println(valid.getText());
    }

}
