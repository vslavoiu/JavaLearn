import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Open the URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// 1. Give me the count of links on the page.
		// Count of a footer section-
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		// Limiting webdriver scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		// 3. Count the number of links from the first column
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each link in the column and check if the pages are opening
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(1000);
		} //open all tabs
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
			// Course 96
			
		}

}
