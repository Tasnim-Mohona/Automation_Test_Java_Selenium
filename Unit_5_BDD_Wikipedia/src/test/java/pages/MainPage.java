package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final IButton submitBtn = getElementFactory().getButton(By.xpath("//i[@data-jsl10n='search-input-button']"), "Search");
    private final ITextBox searchBar = getElementFactory().getTextBox(By.xpath("//input[@id='searchInput']"), "Search Input");
    private final IButton languageDropdownBtn = getElementFactory().getButton(By.xpath("//div[@class='hide-arrow']"), "Change Language Button");
    private final By languageBtn = By.xpath("//div/select[@id='searchLanguage']");

    public MainPage() {
        super(By.id("searchInput"), "Search");
    }

    public void clickSubmitBtn() {
        submitBtn.state().waitForClickable();
        submitBtn.click();
    }

    public void sendSearchKeys(String searchInputValue) {
        searchBar.sendKeys(searchInputValue);
    }

    public void changeLanguage(String language) {
        languageDropdownBtn.clickAndWait();
        IComboBox languageOptions = getElementFactory().getComboBox(languageBtn, "Dropdown Menu", ElementState.EXISTS_IN_ANY_STATE);
        languageOptions.selectByText(language);
    }
}
