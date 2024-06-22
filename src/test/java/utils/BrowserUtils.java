package utils;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static aquality.selenium.browser.AqualityServices.getConditionalWait;

@UtilityClass
public class BrowserUtils {

    public void navigateBack() {
        getBrowser().goBack();
    }

    public boolean switchToIframe(By locator) {
        try {
            getConditionalWait().waitFor(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void switchToDefaultContent() {
        getBrowser().getDriver().switchTo().defaultContent();
    }
}
