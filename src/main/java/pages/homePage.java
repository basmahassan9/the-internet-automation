package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {

   public WebDriver driver ;
    public homePage(WebDriver driver){
        this.driver= driver;
    }

    public loginPage clickauthLink(){
        clickLink("Form Authentication");
        return new loginPage(driver);
    }

    public dropdownPage clickDropLink(){
        clickLink("Dropdown");
       return new dropdownPage(driver);
    }
    public hoverPage clickHoverLink(){
        clickLink("Hovers");
        return new hoverPage(driver);
    }
    public keyPressPage clickKeyPressLink(){
        clickLink("Key Presses");
        return new keyPressPage(driver);
    }
    public horizontalSliderPage clickSliderLink(){
        clickLink("Horizontal Slider");
        return new horizontalSliderPage(driver);
    }
    public alertsPage clickAlertLink(){
        clickLink("JavaScript Alerts");
        return new alertsPage(driver);
    }
    public wysiwygPage clickwysiwygLink(){
        clickLink("WYSIWYG Editor");
        return new wysiwygPage(driver);
    }
    public dyamicLoadingPage clickdynamicLink(){
        clickLink("Dynamic Loading");
        return new dyamicLoadingPage(driver);
    }
    public uploadPage clickUploadLink(){
        clickLink("File Upload");
        return new uploadPage(driver);
    }
    public largAndDeepPage clickLargeLink(){
        clickLink("Large & Deep DOM");
        return new largAndDeepPage(driver);
    }
    public void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }


}
