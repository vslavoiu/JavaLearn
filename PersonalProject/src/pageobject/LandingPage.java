package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
		WebDriver driver;

		public LandingPage(WebDriver driver)
		{
			//initialization
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(id="user-name")
		WebElement userLogin;
		
		@FindBy(id="password")
		WebElement passwordLogin;
		
		@FindBy(id="login-button")
		WebElement submit;
		
		public void loginApplication(String user, String password)
		{
			userLogin.sendKeys(user);
			passwordLogin.sendKeys(password);
			submit.click();
		}
		
		public void goTo()
		{
			driver.get("https://www.saucedemo.com/");
		}
		
		
	

}
