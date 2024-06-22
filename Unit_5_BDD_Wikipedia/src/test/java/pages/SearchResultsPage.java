package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SearchResultsPage extends Form {
    private final ILink toolsBtn = AqualityServices.getElementFactory().getLink(By.id("vector-page-tools-dropdown"), "Tools Button");
    private final IButton pageInformationLocator = getElementFactory().getButton(By.xpath("//span[text()='Page information']"), "Page Information");
    private final ILabel pageHeading = getElementFactory().getLabel(By.xpath("//h1[@id='firstHeading']"), "Heading of Page");
    private final ILink downloadBtn = AqualityServices.getElementFactory().getLink(By.xpath("//span[text()='Download as PDF']"), "Download Link");

    public SearchResultsPage() {
        super(By.xpath("//input[@aria-label='Tools']"), "Tools");
    }

    public void clickTools() {
        toolsBtn.click();
    }

    public void clickFileDownloadPageBtn() {
        downloadBtn.click();
    }

    public void clickPageInfo() {
        pageInformationLocator.click();
    }

    public String getPageHeader() {
        return pageHeading.getText();
    }
}
