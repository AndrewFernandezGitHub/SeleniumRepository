package com.SeleniumSyntax.SeleniumReview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReviewBasic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");//go to wedsbite
       // driver.navigate().to("http://www.gmail.com");
        WebElement username=driver.findElement(By.id("userName"));//search for webelement using a locator
      //  username.sendKeys("Hellohowareyou");
       // Thread.sleep(2000);
        //username.clear();
        //username.sendKeys("Fire");
        driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("isthisworking");
    }
}
