package com.phptravels.core;

import com.google.common.base.Predicate;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class NegatingWaitCondition implements Predicate<SearchContext> {
    private final WaitType waitType;
    private final By by;
    private boolean isElementFound;

    private final Logger logger = Logger.getLogger(this.getClass());

    public NegatingWaitCondition(final WaitType waitType, final By by) {
        this.waitType = waitType;
        this.by = by;
    }


    public boolean isElementFound() {
        return isElementFound;
    }

    @Override
    public boolean apply(final SearchContext webDriver) {
        logger.debug(String.format("Waiting for element %s to disappear", by));

        WebElement element;
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            element = webDriver.findElement(by);
            isElementFound = true;
            switch (waitType) {
                case NotPresent: {
                    return element == null;
                }
                case NotDisplayed: {
                    return element == null || !element.isDisplayed();
                }
                default: {
                    return element == null;
                }

            }
        } catch (WebDriverException e) {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Element located by{" +
                by.toString() +
                "} to Disappear";
    }
}
