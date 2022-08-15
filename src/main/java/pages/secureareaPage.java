package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secureareaPage {
    public WebDriver driver;
    public secureareaPage(WebDriver driver){
        this.driver=driver;

    }
    public By statusAlert = By.id("flash");

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
