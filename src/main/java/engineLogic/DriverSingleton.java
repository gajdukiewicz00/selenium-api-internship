package engineLogic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static final ThreadLocal<WebDriver> driverThreadLocalLocal = new ThreadLocal<>();

    private DriverSingleton() {}

    public static WebDriver getDriver() {
        if (driverThreadLocalLocal == null) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driverThreadLocalLocal.set(driver);
        }
        return driverThreadLocalLocal.get();
    }

    public static void quitDriver() {
        WebDriver driver = driverThreadLocalLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocalLocal.remove();
        }
    }
}
