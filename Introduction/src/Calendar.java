import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Pick a specific Date
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://path2usa.com/travel-companions");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains (text(), 'Find A Travel Companion')]")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        		
//        WebElement Element = driver.findElement(By.xpath("//*[contains (text(), 'SEARCH')]"));

        // Scrolling down the page till the element is found		
		js.executeScript("window.scrollBy(0,1100)");
		Thread.sleep(1000);
		
		// .//*[@id='travel_date']
        driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		while (!driver.findElement(By.className("flatpickr-month")).getText().contains("April"))
		{
			driver.findElement(By.className("flatpickr-next-month")).click();
		}
		
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		// Grab common attribute //Put into list and iterate
		int count = driver.findElements(By.className("flatpickr-day")).size();
				
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("28"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}
		
		//course 102

	}

}
