package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SearchResultPage extends Form {
    private final ILabel weatherPageHeader = AqualityServices.getElementFactory().getLabel(By.xpath("//h1[@class='header-loc']"), "Weather Page Header");

    public SearchResultPage() {
        super(By.xpath("//a[@class='header-logo' and svg]"), "Search Bar");
    }

    public String getWeatherPageHeader() {
        weatherPageHeader.state().waitForDisplayed();
        return weatherPageHeader.getText();
    }
}
