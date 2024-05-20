package com.kmslh.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessibility extends BasePage {

    protected By accessibilityButton = By.id("acwp-toolbar-btn");

    public Accessibility(WebDriver driver) {
        super(driver);
    }
}