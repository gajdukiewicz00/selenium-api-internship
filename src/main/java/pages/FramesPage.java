package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage{

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromFrame(String frameId) {
        driver.switchTo().frame(frameId);
        String text = driver.findElement(By.id("sampleHeading")).getText();
        driver.switchTo().defaultContent();
        return text;
    }
}
