package test;

import com.kmslh.util.PropertyManager;
import common.BrowserSetup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest extends BrowserSetup {

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                startChrome();
                break;
            default:
                startChrome();
                System.out.println("Selected browser is not supported, starting tests on chrome");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(PropertyManager.getInstance().getUrl());
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
