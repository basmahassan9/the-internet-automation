package frame;

import base.baseTest;
import org.testng.annotations.Test;
import pages.wysiwygPage;

import static org.testng.Assert.assertEquals;

public class frameTest extends baseTest {
    @Test
    public void frameTests(){
        wysiwygPage wysiwygPage = homePage.clickwysiwygLink();

        String s1 = "Hello ";
        String s2 = "world";

        wysiwygPage.clearTextArea();
        wysiwygPage.addText(s1);
        wysiwygPage.clickJustifyBtn();

        wysiwygPage.addText(s2);

        assertEquals(wysiwygPage.getText().contains(s1+s2), true,"wrong text");

    }
}
