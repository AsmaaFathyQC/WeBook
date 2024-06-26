package org.example;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebookTest extends Basetest {

     HomePage homePage;
     RegisterPage registerPage;
    SearchPage searchPage;

    @BeforeMethod
    public void setUpPages() {
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver,wait);
        searchPage = new SearchPage(driver, wait);
    }

    @Test
    public void testRegistration() throws InterruptedException {
        // Registration flow
        homePage.clickSignUp();
        registerPage.register("Asmaa", "Fathy", "asma0a1@gmail.com", "asma0a1@gmail.com", "Test1234@#$", "588713023");
        driver.findElement(By.xpath("//li/button[@aria-haspopup='dialog']")).click();
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.xpath("//button[@data-menuitem='logout']"));
        Thread.sleep(2000);
        Assert.isTrue(logout.isDisplayed(), "Can't see logout btn.");

    }
    @Test(dependsOnMethods ="testRegistration")         //Search and apply filter
        public void testSearch() throws InterruptedException {
        searchPage.search("ferdi");
            Thread.sleep(3000);
        }
    }
