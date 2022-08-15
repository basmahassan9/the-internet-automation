package alerts;

import base.baseTest;
import org.testng.annotations.Test;
import pages.alertsPage;

import static org.testng.Assert.assertEquals;

public class alertTest extends baseTest {
@Test
    public void testAccept(){
    alertsPage alertsPage = homePage.clickAlertLink();
    alertsPage.triggerAlert();
    alertsPage.acceptAlert();
    assertEquals(alertsPage.getResult(),"You successfully clicked an alert","wrong message");
}

@Test
    public void testConfirm(){
    alertsPage alertsPage = homePage.clickAlertLink();
    alertsPage.confirmAlert();
    String text = alertsPage.getAlertText();
    alertsPage.cancleAlert();
    assertEquals(text,"I am a JS Confirm","wrong text");
}

@Test
    public void testPrompt(){
    alertsPage alertsPage = homePage.clickAlertLink();
    alertsPage.promtAlert();
    alertsPage.enterTextAlert("basma");
    alertsPage.acceptAlert();
    assertEquals(alertsPage.getResult(),"You entered: basma","wron text");
}

}
