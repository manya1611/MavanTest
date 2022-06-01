package com.SauceTest;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.UtilityClasses.ScreenshotClass;
import com.SaucePOM.HomePage;
import com.SaucePOM.LoginFunctionallity;

public class HomeFuction 
{
   @Test
   public void homeElement() throws IOException
   {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\Browsers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
	
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Open URL"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		ScreenshotClass ts= new ScreenshotClass(driver);
		 
		LoginFunctionallity log = new LoginFunctionallity(driver);
		log.sendUsername();
		log.sendpassword();
		log.loginButton();
	    ts.takeScreenshot("login page");
	    System.out.println("snap taken");
		
	    HomePage hom = new HomePage(driver);
	    hom.clickproduct_3();
	    ts.takeScreenshot("Home Page");
	    System.out.println("snap taken");
	    hom.addCart();
	    hom.cartbutton();
	    hom.cartText();
	    
	    String Expectedtext="1";
	    String Actualtext=hom.cartText();
	    System.out.println(Actualtext);
	    
	    if (Expectedtext.equals(Actualtext))
	    {
	    	System.out.println("Test case is pass");
	    }
	    else
	    {
	    	System.out.println("Test case is failed");
	    }
	    
	    driver.close();
	    System.out.println("Browser closed");
	   
   }
        
}
