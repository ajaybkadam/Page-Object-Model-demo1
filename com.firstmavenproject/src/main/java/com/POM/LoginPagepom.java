package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagepom {
	WebDriver driver;

		 @FindBy(id="email")                //driver.findElement(By.id("email")
		 private WebElement uname;                                  //@FindBy annotation for Single WebElememnt also we can use for List of WebElement
	                                                        //private for encapsulation obtain
		                                    //These are wenElement means object repository
		@FindBy(id="password")
		private WebElement pass;
		
		
		@FindBy(xpath="//button")                                           
		private WebElement LoginButton;
		
		
	
	public LoginPagepom(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);	
				
	}
	
	public  PomDashboardPage PomLogin(){
	uname.clear();
	pass.clear();
		
	uname.sendKeys("kiran@gmail.com");
	pass.sendKeys("123456");
	LoginButton.click();
	return new PomDashboardPage(driver);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
