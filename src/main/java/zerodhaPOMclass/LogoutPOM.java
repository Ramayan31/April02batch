package zerodhaPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM 

{
	 WebDriver driver;
		
		@FindBy(xpath="//span[@class='user-id']")
		private WebElement userid;
		public void clickUserid()
		{
	        userid.click();
		}
	
		@FindBy(xpath="//a[@target='_self']")
		private WebElement logout;
		public void clicklogout()
		{
	        logout.click();
		}
	
		public LogoutPOM(WebDriver driver)
		{
			
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
							
		}
	
         

	
	

}
