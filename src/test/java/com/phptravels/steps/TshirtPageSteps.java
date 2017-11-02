package com.phptravels.steps;

import com.phptravels.core.pages.TshirtPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class TshirtPageSteps {
    TshirtPage tshirtPage = new TshirtPage();

    @Given("^clicking on Tshirt page$")
    public void clickingOnTshirtPage() {

        tshirtPage.clickingTshirtPage();

    }
}
