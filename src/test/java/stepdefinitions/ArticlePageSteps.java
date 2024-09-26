package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ArticlePage;

import static io.qameta.allure.Allure.step;

public class ArticlePageSteps {

    private final ArticlePage articlePage = new ArticlePage();

    @When("I click the tool menu button and Download as PDF button on the Article page")
    public void clickToolButtonAndPDFButton() {
        step("Clicking on the Tool Menu Button");
        articlePage.clickToolButton();
        step("Clicking on the Download as PDF Button");
        articlePage.clickPDFButton();
    }

    @And("I click the tool menu button and Page Information button on the Article page")
    public void clickToolButtonAndPageInformationButton() {
        step("Clicking on the Tool Menu Button");
        articlePage.clickToolButton();
        step("Clicking on the Page Information Button");
        articlePage.clickPageInformationButton();
    }

    @Then("Article page for the {string} name is opened successfully")
    public void isArticlePageOpened(String string) {
        step("Getting the name of Article Page Title");
        String articlePageTitle = articlePage.getArticlePageTitle();
        step("Verifying the Article Page with the desired name is Opened Successfully");
        Assert.assertTrue(articlePageTitle.contains(string), "Article page for the given name is not open.");
    }
}
