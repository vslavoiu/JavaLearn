package webpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	WebDriver driver;

	public void LandingPageLogin(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, new LandingPage());

	}
	
	
	@FindBy(id="loginusername")
	WebElement UserName;
	
	@FindBy(id="loginpassword")
	WebElement Password;
	
	@FindBy(className ="btn btn-primary")
	WebElement Login;

	public void loginApplication(String User, String PasswordElement) {

//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(4));
//
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
		UserName.sendKeys(User);
		Password.sendKeys(PasswordElement);
		Login.click();
	
	}
	
	
	
	
}	
