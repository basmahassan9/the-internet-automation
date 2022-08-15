package dropdown;

import base.baseTest;
import org.testng.annotations.Test;
import pages.dropdownPage;

import java.util.List;

import static org.testng.Assert.*;

public class dropdownTest extends baseTest {

    @Test
    public void testSelectedOption(){
        dropdownPage dropdownPage = homePage.clickDropLink();
        dropdownPage.selectItem("Option 1");
        List<String> options =dropdownPage.getItemsValue();
        assertEquals(options.size(),1,"incorrect number");
        assertTrue(options.contains("Option 1"),"wrong option");
    }
}
