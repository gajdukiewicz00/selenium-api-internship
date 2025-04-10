
package tests.demoQA.exceptionTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import tests.BaseTest;

import static org.testng.Assert.*;

public class ExceptionTests extends BaseTest {

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testElementNotFoundException() {
        pages.exceptionPage().open();

        pages.exceptionPage().getRawMissElement();
    }

}

