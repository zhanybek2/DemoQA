package demoqa_tests;

import org.testng.annotations.Test;

import java.util.List;

public class MultiSelectTest extends BaseTest{
    @Test
    void multiSelecTest() throws InterruptedException {
        helper.getBrowserManager().openUrl("https://demoqa.com/select-menu");
       helper.getDropdownHelper().selectByText(demoqaPages.multiSelectPage.cars, "Volvo");
        Thread.sleep(5000);
        List<String> cars = helper.getDropdownHelper().getAllDropdownValues(demoqaPages.multiSelectPage.cars);
        for (String car:cars){
            System.out.println(car);
        }
    }

}
