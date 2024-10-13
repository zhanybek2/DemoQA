package demoqa_tests;

import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{

    @Test
    void testButtons() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        webElementActions.doubleClick(demoqaPages.getButtonsPage().doubleClickButton);
        Thread.sleep(400);
        webElementActions.rightClick(demoqaPages.getButtonsPage().rightClickButton);
        Thread.sleep(4000);

    }
}
