package Content;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Base64;
import java.util.List;

public class FileUpload {
    WebDriverWait wait;
    public void SelectFile(WebDriver driver) throws InterruptedException, AWTException {
        WebElement content = driver.findElement(By.cssSelector("[data-test='nav-file-upload']"));
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(content));
        content.click();

        WebElement FileInput = driver.findElement(By.cssSelector("[data-test='file-input']"));
        FileInput.sendKeys("C:\\Users\\hisham\\Downloads\\hesham hamza resume_1.pdf");
    }
    public void DragDropFile (WebDriver driver) throws IOException, InterruptedException {
        WebElement content = driver.findElement(By.cssSelector("[data-test='nav-file-upload']"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(content));
        content.click();
        WebElement DragZone = driver.findElement(By.cssSelector("[data-test='drop-zone']"));
        String FilePath = "C:\\Users\\hisham\\Downloads\\hesham hamza resume_1.pdf";
        byte [] FileContent = Files.readAllBytes(Paths.get(FilePath));
        String base64File = Base64.getEncoder().encodeToString(FileContent);
        String jsScript = "var dropTarget = arguments[0];\n" +
                "var base64Data = arguments[1];\n" +
                "var contentType = 'video/mp4';\n" +
                "var filename = 'when set max value for.mp4';\n" +
                "var binary = atob(base64Data);\n" +
                "var array = [];\n" +
                "for (var i = 0; i < binary.length; i++) {\n" +
                "  array.push(binary.charCodeAt(i));\n" +
                "}\n" +
                "var file = new File([new Uint8Array(array)], filename, {type: contentType});\n" +
                "var dataTransfer = new DataTransfer();\n" +
                "dataTransfer.items.add(file);\n" +
                "['dragenter', 'dragover', 'drop'].forEach(function(eventType) {\n" +
                "  var event = new DragEvent(eventType, {\n" +
                "    dataTransfer: dataTransfer,\n" +
                "    bubbles: true,\n" +
                "    cancelable: true\n" +
                "  });\n" +
                "  dropTarget.dispatchEvent(event);\n" +
                "});";
        ((JavascriptExecutor) driver).executeScript(jsScript, DragZone, base64File);
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.cssSelector("[data-test='uploaded-file-0']"));
        for (WebElement ul : list)
        {
            System.out.println(ul.getText());
        }
    }
}
