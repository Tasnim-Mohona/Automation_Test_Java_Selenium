import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicControlsTest extends BaseTest {
    private final By dynamicControls = By.xpath(String.format(PRECISE_TEXT_XPATH, "Dynamic Controls"));
    private final By enableButton = By.xpath(String.format(PRECISE_TEXT_XPATH, "Enable"));
    private final By disableButton = By.xpath(String.format(PRECISE_TEXT_XPATH, "Enable"));
    private final By removeButton = By.xpath("//button[@onclick = 'swapCheckbox()']");
    private final By addButton = By.xpath(String.format(PRECISE_TEXT_XPATH, "Add"));
    int WAIT_TIME = 10;

    @Test
    public void dynamicControlsTest() {
        driver.findElement(dynamicControls).click();


        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        driver.findElement(removeButton).click();
        wait.until(d -> driver.findElement(addButton).isDisplayed());
        Assert.assertTrue(wait.until(d -> driver.findElement(addButton).isDisplayed()), "Add Button not displayed" );

        driver.findElement(enableButton).click();
        Assert.assertTrue(wait.until(d -> driver.findElement(disableButton).isDisplayed()),"It is enabled message is shown");

        // todo: assert input is enabled
        // todo: input random generated text
        // todo: assert inputted text
    }
}
