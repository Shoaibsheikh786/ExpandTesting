package com.expandTesting.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dd {
	
	public static void selectByText(WebElement ele, String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	public static void selectByIndex(WebElement ele, int ind)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(ind);
	}

}
