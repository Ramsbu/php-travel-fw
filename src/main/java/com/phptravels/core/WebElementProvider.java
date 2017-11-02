package com.phptravels.core;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebElementProvider {

    private SearchContext searchContext;

    private WebElementProvider(SearchContext searchContext) {
        this.searchContext = searchContext;
    }

    public static WebElementProvider get(SearchContext searchContext) {
        return new WebElementProvider(searchContext);
    }

    public WebElement getElement(List<? extends FluentElement> fluentElementList) {
        for (FluentElement fluentElement : fluentElementList) {
            searchContext = getElement(fluentElement);
        }
        return (WebElement) searchContext;
    }


    public WebElement getElement(FluentElement fluentElement) {
        GSFluentWait fluentWait = fluentElement.getFluentWait();
        if (fluentWait != null) {
            WebDriverWait webDriverWait = new WebDriverWait(fluentElement.getWebDriver(), fluentWait.getTimeOut());
            final WaitCondition waitCondition = new WaitCondition(fluentWait.getWaitType(), fluentElement.getBy(), searchContext);
            return webDriverWait.until(waitCondition);
        } else {
            return searchContext.findElement(fluentElement.getBy());
        }

    }
}
