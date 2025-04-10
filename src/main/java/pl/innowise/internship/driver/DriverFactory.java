package pl.innowise.internship.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {

    public static WebDriver createDriver(BrowserType browserType) {
        return switch (browserType) {
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().setup();
                yield new FirefoxDriver();
            }
            case EDGE -> {
                WebDriverManager.edgedriver().setup();
                yield new EdgeDriver();
            }
            default -> {
                WebDriverManager.chromedriver().setup();
                yield new ChromeDriver();
            }
        };
    }
}
