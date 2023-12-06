package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By welcomeMessage = By.xpath("//div[@class='page-title']/h1");
    By guestCheckout = By.xpath("//button[@class = 'button-1 checkout-as-guest-button']");
    By deliveryOpn = By.id("shippingoption_1");
    By paymentOpn = By.id("paymentmethod_1");
    By finalCtn = By.xpath("//div[@id='shipping-method-buttons-container']/button[normalize-space()='Continue']");


    public String verifyTheWelcomeTxt() {
        return getTextFromElement(welcomeMessage);
    }

    public void clickOnCheckOutAsGuest() {
        clickOnElement(guestCheckout);
    }

    public void clickOnDeliveryOption() {
        clickOnElement(deliveryOpn);
    }

    public void clickOnPaymentOption() {
        clickOnElement(paymentOpn);

    }

    public void clickOnFinalCtn() {
        clickOnElement(finalCtn);

    }
}
