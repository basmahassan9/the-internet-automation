package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class keyPressPage {
    public WebDriver driver;
    public keyPressPage(WebDriver driver){
        this.driver = driver;
    }
    private By inputField = By.id("target");
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    private By resultText = By.id("result");

    public String getResult(){
        return driver.findElement(resultText).getText();
    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"p") + "= 3.14");
    }

}
