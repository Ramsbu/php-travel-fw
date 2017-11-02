package com.phptravels.core;


import com.google.inject.Provider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class FluentDriverProvider implements Provider<FluentDriver> {

    private static FluentDriver fluentDriver;

    public FluentDriver get() {
        if (fluentDriver == null) {
            WebDriver driver = WebDriverFactory.getDriver();
            driver.manage().window().setSize(new Dimension(1376, 1032));
            fluentDriver = new FluentDriver(driver);

        }
        return fluentDriver;
    }

    public static FluentDriver getDriver() {
        return fluentDriver;
    }


    public void clear() {
        fluentDriver.stopDriver();
        fluentDriver = null;
    }

    public boolean isInitialized() {
        return fluentDriver != null;
    }
}

