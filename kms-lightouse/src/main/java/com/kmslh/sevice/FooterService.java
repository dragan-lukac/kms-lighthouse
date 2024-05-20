package com.kmslh.sevice;

import com.kmslh.page.Footer;
import org.openqa.selenium.WebDriver;

public class FooterService extends Footer {
    public FooterService(WebDriver driver) {
        super(driver);
    }


    public void assertContactUsIsPresent() {
        assertionService.assertElementIsPresent(contactUs);
    }
}
