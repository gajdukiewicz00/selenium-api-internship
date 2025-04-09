package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AlertsPage {
    private final WebDriver driver;

    @FindBy(id = "alertButton")
    private WebElement alertButton;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://demoqa.com/alerts");
    }

    public void clickAlertButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(alertButton));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertButton);
        alertButton.click();
    }

    public String getAlertTextAndAccept() {
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;
    }
}
