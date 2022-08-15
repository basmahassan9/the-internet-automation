package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uploadPage {
    public WebDriver driver;
    public uploadPage(WebDriver driver){
        this.driver = driver;
    }
    private By input = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");
    /**
     * provides path of file
     * @param path the complete path of file
     */
    public void uploadFile(String path){
        driver.findElement(input).sendKeys(path);
        clickUpload();

    }
    public void clickUpload(){
        driver.findElement(uploadButton).click();
    }

    public String getText(){
        return driver.findElement(uploadedFiles).getText();
    }
}
