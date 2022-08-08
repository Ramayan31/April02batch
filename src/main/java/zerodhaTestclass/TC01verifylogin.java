package zerodhaTestclass;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TC01verifylogin extends TestBaseClass 

{
	
	@Test
	public void verifyloginfunctionality()
	{
	
		 String expectedTitle = "Dashboard / Kite";	     	
		 String actualTitle = driver.getTitle(); 
			 
		 	 
		// SoftAssert soft = new SoftAssert();
			
		//soft.assertEquals(actualTitle, expectedTitle);
		
		// soft.assertAll();
		
		Assert.assertEquals(actualTitle, expectedTitle);		
		
	}
	
	
	
	

}
