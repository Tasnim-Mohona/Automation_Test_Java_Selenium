package tests;

import aquality.selenium.browser.AqualityServices;
import org.testng.annotations.*;
import utils.SettingsTestData;
import static aquality.selenium.browser.AqualityServices.getBrowser;

public abstract class BaseTest {
    @BeforeMethod
    public void setup() {
        System.out.println("Before");

        getBrowser().maximize();
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
        getBrowser().waitForPageToLoad();
    }

    @AfterTest
    public void tearDown() {
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
        System.out.println("After");
    }
}
