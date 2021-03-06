package com.SeleniumSyntax.SeleniumReview03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    public static String url="http://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        //find alert and click on it
       WebElement simpleAlert= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();

        //handling the alert
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        WebElement jsalert=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        jsalert.click();
        Thread.sleep(2000);
        driver.switchTo().alert();

        Thread.sleep(2000);
        alert.sendKeys("Hello everyone!!!!");
        alert.accept();



    }
}
