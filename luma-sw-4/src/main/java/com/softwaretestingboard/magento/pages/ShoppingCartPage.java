package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
     By verifyProductName = By.linkText("Cronus Yoga Pant");
     By verifySize = By.xpath("//dl[@class='item-options']//dd[1]");
     By verifyColour =By.xpath("//dl[@class='item-options']//dd[2]");


    public String verifyProductCronusYogaPant(){
        return getTextFromElement(verifyProductName);

    }
    public String verifySize32(){
        return getTextFromElement(verifySize);

    }
    public String verifyColourBlack(){
        return getTextFromElement(verifyColour);

    }

}
