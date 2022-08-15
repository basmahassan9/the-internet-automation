package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.homePage;

public class baseTest {
    public WebDriver driver;
    public homePage homePage;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
        homePage = new homePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();

    }


}
