import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ByClassDemo {
    @Test
    void byClassDemoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/text-box");

        driver.get("https://demoqa.com/webtables");
        WebElement addNewRecordBtn = driver.findElement(By.className("btn-primary"));
        addNewRecordBtn.click();
        Thread.sleep(4000);
    }
}