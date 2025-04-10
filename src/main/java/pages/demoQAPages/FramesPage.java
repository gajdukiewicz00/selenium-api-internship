package pages.demoQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import pages.BasePage;

public class FramesPage extends BasePage {

    private final String URL = "https://demoqa.com/frames";

    private final By rawSampleHeadingDuplicate = By.id("frame1");

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void assertFrameText() {
        driver.findElement(rawSampleHeadingDuplicate).getText();
    }

    public void getRawSampleHeading(String string) {
        driver.switchTo().frame(driver.findElement(rawSampleHeadingDuplicate));
        driver.findElement(By.id("sampleHeading")).getText();
        driver.switchTo().defaultContent();
    }

}
