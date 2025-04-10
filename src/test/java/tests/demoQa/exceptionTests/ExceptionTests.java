package tests.demoQa.exceptionTests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.*;

public class ExceptionTests extends BaseTest {

    @Test
    public void testElementNotFoundException() {
        pages.exceptionPage().open();
        try {
            pages.exceptionPage().findMissingElementById("fakeId");
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            System.out.println("Element not found, as expected.");
        }
    }

    @Test
    public void testSafeElementCheck() {
        pages.exceptionPage().open();
        assertFalse(pages.exceptionPage().isElementPresent("definitely-fake"));
    }
}
