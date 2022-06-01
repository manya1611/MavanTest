package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage
{
  private WebDriver driver;
  
  @FindBy(xpath="//img[@alt='Sauce Labs Backpack']")
  private WebElement product1;
  
  public void selectbag()
  {
	  product1.click();
  }
  
  @FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
  private WebElement product2;
  
  public void selectLight()
  {
	  product2.click();
  }
  
  @FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
  private WebElement product3;
  
  public void selectTShirt()
  {
	  product3.click();
  }
  
  @FindBy(xpath="(//div[@class='inventory_item_name'])[4]")
  private WebElement product4;
  
  public void selectJacket()
  {
	  product4.click();
  }
  
  @FindBy(xpath="//div[contains(text(),'Sauce Labs Onesie')]")
  private WebElement product5;
  
  public void selectOnesie()
  {
	  product5.click();
  }
  
  @FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
  private WebElement product6;
  
  public void clickShirt()
  {
	  product6.click();
  }
  
  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
  private WebElement addcart_1;
  
  public void clickCart_1()
  {
	  addcart_1.click();
  }
  
  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
  private WebElement addcart_2;
  
  public void clickCart_2()
  {
	  addcart_2.click();
  }
  
  @FindBy(xpath="(//button[text()='Add to cart'])[3]")
  private WebElement addcart_3;
  
  public void clickCart_3()
  {
	  addcart_3.click();
  }

  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
  private WebElement addcart_4;
  public void clickCart_4()
  {
	  addcart_4.click();
  }

  
  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
  private WebElement addcart_5;
  public void clickCart_5()
  {
	  addcart_5.click();
  }
  
  @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
  private WebElement addcart_6;
  public void clickCart_6()
  {
	  addcart_6.click();
  }
  
  @FindBy(xpath="//Select[@class='product_sort_container']")
  private WebElement dropdown;
  
 
  public void dropDown()
  {
  Select s=new Select(dropdown);
  s.selectByIndex(2);
  s.selectByVisibleText("Price (high to low)");
  }
  
  @FindBy(xpath="//a[@class='shopping_cart_link']")
  private WebElement cartbutton;
  public void clickCart()
  {
	  cartbutton.click();
  }
  
  
  @FindBy(xpath="//button[@id='react-burger-menu-btn']")
  private WebElement allbutton_1;
  public void allbutton()
  {
	  allbutton_1.click();
  }
  
  @FindBy(xpath="//a[@id='inventory_sidebar_link']")
  private WebElement allitoms_1;
  public void allitom()
  {
	  allitoms_1.click();
  }
  
  @FindBy(xpath="//a[text()='About']")
  private WebElement About_1;
  public void about()
  {
	  About_1.click();
  }
  
  @FindBy(xpath="//a[contains(text(),'Logout')]")
  private WebElement logoutbutton;
  public void logout()
  {
	  logoutbutton.click();
  }
  
  @FindBy(xpath="//a[@id='reset_sidebar_link']")
  private WebElement ResetAppState;
  public void resetAppbutton()
  {
	  ResetAppState.click();
  }
  
  public Homepage(WebDriver driver)
  {
	  this.driver=driver;
	  
	  PageFactory.initElements(driver,this);
  }
  
  
  
}
