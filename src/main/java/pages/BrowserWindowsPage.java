package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowsPage extends BasePage {

    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewWindowButton() {
        driver.findElement(By.id("windowButton")).click();
    }

    public String switchToNewWindowAndGetText(String mainWindowHandle) {
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                return driver.findElement(By.tagName("body")).getText();
            }
        }
        return null;
    }
}
