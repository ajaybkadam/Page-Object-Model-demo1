package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage { 
	WebDriver driver;
	
    @FindBy(tagName="h3")
    private List<WebElement>courses;   //Here we take List for List of WebElement by Using @FindBy annotations
	
    @FindBy(xpath="//span[text()='Users']")
    private WebElement Userlink;

   public DashboardPage(WebDriver driver) {  //LoginPage is a Parametric constructor//here line 22,24 Initialize the WebElement
	
	PageFactory.initElements(driver, this);  //PageFactory it is a class and initElement is method
			                                 //This can called current class
	}

    public ArrayList<String> verifycourses(){
	ArrayList<String> actualCoursesName=new ArrayList<String>();   //To store this four String we Use ArrayList
	
	
	for(WebElement course:courses){     //Iterating List OF webElement 
		
		String Text=course.getText();    //here we get four string
		actualCoursesName.add(Text);	//we add actualcoursesName in ArrayList	
	}
	return actualCoursesName;
	

	
}
 public NewUserpage Userlink(){
	Userlink.click(); 
	return new NewUserpage(driver);///DashboardPage returns the NewUserPage
	 
 }

}
