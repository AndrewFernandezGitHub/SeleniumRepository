package com.SeleniumSyntax.class10;
//this code works
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClassDemo {
    /*
    navigate to amazon
    hover over the cursor onto accounts and lists element
     */
    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement accountsAndLists=driver.findElement(By.id("nav-link-accountList"));
        Actions action=new Actions(driver);
        action.moveToElement(accountsAndLists).build().perform();

    }
}