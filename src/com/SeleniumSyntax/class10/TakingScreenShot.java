package com.SeleniumSyntax.class10;
//this code works
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));//username /we get an web element in return.
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password")); //password
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();//log in button
//uses new object to take screenshot from TakesScreenShot interface
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);//screenshot is taken in this step as it returns a file , now need to store it somewhere


        try {                                              //first folder-secondfolder-file
            FileUtils.copyFile(sourceFile, new File("screenshots/SmartBear/adminlogin01.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
