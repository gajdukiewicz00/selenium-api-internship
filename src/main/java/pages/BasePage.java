package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static org.testng.Assert.*;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private final int TIMEOUT_SECONDS = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SECONDS));
        PageFactory.initElements(driver, this);
    }

    // === Базовые геттеры ===
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    // === Базовые ассерты ===
    public void assertUrlContains(String expectedPart) {
        assertTrue(getCurrentUrl().contains(expectedPart),
                "Expected URL to contain: " + expectedPart + ", but was: " + getCurrentUrl());
    }

    public void assertPageTitleEquals(String expectedTitle) {
        assertEquals(getPageTitle(), expectedTitle,
                "Expected title: " + expectedTitle + ", but was: " + getPageTitle());
    }

    public void assertElementVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            assertTrue(element.isDisplayed(), "Element should be visible");
        } catch (TimeoutException e) {
            fail("Element not visible within timeout");
        }
    }

    public void assertElementTextEquals(WebElement element, String expectedText) {
        wait.until(ExpectedConditions.visibilityOf(element));
        assertEquals(element.getText(), expectedText,
                "Expected text: " + expectedText + ", but was: " + element.getText());
    }
    public void assertTextEquals(String actual, String expected) {
        assertEquals(actual, expected, "Expected: " + expected + ", but got: " + actual);
    }


    // === Базовые действия ===
    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(text);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
