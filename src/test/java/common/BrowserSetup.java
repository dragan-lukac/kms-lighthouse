package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserSetup {
    protected WebDriver driver;

    protected void startChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--window-size=360,640"));
    }

    protected void startFirefox() {
        WebDriverManager.firefoxdriver().setup();
        System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--width=360");
        options.addArguments("--height=640");
        driver = new FirefoxDriver(options);
    }
}
