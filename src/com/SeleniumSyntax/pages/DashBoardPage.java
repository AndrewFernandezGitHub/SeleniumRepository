package com.SeleniumSyntax.pages;

import com.SeleniumSyntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends CommonMethods {
    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }
}
