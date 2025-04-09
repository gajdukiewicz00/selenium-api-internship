package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.ExceptionPage;

import static org.testng.Assert.*;

public class ExceptionTests {
    private WebDriver driver;
    private ExceptionPage exceptionPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        exceptionPage = new ExceptionPage(driver);
    }

    @Test
    public void testHandleNoSuchElementException() {
        try {
            exceptionPage.findMissingElementById("nonExistent");
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found as expected.");
        }
    }

    @Test
    public void testCheckElementPresence() {
        boolean isPresent = exceptionPage.isElementPresent("nonExistent");
        assertFalse(isPresent);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
