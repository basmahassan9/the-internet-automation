package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wysiwygPage {

    public WebDriver driver;
    private By textArea = By.id("tinymce");
    private By justifyBtn = By.xpath(".//button[@title='Justify']");
    public wysiwygPage(WebDriver driver){
        this.driver = driver;
    }
    private void switchToFrame(){
        driver.switchTo().frame("mce_0_ifr");

    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public void clearTextArea(){
        switchToFrame();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void addText(String text){
        switchToFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void clickJustifyBtn(){
        driver.findElement(justifyBtn).click();
    }
    public String getText(){
        switchToFrame();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }




}
