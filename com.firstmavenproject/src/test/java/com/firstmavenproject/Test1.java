package com.firstmavenproject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
WebDriver driver;

private Logger log=Logger.getLogger(Test0.class);
	@Test(priority = 1)
	public void course() {
		log.info("opening my browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("=======================================================");
		driver.get(" file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		String exp = "JAVA | SELENIUM | PYTHON";
		String act = driver.findElement(By.xpath(" /html/body/div/div[1]/a/h4")).getText();
		Assert.assertEquals(act, exp);
		driver.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
