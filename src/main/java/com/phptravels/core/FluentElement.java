package com.phptravels.core;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;

import java.util.List;

public class FluentElement {

    private By by;
    private WebElement webElement;
    private String elementName;
    private SearchContext searchContext;
    GSFluentWait fluentWait;

    private final Logger logger = Logger.getLogger(this.getClass());


    public FluentElement(final By by, SearchContext searchContext) {
        this.by = by;
        this.searchContext = searchContext;
    }

    public FluentElement(WebElement webElement) {
        this.webElement = webElement;
        this.searchContext = webElement;
    }

    public FluentElement(final By by, WebDriver webDriver) {
        this.by = by;
        this.searchContext = webDriver;
    }

    public GSFluentWait<FluentElement> waitUntil(final int timeOut) {
        GSFluentWait fluentWait = new GSFluentWait<>(timeOut, by, this, searchContext);
        this.fluentWait = fluentWait;
        return fluentWait;
    }


    public FluentElement name(final String name) {
        this.elementName = name;
        return this;
    }

    public void click() {
        logger.debug(String.format("Clicking on %s", by));
        getElement().click();
    }

    public void jsClick() {
        logger.debug(String.format("Clicking on %s", by));
        getExecutor().executeScript("arguments[0].click()", getElement());
    }

    public void jsSendKeys(String value) {
        logger.debug(String.format("Clicking on %s", by));
        getExecutor().executeScript(String.format("arguments[0].value='%s'", value), getElement());
    }

    public FluentElement highlight() {
        logger.debug(String.format("Highlight on %s", by));
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].style.border='3px solid red'", getElement());
        return this;
    }

    public FluentElement sendKeys(final String value) {
        logger.debug(String.format("Typing %s in %s", value, by));
        getElement().sendKeys(value);
        return this;
    }


    public FluentElement clear() {
        logger.debug(String.format("Clearing  %s field", by));
        getElement().clear();
        return this;
    }

    public String getText() {
        return getElement().getText();
    }

    public String getValue() {

        return getElement().getAttribute("value");
    }

    public String getAttribute(final String attributeName) {
        return getElement().getAttribute(attributeName);
    }

    public boolean isDisplayed() {
        try {
            return getElement().isDisplayed();
        } catch (WebDriverException ex) {
            return false;
        }

    }

    public boolean isEnabled() {
        try {
            return getElement().isEnabled();
        } catch (WebDriverException ex) {
            return false;
        }

    }

    public WebElement getElement() {
        if (webElement == null) {
            return WebElementProvider.get(searchContext).getElement(this);
        }
        return webElement;

    }

    public FluentElement mouseHoverJS() {
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');" +
                "evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} " +
                "else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        javascriptExecutor.executeScript(mouseOverScript, getElement());
        return this;
    }


    private JavascriptExecutor getExecutor() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        return javascriptExecutor;
    }

    public List<WebElement> getElements() {
        return searchContext.findElements(by);
    }


    public List<WebElement> getElements(By by) {
        return searchContext.findElements(by);
    }

    public FluentElement rightClick() {
        logger.debug(String.format("Right clicking on %s", by));
        final Actions actions = new Actions(getWebDriver());
        actions.contextClick(getElement()).perform();
        return this;
    }

    public FluentElement doubleClick() {
        logger.debug(String.format("Double clicking  %s", by));
        final Actions actions = new Actions(getWebDriver());
        actions.doubleClick(getElement()).build().perform();
        return this;
    }

    public FluentElement drop(final FluentElement target) {
        logger.debug(String.format("Drag & drop   %s", by));
        final Actions actions = new Actions(getWebDriver());
        actions.dragAndDrop(getElement(), target.getElement()).build().perform();
        return this;

    }

    public FluentElement moveToElement() {
        logger.debug(String.format("Hovering move over %s", by));
        final Actions actions = new Actions(getWebDriver());
        actions.moveToElement(getElement()).build().perform();
        return this;
    }

    public FluentElement bringElementInView() {
        logger.debug(String.format("Bringing  %s in view", by));
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", getElement());
        return this;
    }


    public WebDriver getWebDriver() {
        if (searchContext instanceof WebDriver) {
            return (WebDriver) searchContext;
        } else {
            WebElement element = (WebElement) searchContext;
            return ((WrapsDriver) element).getWrappedDriver();
        }
    }

    public GSFluentWait getFluentWait() {
        return fluentWait;
    }

    public void setFluentWait(GSFluentWait fluentWait) {
        this.fluentWait = fluentWait;
    }

    By getBy() {
        return by;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(final String elementName) {
        this.elementName = elementName;
    }


}
