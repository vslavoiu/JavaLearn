import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIElementsEnableDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isDisplayed());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("It's enabled!");
			Assert.assertTrue(true);

		} else {
			System.out.println("It's disabled! Test failed");
			Assert.assertTrue(false);
		}

		//////// ASSIGNMENT 2!!! Course 64-65!!!

	}

}
