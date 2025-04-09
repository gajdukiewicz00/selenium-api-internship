package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest {

    @Test
    public void testSimpleAlert() {
        pages.alertsPage().open();
        pages.alertsPage().clickAlertButton();
        String alertText = pages.alertsPage().getAlertTextAndAccept();
        assertEquals(alertText, "You clicked a button");
    }
}
