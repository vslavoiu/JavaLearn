import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Define WebPage for testing
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		// select flight option
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		Thread.sleep(500);
		// Origin + destination stations select
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='DEL']")).click();
		System.out.println("Selected origin station = " + driver
				.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']"))
				.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		System.out.println("Selected destination station = " + driver
				.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.getText());

		Thread.sleep(500);
		// Date pick
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("It's disabled");
			Assert.assertTrue(true);

		} else {
			System.out.println("It's enabled! Test failed");
			Assert.assertTrue(false);
		}

		Thread.sleep(500);
		// Number of adults
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 3; i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Thread.sleep(500);
		// checkbox tick
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Thread.sleep(500);
		// Tap on Search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		// or multiple options
		// driver.findElement(By.cssSelector("input[value='Search']")).click();
		// driver.findElement(By.xpath("//input[@value='Search']")).click();
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

		// Manage window - wait then close
		Thread.sleep(4000);
		driver.close();

	}

}
