package advanced_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {
    @Test
    void datePickerDemoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/date-picker");

        WebElement datePicker = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
        datePicker.click();
        Thread.sleep(4000);

        List<WebElement> days = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div[contains(@aria-label,'October')]"));
        for (WebElement dDays : days){
            System.out.println(dDays.getText());
        }
        driver.close();
    }
}
