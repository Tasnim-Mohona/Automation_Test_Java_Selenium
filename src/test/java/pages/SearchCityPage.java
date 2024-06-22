package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.BrowserUtils;

import java.util.List;

import static aquality.selenium.browser.AqualityServices.getConditionalWait;

public class SearchCityPage extends Form {
    private final ITextBox searchBar = getElementFactory().getTextBox(By.className("search-input"), "Search Bar");
    private final IButton consentButton = getElementFactory().getButton(By.className("banner-button"), "I Understand");
    private final By searchResultLocator = By.className("search-bar-result__long-name");
    private final ILink recentLocationLink = getElementFactory().getLink(By.xpath("//div[@class='featured-locations__header']"), "Recent Location");
    private final By recentLocationItem = By.className("recent-location-item");
    private final ILabel currentLabel = getElementFactory().getLabel(By.xpath("//span[@class='current-location-text']"), "Current Location Label");
    private final ILink searchResultsContainer = getElementFactory().getLink(By.className("search-bar-result__long-name"), "Search Results Container");
    private final IButton closeAdButton = getElementFactory().getButton(By.cssSelector("div#dismiss-button[aria-label='Close ad']"), "Close Ad Button");
    private final By adIframeLocator = By.xpath("//iframe[contains(@id,'interstitial')]");

    public SearchCityPage() {
        super(By.className("search-input"), "Search Bar");
    }

    public void acceptDataUsage() {
        consentButton.click();
    }

    public void clickSearchLocation() {
        searchBar.click();
    }

    public boolean isCurrentLocationLabelDisplayed() {
        return currentLabel.state().isDisplayed();
    }

    public void enterCityInSearchField(String city) {
        searchBar.state().waitForDisplayed();
        searchBar.type(city);
    }

    public void clickFirstSearchResult() {
        getConditionalWait().waitFor(() -> searchResultsContainer.state().isDisplayed());
        List<ILink> searchResults = getElementFactory().findElements(searchResultLocator, ElementType.LINK);
        searchResults.getFirst().click();
        this.state().waitForNotDisplayed();
    }

    public void isSearchResultDisplayed() {
        searchResultsContainer.state().isDisplayed();
    }

    public void dismissAdIfPresent() {
        if (BrowserUtils.switchToIframe(adIframeLocator)) {
            closeAdButton.click();
            BrowserUtils.switchToDefaultContent();
        }
    }

    public void clickFirstRecentLocation() {
        recentLocationLink.state().waitForDisplayed();
        List<ILink> locationElements = getElementFactory().findElements(recentLocationItem, ElementType.LINK);
        locationElements.getFirst().click();
        AqualityServices.getBrowser().waitForPageToLoad();
    }
}
