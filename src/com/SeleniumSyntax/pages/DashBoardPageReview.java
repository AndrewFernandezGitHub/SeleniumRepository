package com.SeleniumSyntax.pages;

import com.SeleniumSyntax.utils.CommonMethodsReview;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoardPageReview extends CommonMethodsReview {

    public WebElement dashBoardMsg= driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
}
