package com.phptravels.core;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FluentDriver {

    private final WebDriver webDriver;

    public FluentDriver(final WebDriver webDriver, boolean initializeWorker) {
        this.webDriver = webDriver;
    }

    public FluentDriver(final WebDriver webDriver) {
        this(webDriver, true);
    }

    public FluentElement element(final By by) {
        return new FluentElement(by, webDriver);
    }

    public void stopDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public void openUrl(String url) {
        webDriver.get(url);
    }

    public void get(final String url) {
        webDriver.get(url);
    }

    public  void navigateBack(){
        webDriver.navigate().back();
    }

    public byte[] takeScreenShot() {
        if (webDriver != null)
            return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
        else
            return new byte[2];
    }



}
