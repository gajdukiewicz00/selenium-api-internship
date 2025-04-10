package pl.innowise.internship.pages;

import pl.innowise.internship.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;


public class BasePage {
    protected WebDriver driver;

    public BasePage(){
        this.driver = DriverSingleton.getDriver();
    }

    public void open(String url){
        driver.get(url);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
