package SwagLabProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.CartPage;
import pageobject.LandingPage;
import pageobject.ProductCatalog;

public class E2E {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
		landingPage.loginApplication("standard_user", "secret_sauce");

		ProductCatalog prodSelect = new ProductCatalog(driver);
		prodSelect.productSelect();
		
		CartPage cart = new CartPage(driver);
		cart.cartDetails("Vic", "Tor", "777 777");
		
		CartPage orderConfirmation = new CartPage(driver);
		orderConfirmation.orderConfirmation();
		
		driver.findElement(By.id("back-to-products")).click();
		
		driver.quit();
		
	}

}
