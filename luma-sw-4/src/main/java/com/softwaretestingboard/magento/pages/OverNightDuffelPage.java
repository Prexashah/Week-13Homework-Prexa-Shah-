package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDuffelPage extends Utility {

    By verifyOverNightDuffleTxt = By.xpath("//span[text() = 'Overnight Duffle']");
    By changeElement = By.id("qty");
    By addToCart = By.id("product-addtocart-button");
    By verifyShoppingMsg = By.xpath("//div[@class='message-success success message']");
    By clickOngCart =By.linkText("shopping cart");

    public String verifyOvernightDuffle() {
        return getTextFromElement(verifyOverNightDuffleTxt);
    }

    public void changeQuantity() {
        getElement(changeElement).clear();

    }

    public void sendNewQuantity(String text) {
        sendTextToElement(changeElement, text);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyMessageYouAddedOvernightDuffleToShoppingCart() {
        return getTextFromElement(verifyShoppingMsg);

    }

    public void clickOnShoppingCart() {
        clickOnElement(clickOngCart);
    }
}