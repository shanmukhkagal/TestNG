package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public  class LaunchFireBoxAndChromeTogether {
	
	WebDriver driver = null;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		 System.out.println("Browser Name is "+browser);
		 
		 if(browser.equalsIgnoreCase("chrome")) {
		      System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		      driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("edge")){
			 
			 System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win32\\msedgedriver.exe");
			 driver = new EdgeDriver();
		 }
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed successfully");
	}
	
}

