import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Open the URL
		driver.get("https://the-internet.herokuapp.com/");

		// Click on "Nested Frames" hyperlink
		driver.findElement(By.linkText("Nested Frames")).click();
		
		// Switch to Top Frame
		driver.switchTo().frame("frame-top");
		
		// Switch to Middle Frame
		driver.switchTo().frame("frame-middle");
		
		// Print in console the text from the middle frame
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
				
	}

}
