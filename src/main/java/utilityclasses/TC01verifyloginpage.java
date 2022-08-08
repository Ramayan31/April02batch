package utilityclasses;

import java.io.IOException;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01verifyloginpage {

	public static void main(String[] args) throws IOException, InterruptedException 
	
	{

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Software Testing study\\driver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
	
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
				
		driver.get("https://kite.zerodha.com/");
		System.out.println("URL is opened");

	ZerodhaPOMclass.takescreenshot(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		ZerodhaPOMclass  zlp = new ZerodhaPOMclass (driver);
		
		zlp.sendusername();
		System.out.println("username is entered");
		
		zlp.sendpassword();
		System.out.println("password is entered");
			
		zlp.clickloginbutton();
		System.out.println("loginbutton is clicked");
		
		zlp.sendpin();
		System.out.println("pin is entered");
		
		zlp.clickcon();
		Thread.sleep(2000);
		System.out.println("continuebutton is clicked");
		
	ZerodhaPOMclass.takescreenshot(driver);
		
	}

}
