package com.firstmavenproject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	WebDriver driver;
	private Logger log=Logger.getLogger(Test0.class);
	@Test
	public void usefullink() {
		 log.info("opening a new chrome ");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("========================================");
		driver.get(" file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		
		Assert.assertEquals(false, true);
}
}