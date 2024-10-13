package demoqa_tests;

import demoqa.helper.BrowserManager;
import org.testng.annotations.Test;

public class FramesTests  extends BaseTest{

    @Test
    void testFrames(){
        helper.getBrowserManager().openUrl("https://demoqa.com/frames");
        helper.getiFrameHelper().switchToIframe(demoqaPages.getFramesPage().frame1);
        System.out.println(webElementActions.getTextFromElement(demoqaPages.getFramesPage().sampleHeading));
        helper.getiFrameHelper().switchToDefaultIFrame();
        System.out.println(webElementActions.getTextFromElement(demoqaPages.getFramesPage().textCenter));
        helper.getiFrameHelper().switchToFrmeByIndex(2);
        System.out.println(webElementActions.getTextFromElement(demoqaPages.getFramesPage().sampleHeading));


    }
}
