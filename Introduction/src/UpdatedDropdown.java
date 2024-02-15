import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Assert.assertFalse(false);
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);

//		int i=1;
//	while(i<4)
//	{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//	}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++)

		{
			driver.findElement(By.id("hrefIncAdt")).click();

		}

		Thread.sleep(1000);

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
//2. How to get the Count of number of check boxes present in the page

//1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
//
//driver.findElement(By.id("checkBoxOption1")).click();
//
//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True
//
//driver.findElement(By.id("checkBoxOption1")).click();
//
//
//
//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false
//
//
//
//
//
//
//
//2. How to get the Count of number of check boxes present in the page
//
//driver.findElements(By.cssSelector("input[value='checkbox']")).size();

	}

}
