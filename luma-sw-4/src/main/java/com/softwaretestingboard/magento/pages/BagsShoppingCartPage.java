package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsShoppingCartPage extends Utility {

    By verifyProduct = By.linkText("Overnight Duffle");
    By verifyQty = By.xpath("//span[@class='label'][text()='Qty']/following-sibling::input");
    By verifyPrice = By.xpath("(//span[@class='cart-price']/span[@class='price'])[2]");
    By changeQty = By.xpath("//span[@class='label'][text()='Qty']/following-sibling::input");
    By sendNewQty = By.xpath("//span[@class='label'][text()='Qty']/following-sibling::input");
    By clickUpdate = By.xpath("//button[normalize-space()='Update Shopping Cart']");


    public String verifyProductNameOverNightDuffle(){
        return getTextFromElement(verifyProduct);
    }
    public String verifyTheQuantityIs3(){
        return getElement(verifyQty).getAttribute("value");
    }
    public String verifyTheProductPrice(){
        return getTextFromElement(verifyPrice);
    }
    public void changeQtyTo5(){
        getElement(changeQty).clear();
    }
    public void sendNewQty5(String text){
        sendTextToElement(sendNewQty,text);
    }
    public void clickOnUpdateCart(){
        clickOnElement(clickUpdate);
    }
}
