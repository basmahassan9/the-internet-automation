package navigation;

import base.baseTest;
import org.testng.annotations.Test;
import pages.DLExample2Page;

import static org.testng.Assert.assertEquals;

public class navigationTests extends baseTest {
    @Test
    public void testNav() throws InterruptedException {
        homePage.clickdynamicLink().clickExample1();
        getWindowManager().goBack();
        Thread.sleep(2000);
        getWindowManager().refreshPage();
        Thread.sleep(2000);
        getWindowManager().goForward();
        Thread.sleep(2000);
        getWindowManager().goTo("https://google.com");
        Thread.sleep(2000);
    }
    @Test
    public void testSwitchTab() throws InterruptedException {
        homePage.clickmultiLink().clickHereBtn();
        getWindowManager().switchToTab("New Window");
        Thread.sleep(2000);
    }
    @Test
    public void tabSwitchTest(){
        homePage.clickdynamicLink().clickExample2s();
        DLExample2Page page = getWindowManager().switchToTab1();
        page.clickStart();
        assertEquals(page.getText(),"Hello World!","wrong text");

    }
}
