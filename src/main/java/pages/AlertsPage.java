package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    @FindBy(id = "alertButton")
    private WebElement alertButton;

    @FindBy(id = "timerAlertButton")
    private WebElement timerAlertButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "confirmResult")
    private WebElement confirmResult;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAlertButton() {
        alertButton.click();
    }

    public void clickTimerAlertButton() {
        timerAlertButton.click();
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public Alert getAlert() {
        return driver.switchTo().alert();
    }

    public String getConfirmResultText() {
        return confirmResult.getText();
    }
}
