package com.expandTesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expandTesting.base.SetUp;
import com.expandTesting.utils.EleInt;

public class AutomationTipsPage extends SetUp{
	
	//. extend Base/setup class
	//1. Constructor 
	//2 . Find Webelement 
	//3. Actions 
	
	public AutomationTipsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Automation Tips']")
	private WebElement AutomationTips;
	
	public void clickOnAutomationTips()
	{
		EleInt.click(AutomationTips);

	}


}
