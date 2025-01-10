package com.expandTesting.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.expandTesting.Enum.TimeUnits;

public class SetUp {
	static File file;
	static FileInputStream fis;
	static Properties pr;
public	static WebDriver driver;
	static String browser;
	static String url;

	public SetUp() {
		pr = new Properties();
		file = new File("./Config/config.properties");
		
		try {
			fis=new FileInputStream(file);
			pr.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		browser = pr.getProperty("browser");
		url = pr.getProperty("url");
		
	}

	// methods which will read the data

	public static void initlization()
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else 
		{
			System.out.println("Browser Not found ");
			return ;
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUnits.IMP_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TimeUnits.PAGE_LOAD));
		
		

	}
	


}
