package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BillingPage extends Utility {
    By firstname = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By dropDownTxt = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By clickContinue = By.xpath("(//button[@class ='button-1 new-address-next-step-button'])[1]");

    public void firstName(String text) {
        sendTextToElement(firstname, text);
    }
    public void lastName(String text) {
        sendTextToElement(lastName,text);
    }
    public void email(String text) {
        sendTextToElement(email,text);
    }
    public void selectCountry(String text) {
        selectByVisibleTextFromDropDown(dropDownTxt,text);
    }
    public void selectCity(String text){
        sendTextToElement(city,text);

    }
    public void address1(String text){
        sendTextToElement(address1,text);
    }
    public void postcode(String text){
        sendTextToElement(postCode,text);
    }
    public void phoneNumber(String text){
        sendTextToElement(phoneNumber,text);
    }
    public void clickOnContinueBtn(){
        clickOnElement(clickContinue);
    }
}
