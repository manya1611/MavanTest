package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsser 
{ 
	SoftAssert softassert=new SoftAssert();
	//SoftAssert softassert1=new SoftAssert();
	/*
  @Test
  public void demoTest()
  {
	  softassert.assertTrue(true);
	  softassert.assertEquals("Abhijeet", "abheejit");
	  softassert.assertEquals("Manohar","Manohar");
	  System.out.println("Test case is passed");
	  softassert.assertAll();
  }
  */
	@Test
  public void demo_2()
  {
	softassert.assertEquals(false, true);  
	softassert.assertAll();
  }
  
	@Test
  public void Test()
  {
		softassert.assertEquals('M', 'M');
		softassert.assertAll();
  }
  
  
  
  
}
