package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Then("I am on the Main page of Wikipedia")
    public void iAmOnTheMainPageOfWikipedia() {
        Assert.assertTrue(mainPage.state().waitForDisplayed());
    }

    @When("I input {string} in the search field and submit")
    public void inputInTheSearchField(String searchInputValue) {
        mainPage.sendSearchKeys(searchInputValue);
        mainPage.clickSubmitBtn();
    }

    @When("I input {string} in the search field")
    public void inputSearchKey(String searchInputValue) {
        mainPage.sendSearchKeys(searchInputValue);
    }

    @When("I change search language to {string}")
    public void selectLanguage(String language) {
        mainPage.changeLanguage(language);
    }

    @When("I click submit button")
    public void submitSearchKey() {
        mainPage.clickSubmitBtn();
    }
}
