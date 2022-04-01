package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //for windows add extension .exe
        WebDriver driver = new ChromeDriver();//this is code to setup automated launch of browser
        driver.get("https://www.google.com/");//navigated to actual website
        String url=driver.getCurrentUrl();//convert url to string
        System.out.println(url);//print the url
        String title=driver.getTitle();//convert title to string
        System.out.println(title);//print title
        driver.quit();//closes the browser

    }
}
