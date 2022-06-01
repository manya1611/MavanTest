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

public class TC02Logout
{
	WebDriver driver;
	
	@BeforeMethod
	public void logoutCheck()
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\Browsers files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver(); 
		
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			System.out.println("Open URL"); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			LoginFunctionallity log = new LoginFunctionallity(driver);
			log.sendUsername();
			log.sendpassword();
			log.loginButton();
	}
	
	@Test
	public void logoutFunction() throws IOException
	{
		 ScreenshotClass ts= new ScreenshotClass(driver);
		 HomePage hp=new HomePage(driver);
		 hp.menuButton();
		 hp.clickLogout();
		 
		 String ExpectedUrl="https://www.saucedemo.com/";
		 String ActualUrl =driver.getCurrentUrl();
		 System.out.println(ActualUrl);
		 
		 if(ExpectedUrl.equals(ActualUrl))
		 {
			 System.out.println("Test case pass");
		 }
		 else
		 {
			 System.out.println("Test is fail");
		 }
		 ts.takeScreenshot("logout page");
		 
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
		System.out.println("Browser close");
	}

}
