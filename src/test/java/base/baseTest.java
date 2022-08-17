package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.homePage;
import utils.eventsReporter;
import utils.windowManager;

import java.io.File;
import java.io.IOException;

public class baseTest {
    public EventFiringWebDriver driver;
    public homePage homePage;

    public windowManager getWindowManager(){
        return new windowManager(driver);
    }
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new eventsReporter());
        goHome();
        setCookie();
        driver.manage().window().maximize();
        homePage = new homePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus())
        {TakesScreenshot camera = (TakesScreenshot)driver;
        File screen = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screen,new File("resources/screenshots/"+result.getName()+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("screen taken "+ screen.getAbsolutePath() );}
    }

    @AfterClass
    public void closeDriver(){
        driver.quit();

    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars"); // remove info bar that says run by automation
        //options.setHeadless(true); // run tests without opening browser

        return options;
    }
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("basma","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }


}
