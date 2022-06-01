package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	private WebDriver driver;
	
	
	@FindBy(xpath="//button[@id='continue-shopping']")
    private WebElement continueshopping;
	
    public void clickOnContinue()
    {
    	continueshopping.click();
    }
    
    @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
    private WebElement removebutton;
	
    public void clickOnRemove()
    {
    	removebutton.click();
    }
	
    @FindBy(xpath="//button[@id='checkout']")
    private WebElement checkoutbutton;
	
    public void clickOncheckout()
    {
    	checkoutbutton.click();
    }
    
    public CartPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
	
}
