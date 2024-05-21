package com.kmslh.sevice;

import com.kmslh.page.Header;
import org.openqa.selenium.WebDriver;

public class HeaderService extends Header {
    public HeaderService(WebDriver driver) {
        super(driver);
    }

    public void openBurgerMenu() {
        clickElement(burgerMenuButton);
    }

    public void clickOnIndustries() {
        clickElement(burgerMenuIndustriesLink);
    }

    public void clickOnProducts() {
        clickElement(burgerMenuProductsLink);
    }

    public void clickOnCaseStudies() {
        clickElement(burgerMenuCaseStudiesLink);
    }

    public void clickOnResources() {
        clickElement(burgerMenuResourcesLink);
    }

    public void clickOnAbout() {
        clickElement(burgerMenuAboutLink);
    }

    public void clickOnRequestADemo() {
        clickElement(burgerMenuRequestADemoLink);
    }


    public void assertKmsLighthouseLogoIsPresent() {
        assertionService.assertElementIsPresent(kmsLighthouseLogo);
    }

    public void assertRequestADemoButtonIsPresent() {
        assertionService.assertElementIsPresent(requestADemoButton);
    }
}
