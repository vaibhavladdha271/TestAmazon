package com.amazon.qa.base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class TestBase {

	public static WebDriver driver;
	public static Properties property;
	public TestBase()
	{
		try
		{
	   FileInputStream input=new FileInputStream("C:\\Users\\Vaibhav\\eclipse-workspace\\Amazon\\config.properties");
	   property=new Properties();
	   property.load(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialize()
	{
		String browser=property.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Geckodriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "C:\\Geckodriver\\MicrosftWebDriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.get(property.getProperty("url")); 
	}
}
