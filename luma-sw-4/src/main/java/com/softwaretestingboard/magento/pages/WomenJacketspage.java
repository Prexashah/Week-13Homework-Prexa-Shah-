package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenJacketspage extends Utility {
    By dropdown = By.xpath("//select[@id='sorter'])[1]");
    By sortByDropDown =By.id("sorter");

    By jacketList = By.xpath("//strong[@class='product name product-item-name']");

    By filterPrice = By.xpath("//span[@class='price-container price-final_price tax weee']//span[@class='price']");
    By selectFilterByNamePrice = By.id("sorter");

    public void selectSortByProductName(String text) {
        selectByVisibleTextFromDropDown(dropdown, text);
    }

    public List<WebElement> getProductList() {
        return driver.findElements(jacketList);
    }

    public void selectSortByDropDown(String text) {
        selectByVisibleTextFromDropDown(sortByDropDown, text);
    }

    public List<WebElement> getPriceList(){
        return driver.findElements(filterPrice);

    }
//public void afterSortByPrice(String text){

  //      selectByVisibleTextFromDropDown(afterFilterPrice,text);
    //}
    public void selectPriceLowToHigh(String text) {
        selectByVisibleTextFromDropDown(selectFilterByNamePrice, text);
    }
}
