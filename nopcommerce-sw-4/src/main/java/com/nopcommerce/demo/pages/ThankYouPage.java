package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ThankYouPage extends Utility {
    By message = By.xpath("//div[@class='page-title']/h1");
    By continueBtn = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    By verifyMsg = By.xpath("//div[@class='section order-completed']/div[@class='title']");

    public String verifyThankYouMessage(){
        return getTextFromElement(message);
    }
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }
    public String verifyYourOrderIsSuccessfully(){
        return getTextFromElement(verifyMsg);
    }
}
