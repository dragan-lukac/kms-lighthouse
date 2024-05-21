package com.kmslh.sevice;

import com.kmslh.page.Accessibility;
import org.openqa.selenium.WebDriver;

public class AccessibilityService extends Accessibility {

    public AccessibilityService(WebDriver driver) {
        super(driver);
    }

    public void assertAccessibilityButtonIsPresent() {
        scroll();
        assertionService.assertElementIsPresent(accessibilityButton);
    }
}
