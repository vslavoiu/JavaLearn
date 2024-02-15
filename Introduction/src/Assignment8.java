import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignment8 {

	@SuppressWarnings("static-access")
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Complete the Suggestion Class Example - Autocomplete dropdown
		driver.findElement(By.id("autocomplete")).sendKeys("United");
		Thread.sleep(1000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		// Course 105

	}

}
