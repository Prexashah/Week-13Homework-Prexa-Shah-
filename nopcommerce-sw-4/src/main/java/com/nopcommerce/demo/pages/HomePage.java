package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By clickOnSelectMenu = By.xpath("//ul[@class='top-menu notmobile']/li/a[normalize-space()=' + menu + ']");
    By getActualText = By.xpath("//div[@class='page-title']/h1");
    By clickOnComputer = By.xpath("(//a[text() = 'Computers '])[1]");
    By clickOnDesktop = By.xpath("(//div[@class='sub-category-item'])[1]");
    By topMenuElements = By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li");
    By pageTitle =By.xpath("//div[@class='page-title']/h1");

    public void clickOnAnySelectMenu() {
        clickOnElement(clickOnSelectMenu);

    }

    public String getText() {
        return getTextFromElement(getActualText);

    }

    public void ClickOnComputerMenu() {
        clickOnElement(clickOnComputer);
    }

    public void clickOnDesktopDropDown() {
        clickOnElement(clickOnDesktop);
    }

    public List<WebElement> selectNavigationBar() {
        return getElements(topMenuElements);

    }
    public String getPageTitle(){

        return getTextFromElement(pageTitle);
    }
}
