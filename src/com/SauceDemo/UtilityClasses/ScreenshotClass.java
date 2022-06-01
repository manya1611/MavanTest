package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class ScreenshotClass 
{
  static WebDriver driver;
  
  
  public static void takeScreenshot(String x) throws IOException
  {
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File source=ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./screenshot/"+x+".jpg");
	  FileHandler.copy(source, dest);
	  System.out.println("start screenshot click");  
	   
  }
  
   public ScreenshotClass(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
}
