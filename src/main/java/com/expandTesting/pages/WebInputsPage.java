package com.expandTesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expandTesting.base.SetUp;
import com.expandTesting.utils.EleInt;

public class WebInputsPage extends SetUp{

	// 1. WebElements
	// 2. Methods
	// 3. Constructor
	
	//Note
	//1. Don't write Assertions here in this page class 
	//2. Don't hard-code any value 
	
	
	public WebInputsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[text()='Web inputs']")
	private WebElement webInputs;
	public void clickOnWebInputs()
	{
		EleInt.click(webInputs);
	
	}

}
