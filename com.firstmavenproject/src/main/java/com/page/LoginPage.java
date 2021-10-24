package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(id="email")                //driver.findElement(By.id("email")
	                                   //@FindBy annotation for Single WebElememnt also we can use for List of WebElement
	private WebElement uname;          //private for encapsulation obtain
	                                  //These are wenElement means object repository
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")                                           
	private WebElement LoginButton;
	
	
	
	
	public LoginPage(WebDriver driver) {  //LoginPage is a Parametric constructor//here line 22,24 Initialize the WebElement
	this.driver=driver;                   //line number 40 of driver is null therefore we initialize the driver
	PageFactory.initElements(driver, this);  //PageFactory it is a class and initElement is method
			                                 //This can called current class
	}
	
	
	public DashboardPage ValidLogin(){
	 
	uname.clear();
	pass.clear();
	uname.sendKeys("kiran@gmail.com");
	pass.sendKeys("123456");
	LoginButton.click();    ///after this click we will come on dashboard page
	
	
	return new DashboardPage(driver);  /// The LoginPage returns the DashboardPage
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
