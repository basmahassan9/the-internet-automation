package javascript;

import base.baseTest;
import org.testng.annotations.Test;

public class javascriptTest extends baseTest {
    @Test
    public void testScroll() throws InterruptedException {
         homePage.clickLargeLink().scrollToTable();
        // Thread.sleep(2000);
    }
}
