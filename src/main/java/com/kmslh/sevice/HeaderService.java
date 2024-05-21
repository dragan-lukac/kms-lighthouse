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

    public void clickOnProducts() {
        clickElement(burgerMenuProductsLink);
    }

    public void assertKmsLighthouseLogoIsPresent() {
        assertionService.assertElementIsPresent(kmsLighthouseLogo);
    }
}
