package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private final WebDriver driver;

    private final By createAccount = By.xpath("//div/button[contains(.,'Create an account')]");
    private final By firstName = By.name("first_name");
    private final By lastName = By.name("last_name");
    private final By Email = By.name("email");
    private final By confirmEmail = By.name("confirm_email");
    private final By passWord = By.name("password");
    private final By moBile = By.name("mobile");
    private final By termsCondition = By.name("agreeTerms");
    private final By Agree = By.name("newsletterAgree");
    private final By CreateButton = By.xpath("//button[@type='submit']");

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
    }

    public void register(String fr_name, String ls_name, String eMail,String confirm_email,String Password,String Mobile) throws InterruptedException {
        driver.findElement(createAccount).click();
        Thread.sleep(2000);
        driver.findElement(firstName).sendKeys(fr_name);
        driver.findElement(lastName).sendKeys(ls_name);
        driver.findElement(Email).sendKeys(eMail);
        driver.findElement(confirmEmail).sendKeys(confirm_email);
        driver.findElement(passWord).sendKeys(Password);
        driver.findElement(moBile).sendKeys(Mobile);
        driver.findElement(termsCondition).click();
        driver.findElement(Agree).click();
        driver.findElement(CreateButton).click();
        Thread.sleep(5000);






    }
}