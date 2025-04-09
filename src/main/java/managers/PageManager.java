package managers;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageManager {

    private final WebDriver driver;

    private AlertsPage alertsPage;
    private BrowserWindowsPage browserWindowsPage;
    private FramesPage framesPage;
    private ExceptionPage exceptionPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public AlertsPage alertsPage() {
        if (alertsPage == null) alertsPage = new AlertsPage(driver);
        return alertsPage;
    }

    public BrowserWindowsPage browserWindowsPage() {
        if (browserWindowsPage == null) browserWindowsPage = new BrowserWindowsPage(driver);
        return browserWindowsPage;
    }

    public FramesPage framesPage() {
        if (framesPage == null) framesPage = new FramesPage(driver);
        return framesPage;
    }

    public ExceptionPage exceptionPage() {
        if (exceptionPage == null) exceptionPage = new ExceptionPage(driver);
        return exceptionPage;
    }
}
