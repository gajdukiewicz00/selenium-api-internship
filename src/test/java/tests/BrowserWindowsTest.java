package tests;

import base.BaseTest;
import base.DriverSingleton;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BrowserWindowsTest extends BaseTest {

    @Test
    public void testNewWindow() {
        pages.browserWindowsPage().open();
        String main = DriverSingleton.getDriver().getWindowHandle();
        pages.browserWindowsPage().clickNewWindowButton();
        String text = pages.browserWindowsPage().switchToNewWindowAndGetText(main);
        assertTrue(text.contains("This is a sample page"));
    }
}
