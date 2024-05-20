package com.kmslh.page;

import com.kmslh.sevice.AssertionService;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    protected AssertionService assertionService;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        assertionService = new AssertionService(driver);
    }

    public void waitToBeVisible(By elementLocator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementLocator));
    }

    public void waitToBeClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void clickElement(By elementLocator) {
        waitToBeClickable(elementLocator);
        driver.findElement(elementLocator).click();
    }

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
    }
}
