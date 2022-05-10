package com.SeleniumSyntax.class04;
/*
        Open chrome browser
        Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify Syntax Logo is displayed.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        String header= driver.getTitle();
        System.out.println(header);


    }
}