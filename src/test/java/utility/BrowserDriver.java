package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

    public static WebDriver driver;

    public ChromeOptions options;

    public BrowserDriver(){
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resoucers/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void close(){
        this.driver.close();
    }

}
