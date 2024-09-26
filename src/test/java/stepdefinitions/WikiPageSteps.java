package stepdefinitions;

import constants.Languages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.WikiPage;

import static io.qameta.allure.Allure.step;

public class WikiPageSteps {

    private final WikiPage wikiPage = new WikiPage();

    @When("I enter {string} in the search field and click submit button")
    public void enterInputAndClick(String text) {
        step("Typing the Desired name in the Search Filed");
        wikiPage.enterInput(text);
        step("Clicking on the Submit Button");
        wikiPage.submitInput();
    }

    @When("I enter {string} in the search field, change search language to {string} and click submit button")
    public void enterSearchNameAndChangeLanguage(String text, String language) {
        step("Typing the Desired name in the Search Filed");
        wikiPage.enterInput(text);
        step(String.format("Changing the Search Language to %s", language));
        wikiPage.changeSearchLanguage(Languages.valueOf(language.toUpperCase()));
        step("Clicking on the Submit Button");
        wikiPage.submitInput();
    }

    @Then("Main Page is Displayed")
    public void validateMainPage() {
        step("Validating the Main Page is Displayed");
        Assert.assertTrue(wikiPage.state().isDisplayed(), "Wikipedia Page is not displayed");
    }
}
