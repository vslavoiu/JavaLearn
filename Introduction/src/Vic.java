import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.get("https://youtube.com");

		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//div[@class='eom-title style-scope ytd-consent-bump-v2-lightbox']")));

		
		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//span[contains(text(),'Reject all')]")).click();
		
		
		
		

	}

}
