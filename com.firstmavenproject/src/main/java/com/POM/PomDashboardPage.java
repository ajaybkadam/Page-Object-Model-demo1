package com.POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PomDashboardPage {

	
	
WebDriver driver;
	
    @FindBy(tagName="h3")              ///This is WebElement for courses
    private List<WebElement>courses;   //Here we take List for List of WebElement by Using @FindBy annotations

    @FindBy(xpath="//span[text()='Users']")//This is WebElement for UserBtn
    private WebElement UserBtn;

   public  PomDashboardPage(WebDriver driver) {  //LoginPage is a Parametric constructor//here line 22,24 Initialize the WebElement
	this.driver=driver;
	PageFactory.initElements(driver, this);  //PageFactory it is a class and initElement is method
			                                 //This can called current class
	}
	
	public ArrayList<String> Verifycourses(){ ///This is Method for courses	
	ArrayList<String> S1=new ArrayList<String>();	
	for(WebElement course:courses){
	
		String text=course.getText();
		S1.add(text);
		
	}
	return S1;
		
	}

	public UserPage clickuserbtn(){   ///This is Method for UserBtn
		
		UserBtn.click();
		return new UserPage(driver);
	}
	
	
	
	
	
	
	
	
	
}
