package pl.innowise.internship.tests;

import pl.innowise.internship.driver.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    @BeforeTest
    public void setUp() {
        DriverSingleton.getDriver();
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.quit();
    }
}
