package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDemo {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  //WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		
	}
	
	@Test
	 public void googlSearch() {
		 driver.get("https://www.google.co.in/");
		 driver.close();
	}
}

