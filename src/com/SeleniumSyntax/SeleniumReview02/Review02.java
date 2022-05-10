package com.SeleniumSyntax.SeleniumReview02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Review02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleButton = driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));
        //check if the radio button is enabled
        System.out.println("the female radio button is enabled" + femaleButton.isEnabled());
        //check if the radio button is displayed on the page
        System.out.println("the female radio button is displayed" + femaleButton.isDisplayed());
        //check if it's selected or not
        System.out.println("the female radio button is selected" + femaleButton.isSelected());

        if (!femaleButton.isSelected()) {
            femaleButton.click();
        }
        //check the status of selection again
        System.out.println("the female radio button is selected" + femaleButton.isSelected());

        //how to retrieve all links in the current web page
        //locator use anchor tag "a" in this case and usually

        List<WebElement> links = driver.findElements(By.tagName("a"));//use elements when pulling multiple links
        //List<WebElement> stores the multiple web elements (links) in a list

        //uses loop to print the links after using advanced loop to convert it into single element
        for (WebElement link : links) {
            String name = (link.getText());
            if (!name.isEmpty()) {
                System.out.println(name);
            }
        }
    }
}
