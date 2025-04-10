package pl.innowise.internship.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.innowise.internship.driver.DriverSingleton;


public class BaseElement {
    protected WebDriver driver;
    protected By locator;

    public BaseElement(By locator)
    {
        this.driver = DriverSingleton.getDriver();
        this.locator = locator;
    }

    protected WebElement findElement() {
        return driver.findElement(locator);
    }

    public void click() {
        findElement().click();
    }

    public void sendKeys(String text) {
        findElement().sendKeys(text);
    }

    public String getText() {
        return findElement().getText();
    }

    public boolean isDisplayed() {
        return findElement().isDisplayed();
    }
}
