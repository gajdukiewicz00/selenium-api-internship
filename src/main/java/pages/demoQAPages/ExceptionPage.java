package pages.demoQAPages;

import elements.pageElements.ButtonElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ExceptionPage extends BasePage {

    private final String URL = "https://demoqa.com/alerts";

    private By rawMissElementLocator = By.id("noID");


    public ExceptionPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public WebElement getRawMissElement() {
        return driver.findElement(rawMissElementLocator);
    }



}
