package zerodhaPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM 

{
    WebDriver driver;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement username;
	public void sendusername()
	{
		username.sendKeys("ER3715");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("$Rs310794");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin ;
	public void sendpin()
	{
		pin.sendKeys("100292");
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement con;
	public void clickcon()
	{
		con.click();
	}
	
		
	public LoginPOM(WebDriver driver)
	{
		
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
			
		
	}
	

}
