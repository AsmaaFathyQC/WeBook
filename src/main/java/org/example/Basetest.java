package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Basetest {
    protected WebDriver driver;
    protected WebDriverWait wait;

   @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AsmaaFathy\\Desktop\\untitled\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://webook.com/en");
    }



   @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}