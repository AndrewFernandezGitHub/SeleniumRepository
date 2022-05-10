package com.SeleniumSyntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

/*click on help link switch between tabs

 */
public class SimpleWindowHandling {
   public static String url="http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();//this is main page, other tabs are child pages/handle
        System.out.println(mainPageHandle);

        WebElement helpLink= driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//store all the handles in a set
        System.out.println(allWindowHandles.size());

        Iterator<String> it= allWindowHandles.iterator();//have an iterator in order to iterate through the handles
        mainPageHandle=it.next();//take the first step and assign the main handle
        String childHandle=it.next();//take the second step and have a child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        //driver.switchTo().window(mainPageHandle);
        driver.switchTo().window(childHandle);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        helpLink.click();



    }
}
