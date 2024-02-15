import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Define WebPage for testing
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		//Complete "Name" field
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Victor");
		var newFirst = name.getAttribute("value");
		//Print the input text
		System.out.println("User Name = " + newFirst);

		Thread.sleep(500);
		
		//Complete "Email" field
		WebElement name2 = driver.findElement(By.name("email"));
		name2.sendKeys("Victor@test.com");
		var email = name2.getAttribute("value");
		//Print the input text
		System.out.println("User Email = " + email);
		
		Thread.sleep(500);
		
		//Complete "Password" field
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password1");
		//Print the input text
		System.out.println("We won't display the password entered :-)");
		
		Thread.sleep(500);
		
		//Tick the "I love icecream checkbox"
		driver.findElement(By.id("exampleCheck1")).click();
		//Print if the checkbox is ticked
		System.out.println("Do we love icecream? = " + driver.findElement(By.id("exampleCheck1")).isSelected());
			
		Thread.sleep(500);
		
		//Select the gender from the dropdown
		WebElement Dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown =new Select(Dropdown);
		dropdown.selectByVisibleText("Male");
		System.out.println("Gender = " + dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(500);
		
		//Select the Employment Status
		driver.findElement(By.id("inlineRadio2")).click();
		//Print if the radiobox is ticked
		System.out.println("Employment Status = " + driver.findElement(By.id("inlineRadio2")).getText() + driver.findElement(By.id("inlineRadio2")).isSelected());
		
		Thread.sleep(500);
		
		//Select the date of birth
		driver.findElement(By.name("bday")).sendKeys("3004");
		driver.findElement(By.name("bday")).sendKeys(Keys.TAB);
		driver.findElement(By.name("bday")).sendKeys("1990");
		//Print the DOB
		System.out.println(driver.findElement(By.name("bday")).getAttribute("value"));
		
		Thread.sleep(500);
		
		//Submit form
		driver.findElement(By.cssSelector(".btn-success")).click();
		//Print the text received
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
