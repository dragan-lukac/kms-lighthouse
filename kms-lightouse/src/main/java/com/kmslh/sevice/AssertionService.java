package com.kmslh.sevice;

import com.kmslh.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertionService {
    private final WebDriver driver;

    public AssertionService(WebDriver driver) {
        this.driver = driver;
    }

    public void assertElementIsPresent(By by) {
        BasePage basePage= new BasePage(driver);
        basePage.waitToBeVisible(by);
        Assert.assertTrue(driver.findElement(by).isDisplayed());
    }
}
