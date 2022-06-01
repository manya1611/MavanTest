package com.SaucePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
  private WebDriver driver;
   
   public HomePage(WebDriver driver)
    {
     this.driver=driver;
     PageFactory.initElements(driver, this);
    }
   
  @FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
  private WebElement product3;
  
  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
  private WebElement addtocart_3;
  
  @FindBy(xpath="//div[@id='shopping_cart_container']")
  private WebElement cart;
  
  @FindBy(xpath="//button[@id='react-burger-menu-btn']")
  private WebElement Allbutton;
  
  @FindBy(xpath="//a[contains(text(),'Logout')]")
  private WebElement logout;
  
  
  public void clickproduct_3()
  {
	  product3.click();
  }
  public void addCart()
  {
	  addtocart_3.click(); 
  }
  public String cartText()
  {
	  String cartcount=cart.getText();
	  return cartcount;
  } 
  public void menuButton()
  {
	  Allbutton.click();
  }
  public void clickLogout()
  {
	  logout.click();
  }
  public void cartbutton()
  {
	  cart.click();
  }
   
}
