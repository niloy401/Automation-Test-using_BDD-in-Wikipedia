package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DownloadPage extends Form {
    private final IButton downloadButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Download button");
    private final ILabel pdfName = getElementFactory().getLabel(By.xpath("//div[contains(@class,'mw-electronpdfservice-selection-label-desc')]"), "Filename");

    public DownloadPage() {
        super(By.xpath("//div[contains(@class,'mw-electronpdfservice-selection-body')]"), "Download page");
    }

    public String getFileName() {
        return pdfName.getText();
    }

    public void clickDownloadButton() {
        downloadButton.click();
    }
}
