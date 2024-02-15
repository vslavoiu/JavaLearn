import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Define WebPage for testing
		String text = "Victor";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("[id=alertbtn]")).click();

		Thread.sleep(1000);

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		Thread.sleep(1000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

		Thread.sleep(1000);

	}

}

//1) void dismiss() // To click on the ‘Cancel’ button of the alert.
//
//driver.switchTo().alert().dismiss();
//2) void accept()// To click on the ‘OK’ button of the alert.
//
//driver.switchTo().alert().accept();
//3) String getText() // To capture the alert message.
//
//driver.switchTo().alert().getText();
//4) void sendKeys(String stringToSend) // To send some data to alert box.
//
//driver.switchTo().alert().sendKeys("Text");