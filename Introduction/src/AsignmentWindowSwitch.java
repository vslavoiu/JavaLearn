import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AsignmentWindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Open the URL
		driver.get("https://the-internet.herokuapp.com/");

		// Click on "Multiple Windows" hyperlink
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		// Click on "Click Here" hyperlink
		driver.findElement(By.linkText("Click Here")).click();
		
		// Define parent and child windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentID = it.next();
		
		// Switch to child window
		driver.switchTo().window(it.next());
		
		// Print in console text from child window
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		// Switch to parent window
		driver.switchTo().window(parentID);
		
		// Print in console text from parent window
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
	}

}
