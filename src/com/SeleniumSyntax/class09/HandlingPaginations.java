package com.SeleniumSyntax.class09;
//this code works
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingPaginations {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //login actions
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        //navigating to employee page
        WebElement pimButton = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimButton.click();
        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();

        //adding an employee and saving
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Andrew");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Fernandez");
        WebElement empIdField = driver.findElement(By.id("employeeId"));
        String empId = empIdField.getAttribute("value");
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();


        WebElement employeeListButton = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeeListButton.click();

        //  List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
        // WebElement nextButton = driver.findElement(By.linkText("Next")); put these two lines in correct space to avoide stale exception

        boolean flag = true;
        while (flag) {
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));//re initialize all the elements because the page gets refreshed after the next click
            for (int i = 0; i < tableRows.size(); i++) {
                String rowText = tableRows.get(i).getText();
                if (rowText.contains(empId)) {
                    flag = false;
                    System.out.println(rowText);
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[" + i + "]/td[1]"));
                    checkbox.click();
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;
                }
            }
            if (flag) {
                WebElement nextButton = driver.findElement(By.linkText("Next"));
                nextButton.click();
            }
        }
    }
}