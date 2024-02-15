import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
		.keyDown(Keys.LEFT_SHIFT).sendKeys("hello").doubleClick().build().perform();
		//Move to Specific element then right click
		a.moveToElement(move).contextClick().build().perform();
		
		
		
	}

}
