package com.expandTesting.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.expandTesting.Enum.Titles;
import com.expandTesting.base.SetUp;
import com.expandTesting.pages.LoginPage;
import com.expandTesting.utils.DriverMethods;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LoginTest extends SetUp {
   
	LoginPage lp;
	public LoginTest() 
	{
		initlization();
		lp=new LoginPage(driver);
		
	}
	
   @Feature("Login")
   @Description("login with valid credentials")
   @Story("Strory 1")
   @Severity(SeverityLevel.MINOR)
   @Owner("John Doe")
	@Test
	public void loginTestWithValidCred()
	{
		lp.clickOnTlp();
		lp.enterUsername("practice");
		lp.enterPassword("SuperSecretPassword!");
		lp.clickOnLogin();
	String actTit=	DriverMethods.getTitle(driver);
	Assert.assertEquals(actTit,Titles.loginPage);
	}
	
   
   @Feature("Logout")
   @Description("login with invalid credentials")
   @Story("Strory 1")
   @Severity(SeverityLevel.MINOR)
   @Owner("Shoaib")
	@Test
	public void loginTestWithInValidCred()
	{
		lp.clickOnTlp();
		lp.enterUsername("practicex");
		lp.enterPassword("SuperSecretPassword!x");
		lp.clickOnLogin();
	String actTit=	DriverMethods.getTitle(driver);
	Assert.assertNotEquals(actTit,Titles.loginPage);
	}


}
