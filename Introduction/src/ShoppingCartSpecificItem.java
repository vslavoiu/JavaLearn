import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCartSpecificItem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++)

		{

			String name = product.get(i).getText();

			if (name.contains("Potato")) {
				driver.findElements(By.xpath("//div[@class='stepper-input']/input")).get(i).clear();
				driver.findElements(By.xpath("//div[@class='stepper-input']/input")).get(i).sendKeys("4");
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				break;

			}

		}
		
		
	}

}
