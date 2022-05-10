package com.SeleniumSyntax.class05;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class AuthenticationAlert {
    public static String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";

    //username:password@
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
