package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchResultsPage;

public class SearchResultsPageStep {
    private final SearchResultsPage searchResultsPage = new SearchResultsPage();

    @When("I click the Tool menu button on the Article page")
    public void iClickTheToolMenuButtonOnTheArticlePage() {
        searchResultsPage.clickTools();
    }

    @When("I click the Download as PDF button in Tools")
    public void clickDownloadPage() {
        searchResultsPage.clickFileDownloadPageBtn();
    }

    @And("I click the Page information button on the Article page")
    public void clickPageInformationBtn() {
        searchResultsPage.clickPageInfo();
    }

    @Then("Information page for {string} article is displayed")
    public void isInfoPageDisplayed(String DisplayedArticle) {
        Assert.assertTrue(searchResultsPage.getPageHeader().contains(DisplayedArticle), "Header does not contain the city name %s".formatted(DisplayedArticle));
    }
}
