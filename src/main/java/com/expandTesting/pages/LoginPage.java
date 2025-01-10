package com.expandTesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expandTesting.base.SetUp;
import com.expandTesting.utils.EleInt;

public class LoginPage  extends SetUp{

	
	//1. extends SetUp
	//2. Constructor
	//3. Find webElement @FindBy()
	//4. Methods 
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Test Login Page']")
	private WebElement tlp;
	
	public void clickOnTlp()
	{
		EleInt.click(tlp);
	}
	
	
	//username 
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	public void enterUsername(String user)
	{
		EleInt.sendKeys(username, user);
	}
	
	//password 
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void enterPassword(String pass)
	{
	  EleInt.sendKeys(password, pass);
	}
	
	//loginButton
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginBtn;
	
	public void clickOnLogin()
	{
		EleInt.click(loginBtn);
	}
	
	
	
	
	
	
}
