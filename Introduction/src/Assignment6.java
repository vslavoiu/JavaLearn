import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 1. Navigate to specified URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 2. Select a checkbox ("from Checkbox Eaxmple")
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();

		// 3. Grab the text from the selected checkbox
		String selectedValue = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();

		// 4. Select an option from the dropdown - Do not hard code - should be same
		// value as ticked checkbox from step 2!
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(selectedValue);

		// 5. Enter the label from step 2 in the Edit box
		driver.findElement(By.name("enter-name")).sendKeys(selectedValue);

		// 6. Click on "Alert" button and then verify if the grabbed text from step 2 is
		// presented in the error message
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		if (text.contains(selectedValue)) {
			System.out.println("Alert message success");
		} else
			System.out.println("Message not correct!");
	}

}
