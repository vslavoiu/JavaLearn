import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.browser.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webpage.LandingPage;

public class OrderItem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/Users/VSlavoiu/Documents/JAVA Projects/chromedriver 111/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(4));
//		driver.manage().window().setPosition(new Point(2000,0));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		LandingPage landingPage = new LandingPage();
		landingPage.LandingPageLogin(driver);
		driver.findElement(By.id("login2")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
		landingPage.loginApplication("Vic", "mypassword");
		driver.findElement(By.id("next2")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card h-100' and contains(.,'ASUS')]")));
		driver.findElement(By.xpath("//div[@class='card h-100' and contains(.,'ASUS')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success.btn-lg")));
		driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("cartur")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("Victor Test");		
		driver.findElement(By.id("country")).sendKeys("Rwanda");	
		driver.findElement(By.id("city")).sendKeys("London");	
		driver.findElement(By.id("card")).sendKeys("26351362231");	
		driver.findElement(By.id("month")).sendKeys("Jun");	
		driver.findElement(By.id("year")).sendKeys("33");	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//*[contains(text(),'Purchase')]")).click();
		String receipt = driver.findElement(By.xpath("//p[@class='lead text-muted ']")).getText();
		System.out.println(receipt);
		driver.findElement(By.xpath("//*[contains(text(),'OK')]")).click();
		driver.quit();
		
		
	}

}
