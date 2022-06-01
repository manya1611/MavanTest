package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAsser 
{
  @Test
  
   public void loginCheck()
   {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\Browsers files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernametext=driver.findElement(By.id("user-name"));
		WebElement passwordtext=driver.findElement(By.xpath("//input[@id='password']"));
		
		Assert.assertTrue(usernametext.isDisplayed());
		usernametext.sendKeys("standard_user");
		
		Assert.assertTrue(passwordtext.isDisplayed());
		passwordtext.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String ExpectedTitle="Swag labs";
		
		Assert.assertEquals(actualTitle, ExpectedTitle);
		{
			System.out.println("End of program");
			
		}
		
		driver.quit();
   }
}
