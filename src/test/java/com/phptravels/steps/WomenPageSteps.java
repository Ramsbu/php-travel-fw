package com.phptravels.steps;

import com.phptravels.core.pages.WomenPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WomenPageSteps {
    WomenPage womenPage = new WomenPage();

    @Given("^Clicking on women page tab and verify the result$")
    public void clickingOnWomenPageTabAndVerifyTheResult()
    {
        womenPage.clickOnWomenTab();
    }

    @And("^I verify the women Tab is clicked$")
    public void iVerifyTheWomenTabIsClicked() {

        Assert.assertTrue(womenPage.isWomenTabClicked());
    }

    @And("^I verify women tab with string comparision$")
    public void iVerifyWomenTabWithStringComparision() {
        String result = womenPage.womenTabStringComparision();
        Assert.assertEquals(result, "You will find here all woman fashion collections.");
    }

    @And("^I verify the Top tab is clicked$")
    public void iVerifyTheTopTabIsClicked() {
        womenPage.topTabClicked();


    }

    @And("^I verify the top tab with string comparision$")
    public void iVerifyTheTopTabWithStringComparision() {
        String result = womenPage.topTabComparision();
        Assert.assertEquals(result, "Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more.");


    }

    @And("^I verify the t-shirt is clicked$")
    public void iVerifyTheTShirtIsClicked() {
        womenPage.tshirtClicked();

    }

    @And("^I verify the categories$")
    public void iVerifyTheCategories() {
        womenPage.categorieClick();

    }

    @And("^I select the \"([^\"]*)\"$")
    public void iSelectThe(String size) {
        womenPage.clickOnSize(size);
    }

    @And("^I select color \"([^\"]*)\"$")
    public void iSelectColor(String col) {
        womenPage.selectColor(col);
    }

    @And("^I select Compositions \"([^\"]*)\"$")
    public void iSelectCompositions(String comp) {
        womenPage.selectCompositions(comp);

    }

    @And("^i verify the Colorful Dress is clicked$")
    public void iVerifyTheColorfulDressIsClicked() {
        womenPage.selectProperties();
    }

    @And("^i verify the stock$")
    public void iVerifyTheStock() {
        womenPage.clickOnStock();

    }

    @And("^I select dress type \"([^\"]*)\"$")
    public void iSelectDressType(String dress)  {
        womenPage.dressProperties(dress);



    }


    @And("^i click the dress tab$")
    public void iClickTheDressTab()  {
        womenPage.clickOnDress();
    }

    @And("^I verify the dress tab with result$")
    public void iVerifyTheDressTabWithResult() {
        womenPage.dressResult();

    }

    @And("^I click the casual dresses$")
    public void iClickTheCasualDresses()  {
        womenPage.clickOnCasualDress();
    }


    @And("^I click the \"([^\"]*)\"$")
    public void iClickThe(String size) {
        womenPage.selectTheSize(size);

    }

    @And("^I click the dress color$")
    public void iClickTheDressColor(String c) {
        womenPage.dressColor(c);

    }

    @And("^I check the delivery tab$")
    public void iCheckTheDeliveryTab() {
        womenPage.delivery();
    }
}
