package com.expandTesting.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.expandTesting.Enum.Titles;
import com.expandTesting.base.SetUp;
import com.expandTesting.pages.WebInputsPage;
import com.expandTesting.utils.DriverMethods;
import com.expandTesting.utils.Waits;


public class WebInputsTest extends SetUp{
	
	WebInputsPage wi;
	@BeforeTest
	public void beforeTest()
	{  
		initlization();
		wi=new WebInputsPage(driver);
	}
	
	
	@Test
	public void verifyWebInputsBtn()
	{
		wi.clickOnWebInputs();
		Waits.waitforSeconds(3);
	   String actTitle=	DriverMethods.getTitle(driver);
	   Assert.assertEquals(actTitle,Titles.webInputTitle);
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		if(!driver.equals(null))
		{
			driver.close();
		}
		
	}
	
	

}
