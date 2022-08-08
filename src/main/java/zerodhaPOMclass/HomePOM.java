package zerodhaPOMclass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM 

{
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement search;
	
	public void sendsearch()
	{
		search.sendKeys("Tatasteel");
	}
	
	@FindBy(xpath="(//span[text()='TATASTEEL'])[1]")
	private WebElement tatasteel;
	
	public void clicktatasteel()
	{
		tatasteel.click();
	}
	 
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement buyoption;
	
	public void clickbuyoption()
	{
		buyoption.click();
	}
	      
	@FindBy(xpath="(//span[text()='Buy'])[2]")
	private WebElement buybutton;
		
	public void clickbuybutton()
	{
		buybutton.click();
	}
	     
	public HomePOM(WebDriver driver)
	{
		
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
			
		
	}	

}
