package com.SeleniumSyntax.test;

import com.SeleniumSyntax.pages.DashBoardPage;
import com.SeleniumSyntax.pages.LoginPageWithPageFactory;
import com.SeleniumSyntax.testbase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        LoginPageWithPageFactory loginPageWithPageFactory=new LoginPageWithPageFactory();
        DashBoardPage dashBoardPage=new DashBoardPage();
        loginPageWithPageFactory.username.sendKeys("Admin");
        loginPageWithPageFactory.password.sendKeys("Hum@nhrm123");
        loginPageWithPageFactory.loginButton.click();

        TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;

       File sourceFile=ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
       String welcomeText=dashBoardPage.welcomeAdmin.getText();
        System.out.println(welcomeText);
        BaseClass.tearDown();
    }
}