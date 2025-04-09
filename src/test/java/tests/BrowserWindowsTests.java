package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.BrowserWindowsPage;

import static org.testng.Assert.assertTrue;

public class BrowserWindowsTests {
    private WebDriver driver;
    private BrowserWindowsPage browserWindowsPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        browserWindowsPage = new BrowserWindowsPage(driver);
    }

    @Test
    public void testNewWindowHandle() {
        String mainWindow = driver.getWindowHandle();
        browserWindowsPage.clickNewWindowButton();

        String newWindowText = browserWindowsPage.switchToNewWindowAndGetText(mainWindow);
        assertTrue(newWindowText.contains("This is a sample page"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
