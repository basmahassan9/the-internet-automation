package login;

import base.baseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import pages.secureareaPage;

import static org.testng.Assert.*;

public class loginTest extends baseTest {

    @Test
    public void testSuccessfullLogin(){
       loginPage loginPage= homePage.clickauthLink();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       secureareaPage securePage =loginPage.pressBtn();
       assertTrue(securePage.getAlertText().contains("You logged into a secure area!"),"wroong msg");

    }
}
