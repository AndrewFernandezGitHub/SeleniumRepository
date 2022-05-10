package com.SeleniumSyntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    /*
    click on buttons an open new windows (tabs)
    switch to windows and perform different actions
     */

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
//with link text get rid of spaces
        igButton.click();
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//4 different windows, the three pop ups and parent class
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()) {//start iterating through handles
            String handle = it.next();//get the next handles
            if (!mainPageHandle.equals(handle)) {//set a condition of mainpage handles s child page handles
                driver.switchTo().window(handle);//switch to a window which is not equal to main page handle
                //driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();

            }
        }
        driver.switchTo().window(mainPageHandle);//switching back to parent handle
        igButton.click();//
    }
}