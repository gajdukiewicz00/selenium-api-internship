package Elements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static org.testng.Assert.*;

public class BaseElement {
    protected WebDriver driver;
    protected WebElement element;
    protected WebDriverWait wait;

    private final int TIMEOUT_SECONDS = 10;

    public BaseElement(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SECONDS));
    }

    public void click() {
        waitUntilClickable();
        element.click();
    }

    public void type(String text) {
        waitUntilVisible();
        element.clear();
        element.sendKeys(text);
    }

    public String getText() {
        waitUntilVisible();
        return element.getText();
    }

    public boolean isDisplayed() {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            return false;
        }
    }

    public void scrollTo() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void assertTextEquals(String expected) {
        assertEquals(getText(), expected, "Text mismatch!");
    }

    public void assertVisible() {
        assertTrue(isDisplayed(), "Element is not visible");
    }

    public void waitUntilClickable() {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible() {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
