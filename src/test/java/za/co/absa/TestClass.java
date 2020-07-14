package za.co.absa;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    @Test
    public void Chrome() {
        System.setProperty("webdriver.chrome.driver", "/Users/mzwandile/bolt/selenium/browserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
        driver.close();
    }
}
