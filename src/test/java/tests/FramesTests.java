package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramesPage;

import static org.testng.Assert.assertEquals;

public class FramesTests {
    private WebDriver driver;
    private FramesPage framesPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        framesPage = new FramesPage(driver);
    }
    @Test
    public void testFramesText() {
        String text1 = framesPage.getTextFromFrame("frame1");
        assertEquals(text1, "This is a sample page");

        String text2 = framesPage.getTextFromFrame("frame2");
        assertEquals(text2, "This is a sample page");
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
