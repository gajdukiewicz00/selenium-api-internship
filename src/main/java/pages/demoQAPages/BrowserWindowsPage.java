package pages.demoQAPages;

import elements.pageElements.ButtonElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class BrowserWindowsPage extends BasePage {

    private final String URL = "https://demoqa.com/browser-windows";

    @FindBy(id="windowButton")
    private WebElement rawWindowButton;

    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    public ButtonElement windowButton() {
        return new ButtonElement(driver, rawWindowButton);
    }

    public void clickWindowButton() {
        windowButton().click();
    }

    public void assertClickWindowButton() {
        windowButton().assertButtonEnabled();
    }
}
