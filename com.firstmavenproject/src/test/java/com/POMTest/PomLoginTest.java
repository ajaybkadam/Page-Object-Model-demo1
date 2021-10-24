package com.POMTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.POM.LoginPagepom;

import com.POM.PomDashboardPage;
import com.POM.UserPage;
import com.test.LoginPageTest;

public class PomLoginTest {
WebDriver driver;
LoginPagepom lp;
PomDashboardPage pdp;	
UserPage up;
private Logger log = Logger.getLogger(LoginPageTest.class);
	
	
	@BeforeSuite()          //in BeforeSuite annotation browser runs or open in only one times in a project for more than one test classes and In BeforeClass annotation if we have two Test classes in our project then browser runs two times
	public void setUp(){
	log.warn("User should use valid driver file");	
	log.info("opening a new chromeBrowser");	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	//driver.manage().window().maximize();
	  lp=new LoginPagepom(driver);   /// Here we take LoginPage object
	}
	
@Test(priority=1)
public void TestLogin1(){

pdp=lp.PomLogin();
	
Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	
}
	
	@Test(priority=2)
	public void  TestLogin2(){
	
	pdp.Verifycourses()	;
	}
	
	@Test(priority=3 )
	public void TestLogin3(){
		up=pdp.clickuserbtn();
		
		
	}
	
	 
	
	
	
	
	
	
	
	
	
}

