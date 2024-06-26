package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    WebDriver driver;
    By searchBar = By.xpath("//input[@type='search']");
    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;

    }
    public void search(String query) throws InterruptedException {
// filter using restaurants category
        driver.findElement(By.xpath("//input[@type='search']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"radix-:r0:\"]/div[2]/ul/li[3]/a/span")).click();
        Thread.sleep(2000);

        WebElement searchInput = driver.findElement(searchBar);

        searchInput.sendKeys(query);
        searchInput.submit();
    }



}