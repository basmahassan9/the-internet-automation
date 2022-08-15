package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertsPage {
    public WebDriver driver;
    public alertsPage(WebDriver driver){
        this.driver=driver;
    }
    private By firstButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By result = By.id("result");
    private By secondButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By thirdButton = By.xpath(".//button[text()='Click for JS Prompt']");
    public void triggerAlert(){
        driver.findElement(firstButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void confirmAlert(){
        driver.findElement(secondButton).click();
    }
    public void cancleAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void promtAlert(){
        driver.findElement(thirdButton).click();
    }
    public void enterTextAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
