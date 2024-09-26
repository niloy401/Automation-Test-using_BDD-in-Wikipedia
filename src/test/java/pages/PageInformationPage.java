package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class PageInformationPage extends Form {
    private final ILabel informationPageTitle = getElementFactory().getLabel(By.xpath("//h1[contains(@id,'firstHeading')]"), "Information Page Title");

    public PageInformationPage() {
        super(By.xpath("//div[contains(@id,'mw-indicator-mw-helplink')]"), "Page Information");
    }

    public String getInfoPageTitle() {
        return informationPageTitle.getText();
    }
}
