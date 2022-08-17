package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class multiplwWindows {
    private WebDriver driver;

    public multiplwWindows(WebDriver driver){
        this.driver = driver;
    }
    public void clickHereBtn(){
        driver.findElement(By.linkText("Click Here")).click();
    }

}
