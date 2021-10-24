package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

WebDriver driver = new ChromeDriver();	
	
//There are 8 different Types of Locators
//#Normal
//#Dedicated
//#Customized




//1# Normal  locators
// can not change its value


@org.testng.annotations.Test
public void Test1(){
	
	driver.findElement(By.id(""));
	driver.findElement(By.className(""));
	driver.findElement(By.name(""));
	driver.findElement(By.tagName(""));
		
}

//2# Dedicated 
// can not change its value

//<a   Anger tag
@org.testng.annotations.Test
public void Test2(){
	
driver.findElement(By.linkText("Register a new membership"));
driver.findElement(By.partialLinkText("Membership"));
	
}

//3# Customized
//can change its value
//CSS Cascade style sheet
@Test
public void Test3(){
// CSS selector can find by these following four method

	//1 #id--
driver.findElement(By.cssSelector("#email"));  ///#email taking from our offline jbk website

    //2 .class
driver.findElement(By.cssSelector(".formcontrol"));  //JBK offline

   //3  tagName#id
driver.findElement(By.cssSelector("input#email"));   //JNK OFFLINE

  //4   tagName.class

driver.findElement(By.cssSelector("inut.formcontrol"));

 //5  tagName attribute

 driver.findElement(By.cssSelector("input[id='email]"));

}






}
