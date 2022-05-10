package com.SeleniumSyntax.pages;

import com.SeleniumSyntax.utils.CommonMethodsReview;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactoryReview extends CommonMethodsReview {

    @FindBy(id="txtUsername")
    public WebElement username;

    @FindBy(xpath="//input[@id='txtPassword']")
    public WebElement password;

    @FindBy(css ="input#btnLogin")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Invalid credentials']")
    public WebElement msg;


    //constructor to initialize the above annotations, necessary for code to run
    public LoginPageWithPageFactoryReview(){
        PageFactory.initElements(driver,this);
    }


}
