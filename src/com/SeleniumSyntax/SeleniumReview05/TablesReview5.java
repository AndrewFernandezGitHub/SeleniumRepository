package com.SeleniumSyntax.SeleniumReview05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesReview5 {
    //Go to aa.com/homePage.do
    ///select depart date
    // select return date
    // select destination
    //click on search
    //quit the browser
    public static String url = "https://aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement departureBox = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        departureBox.clear();
        departureBox.sendKeys("SFO", Keys.ARROW_DOWN);
        WebElement arrivalBox = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        arrivalBox.sendKeys("YYZ", Keys.ARROW_DOWN);
        WebElement passengerSelectBox = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
        Select select = new Select(passengerSelectBox);
        select.selectByValue("3");
        WebElement departureMonth = driver.findElement(By.className("ui-datepicker-trigger"));
        departureMonth.click();
        WebElement nextbutton = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
        WebElement depMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'][1])"));
        String depMonthText = depMonth.getText();
        while (!depMonthText.equals("June")) {
            nextbutton.click();
            nextbutton = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
            depMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'][1])"));
            depMonthText = depMonth.getText();
        }

        List<WebElement> departureDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
        for (WebElement departureDate : departureDates) {
            if (departureDate.getText().equals("1")) {
                departureDate.click();
                break;
            }
        }
        driver.findElement(By.xpath("(//button[@class = 'ui-datepicker-trigger'])[2]")).click();

        WebElement returnMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'][1])"));
        String retMonthText = returnMonth.getText();
        nextbutton = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
        while (!retMonthText.equals("August")) {
            nextbutton.click();
            nextbutton = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
            returnMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            retMonthText = returnMonth.getText();
        }

        List<WebElement> arrivalDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
        for (WebElement arrivalDate : arrivalDates) {
            if (arrivalDate.getText().equals("1")) {
                arrivalDate.click();
                break;
            }
        }
        WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchButton.click();
        driver.quit();
    }
}
