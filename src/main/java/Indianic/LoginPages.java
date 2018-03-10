package Indianic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {

	WebDriver driver;
	public LoginPages(WebDriver driver) {
		this.driver=driver;
	}
		@FindBy(id="username")
		WebElement Username;
		
		@FindBy(id="password")
		WebElement Password;
		
		@FindBy(xpath= "//button[@class='radius']")
		WebElement SubmitButton;
		
		
		public void ValidLogin(String Uid, String Upass) throws InterruptedException {
			
			Username.sendKeys(Uid);
			Password.sendKeys(Upass);
			SubmitButton.click();
			
			Thread.sleep(3000);
			
			
		}
	
}
