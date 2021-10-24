package com.firstmavenproject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;




public class Test0 {

	WebDriver driver;
	private Logger log=Logger.getLogger(Test0.class);
	@Test(priority = 1)
	public void MemberShipTest() {
       log.info("opening a new chrome browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("=============================================================");
		driver.get(" file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.xpath(" /html/body/div/div[2]/form/div[3]/div/button")).click();
		String act = "JavaByKiran | Log in";
		String exp = driver.getTitle();
		Assert.assertEquals(act, exp);
		driver.close();
	


	}

@Test
public void check(){
	  log.info("opening new task");
	Assert.assertEquals(true, false);
	
	
	
	
}

@Test
public void test(){
	 log.info("opening new test");
	throw new SkipException("skipping a test");
	
	
	
	
}



}


	
	
	

