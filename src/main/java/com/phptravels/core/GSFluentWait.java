package com.phptravels.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class GSFluentWait<T> {

    private final int timeOut;
    private WaitType waitType;
    private final T fluentElement;
    private final By by;
    private boolean ignoreError;
    private SearchContext searchContext;

    private String message;

    private final Logger logger = Logger.getLogger(this.getClass());


    public GSFluentWait(final int timeOut, final By by, final T fluentElement, final SearchContext driver) {
        this.timeOut = timeOut;
        this.fluentElement = fluentElement;
        this.searchContext = driver;
        this.by = by;
    }

    public T ifElementIsNotDisplayed() {
        this.waitType = WaitType.Displayed;
        final FluentWait wd = getWebDriverWait(searchContext, timeOut);
        final WaitCondition waitCondition = new WaitCondition(waitType, by, searchContext);
        try {
            wd.until(waitCondition);
        } catch (Exception e) {
            if (!ignoreError) {
                throw e;
            } else {
                logger.info(String.format("Element %s did not appear in specified time we are ignoring it and continuing......", by));
            }
        }
        return (T) fluentElement;
    }

    public T ifElementIsNotEnabled() {
        this.waitType = WaitType.Enabled;
        final FluentWait webDriverWait = getWebDriverWait(searchContext, timeOut);
        final WaitCondition waitCondition = new WaitCondition(waitType, by, searchContext);
        try {
            webDriverWait.until(waitCondition);
        } catch (Exception e) {
            if (!ignoreError) {
                throw e;
            } else {
                logger.info(String.format("Element %s did not get enabled in specified time we are ignoring and continuing......", by));
            }
        }
        return (T) fluentElement;
    }

    public T ifElementIsNotClickable() {
        this.waitType = WaitType.Clickable;
        final FluentWait webDriverWait = getWebDriverWait(searchContext, timeOut);
        final WaitCondition waitCondition = new WaitCondition(waitType, by, searchContext);
        try {
            webDriverWait.until(waitCondition);
        } catch (WebDriverException e) {
            if (!ignoreError) {
                throw e;
            } else {
                logger.info(String.format("Element %s did not become clickable in specified time we are ignoring and continuing......", by));
            }
        }
        return (T) fluentElement;
    }

    public void ifElementIsDisplayed() {
        this.waitType = WaitType.NotDisplayed;
        final FluentWait webDriverWait = getWebDriverWait(searchContext, timeOut);
        final NegatingWaitCondition negatingWaitCondition = new NegatingWaitCondition(waitType, by);
        webDriverWait.until(negatingWaitCondition);
    }

    public T ifElementIsNotPresent() {
        this.waitType = WaitType.Present;
        final FluentWait webDriverWait = getWebDriverWait(searchContext, timeOut);
        final WaitCondition waitCondition = new WaitCondition(waitType, by, searchContext);
        try {
            webDriverWait.until(waitCondition);
        } catch (WebDriverException e) {
            if (!ignoreError) {
                throw e;
            } else {
                logger.info(String.format("Element %s did not become present in specified time we are ignoring and continuing......", by));
            }
        }
        return (T) fluentElement;
    }

    public GSFluentWait<T> ignoringError() {
        this.ignoreError = true;
        return this;
    }


    private org.openqa.selenium.support.ui.FluentWait getWebDriverWait(final SearchContext webDriver, final int timeOut) {
        final FluentWait<SearchContext> webDriverWait =
                new FluentWait<>(searchContext);
        webDriverWait.pollingEvery(1, TimeUnit.MILLISECONDS);
        webDriverWait.withTimeout(timeOut, TimeUnit.SECONDS);
        webDriverWait.withMessage(getMessage());
        return webDriverWait;
    }

    public GSFluentWait<T> message(String message) {
        this.message = message;
        return this;
    }

    int getTimeOut() {
        return timeOut;
    }

    WaitType getWaitType() {
        return waitType;
    }

    private String getMessage() {
        return message;
    }
}
