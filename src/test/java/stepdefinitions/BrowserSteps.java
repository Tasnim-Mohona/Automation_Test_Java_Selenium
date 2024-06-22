package stepdefinitions;

import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import utils.BrowserUtils;

public class BrowserSteps {

    @When("I go back to the previous page")
    public void goToPreviousPage() {
        Allure.step("Navigate to previous page");
        BrowserUtils.navigateBack();
    }
}
