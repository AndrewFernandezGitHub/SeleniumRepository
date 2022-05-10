package com.SeleniumSyntax.pages;

import com.SeleniumSyntax.utils.CommonMethodsReview;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageReview extends CommonMethodsReview {

    public WebElement username = driver.findElement(By.id("txtUsername"));
    public  WebElement password = driver.findElement(By.id("txtPassword"));
    public  WebElement loginButton = driver.findElement(By.id("btnLogin"));
    //public WebElement invalidCredentialsMsg=driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
}
