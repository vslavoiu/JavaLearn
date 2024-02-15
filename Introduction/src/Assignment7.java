import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Print the number of rows in Web Table Example
		WebElement table = driver.findElement(By.id("product"));
		System.out.println("Number of rows - " + table.findElements(By.tagName("tr")).size());
		
		// Print the number of columns in Web Table Example
		System.out.println("Number of columns - " + table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		// Print the second row of data
		List <WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println("Text from second row : ");
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

		
	}

}
