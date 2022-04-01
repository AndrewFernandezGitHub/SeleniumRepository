package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 /* 1. launch the browser
         * 2. navigate to amazon web site
         * 3. print out the title and the url in the console
         * 4. close the browser*/
public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(title+" "+url);
        driver.quit();
    }
}
