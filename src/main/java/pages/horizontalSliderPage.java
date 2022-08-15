package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class horizontalSliderPage {
    public WebDriver driver;
    public horizontalSliderPage(WebDriver driver){
        this.driver= driver;
    }

    private By slider = By.cssSelector("div.sliderContainer input");
    private By result = By.id("range");
    public void sendSliderKeys(){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
