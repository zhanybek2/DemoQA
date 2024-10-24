package demoqa.drivers;

import demoqa.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");



        if(Boolean.parseBoolean(ConfigReader.getValue("headless"))){
            options.addArguments("--headless");
        }

//        Cookie cookie = new Cookie("JSESSIONID",ConfigReader.getValue("cookie"));

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.manage().addCookie(cookie);
        return driver;
    }
}
