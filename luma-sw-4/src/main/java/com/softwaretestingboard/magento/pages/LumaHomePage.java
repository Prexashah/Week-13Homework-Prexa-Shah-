package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class LumaHomePage extends Utility {
    By womenlink = By.id("ui-id-4");
    By hoverOnTop = By.id("ui-id-9");
    By jackets = By.id("ui-id-11");
    By menLink = By.id("ui-id-5");
    By hoverOnBottom = By.id("ui-id-18");
    By clickOnPant = By.id("ui-id-23");
    By mouseHoverGear = By.id("ui-id-6");
    By clickOnBags = By.id("ui-id-25");

    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenlink);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(hoverOnTop);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);

    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menLink);
    }

    public void mouseHoverOnBottom() {
        mouseHoverToElement(hoverOnBottom);
    }

    public void clickOnPant() {
        mouseHoverToElementAndClick(clickOnPant);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(mouseHoverGear);
    }

    public void clickOnBags() {
        mouseHoverToElementAndClick(clickOnBags);
    }
}