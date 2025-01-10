package com.expnadTesting.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.expandTesting.base.SetUp;

import io.qameta.allure.Attachment;

public class MyListener extends SetUp implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName());
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		
		takesScreenshot();
	}
	
	@Attachment
	public byte[] takesScreenshot()
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] src = tk.getScreenshotAs(OutputType.BYTES);
		return src;
	
	}

}
