package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class FramesPage {
    private final WebDriver driver;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/frames");
    }

    public String getTextFromFrame(String frameId) {
        driver.switchTo().frame(frameId);
        String text = driver.findElement(By.id("sampleHeading")).getText();
        driver.switchTo().defaultContent();
        return text;
    }
}
