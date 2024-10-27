import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    private final By jsAlert = By.xpath(String.format(PRECISE_TEXT_XPATH, "JavaScript Alerts"));
    private final By clickForJsAlertButton = By.xpath("//button[@onclick='jsAlert()']");
    private final By resultAfterClickedOk = By.xpath("//p[@id='result']");
    String successMessage = "You successfully clicked an alert";

    @Test
    public void alertTest() {
        driver.findElement(jsAlert).click();
        driver.findElement(clickForJsAlertButton).click();
        driver.switchTo().alert().accept();
        String text = driver.findElement(resultAfterClickedOk).getText();
        Assert.assertEquals(text, successMessage);
        // todo: accept alert
        // todo: assert success message
    }
}
