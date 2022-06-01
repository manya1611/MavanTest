package com.SaucePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionallity 
{
 private WebDriver driver;
 
 public LoginFunctionallity(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 
 
 @FindBy(xpath="//input[@id='user-name']")
 private WebElement username;
 
 @FindBy(xpath="//input[@id='password']")
 private WebElement password;
	
 @FindBy(xpath="//input[@id='login-button']")
 private WebElement login;
 
 
 public void sendUsername()
 {
     username.sendKeys("standard_user");
 }
	
 public void sendpassword()
 {
	 password.sendKeys("secret_sauce");
 }
	
 public void loginButton()
 {
	 login.click();
 }
	
	
	
}
