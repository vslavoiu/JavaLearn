package webpage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/VSlavoiu/Documents/JAVA Projects/chromedriver 111/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(4));
//		driver.manage().window().setPosition(new Point(2000,0));
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		

	}

}
