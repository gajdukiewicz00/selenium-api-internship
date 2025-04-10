package pages.demoQaPages;

import Elements.pageElements.ButtonElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertsPage extends BasePage {

    private final String URL = "https://demoqa.com/alerts";

    @FindBy(id = "alertButton")
    private WebElement rawAlertButton;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    // Геттер, возвращающий обёртку ButtonElement
    public ButtonElement alertButton() {
        return new ButtonElement(driver, rawAlertButton);
    }

    public void clickAlertButton() {
        alertButton().scrollTo();
        alertButton().click();
    }

    public void assertAlertButtonVisible() {
        alertButton().assertVisible();
    }

    public String getAlertTextAndAccept() {
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;
    }
}
