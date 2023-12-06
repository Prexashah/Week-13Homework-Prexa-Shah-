package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    By clickOnDuffel = By.xpath("//strong[@class='product name product-item-name'][normalize-space()='Overnight Duffle']");



    public void clickOnOverNightDuffel(){
        clickOnElement(clickOnDuffel);
    }
}
