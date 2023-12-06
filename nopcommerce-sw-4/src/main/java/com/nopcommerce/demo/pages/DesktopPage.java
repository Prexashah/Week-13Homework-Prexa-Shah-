package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

By desktopProducts = By.xpath("//div[@class='details']//h2[@class='product-title']/a");
By nameDropDown = By.id("product_attribute_1");
By addCart = By.xpath("(//button[text()= 'Add to cart'])[1]");
public List<WebElement> beforeSortElements(){
   return getElements(desktopProducts);
}
public void clickNameDropDown(String text){
   selectByVisibleTextFromDropDown(nameDropDown,text);
}
public void addToCart(){
   clickOnElement(addCart);
}
}
