package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.fb.com");//make sure to use the right name for the variable  in the id
        driver.findElement(By.id("email")).sendKeys("Syntax@sdsldk.com");//this is saying to find the email input box by its id
        driver.findElement(By.id("pass")).sendKeys("whatever");//types the password in
        driver.findElement(By.name("login")).click();//.click is to click on the buttons
        Thread.sleep(2000);//slows down script long enough to register loaded page properly
        //driver.findElement(By.linkText("Forgot password?")).click();// if script runs too fast, add a pause or wait
        driver.findElement(By.partialLinkText("Forgot")).click();//to find by partial link text
        driver.quit();
    }
}
