package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage 
{
  private WebDriver driver;
  
  @FindBy(xpath="//button[@id='cancel']")
  private WebElement canceltab;
  
  public void clickOnCancelTab()
  {
	  canceltab.click();
  }
  
  @FindBy(xpath="//button[@id='finish']")
  private WebElement finishbutton;
  
  public void clickFinish()
  {
	  finishbutton.click();
  }
  
  public BillingPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
}
