package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FileDownloadPage;
import utils.BrowserUtils;
import utils.FileUtils;

import java.io.File;

public class FileDownloadPageSteps {
    private final FileDownloadPage fileDownloadPage = new FileDownloadPage();

    @When("Download file from Download as PDF page")
    public void clickDownloadFile() {
        fileDownloadPage.clickDownloadPDF();
        FileUtils.isFileExists(new File(fileDownloadPage.getFileName()));
    }

    @Then("the file with the name provided on the Download as PDF page is downloaded")
    public void theFileShouldBeDownloaded() {
        Assert.assertTrue(BrowserUtils.isFileDownloaded(fileDownloadPage.getFileName()), "File has not been downloaded");
    }
}
