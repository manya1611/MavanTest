package com.SauceTest;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SaucePOM.HomePage;
import com.SaucePOM.LoginFunctionallity;

public class LoginCheck 
{
  
	@Test
	public void loginFunction()
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
		
			String ExpectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			
			if (actualTitle.equals(ExpectedTitle))
			{
				System.out.println("Test case is pass");
			}
			else 
			{
				System.out.println("Test case is failed");
			}
			
			driver.quit();
			System.out.println("Browser closed");
		
	}
	
}
