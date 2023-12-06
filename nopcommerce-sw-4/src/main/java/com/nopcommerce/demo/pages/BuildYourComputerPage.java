package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuildYourComputerPage extends Utility {
    By computerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectTickBox = By.id("product_attribute_1");
    By selectRAM = By.id("product_attribute_2");
    By selectHDD = By.id("product_attribute_3_7");
    By selectOS = By.id("product_attribute_4_9");
    By softwareFirstOpt = By.id("product_attribute_5_10");
    By softwareThirdOption = By.id("product_attribute_5_12");
    By totalPrice = By.id("price-value-1");
    By addToCart = By.id("add-to-cart-button-1");
    By verifyActualMessage = By.xpath("//p[text() = 'The product has been added to your ']");
    By closeTheGreenBar = By.xpath("//span[@class='close']");

    public String getComputerText() {
        return getTextFromElement(computerText);
    }

    public void selectDropDown() {
        clickOnElement(selectTickBox);
    }

    public void selectOption(String text) {
        selectByContainsTextFromDropDown(selectTickBox, text);
    }

    public void clickOnRAM() {
        clickOnElement(selectRAM);

    }

    public void selectRAMOption(String text) {
        selectByVisibleTextFromDropDown(selectRAM, text);
    }

    public void clickOnHDDOption() {
        clickOnElement(selectHDD);
    }

    public void clickOnOS() {
        clickOnElement(selectOS);
    }

    public void clickOnSoftwareFirstOption() {
        clickOnElement(softwareFirstOpt);

    }
    public void clickOnSoftwareThirdOption(){
        clickOnElement(softwareThirdOption);
    }
    public void verifyTheTotalPrice(){
        WebElement price = getElement(totalPrice);
    }
    public void clickOnAddToCartOnComputerPage(){
        clickOnElement(addToCart);
    }
    public String VerifyTheMessageTheProductsHasBeenAdded(){
       return getTextFromElement(verifyActualMessage);

    }
    public void clickOnCloseButton(){
        clickOnElement(closeTheGreenBar);
    }
}