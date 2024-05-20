package com.kmslh.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer extends BasePage {
    protected By contactUs = By.xpath("//div[@class='menu-footer-about-container']//a[@href='https://kmslh.com/contact-us/']");

    public Footer(WebDriver driver) {
        super(driver);
    }
}
