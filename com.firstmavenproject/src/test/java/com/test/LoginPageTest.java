package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.page.DashboardPage;
import com.page.LoginPage;
//import com.page.NewUserpage;
import com.page.NewUserpage;

public class LoginPageTest {
 
	static WebDriver driver; 
	LoginPage lp;
	static DashboardPage dp;
	//NewUserpage nup;
	private Logger log = Logger.getLogger(LoginPageTest.class);
	
	
	@BeforeSuite()          //in BeforeSuite annotation browser runs or open in only one times in a project for more than one test classes and In BeforeClass annotation if we have two Test classes in our project then browser runs two times
	public void setUp(){
	log.warn("User should use valid driver file");	
	log.info("opening a new chromeBrowser");	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	//driver.manage().window().maximize();
	   lp=new LoginPage(driver);   /// Here we take LoginPage object
	}
	
	
	
	@Test(priority=1) 
	public void Test1(){
	dp=lp.ValidLogin();/// result two linking two pages we can take dp=lp.validlogin
	Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	
		
		
	}
	
/*
	@Test 
	public void Test2(){
	dp.verifycourses();	
		
	}
	
	@Test
	public void Test3(){
	nup=dp.Userlink();
	}
	*/
}
