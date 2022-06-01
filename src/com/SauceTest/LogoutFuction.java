package com.SauceTest;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SaucePOM.HomePage;
import com.SaucePOM.LoginFunctionallity;

public class LogoutFuction 
{
   @Test
   public void logoutcheck()
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
	
	    HomePage hp= new HomePage(driver);
	    hp.menuButton();
	    hp.clickLogout();
	    
	    String extectedUrl="https://www.saucedemo.com/";
	    String ActualUrl=driver.getCurrentUrl();
	    System.out.println(ActualUrl);
	    
	    if (ActualUrl.equals(extectedUrl))
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
