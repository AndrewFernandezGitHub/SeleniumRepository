package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.google.com/");//with navigate you can go back and forth
        driver.navigate().back();//navigates back a page
        driver.navigate().forward();//navigates forward a page
        Thread.sleep(2000);//slows down so you can see steps
        driver.navigate().refresh();//refreshes page
        //driver.close();//will close the current tab
        driver.quit();//will close the whole browser
    }
}
