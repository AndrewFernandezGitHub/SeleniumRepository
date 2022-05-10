package com.SeleniumSyntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*HW
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser

 */
public class FormFill {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Andrew");
        driver.findElement(By.id("customer.lastName")).sendKeys("Slamdrew");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Anywhere");
        driver.findElement(By.id("customer.address.state")).sendKeys("RandomState");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("189-203-4920");
        driver.findElement(By.id("customer.ssn")).sendKeys("1234987654");
        driver.findElement(By.id("customer.username")).sendKeys("MyUserName");
        driver.findElement(By.id("customer.password")).sendKeys("MyPassword123!");
        driver.findElement(By.id("repeatedPassword")).sendKeys("MyPassword123!");
        driver.findElement(By.className("button")).click();
        driver.quit();


    }
}
