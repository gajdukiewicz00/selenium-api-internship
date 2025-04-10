package pl.innowise.internship.tests.loginDemoQaTest;

import org.testng.annotations.Test;
import pl.innowise.internship.pages.LoginPage;
import pl.innowise.internship.tests.BaseTest;


public class LoginTest extends BaseTest {

    @Test
    public void testInvalidInput(){
        LoginPage loginPage = new LoginPage();

        loginPage.openLoginPage();
        loginPage.fillText("gofodofodofodfo");
        loginPage.verifyButtonClicked();
    }
}
