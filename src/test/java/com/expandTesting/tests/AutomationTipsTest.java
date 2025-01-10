package com.expandTesting.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.expandTesting.Enum.Titles;
import com.expandTesting.base.SetUp;
import com.expandTesting.pages.AutomationTipsPage;
import com.expandTesting.utils.DriverMethods;
import com.expandTesting.utils.Waits;

public class AutomationTipsTest extends SetUp{
	
	//1. extend Base class
	
	AutomationTipsPage atp;
	
	@BeforeTest
	public void befTest()
	{  
		initlization();
		atp=new AutomationTipsPage(driver);
	}
	
	@Test
	public void clickOnAutomationPage()
	{
		atp.clickOnAutomationTips();
		Waits.waitforSeconds(3);
		String title=DriverMethods.getTitle(driver);
		
		Assert.assertEquals(title,Titles.automationTipsTricks);
		
	}
	
	

}
