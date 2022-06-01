package com.SauceTest;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClasses.ScreenshotClass;
import com.SaucePOM.HomePage;
import com.SaucePOM.LoginFunctionallity;

public class TC03SingleProduct 
{
  WebDriver driver;
  
  @BeforeMethod
  public void product()
  {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\Browsers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
	
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Open URL"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        ScreenshotClass ts= new ScreenshotClass(driver);
		
		LoginFunctionallity lf= new LoginFunctionallity(driver);
		lf.sendUsername();
		lf.sendpassword();
		lf.loginButton();
  }
  @Test
  public void singleProduct() throws IOException
  {
	  ScreenshotClass ts= new ScreenshotClass(driver);
	  HomePage h=new HomePage(driver);
	  h.clickproduct_3();
	  h.addCart();
	  h.cartbutton();
	  h.cartText();
	  
	  String Expectedcount="1";
	  String Actualcount=h.cartText();
	  System.out.println(Actualcount);
	  
	  if(Expectedcount.equals(Actualcount))
	  {
		  System.out.println("Test is ok");
	  }
	  else
	  {
		  System.out.println("Test is fail");
	  }
	  ts.takeScreenshot("product count");
	  
	  h.menuButton();
	  h.clickLogout();
  }
  
  @AfterMethod
  public void TearDown()
  {
	  driver.close();
	  System.out.println("Browser close");
  }
  
  
  
  
}
