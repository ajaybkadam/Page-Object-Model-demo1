package com.test;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.DashboardPage;
import com.page.NewUserpage;

public class DashboardPageTest {

 WebDriver driver;	
 DashboardPage dp;
static NewUserpage nup;
private Logger log = Logger.getLogger(DashboardPageTest.class);


@Test(priority=2)
public void Test2(){
ArrayList<String> expectedcourse=new ArrayList<String>();	
expectedcourse.add("Selenium");
expectedcourse.add("Java / J2EE");
expectedcourse.add("Python");
expectedcourse.add("Php");

Assert.assertEquals(LoginPageTest.dp.verifycourses(),expectedcourse);
	
}

@Test(priority=3)
public void Test3(){
nup=LoginPageTest. dp.Userlink();
Assert.assertEquals( LoginPageTest.driver.getTitle(),"JavaByKiran | User");
}	
	
	
	
	
}
