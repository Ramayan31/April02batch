package zerodhaTestclass;


import org.testng.annotations.Test;

import zerodhaPOMclass.HomePOM;


public class TC02verifyhomepage extends TestBaseClass

{
    	
	@Test
	public void verifyhomepage() throws InterruptedException 
	{
		
		HomePOM hp = new HomePOM(driver);
		
		hp.sendsearch();
		hp.clicktatasteel();
		hp.clickbuyoption();
		hp.clickbuybutton();
		Thread.sleep(3000);
		System.out.println("buy is done");	
		
	}
}
