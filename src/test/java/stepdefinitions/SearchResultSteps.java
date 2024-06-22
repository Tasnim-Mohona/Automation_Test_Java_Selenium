package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SearchResultPage;

public class SearchResultSteps {
    private final SearchResultPage searchResultPage = new SearchResultPage();

    @Then("The header should contain the city name {string}")
    public void headerShouldContainCityName(String cityName) {
        Assert.assertTrue(searchResultPage.getWeatherPageHeader().contains(cityName), "Header does not contain the city name %s".formatted(cityName));
    }
}
