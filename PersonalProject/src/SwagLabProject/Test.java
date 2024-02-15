package SwagLabProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.LandingPage;

public class Test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		LandingPage landingPage = new LandingPage(driver);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Vic");
		driver.findElement(By.id("last-name")).sendKeys("Tor");
		driver.findElement(By.id("postal-code")).sendKeys("777 777");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		String confirmMessage = driver.findElement(By.cssSelector(".complete-header")).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("Thank you for your order!"));
		
		driver.findElement(By.id("back-to-products")).click();
		
		driver.quit();
		
	}

}
