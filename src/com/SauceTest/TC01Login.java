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

public class TC01Login 
{
	WebDriver driver;
	
	@BeforeMethod()
	public void SetUp() throws IOException
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
	 		ts.takeScreenshot("login");
	   }
			
			@Test
			public void loginCheck()
   	   {
			 String Expectedtitle="Swag Labs";
			 String Actualtitle= driver.getTitle();
			 System.out.println(Actualtitle);
			 
			 
			 if(Expectedtitle.equals(Actualtitle))
			 
			 {
				 System.out.println("Test case ok");
			 }
			 else
			 {
				 System.out.println("Test case failed");
			 }
				 
			 HomePage hp=new HomePage(driver);
			 hp.menuButton();
			 hp.clickLogout();
	   }
			
			@AfterMethod()
			public void TearDown()
	   {
				driver.close();
				System.out.println("Browser close");
    	}
			
			
			
			
	
	
	

}
