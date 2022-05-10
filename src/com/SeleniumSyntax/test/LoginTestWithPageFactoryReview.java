package com.SeleniumSyntax.test;

import com.SeleniumSyntax.pages.LoginPageWithPageFactoryReview;
import com.SeleniumSyntax.testbase.BaseClassReview;

public class LoginTestWithPageFactoryReview {
    public static void main(String[] args) {
        BaseClassReview.openWithSpecificURL1("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php");
        LoginPageWithPageFactoryReview loginPageWithPageFactoryReview=new LoginPageWithPageFactoryReview();
        loginPageWithPageFactoryReview.username.sendKeys("Admin");
        loginPageWithPageFactoryReview.password.sendKeys("Hum@nhrm123");
        loginPageWithPageFactoryReview.loginButton.click();
        BaseClassReview.tearDown1();

    }

}
