package com.phptravels.steps;

import com.phptravels.core.dto.IndexDTO;
import com.phptravels.core.pages.IndexPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class IndexPageSteps {

    IndexPage indexPage;

    @Given("^I search with following details$")
    public void searchProduct(List<IndexDTO> indexDTOS) {
        IndexDTO indexDTO = indexDTOS.get(0);
        indexPage = new IndexPage();
        indexPage.searchAProduct(indexDTO);

    }

    @Then("^I verify product \"([^\"]*)\" is listed$")
    public void isProductListed(String productName) {
        Assert.assertTrue(indexPage.isProductDisplayed(productName));
    }

    @Given("^Adding new product to cart$")
    public void addingNewProductToCart() {
    }

    @And("^Add product \"([^\"]*)\" to the cart$")
    public void addProductToCart(String productName) {
        boolean isProductAdded = indexPage.addToCart(productName);
        Assert.assertTrue(isProductAdded);

    }

    @And("^I checkout the product$")
    public void iCheckoutTheProduct() {
        indexPage.checkOutProduct();
    }

    @And("^I delete the product$")
    public void iDeleteTheProduct() {
        boolean isDeleted = indexPage.deleteProduct();
        Assert.assertTrue(isDeleted);

    }

    @And("^I switch to List view$")
    public void switchTOListView() {
        indexPage.clickOnListView();
    }



}
