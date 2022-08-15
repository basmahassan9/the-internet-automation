package alerts;

import base.baseTest;
import org.testng.annotations.Test;
import pages.uploadPage;

import static org.testng.Assert.assertEquals;

public class uploadTest extends baseTest {
    @Test
    public void testFileUpload(){
        uploadPage uploadPage = homePage.clickUploadLink();
        uploadPage.uploadFile("C:\\Users\\Basma\\IdeaProjects\\the-internet-automation\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getText(),"chromedriver.exe","wrong text");
    }
}
