import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));
		driver.manage().window().maximize();

		// Open URL
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		// Insert username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("rahulshettyacademy");
		var name = username.getAttribute("value");
		
		//Print the input text
		System.out.println("User Name = " + name);

		// Insert password
		driver.findElement(By.id("password")).sendKeys("learning");
		
		//Print the input text
		System.out.println("Password - We won't display the password entered!");

		// Tick the "user" radio button
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
				
		// Explicit wait for popup to appear
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		// Accept alert popup
		driver.findElement(By.id("okayBtn")).click();

		// Select "Consultant" from dropdown
		WebElement Dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(Dropdown);
		dropdown.selectByValue("consult");
		System.out.println("Selected User Type = " + dropdown.getFirstSelectedOption().getText());

		// Tick the "I Agree.." checkbox
		driver.findElement(By.xpath("//input[@id='terms']")).click();

		// Tap on Sign-in button
		driver.findElement(By.id("signInBtn")).click();

		// Explicit wait - for page to load
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));

		// Add all products in cart
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for (int i = 0; i < products.size(); i++)

			{
			products.get(i).click();
			}

		Thread.sleep(2000);
		
		// Check the cart
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		// Wait around 5 sec
		Thread.sleep(5000);
		
		// Close the webpage
		driver.close();
		
	}

}
