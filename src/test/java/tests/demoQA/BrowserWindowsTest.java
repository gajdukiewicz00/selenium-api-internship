package tests.demoQA;

import tests.BaseTest;
import org.testng.annotations.Test;

public class BrowserWindowsTest extends BaseTest {

    @Test
    public void testNewWindow() {
        pages.browserWindowsPage().open();

        pages.browserWindowsPage().windowButton();

        pages.browserWindowsPage().clickWindowButton();

        pages.browserWindowsPage().assertClickWindowButton();
    }
}
