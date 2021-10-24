package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	WebDriver driver=null;
	
	
	public UserPage(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);	
				
	}


	public PomDashboardPage clickuserbtn() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	
	
}
