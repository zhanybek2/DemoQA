import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class ByIdDemo {
    @Test
    void byIdTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("John Doe");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("john.doe@gmail.com");

        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("Wall street 123");

        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys("Some street 123");



        WebElement submitBtn = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitBtn).perform();
        submitBtn.click();

        WebElement result = driver.findElement(By.xpath("//p[@id='currentAddress' and text()='Some street 123']"));
        System.out.println(result.getText());

        Thread.sleep(4000);
        driver.close();
       driver.quit();

//       WebElement responseName =driver.findElement(By.id("name"));
//       Assert.assertEquals(responseName.getText(),"Name:John Doe");
//
//       WebElement responseEmail = driver.findElement(By.id("email"));
//       Assert.assertEquals(responseEmail.getText(),"Email:john.doe@gmail.com");
//

    }
}
