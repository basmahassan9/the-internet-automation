package keys;

import base.baseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.keyPressPage;

import static org.testng.Assert.*;

public class keysTest extends baseTest {
    @Test
    public void testBackspace(){
        keyPressPage keyPage = homePage.clickKeyPressLink();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE","wrong text");
    }

    @Test
    public void testPi(){
        keyPressPage keyPage = homePage.clickKeyPressLink();
        keyPage.enterPi();
        assertEquals(keyPage.getResult(),"You entered: 4","wrong text");

    }

}
