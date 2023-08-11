package com.example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    @Test
    public void testSelenium() throws InterruptedException {
        // Create a new Chrome driver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Testing\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the iamneo.ai website
        driver.get("http://iamneo.ai");

        // Write a method to print PASS if the title of the page matches with “We are
        // Hiring!” else FAIL.
        boolean isTitleMatch = driver.getTitle().equals("We are Hiring!");
        if (isTitleMatch) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Navigate to the Facebook page
        driver.get("https://www.facebook.com");

        // Navigate back to the iamneo.ai website
        driver.navigate().back();

        // Print the URL of the current page
        System.out.println(driver.getCurrentUrl());

        // Navigate forward
        driver.navigate().forward();

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
