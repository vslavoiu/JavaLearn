import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class TestCase {
    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = chromedriver().create();
    }
    @Test
    public void myTestCase() {
        driver.get("https://applitools.com/helloworld/");
        WebElement numbers = driver.findElement(By.cssSelector("span.primary"));
        WebElement button = driver.findElement(By.cssSelector("div.section:nth-child(3) > button:nth-child(1)"));
        WebElement titleH = driver.findElement(By.cssSelector("div.fancy:nth-child(1) > span:nth-child(1)"));
        WebElement titleD = driver.findElement(By.cssSelector("div.fancy:nth-child(1) > span:nth-child(11)"));

        Assertions.assertTrue(numbers.isDisplayed());
        Assertions.assertEquals(numbers.getText(), "123456");
        Assertions.assertEquals(numbers.getCssValue("color"), "rgba(78, 90, 99, 1)");

        Assertions.assertTrue(button.isDisplayed());
        Assertions.assertEquals(button.getText(), "Click me!");
        Assertions.assertEquals(button.getCssValue("color"), "rgba(255, 255, 255, 1)");

        Assertions.assertTrue(titleH.isDisplayed());
        Assertions.assertEquals(titleH.getText(), "H");
        Assertions.assertEquals(titleH.getCssValue("color"), "rgba(255, 0, 0, 1)");

        Assertions.assertTrue(titleD.isDisplayed());
        Assertions.assertEquals(titleD.getText(), "D");
        Assertions.assertEquals(titleD.getCssValue("color"), "rgba(70, 0, 255, 1)");
    }

    @AfterEach
    public void afterEach() {
        driver.close();
    }
}
