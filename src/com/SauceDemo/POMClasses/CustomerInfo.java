package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfo 
{
 private WebDriver driver;
	
 @FindBy(xpath="//input[@id='first-name']")
 private WebElement firstname;
	
 public void clickOnName()
 {
	 firstname.sendKeys("Manohar");
 }
	
 @FindBy(xpath="//input[@id='last-name']")
 private WebElement lastname;
	
 public void clickOnLastName()
 {
	 lastname.sendKeys("Chache");
 }
 
 @FindBy(xpath="//input[@id='postal-code']")
 private WebElement postalcode;
	
 public void clickOnZip()
 {
	 postalcode.sendKeys("416205");
 }
	
// @FindBy(xpath="//button[@id='cancel']")
// private WebElement canclebutton;
// {
//	 canclebutton.click();
// }
 
 @FindBy(xpath="//input[@id='continue']")
 private WebElement continuebutton;
 
 public void clickContinue()
 {
	 continuebutton.click();
 }

 public CustomerInfo (WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
 }
