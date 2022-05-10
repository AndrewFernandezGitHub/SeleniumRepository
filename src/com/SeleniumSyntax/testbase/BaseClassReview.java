package com.SeleniumSyntax.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClassReview {

    public static WebDriver driver;

    /**
     * open the browser and navigate to specific URL
     * @param url
     */
    public static void openWithSpecificURL1(String url){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void tearDown1(){
        if (driver != null) {
            driver.quit();
        }
    }
}

