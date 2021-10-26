package com.firstmavenproject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

	WebDriver driver;
	private Logger log=Logger.getLogger(Test0.class);
	@Test
	public void checkblank() {
		 log.info("opening a new  browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("========================================");
		driver.get(" file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.xpath(" /html/body/div/div[2]/form/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath(" /html/body/div/div[2]/form/div[2]/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String act = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		String exp = "Please enter email.";
		driver.close();
		Assert.assertEquals(act, exp);

	
	
	
	
	
	
	
	
	
	
	
	
	}
}
