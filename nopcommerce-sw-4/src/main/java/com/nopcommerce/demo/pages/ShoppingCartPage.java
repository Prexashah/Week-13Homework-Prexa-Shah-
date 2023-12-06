package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {

    By mouseHover = By.xpath("//span[text() = 'Shopping cart']");
    By clickOnCart = By.xpath("//button[normalize-space()='Go to cart']");
    By shoppingCartMessage = By.xpath("//div[@class='page-title']");
    By changeQty = By.xpath("//td[@class= 'quantity']//input");
    By changeQty2 = By.xpath("//td[@class= 'quantity']//input");
    By totalPrice = By.xpath("(//span[@class = 'value-summary'])[4]");
    By termsAndService = By.id("termsofservice");
    By checkOut = By.id("checkout");
    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(mouseHover);
    }

    public void clickOnGoToCart() {
        clickOnElement(clickOnCart);
    }

    public String verifyTheMessageShoppingCart() {
        return getTextFromElement(shoppingCartMessage);
    }

    public void changeQtyTo2() {
        getElement(changeQty).clear();
    }

    public void sendNewQtyValue(String text) {
        sendTextToElement(changeQty2, text);
    }

    public void verifyTheTotalPriceOfShopping() {
        WebElement price = getElement(totalPrice);
    }

    public void clickOnTermsAndServices() {
        clickOnElement(termsAndService);
    }
    public void clickOnCheckout(){
        clickOnElement(checkOut);
    }

}
