package test;

import com.kmslh.sevice.AssertionService;
import com.kmslh.sevice.HeaderService;
import org.testng.annotations.Test;

public class SelectPageTest extends BaseTest {

    @Test
    public void selectProducts() {
        HeaderService headerService = new HeaderService(driver);
        AssertionService assertionService = new AssertionService(driver);

        headerService.openBurgerMenu();
        headerService.clickOnProducts();

        assertionService.assertMandatoryElementsArePresent();
    }

    @Test
    public void selectIndustries() {
        HeaderService headerService = new HeaderService(driver);
        AssertionService assertionService = new AssertionService(driver);

        headerService.openBurgerMenu();
        headerService.clickOnIndustries();

        assertionService.assertMandatoryElementsArePresent();
    }

    @Test
    public void selectCaseStudies() {
        HeaderService headerService = new HeaderService(driver);
        AssertionService assertionService = new AssertionService(driver);

        headerService.openBurgerMenu();
        headerService.clickOnCaseStudies();

        assertionService.assertMandatoryElementsArePresent();
    }

    @Test
    public void selectResources() {
        HeaderService headerService = new HeaderService(driver);
        AssertionService assertionService = new AssertionService(driver);

        headerService.openBurgerMenu();
        headerService.clickOnResources();

        assertionService.assertMandatoryElementsArePresent();
    }

    @Test
    public void selectAbout() {
        HeaderService headerService = new HeaderService(driver);
        AssertionService assertionService = new AssertionService(driver);

        headerService.openBurgerMenu();
        headerService.clickOnAbout();

        assertionService.assertMandatoryElementsArePresent();
    }

    @Test
    public void selectRequestADemo() {
        HeaderService headerService = new HeaderService(driver);
        AssertionService assertionService = new AssertionService(driver);

        headerService.openBurgerMenu();
        headerService.clickOnRequestADemo();

        assertionService.assertMandatoryElementsArePresent();
    }
}
