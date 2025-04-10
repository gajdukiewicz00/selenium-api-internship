package tests;

import EngineLogic.DriverSingleton;
import managers.PageManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected PageManager pages;

    @BeforeTest
    public void setUp() {
        pages = new PageManager(DriverSingleton.getDriver());
    }

    @AfterTest
    public void tearDown() {
        DriverSingleton.quitDriver();
    }
}
