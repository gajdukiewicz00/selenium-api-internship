package elements.pageElements;

import elements.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class InputElement extends BaseElement {

    public InputElement(WebDriver driver, WebElement element) {
        super(driver, element);
    }

    public void setValue(String value) {
        type(value);
    }

    public void clear() {
        waitUntilVisible();
        element.clear();
    }

    public void assertValueEquals(String expected) {
        assertEquals(element.getAttribute("value"), expected, "Input value mismatch!");
    }
}