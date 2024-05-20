package test;

import com.kmslh.sevice.AccessibilityService;
import com.kmslh.sevice.HeaderService;
import org.testng.annotations.Test;

public class SelectPageTest extends BaseTest {

    @Test
    public void selectProducts() {
        HeaderService headerService = new HeaderService(driver);
        AccessibilityService accessibilityService = new AccessibilityService(driver);
        headerService.openBurgerMenu();
        headerService.clickOnProducts();
        accessibilityService.assertAccessibilityButtonIsPresent();
    }

    @Test
    public void selectIndustries() {

    }

    @Test
    public void selectCaseStudies() {

    }

    @Test
    public void selectResources() {

    }

    @Test
    public void selectAbout() {

    }

    @Test
    public void selectRequestADemo() {

    }
}
