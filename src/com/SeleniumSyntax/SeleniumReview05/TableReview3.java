package com.SeleniumSyntax.SeleniumReview05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableReview3 {
    public static String url = "https://www.techlistic.com/p/demo-selenium-practice.html";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       /*
        //accessing the whole web tables
        //WebElement wholeTable=driver.findElement(By.xpath("//table[@id='customers']"));
        //line above prints the whole table as one element
        // print the table
        //System.out.println(wholeTable.getText());

        //Accessing the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows) {
            String text = row.getText();
            if (text.contains("Germany")) {
                System.out.println(text);
            }
        }
    }
}


    */
        //print all the companies that are located n UK and get all the entriees in colum 3 i.e COUNTRY

        List<WebElement> countries = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
        int i = 1;
        for (WebElement country : countries) {
            String nameOfCountry = country.getText();
            if (nameOfCountry.equals("UK")) {
                System.out.println(i);
                WebElement company = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + (i+1) + "]/td[1]"));
                System.out.println("The company in the UK is " + company.getText());
            }
            i = i + 1;
        }
    }
}
//if column location may change
//get the headers then find out the location of column that has country
//from there he will get the header index of the header
//then that should be placed in front of the td