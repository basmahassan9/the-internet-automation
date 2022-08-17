package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dyamicLoadingPage {
    public WebDriver driver;
    private By link1= By.xpath("//a[contains(text() , \"Example 1\")]");
    private By link2= By.xpath("//a[contains(text() , \"Example 2\")]");
    public dyamicLoadingPage(WebDriver driver){
        this.driver =driver;
    }
    public DLExample1Page clickExample1(){
        driver.findElement(link1).click();
        return new DLExample1Page(driver);

    }
    public DLExample2Page clickExample2(){
        driver.findElement(link2).click();
        return new DLExample2Page(driver);

    }
    }
