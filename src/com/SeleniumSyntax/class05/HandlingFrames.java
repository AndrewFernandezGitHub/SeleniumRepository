package com.SeleniumSyntax.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 12 forever");
        driver.switchTo().defaultContent();//switches back to default content from frame
        //whenever dealing with frames, you switch to the frames then switch back to default content

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.switchTo().frame("iframe_a");//switches to frame
        textbox.clear();//clears text
        textbox.sendKeys("we are back to frame");

        driver.switchTo().defaultContent();

        WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("goodnight");

    }
}
