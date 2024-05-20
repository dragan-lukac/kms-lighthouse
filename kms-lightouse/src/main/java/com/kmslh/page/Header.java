package com.kmslh.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header extends BasePage{

    protected By burgerMenuButton = By.xpath("//div[@id='man-nav-toggler-mobile']");

    private final String mobileOnly = "//div[@class='mobile-only']//";

    protected By burgerMenuProductsLink = By.xpath(mobileOnly + "a[contains(text(), 'Products')]");
    protected By burgerMenuIndustriesLink = By.xpath(mobileOnly + "a[contains(text(), 'Industries')]");
    protected By burgerMenuCaseStudiesLink = By.xpath(mobileOnly + "a[contains(text(), 'Case Studies')]");
    protected By burgerMenuResourcesLink = By.xpath(mobileOnly + "a[contains(text(), 'Resources')]");
    protected By burgerMenuAboutLink = By.xpath(mobileOnly + "a[contains(text(), 'About')]");
    protected By burgerMenuRequestADemoLink = By.xpath(mobileOnly + "a[contains(text(), 'Request a Demo')]");

    public Header(WebDriver driver) {
        super(driver);
    }
}
