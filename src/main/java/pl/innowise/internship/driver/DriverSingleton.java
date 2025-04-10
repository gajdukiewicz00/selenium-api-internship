package pl.innowise.internship.driver;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {
    private static WebDriver driver;

    private DriverSingleton(){

    }

    public static WebDriver getDriver(){
        if (driver == null){
            BrowserType browserType = BrowserType.CHROME;
            driver = DriverFactory.createDriver(browserType);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quit(){
        driver.quit();
    }

}
