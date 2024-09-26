package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.Languages;
import org.openqa.selenium.By;

public class WikiPage extends Form {
    private final ITextBox inputText = getElementFactory().getTextBox(By.xpath("//input[contains(@id,'searchInput')]"), "Search input");
    private final IButton searchButton = getElementFactory().getButton(By.xpath("//button[contains(@type,'submit')]"), "Search button");
    private final IComboBox searchLanguageBox = getElementFactory().getComboBox(By.xpath("//select[contains(@id,'searchLanguage')]"), "Search language", ElementState.EXISTS_IN_ANY_STATE);

    public WikiPage() {
        super(By.xpath("//nav[contains(@class,'central-featured')]"), "Wikipedia");
    }

    public void enterInput(String text) {
        inputText.type(text);
    }

    public void submitInput() {
        searchButton.click();
    }

    public void changeSearchLanguage(Languages language) {
        searchLanguageBox.selectByValue(language.getValue());
    }
}