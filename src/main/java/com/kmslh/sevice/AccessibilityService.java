package com.kmslh.sevice;

import com.kmslh.page.Accessibility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityService extends Accessibility {

    private final By cloud = By.className("cloud");

    public AccessibilityService(WebDriver driver) {
        super(driver);
    }

    public void assertAccessibilityButtonIsPresent() {
        waitToBeVisible(cloud);
        scroll();
        assertionService.assertElementIsPresent(accessibilityButton);
    }
}
