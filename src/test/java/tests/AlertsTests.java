package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests {
    private WebDriver driver;
    private AlertsPage alertsPage;


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        alertsPage = new AlertsPage(driver);
    }
    @Test
    public void testSimpleAlertAccept(){
        alertsPage.clickAlertButton();
        Alert alert = alertsPage.getAlert();
        assertEquals(alert.getText(), "You clicked a button");
        alert.accept();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
