package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {
	
		WebDriver driver;

			
		public CartPage(WebDriver driver)
		{
			//initialization
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="shopping_cart_container")
		WebElement Cart;
		
		@FindBy(id="checkout")
		WebElement checkout;
		
		@FindBy(id="first-name")
		WebElement FName;
		
		@FindBy(id="last-name")
		WebElement LName;
		
		@FindBy(id="postal-code")
		WebElement PC;
		
		@FindBy(id="continue")
		WebElement Continue;
		
		@FindBy(id="finish")
		WebElement finish;
		
		
		public void cartDetails(String FirstName, String LastName, String PostalCode)
		{
			Cart.click();
			checkout.click();
			FName.sendKeys(FirstName);
			LName.sendKeys(LastName);
			PC.sendKeys(PostalCode);
			Continue.click();
			finish.click();
		}
		
		public void goTo()
		{
			driver.get("https://www.saucedemo.com/");
		}
		
		public void orderConfirmation()
		{
			String confirmMessage = driver.findElement(By.cssSelector(".complete-header")).getText();
			Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thank you for your order!"));
		}
	

}
