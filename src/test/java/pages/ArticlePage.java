package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ArticlePage extends Form {
    private final ILabel toolLabel = getElementFactory().getLabel(By.xpath("//nav[contains(@class,'tools-landmark')]"), "Tool label");
    private final IButton pdfButton = getElementFactory().getButton(By.xpath("//li[contains(@id,'coll-download-as-rl')]//a"), "PDF button");
    private final IButton pageInformationButton = getElementFactory().getButton(By.xpath("//li[contains(@id,'t-info')]//a"), "Page information button");
    private final ILabel articlePageTitle = getElementFactory().getLabel(By.xpath("//h1[contains(@id,'firstHeading')]"), "Article page title");

    public ArticlePage() {
        super(By.xpath("//div[contains(@id,'vector-toc-pinned-container')]"), "Article page");
    }

    public void clickToolButton() {
        toolLabel.state().waitForDisplayed();
        toolLabel.click();
    }

    public void clickPDFButton() {
        pdfButton.click();
    }

    public void clickPageInformationButton() {
        pageInformationButton.click();
    }

    public String getArticlePageTitle() {
        return articlePageTitle.getText();
    }
}
