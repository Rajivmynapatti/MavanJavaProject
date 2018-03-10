package Indianic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest extends Browserselection{

	
	WebDriver driver;
	@Test
	public void Logintest() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\MyFolder\\drivers\\chromedriver.exe");
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		
	LoginPages login=PageFactory.initElements(driver, LoginPages.class);
	login.ValidLogin("tomsmith", "SuperSecretPassword!");
	System.out.println("User has been successfully login into the website.");
	
		
	Thread.sleep(3000);
		}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
		System.out.println("Browser has been closed successfully");
	}
	
}
