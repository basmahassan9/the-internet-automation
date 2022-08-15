package hover;

import base.baseTest;
import org.testng.annotations.Test;
import pages.FigureCaption;
import pages.hoverPage;

import static org.testng.Assert.*;

public class hoverTest extends baseTest {


    @Test
    public void testHoverPage()  {
    hoverPage hoverPage = homePage.clickHoverLink();

    FigureCaption caption = hoverPage.hoverOverFigure(1);
    assertTrue(caption.isCaptionDisplayed(),"not displayed");
    assertEquals(caption.getTitle(),"name: user1","wrong title");
    assertEquals(caption.getLinkText(),"View profile","wrong text");
    assertTrue(caption.getLink().endsWith("/users/1"),"wrong link");
    }
}
