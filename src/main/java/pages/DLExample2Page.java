package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DLExample2Page {
    public WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    public DLExample2Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStart(){
        driver.findElement(startBtn).click();

        WebDriverWait wait = new WebDriverWait(driver ,java.time.Duration.ofSeconds(5) );
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));

    }
    public String getText(){
        return driver.findElement(By.id("finish")).getText();
    }
}
