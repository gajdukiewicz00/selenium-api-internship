package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExceptionPage extends BasePage {

    public ExceptionPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findMissingElementById(String id) {
        return driver.findElement(By.id(id));
    }

    public boolean isElementPresent(String id) {
        List<WebElement> elements = driver.findElements(By.id(id));
        return !elements.isEmpty();
    }
}
