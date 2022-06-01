package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  private WebDriver driver;
  
  @FindBy(xpath="//input[@id='user-name']") //use @findby give xpath
  private WebElement username;
  
  //Method for calling
  
  public void sendUsername() 
  {
	  username.sendKeys("standard_user");
  }
  
  
  @FindBy(xpath="//input[@id='password']")
  private WebElement password;
  
  public void sendPassword()
  {
	  password.sendKeys("secret_sauce");
  }
  
  @FindBy(xpath="//input[@id='login-button']")
  private WebElement login;
  
  public void clickLoginButton()
  {
	  login.click();
  }
  
  public LoginPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
}
