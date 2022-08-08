package zerodhaTestclass;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilityclasses.ZerodhaPOMclass;
import zerodhaPOMclass.LoginPOM;
import zerodhaPOMclass.LogoutPOM;


public class TestBaseClass 

{
    WebDriver driver;
		
    
    @Parameters("BrowserName")
	@BeforeMethod
	public void setup(String BrowserName) throws InterruptedException, IOException
	{  	
    	
		if(BrowserName.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver", 
			"./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
		System.setProperty("webdriver.gecko.driver", 
				"./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
		}
    	
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
			
		driver.get("https://kite.zerodha.com/");
		System.out.println("URL is opened");

	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	       ZerodhaPOMclass.takescreenshot(driver);
	       
				LoginPOM  zlp = new LoginPOM(driver);
				
				zlp.sendusername();
				System.out.println("username is entered");
				
				zlp.sendpassword();
				System.out.println("password is entered");
				
				zlp.clickloginbutton();
				System.out.println("loginbutton is clicked");
				
				zlp.sendpin();
				System.out.println("pin is entered");
				
				zlp.clickcon();
				Thread.sleep(3000);
				System.out.println("continuebutton is clicked");
				
				ZerodhaPOMclass.takescreenshot(driver);		
	}
	
	@AfterMethod
	public void teardown()
	{
		
		LogoutPOM  lt = new LogoutPOM(driver);
		lt.clickUserid();
		lt.clicklogout();
		driver.quit();
		System.out.println("user is logout");
		
	}
		
}
