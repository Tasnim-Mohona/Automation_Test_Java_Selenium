package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.FileUtils;

import java.io.File;

public class FileDownloadPage extends Form {
    private static final By FILE_NAME = By.className("mw-electronpdfservice-selection-label-desc");
    private final ILabel fileLabel = getElementFactory().getLabel(FILE_NAME, "PDF NAME");
    private final ILink downloadPdfLink = AqualityServices.getElementFactory().getLink(By.xpath("//button[@type='submit']"), "Download Link");

    public FileDownloadPage() {
        super(FILE_NAME, "PDF NAME");
    }

    public void clickDownloadPDF() {
        downloadPdfLink.click();
        FileUtils.isFileExists(new File(String.valueOf(fileLabel)));
    }

    public String getFileName() {
        return fileLabel.getText();
    }
}
