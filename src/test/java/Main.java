import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mzwandile/bolt/selenium/browserDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
        driver.close();
    }
}
