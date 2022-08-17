package wait;

import base.baseTest;
import org.testng.annotations.Test;
import pages.DLExample1Page;
import pages.DLExample2Page;

import static org.testng.Assert.assertEquals;

public class waitTest extends baseTest {
    @Test
    public  void testWait(){
        DLExample1Page page = homePage.clickdynamicLink().clickExample1();
        page.clickStart();
        assertEquals(page.getText(),"Hello World!","wrong text");
    }
    @Test
    public  void testWait2(){
        DLExample2Page page = homePage.clickdynamicLink().clickExample2();
        page.clickStart();
        assertEquals(page.getText(),"Hello Wdorld!","wrong text");
    }
    @Test
    public void testWaits() throws InterruptedException {
        homePage.clickdynamicLink().clickExample2s();

    }
}
