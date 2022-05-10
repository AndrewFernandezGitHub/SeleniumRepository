package com.SeleniumSyntax.test;

import com.SeleniumSyntax.pages.DashBoardPageReview;
import com.SeleniumSyntax.pages.LoginPageReview;
import com.SeleniumSyntax.testbase.BaseClassReview;

public class LoginPageTestReview {
    public static void main(String[] args) {

//calling the method openwithspecificurl1 from base class to initiate the driver declaration and open the url
        BaseClassReview.openWithSpecificURL1("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php");
        //create an object of the class that has your required WebElements
        LoginPageReview loginPageReview=new LoginPageReview();
        loginPageReview.username.sendKeys("Admin");
        loginPageReview.password.sendKeys("Hum@nhrm123");
        loginPageReview.loginButton.click();
        //verify that dashboard page is mentioned on the page that opens up
        DashBoardPageReview dash=new DashBoardPageReview();
        String WelcomeAdminMsg=dash.dashBoardMsg.getText();
        System.out.println(WelcomeAdminMsg);

        BaseClassReview.tearDown1();

    }
}