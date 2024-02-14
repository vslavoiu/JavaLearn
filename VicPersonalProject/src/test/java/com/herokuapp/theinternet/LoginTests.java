package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTests {
    private WebDriver driver;

    @Parameters({  "browser" })
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


    @Test(priority = 1, groups = { "positiveTests", "smokeTests" })
    public void positiveLoginTest() {
        System.out.println("Browser opened");

        //        open test page
        String url = ("http://the-internet.herokuapp.com/login");
        driver.get(url);

        System.out.println("Page is opened");

//        enter username

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

//        enter password

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");

        sleep(2);

//        click login button

        WebElement logInButton = driver.findElement(By.xpath("//form[@id='login']//i[@class='fa fa-2x fa-sign-in']"));
        logInButton.click();

//        verification
//        new url

        String expectedUrl = "http://the-internet.herokuapp.com/secure";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same as expected");

//        logout button is visible

        WebElement logOutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
        Assert.assertTrue(logOutButton.isDisplayed(), "Log out button is not visible");

//        successful login message

//        WebElement successMessage = driver.findElement(By.cssSelector("div#flash"));
        WebElement successMessage = driver.findElement(By.className("success"));
        String expectedMessage = "You logged into a secure area!";
        String actualMessage = successMessage.getText();
//        Assert.assertEquals(actualMessage, expectedMessage, "Actual message is not the same as expected");
        Assert.assertTrue(actualMessage.contains(expectedMessage), "Actual message does not contain expected message.\n Actual Message: "
                + actualMessage + "\nExpected Message: " + expectedMessage);


    }


    @Parameters({  "username" ,"password", "expectedMessage"})
    @Test(priority = 2, groups = { "LoginTests", "smokeTests" })
    public void negativeLoginTest(String username, String password, String expectedMessage) {
        System.out.println("Starting negativeLoginTest with " + username + " and " + password);

//        open test page
        String url = ("http://the-internet.herokuapp.com/login");
        driver.get(url);

        System.out.println("Page is opened");

//        enter username

        WebElement usernameElement = driver.findElement(By.id("username"));
        usernameElement.sendKeys(username);

//        enter password

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys(password);

//        click login button

        WebElement logInButton = driver.findElement(By.xpath("//form[@id='login']//i[@class='fa fa-2x fa-sign-in']"));
        logInButton.click();

//        incorrect login message

        WebElement incorrectUserMessage = driver.findElement(By.id("flash"));
        String actualErrorMessage = incorrectUserMessage.getText();

        Assert.assertTrue(actualErrorMessage.contains(expectedMessage), "Actual message does not contain expected message.\n Actual Message: "
                + actualErrorMessage + "\nExpected Message: "
                + expectedMessage);

        System.out.println(actualErrorMessage);

    }

    /**
     * Stop execution for the given amount of time
     *
     */
    private static void sleep(int seconds) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod(alwaysRun = true)
    private void tearDown() {
        driver.close();
        System.out.println("Test finished");
    }
}
