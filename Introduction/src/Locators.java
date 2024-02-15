import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// implicit wait - 5 seconds time out

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Victor");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Victor@test.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Victor@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0123456789");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.className("logout-btn")).click();
//		Thread.sleep(3000);
//		driver.close();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.close();

		// course - 37

	}

}
