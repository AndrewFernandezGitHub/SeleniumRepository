package com.SeleniumSyntax.SeleniumReview03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitPractice2 {
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();

        WebElement welcome = driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        System.out.println(welcome.getText());
    }
}