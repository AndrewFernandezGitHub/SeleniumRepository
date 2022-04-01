package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrdersTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        String title=driver.getTitle();
        String expectedTitle="Web Orders";
        if(title.equals(expectedTitle)){//could also directly put text"web orders in title.equals("Web Orders")
            System.out.println("Title is Correct");
        }else{
            System.out.println("Title is incorrect");
        }
        driver.findElement(By.linkText("Logout"));
        driver.quit();

    }
}
