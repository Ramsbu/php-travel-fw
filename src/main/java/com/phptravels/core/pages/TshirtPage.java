package com.phptravels.core.pages;

import com.phptravels.core.FluentDriver;
import com.phptravels.core.FluentDriverProvider;
import org.openqa.selenium.By;

public class TshirtPage {
    FluentDriver fd;
    private String TSHIRT_PAGE = "//a[@title='T-shirts']";
    private String SIZE="//a[contains(@href, 'size')and contains(. ,'S')]";

    public void clickingTshirtPage() {
        fd = FluentDriverProvider.getDriver();
        fd.element(By.xpath(TSHIRT_PAGE)).jsClick();

    }
    public void selectSize()
    {
        fd.element(By.xpath(SIZE)).click();
    }

}
