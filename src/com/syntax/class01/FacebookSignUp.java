package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* navigate to fb.com
         click on create new account
         fill up all the textboxes
         click on sign up button
         close the pop up
         close the browser

 */
public class FacebookSignUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Bob");
        driver.findElement(By.name("lastname")).sendKeys("Dole");
        driver.findElement(By.name("reg_email__")).sendKeys("Bobdole1223432342@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Bobdole1223432342@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("myPassword123!");
        driver.findElement(By.name("birthday_month")).sendKeys("May");
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        driver.findElement(By.name("birthday_year")).sendKeys("1980");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(4000);
        driver.quit();



    }
}
