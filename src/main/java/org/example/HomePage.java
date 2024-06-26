package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Instant;

public class HomePage {
     WebDriver driver;

     By signUpButton = By.xpath("//a[@data-testid='login-profile']");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
    }

    public void clickSignUp( ) throws InterruptedException {
        Thread.sleep(2000);

        driver.findElement(signUpButton).click();
        Thread.sleep(2000);


    }



}