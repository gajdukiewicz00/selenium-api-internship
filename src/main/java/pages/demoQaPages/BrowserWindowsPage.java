package pages.demoQaPages;

import org.openqa.selenium.*;

import java.util.Set;

public class BrowserWindowsPage {
    private final WebDriver driver;

    public BrowserWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/browser-windows");
    }

    public void clickNewWindowButton() {
        driver.findElement(By.id("windowButton")).click();
    }

    public String switchToNewWindowAndGetText(String mainWindow) {
        Set<String> allWindows = driver.getWindowHandles();
        for (String handle : allWindows) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                String text = driver.findElement(By.tagName("body")).getText();
                driver.close(); // Закрыть вкладку
                driver.switchTo().window(mainWindow); // Назад
                return text;
            }
        }
        return null;
    }
}
