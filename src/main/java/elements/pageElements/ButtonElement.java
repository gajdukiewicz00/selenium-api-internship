package elements.pageElements;

import elements.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class ButtonElement extends BaseElement {

    public ButtonElement(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public void clickWithLog() {
        System.out.println("Clicking button: " + element);
        click();
    }

    public void assertButtonEnabled() {
        assertTrue(element.isEnabled(), "Button is disabled");
    }
}