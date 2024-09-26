package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DownloadPage;
import utils.FileUtils;

import java.io.File;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class DownloadPageSteps {

    private final DownloadPage downloadPage = new DownloadPage();

    @When("I click on the download button from Download as PDF page")
    public void clickDownloadButton() {
        step("Clicking on the Download Button");
        downloadPage.clickDownloadButton();
    }

    @Then("I should see the PDF file is downloaded successfully")
    public void checkDownloadedFile() {
        step("Getting the PDF file name");
        String downloadedFile = downloadPage.getFileName();
        File file = new File(getBrowser().getDownloadDirectory() + File.separator + downloadedFile);
        step("Checking if the PDF file is downloaded or not");
        Assert.assertTrue(FileUtils.isFileExist(file), "File is not downloaded");
    }
}
