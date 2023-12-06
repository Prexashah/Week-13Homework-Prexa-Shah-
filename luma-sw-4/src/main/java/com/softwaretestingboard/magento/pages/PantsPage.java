package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {

By hoverOnCronusPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
By clickOnSize32 = By.id("option-label-size-143-item-175");
By clickOnBlackColour = By.id("option-label-color-93-item-49");
By addToCart = By.xpath("(//span[text() = 'Add to Cart'])[1]");
By verifyAddToCart = By.xpath("//div[@class='message-success success message']");
By clickShoppingLink = By.linkText("shopping cart");
    public void mouseHoverOnCronusYogaPants(){
        mouseHoverToElement(hoverOnCronusPant);
    }
    public void mouseHoverAndClickOnSize32(){
        mouseHoverToElementAndClick(clickOnSize32);
    }
    public void mouseHoverOnYogaPantAndClickOnColourBlack(){
        mouseHoverToElementAndClick(clickOnBlackColour);
    }
    public void addToCartYogaPant(){
        clickOnElement(addToCart);
    }
    public String verifyTheMessageYouAddedPantToShoppingCart(){
        return getTextFromElement(verifyAddToCart);

    }
    public void clickOnShoppingLinkInToMessage(){
        clickOnElement(clickShoppingLink);

    }
}
