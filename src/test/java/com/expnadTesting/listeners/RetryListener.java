package com.expnadTesting.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		return false;
	}
	
	

}