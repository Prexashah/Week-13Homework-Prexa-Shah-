package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AfterOrderPage extends Utility {
By welcomeTxt = By.xpath("//div[@class='topic-block-title']/h2");
    public String verifyWelcomeToOurStoreTxt(){
        return getTextFromElement(welcomeTxt);
    }
}
