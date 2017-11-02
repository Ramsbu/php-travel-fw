package com.phptravels.core.pages;

import com.phptravels.core.FluentDriver;
import com.phptravels.core.FluentDriverProvider;
import org.openqa.selenium.By;

public class DressPage {
    private  String DRESS_TAB = "//a[@title='T-shirts']";
    FluentDriver fd;

    public void clickOnDressTab() {
        fd = FluentDriverProvider.getDriver();
        fd.element(By.xpath(DRESS_TAB)).waitUntil(10).ifElementIsNotDisplayed().click();
    }
}

