package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchCityPage;

public class SearchCitySteps {
    private final SearchCityPage searchCityPage = new SearchCityPage();

    @Then("I go to the main page")
    public void iAmOnTheMainPageOfAccuWeather() {
        searchCityPage.state().waitForDisplayed();
        Assert.assertTrue(searchCityPage.state().isDisplayed());
    }

    @When("I consent to cookie")
    public void consentToDataUsage() {
        searchCityPage.acceptDataUsage();
    }

    @When("I input {string} in the search field")
    public void inputCityInSearchField(String city) {
        searchCityPage.enterCityInSearchField(city);
    }

    @Then("search results list is displayed")
    public void searchResultListDisplayed() {
        searchCityPage.isSearchResultDisplayed();
    }

    @When("I click on the first search result")
    public void clickFirstSearchResult() {
        searchCityPage.clickFirstSearchResult();
    }

    @Then("the main page is opened")
    public void verifyMainPageIsOpened() {
        Assert.assertTrue(searchCityPage.state().waitForDisplayed(), "Main page is not Opened");
    }

    @When("I choose the first city in Recent locations")
    public void selectFirstRecentCity() {
        searchCityPage.clickFirstRecentLocation();
        searchCityPage.dismissAdIfPresent();
    }

    @When("I click the search field")
    public void clickTheSearchField() {
        searchCityPage.clickSearchLocation();
    }

    @Then("Use your current location label is displayed")
    public void isCurrentLocationDisplayed() {
        Assert.assertTrue(searchCityPage.isCurrentLocationLabelDisplayed(), "Label is not shown");
    }
}
