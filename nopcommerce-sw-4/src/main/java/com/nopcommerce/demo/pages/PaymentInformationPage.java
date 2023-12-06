package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentInformationPage extends Utility {
    By clickOnMastercard = By.id("CreditCardType");
    By cardholderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireMonth = By.id("ExpireMonth");
    By expireYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueBtn = By.xpath("//button[@class = 'button-1 payment-info-next-step-button'][text() = 'Continue']");


    public void selectMasterCardOption(String text){
        selectByVisibleTextFromDropDown(clickOnMastercard,text);
    }
    public void cardHolderName(String text){
        sendTextToElement(cardholderName,text);
    }
    public void cardNumber(String text){
        sendTextToElement(cardNumber,text);
    }
    public void selectMonthOfExpire(String text){
        selectByVisibleTextFromDropDown(expireMonth,text);

    }
    public void selectExpireYear(String text){
        selectByVisibleTextFromDropDown(expireYear,text);

    }
    public void cardSecurityCode(String text){
        sendTextToElement(cardCode,text);
    }
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }
}

