package gitHubdemo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githubclass {



		public static void takescreenshot(WebDriver driver) throws IOException	
		  {
				 //date & time format code
			     Date d = new Date();
				 DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
				 String date = d1.format(d);			
						//screenshot
				TakesScreenshot ts = (TakesScreenshot)driver;
				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./Screenshot/zerodha" + date + ".jpg");
				FileHandler.copy(sourceFile, destFile);
				System.out.println("login screenshot is taken");
			}
			
			
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
			
			public ZerodhaPOMclass(WebDriver driver)
			{
				
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			}			

	}

}
