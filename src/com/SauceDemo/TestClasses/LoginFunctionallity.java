package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.BillingPage;
import com.SauceDemo.POMClasses.CartPage;
import com.SauceDemo.POMClasses.CustomerInfo;
import com.SauceDemo.POMClasses.Homepage;
import com.SauceDemo.POMClasses.LoginPage;
import com.SauceDemo.POMClasses.OrderPage;
import com.SauceDemo.UtilityClasses.ScreenshotClass;





public class LoginFunctionallity 
{
 private static final Thread Thraed = null;

@SuppressWarnings("static-access")
public static void main(String[] args) throws IOException, InterruptedException
	
  {
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\Browsers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
	
		System.out.println("Open Browser");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("Open URL"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	    LoginPage lp = new LoginPage(driver);
	    
	    lp.sendUsername();
	    System.out.println("Username Entered");
	     
	    ScreenshotClass ts= new ScreenshotClass(driver);
	    //ts.takeScreenshot("username");
	    
	    lp.sendPassword();
	    System.out.println("Password Entered");
	   
	    //ts.takeScreenshot("password");
	    
	    Thread.sleep(3000);
	    ts.takeScreenshot("login activity");
	    
	    lp.clickLoginButton();
	    System.out.println("Login Button Click");
	    
	    //ts.takeScreenshot("login click");
	   
	    Homepage hp=new Homepage (driver);
	    
	    hp.selectbag();
	    System.out.println("Bag Selected");
	    
	    ts.takeScreenshot("Bag");
	    
	    hp.clickCart_1();
	    System.out.println("Add in the cart");
	    ts.takeScreenshot("Cart Add");
	    hp.clickCart();
	    
	    
	    CartPage cp = new CartPage(driver);
	    cp.clickOncheckout();
	    
	    CustomerInfo  ci= new CustomerInfo (driver);
	    ci.clickOnName();
	    System.out.println("First Name");
	    ci.clickOnLastName();
	    System.out.println("Last Name");
	    ci.clickOnZip();
	    System.out.println("Zip Code");
	    ci.clickContinue();
	    System.out.println("Move To Order Page");
	    Thread.sleep(3000);
	    ts.takeScreenshot("customer information");
	    
	    BillingPage bp=new BillingPage(driver);
	    
	    bp.clickFinish();
	    System.out.println("Order Is Placed");
	    
	    OrderPage op= new OrderPage(driver);
	    op.clickOnBackHome();
	    System.out.println("Thank You For Order");
	    ts.takeScreenshot("order");
  }
	
}
