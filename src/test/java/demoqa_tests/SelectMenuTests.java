package demoqa_tests;

import demoqa.OldStyleSelectMenuValues;
import org.testng.annotations.Test;

import java.util.List;

public class SelectMenuTests extends BaseTest{
    @Test
    void selectMenuTest() throws InterruptedException {
        helper.getBrowserManager().openUrl("https://demoqa.com/select-menu");
        helper.getDropdownHelper().selectByText(demoqaPages.selectMenuPage.oldStyleSelectMenu, OldStyleSelectMenuValues.GREEN.getColor());
        Thread.sleep(5000);
        helper.getDropdownHelper().selectByIndex(demoqaPages.selectMenuPage.oldStyleSelectMenu,7);
        Thread.sleep(5000);
        helper.getDropdownHelper().selectByValue(demoqaPages.selectMenuPage.oldStyleSelectMenu,"8");
        Thread.sleep(5000);
        helper.getDropdownHelper().selectByValue(demoqaPages.selectMenuPage.oldStyleSelectMenu,"red");
        Thread.sleep(5000);
        List<String> colors = helper.getDropdownHelper().getAllDropdownValues(demoqaPages.selectMenuPage.oldStyleSelectMenu);
        for (String color:colors){
            System.out.println(color);
        }
        Thread.sleep(10000);



    }
}
