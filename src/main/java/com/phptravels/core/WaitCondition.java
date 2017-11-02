package com.phptravels.core;

import com.google.common.base.Function;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class WaitCondition implements Function<SearchContext, WebElement> {
    private final WaitType waitType;
    private final By by;

    private final SearchContext searchContext;

    private final Logger logger = Logger.getLogger(this.getClass());


    public WaitCondition(final WaitType waitType, final By by, SearchContext searchContext) {
        this.waitType = waitType;
        this.by = by;
        this.searchContext = searchContext;
    }


    @Override
    public WebElement apply(final SearchContext webDriver) {

        try {
            final WebElement element = searchContext.findElement(by);
            switch (waitType) {
                case Displayed:
                    logger.debug(String.format("Waiting for element %s to be displayed", by));
                    if (element.isDisplayed()) {
                        return element;
                    }
                    break;
                case Enabled:
                    logger.debug(String.format("Waiting for element %s to be enabled", by));
                    if (element.isEnabled()) {
                        return element;
                    }
                    break;
                case Clickable:
                    logger.debug(String.format("Waiting for element %s to be clickable", by));
                    if (element.isEnabled() && element.isDisplayed()) {
                        return element;
                    }
                    break;
                case Present:
                    logger.debug(String.format("Waiting for element %s to be present", by));
                    return element;
                default:
                    logger.error(String.format("Unknown wait type %s specified ", waitType));
            }
        } catch (WebDriverException wd) {
            logger.error(String.format("Element %s is not found retrying to find it again...", by));
            return null;
            //Log.info(wd.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return "Element located by{" +
                by.toString() +
                "} " + getMessage();
    }


    private String getMessage() {
        switch (waitType) {
            case Displayed:
                return "to be displayed";
            case Enabled:
                return "to be enabled";
            case Clickable:
                return "to be clickable";
            case Present:
                return "to be present";
            default:
                return "to be present";

        }


    }
}
