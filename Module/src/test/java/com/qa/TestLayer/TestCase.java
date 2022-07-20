package com.qa.TestLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {
	@Test(priority=1)
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
	}
//	@Test(priority=2)
//	public void navigate()
//	{
//	     driver.navigate
//	}

	
}
