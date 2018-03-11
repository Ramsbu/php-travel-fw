package com.phptravels.steps;

import com.phptravels.core.pages.DressPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class DressPageSteps {
    DressPage dressPage = new DressPage();

    @Given("^Clicking on dress tab$")
    public void clickingOnDressTab()
    {
        dressPage.clickOnDressTab();

    }
}
