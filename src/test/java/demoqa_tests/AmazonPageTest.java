package demoqa_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import java.util.List;

public class AmazonPageTest extends BaseTest {
    @Test
    void amazonTest() throws InterruptedException {
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("Iphone", Keys.ENTER);
        Thread.sleep(4000);

        List<WebElement> brands = driver.findElements(By.xpath("//div[@id ='brandsRefinements']/ul/span/span/li"));
        for (int i = 0; i < brands.size(); i++) {
            try {
                brands = driver.findElements(By.xpath("//div[@id ='brandsRefinements']/ul/span/span/li/span/a"));
                if (i < brands.size()) {
                    brands.get(i).click();
                    Thread.sleep(3000);
                    driver.navigate().refresh();
                } else {
                    System.out.println("Элемент с индексом" + i + " не найден после ");
                }

            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
                System.out.println("Sc c c");
            }
        }

    }
}



