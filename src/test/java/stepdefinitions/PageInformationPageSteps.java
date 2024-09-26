package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PageInformationPage;

import static io.qameta.allure.Allure.step;

public class PageInformationPageSteps {

    private final PageInformationPage pageInformationPage = new PageInformationPage();

    @Then("I should see the Information page for the {string} is displayed successfully")
    public void checkPageInformationPage(String text) {
        step("Getting the title of the Information Page");
        String pageTitle = pageInformationPage.getInfoPageTitle();
        step("Verifying the Page Information page for given article is displayed successfully");
        Assert.assertTrue(pageTitle.contains(text), "Information page for the given article is not displayed");
    }
}
