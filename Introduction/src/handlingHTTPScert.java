import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingHTTPScert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		
		//set proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
		//download path
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		
		//if you want to proceed to insecure site
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VSlavoiu\\Documents\\JAVA Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
