package com.phptravels.core.pages;

import com.phptravels.core.FluentDriver;
import com.phptravels.core.FluentDriverProvider;
import com.phptravels.core.FluentElement;
import com.phptravels.core.dto.IndexDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class IndexPage {

    private String PRODUCT_SEARCH = "//input[@name='search_query']";
    private String SEARCH_BUTTON = "//button[@name='submit_search' and @type='submit']";
    private String PRODUCTRESULT = "//img[@title='%s']";
    private String ADDTOCART = "//a[contains(@class,'ajax_add_to_cart_button')]/span[text()='Add to cart']";
    private String TEXTVERIFICATION = "//h2[contains(.,'Product successfully added to your shopping cart')]";
    private String CHECKOUTPRODUCT = "//a[contains(@title,'Proceed to checkout')]";
    private String DELETEPRODUCT = "//a[@title=\"Delete\"]";
    private String REMOVESHOPPINGCART = "//p[text()=\"Your shopping cart is empty.\"]";
    private String LISTVIEW = "//a[@title=\"List\"]";
    FluentDriver fd;

    public void searchAProduct(IndexDTO indexDTO) {
        fd = FluentDriverProvider.getDriver();
        fd.element(By.xpath(PRODUCT_SEARCH)).waitUntil(30).ifElementIsNotDisplayed().sendKeys(indexDTO.getProductName());
        fd.element(By.xpath(SEARCH_BUTTON)).click();
    }

    public boolean isProductDisplayed(String productName) {
        return fd.element(By.xpath(String.format(PRODUCTRESULT, productName))).waitUntil(10).ifElementIsNotDisplayed().isDisplayed();

    }

    public boolean addToCart(String productName) {
        fd.element(By.xpath(String.format(PRODUCTRESULT, productName))).waitUntil(10).ifElementIsNotDisplayed().moveToElement();
        fd.element(By.xpath(ADDTOCART)).waitUntil(10).ifElementIsNotDisplayed().moveToElement().click();
        return fd.element(By.xpath(TEXTVERIFICATION)).waitUntil(10).ifElementIsNotDisplayed().isDisplayed();

    }

    public void checkOutProduct() {
        fd.element(By.xpath(CHECKOUTPRODUCT)).click();
    }

    public boolean deleteProduct() {
        fd.element(By.xpath(DELETEPRODUCT)).waitUntil(10).ifElementIsNotDisplayed().click();
        return fd.element(By.xpath(REMOVESHOPPINGCART)).waitUntil(10).ifElementIsNotDisplayed().isDisplayed();
    }

    public void clickOnListView() {
        fd.element(By.xpath(LISTVIEW)).waitUntil(10).ifElementIsNotDisplayed().click();
    }

}
