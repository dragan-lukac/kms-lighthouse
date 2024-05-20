package com.kmslh.sevice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertionService {
    private WebDriver driver;

    public AssertionService(WebDriver driver) {
        this.driver = driver;
    }

    public void assertElementIsPresent(By by) {
        try {
            Assert.assertTrue(driver.findElement(by).isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not present.");
        }
    }
}
