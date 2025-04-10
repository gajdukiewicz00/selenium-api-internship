package pages.demoQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import pages.BasePage;

public class FramesPage extends BasePage {

    private final String URL = "https://demoqa.com/frames";

    private final By rawSampleHeadninDuplicate = By.id("sampleHeading");

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public void assertFrameText() {
        driver.findElement(rawSampleHeadninDuplicate).getText();
    }

    public void getRawSampleHeading(String string) {
        FramesPage framesPageElement = (FramesPage) driver.switchTo().frame(driver.findElement(rawSampleHeadninDuplicate));
        driver.findElement(rawSampleHeadninDuplicate).sendKeys(string);
    }

}
