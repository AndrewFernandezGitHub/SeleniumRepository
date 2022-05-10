package com.SeleniumSyntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuments {
    public static String url = "https://the-internet.herokuapp.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/andrewfernandez/Desktop/Syntax Technologies/Selenium/SampleScreenShot");
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        Thread.sleep(2000);
        uploadButton.click();
    }
}