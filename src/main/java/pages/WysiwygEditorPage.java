package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToFrame();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToFrame();
        driver.findElement(textArea).sendKeys();
       // switchToMainArea();
    }

    public void getTextFromEditor(String text){
        switchToFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToFrame();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToFrame(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
}
