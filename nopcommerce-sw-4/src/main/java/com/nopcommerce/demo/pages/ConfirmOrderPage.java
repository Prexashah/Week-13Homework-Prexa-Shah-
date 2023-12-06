package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {
    By verifyCreditCard = By.xpath("//span[normalize-space()='Credit Card");
    By nextDayAirMsg = By.xpath("//span[normalize-space()='Next Day Air'");
    By finalPrice = By.xpath("//td[@class='cart-total-right']/span[@class='value-summary']/strong");
    By confirmBtn = By.xpath("//button[normalize-space()='Confirm']");

    public String verifyPaymentMethodCC() {
        return getTextFromElement(verifyCreditCard);
    }
    public String VerifyShippingIsNextDayAir(){
        return getTextFromElement(nextDayAirMsg);
    }
    public String verifyFinalPrice(){
        return getTextFromElement(finalPrice);
    }
    public void clickOnConfirmBtn(){
        clickOnElement(confirmBtn);
    }

}