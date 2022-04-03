package com.onlineflight.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL= "https://www.southwest.com/";
	public String Departurecity = "MSY";
	public String Arrivalcity = "ROC";
	public String StartDate = "08/01";
	public String ReturnDate = "08/04";
	
	
	
	public static WebDriver driver;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver1.exe" );
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
