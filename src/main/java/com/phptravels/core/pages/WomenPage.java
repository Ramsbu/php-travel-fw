package com.phptravels.core.pages;

import com.phptravels.core.FluentDriver;
import com.phptravels.core.FluentDriverProvider;
import org.openqa.selenium.By;

public class WomenPage {

    private String WOMEN_TAB = "//a[@class='sf-with-ul']";
    private String RESULT = "You will find here all woman fashion collections.";
    private String WOMENPAGERESULT = "//*[text()[contains(., 'You will find here all woman fashion collections.')]]";
    private String TOP_TAB = "//a[contains(@title,'Choose from t-shirts, tops, blouses, short sleeves')]";
    private String TOP_RESULT = "//*[text()[contains(. ,'Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more.')]]";
    private String CATEGORIES = "//li/label[@for='layered_category_5']";
    private String ENABLE_CATEGORIES = "//a[@rel='layered_category_5']";
    private String SIZE = "//a[contains(@href, 'size') and contains(.,'%s')]";
    private String COLOR = "//a[contains(@href ,'color') and contains(.,'%s')]";
    private String Compositions = "//a[@rel='nofollow' and contains(.,'%s')]";
    private String PROPERTIES = "//li/label[@for='layered_id_feature_18']";
    private String STOCK = "//li/label[@for=\"layered_quantity_1\"]";
    private String DRESSPROPERTIES = "//a[contains(.,'%s')]";
    private String DRESS_TAB = "//a[contains(@title,'Find your favorites dresses from our wide choice of evening, casual or summer dresses!')]";
    private String DRESSTABRESULT = "Find your favorites dresses from our wide choice of evening, casual or summer dresses!";
    private String CASUAL_DRESS = "//a[contains(@title,'You are looking for a dress for every day?')]";
    private String DRESSSIZE = "//a[contains(@href,'size') and contains(.,'%s')]";
    private String DRESSCOLOR = "//a[contains(@href,'color') and contains(.,'s')]";
    private String DELIVERY = "//a[@title='Delivery']";

    FluentDriver fd;

    public void clickOnWomenTab() {
        fd = FluentDriverProvider.getDriver();
        fd.element(By.xpath(WOMEN_TAB)).waitUntil(30).ifElementIsNotDisplayed().click();
    }

    public boolean isWomenTabClicked() {
        return fd.element(By.xpath(WOMENPAGERESULT)).waitUntil(30).ifElementIsNotDisplayed().isDisplayed();
    }

    public String womenTabStringComparision() {
        return fd.element(By.xpath(WOMENPAGERESULT)).getText();

    }

    public void topTabClicked() {
        fd.element(By.xpath(TOP_TAB)).waitUntil(30).ifElementIsNotDisplayed().click();


    }

    public String topTabComparision() {
        return fd.element(By.xpath(TOP_RESULT)).getText();
    }

    public void tshirtClicked() {
        fd.element(By.xpath(CATEGORIES)).waitUntil(20).ifElementIsNotDisplayed().click();
    }

    public void categorieClick() {
        fd.element(By.xpath(ENABLE_CATEGORIES)).waitUntil(10).ifElementIsNotDisplayed().click();

    }

    public void clickOnSize(String s) {
        fd.element(By.xpath(String.format(SIZE, s))).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void selectColor(String color) {
        fd.element(By.xpath(String.format(COLOR, color))).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void selectCompositions(String comp) {
        fd.element(By.xpath(String.format(Compositions, comp))).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void selectProperties() {
        fd.element(By.xpath(PROPERTIES)).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void clickOnStock() {
        fd.element(By.xpath(STOCK)).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void dressProperties(String dresspropert) {
        fd.element(By.xpath(String.format(DRESSPROPERTIES, dresspropert))).waitUntil(10).ifElementIsNotDisplayed().click();

    }

    public void clickOnDress() {
        fd.element(By.xpath(DRESS_TAB)).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void dressResult() {
        fd.element(By.xpath(DRESSTABRESULT)).isDisplayed();
    }

    public void clickOnCasualDress() {
        fd.element(By.xpath(CASUAL_DRESS)).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void selectTheSize(String s) {
        fd.element(By.xpath(String.format(DRESSSIZE, s))).waitUntil(10).ifElementIsNotDisplayed().click();
    }

    public void dressColor(String c) {
        fd.element(By.xpath(String.format(DRESSCOLOR, c))).waitUntil(10).ifElementIsNotDisplayed().click();

    }

    public void delivery() {
        fd.element(By.xpath(DELIVERY)).waitUntil(10).ifElementIsNotDisplayed().click();
        fd.navigateBack();
    }


}





