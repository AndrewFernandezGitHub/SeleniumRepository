package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//gets total number of links in a url in an array list
        System.out.println("Number of links" + allLinks.size());

        for (WebElement link : allLinks) {//loop for all links
            String linkText = link.getText();//gets all texts for links
            String fullLink=link.getAttribute("href");
            if (!linkText.isEmpty()) {//trims white space from texts
                System.out.println(linkText+" "+fullLink);//prints whats gathered and stored
            }
        }
    }
}