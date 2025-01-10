package com.expandTesting.utils;

public class Waits {
	
	
  public static void waitforSeconds(int sec)
  {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

}
