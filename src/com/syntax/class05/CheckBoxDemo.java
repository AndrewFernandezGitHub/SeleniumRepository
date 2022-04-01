package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//code to click on check boxes inside a webelement that has multiple checkboxes
import java.util.List;

public class CheckBoxDemo {

   public static String url =("https://www.syntaxprojects.com/basic-checkbox-demo.php");
   //converts url in local variable url if in main, in this instance it's a static
    //can't have non-static variables inside a static method

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        //locating checkboxes and storing them in the list
        List<WebElement> optionCheckboxes=driver.findElements(By.cssSelector("input[class='cb1-element']"));//this is string the web elements into a list
        int size =optionCheckboxes.size();
        System.out.println(size);

        //looping through each element from the list lne 21
        for(WebElement option:optionCheckboxes){
           // option.click();//this is clicking the actual check boxes
            String checkBoxValue=option.getAttribute("value");
            if (checkBoxValue.equals("Option-2")){
                option.click();
                break;
            }
        }
    }
}
