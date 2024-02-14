package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExceptionsTests {

    private WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    private void setUp(String browser) {
        //        Create driver
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                System.out.println("Don't know how to start " + browser + ", starting Chrome instead");
                driver = new ChromeDriver();
                break;

        }


        driver.manage().window().maximize();

    }

    @Test
    public void noSuchElementExceptionTest() {
        //open page
        String url = ("https://practicetestautomation.com/practice-test-exceptions/");
        driver.get(url);
        System.out.println("Page is opened");

        //click Add button
        WebElement addButton = driver.findElement(By.id("add_btn"));
        addButton.click();

        //wait for row to be displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement secondRow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='row2']/input")));

        //verify row 2 input field is displayed
        Assert.assertTrue(secondRow.isDisplayed(), "Second row is not displayed");

    }

    @Test
    public void elementNotInteractableExceptionTest() {

        //Open page
        //Click Add button
        //Wait for the second row to load
        noSuchElementExceptionTest();
        WebElement secondRow = driver.findElement(By.xpath("//div[@id='row2']/input"));

        //Type text into the second input field
        secondRow.sendKeys("Pasta");

        //Push Save button using locator By.name(“Save”)
        WebElement saveButton = driver.findElement(By.xpath("//div[@id='row2']/button[@name='Save']"));
        saveButton.click();

        //Verify text saved
        WebElement confirmationMessage = driver.findElement(By.id("confirmation"));
        String messageText = confirmationMessage.getText();
        Assert.assertEquals(messageText, "Row 2 was saved", "Confirmation message text is not expected");

    }

    @Test
    public void invalidElementStateExceptionTest() {

        // Open page

        String url = ("https://practicetestautomation.com/practice-test-exceptions/");
        driver.get(url);
        System.out.println("Page is opened");

        // Clear input field
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement editButton = driver.findElement(By.id("edit_btn"));
        WebElement row1Input = driver.findElement(By.xpath("//div[@id='row1']/input"));
        editButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(row1Input));
        row1Input.clear();

        // Type text into the input field
        row1Input.sendKeys("Pasta");
        WebElement saveButton = driver.findElement(By.id("save_btn"));
        saveButton.click();

        // Verify text changed
        String value = row1Input.getAttribute("value");
        Assert.assertEquals(value, "Pasta", "Input 1 field value is not expected");

        // Verify text saved
        WebElement confirmationMessage = driver.findElement(By.id("confirmation"));
        String messageText = confirmationMessage.getText();
        Assert.assertEquals(messageText, "Row 1 was saved", "Confirmation message text is not expected");

    }

    @Test
    public void staleElementReferenceExceptionTest() {

       //  Open page

        String url = ("https://practicetestautomation.com/practice-test-exceptions/");
        driver.get(url);
        System.out.println("Page is opened");

        //  Push add button

        WebElement addButton = driver.findElement(By.id("add_btn"));
        addButton.click();

       //  Verify instruction text element is no longer displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("instructions"))), "Instructions text is still displayed");

    }

    @Test
    public void timeoutExceptionTest() {

        //Test case 5: TimeoutException
        //  Open page

        String url = ("https://practicetestautomation.com/practice-test-exceptions/");
        driver.get(url);
        System.out.println("Page is opened");

        //  Push add button

        WebElement addButton = driver.findElement(By.id("add_btn"));
        addButton.click();

        // wait for row to be displayed
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement secondRow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='row2']/input")));

        //verify row 2 input field is displayed
        Assert.assertTrue(secondRow.isDisplayed(), "Second row is not displayed");

    }


    @AfterMethod(alwaysRun = true)
    private void tearDown() {
        driver.close();
        System.out.println("Test finished");
    }

}
