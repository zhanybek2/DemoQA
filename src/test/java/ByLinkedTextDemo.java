import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ByLinkedTextDemo {
    @Test
    public void byLinkedTextTest()  {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/links");


        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();

        WebElement createdlink = driver.findElement(By.linkText("Created"));
        homeLink.click();

    }
}
