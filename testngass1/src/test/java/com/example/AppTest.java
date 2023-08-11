import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BrowserAutomationTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver and open Chrome browser
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testIamNeoTitle() {
        // Navigate to iamneo.ai
        driver.get("http://iamneo.ai");
        
        // Verify page title
        String expectedTitle = "We are Hiring!";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
    }

    @Test
    public void testFacebookNavigation() {
        // Navigate to Facebook
        driver.get("https://www.facebook.com");
        
        // Navigate back to iamneo.ai
        driver.navigate().back();
        
        // Print the URL of the current page
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        // Navigate forward
        driver.navigate().forward();
        
        // Reload the page
        driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
