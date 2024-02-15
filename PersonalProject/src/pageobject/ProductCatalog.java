package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalog {
	
		WebDriver driver;

		public ProductCatalog(WebDriver driver)
		{
			//initialization
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(id="add-to-cart-sauce-labs-backpack")
		WebElement Backpack;
		
		@FindBy(id="add-to-cart-sauce-labs-bike-light")
		WebElement BikeLight;
		
		@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
		WebElement Tshirt;
		
		@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
		WebElement FleeceJacket;
		
		@FindBy(id="add-to-cart-sauce-labs-onesie")
		WebElement Onesie;
		
		@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
		WebElement RedTshirt;
		
		public void productSelect()
		{
			
			Backpack.click();
			BikeLight.click();
			Tshirt.click();
			FleeceJacket.click();
			Onesie.click();
			RedTshirt.click();
					
		}
		
		public void goTo()
		{
			driver.get("https://www.saucedemo.com/");
		}
		
		
	

}
