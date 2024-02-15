import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testVic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Define WebPage for testing
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flyblueair.com/en/gb/");
		
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[contains(text(),'I refuse the use of cookies.')]")).click();
		driver.findElement(By.xpath("input[ng-model='searchdeparture']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
