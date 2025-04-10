package tests.demoQa.alertTests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class AlertsTest extends BaseTest {

    @Test
    public void testSimpleAlert() {
        // Открытие страницы
        pages.alertsPage().open();

        // Проверка, что кнопка видна
        pages.alertsPage().assertAlertButtonVisible();

        // Клик по кнопке и работа с алертом
        pages.alertsPage().clickAlertButton();
        String alertText = pages.alertsPage().getAlertTextAndAccept();

        // Ассерт текста алерта через BasePage
        pages.alertsPage().assertTextEquals(alertText, "You clicked a button");
    }
}
