package slider;

import base.baseTest;
import org.testng.annotations.Test;
import pages.horizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class sliderTest extends baseTest {
    @Test
    public void sliderTests(){
        horizontalSliderPage sliderPage = homePage.clickSliderLink();
        for(int i = 0;i<8; i++){
            sliderPage.sendSliderKeys();
        }
        assertEquals(sliderPage.getResult(),"4","wrong number");
    }
}
