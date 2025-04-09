package pages;

import org.openqa.selenium.*;

import java.util.List;

public class ExceptionPage {
    private final WebDriver driver;

    public ExceptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/alerts"); // Можно любую страницу
    }

    public WebElement findMissingElementById(String id) {
        return driver.findElement(By.id(id));
    }

    public boolean isElementPresent(String id) {
        List<WebElement> elements = driver.findElements(By.id(id));
        return !elements.isEmpty();
    }
}
