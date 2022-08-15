package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    public WebDriver driver;

    public loginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public By username = By.id("username");
    public By password = By.id("password");
    public By loginBtn = By.cssSelector("#login button");

    public void setUsername(String name){
        driver.findElement(username).sendKeys(name);
    }
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public secureareaPage pressBtn(){
        driver.findElement(loginBtn).click();
        return new secureareaPage(driver);
    }
}
