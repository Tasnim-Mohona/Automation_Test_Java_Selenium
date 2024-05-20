package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected static final String BASE_URL = "https://www.accuweather.com/";
    protected static final int WAIT_TIMEOUT_SECONDS = 10;
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "G:/#2 A1QA/Q.MOHONA/Unit-2_Final_Task/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
