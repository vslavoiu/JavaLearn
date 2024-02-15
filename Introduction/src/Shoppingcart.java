import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppingcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait - applies for each step
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//explicit wait for a specific step
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	
		
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Orange" };

		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(1000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		//Course 81
		
		
		
		
		
	}


	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j = 0;
		
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	for (int i = 0; i < products.size(); i++)

	{

	String[] name = products.get(i).getText().split("-");
	String formattedName = name[0].trim();

	// format it to get actual vegetable name
	// check whether name you extract is present in array or not
	// convert array into array list for easy search

	List itemsNeededList = Arrays.asList(itemsNeeded);

	if (itemsNeededList.contains(formattedName)) {

		j++;
		// click on Add To Cart
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		if (j == itemsNeeded.length)
			
		{
			break;
		}

		// 3 times

	}

}
	
}
}
