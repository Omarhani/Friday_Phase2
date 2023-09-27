package frame;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYDEditorPage;


public class FrameTests extends BaseTests {

    @Test
    public void testFrame() throws InterruptedException {
        WYSIWYDEditorPage wysiwydEditorPage =homePage.clickOnWYSIWYGEditorLink();
        Thread.sleep(3000);
        wysiwydEditorPage.clearText();
        wysiwydEditorPage.insertInField("Hello ");
        wysiwydEditorPage.clickOnIncreaseIndent();
        wysiwydEditorPage.insertInField("World!");
        Thread.sleep(3000);

    }

}
