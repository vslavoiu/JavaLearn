import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/VSlavoiu/Documents/JAVA Projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
