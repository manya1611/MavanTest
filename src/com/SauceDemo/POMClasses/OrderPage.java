package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='back-to-products']")
    private WebElement backhome;
	
	public void clickOnBackHome()
	{
		backhome.click();
	}
	
	public OrderPage(WebDriver driver)
 {
	this.driver=driver;
	PageFactory.initElements(driver, this);
 }
	
}
