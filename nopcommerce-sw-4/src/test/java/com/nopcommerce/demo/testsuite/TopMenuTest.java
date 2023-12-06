package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    // and another parameter of int -->I added this to keep count of which element to click

    public void selectMenu(String menu) {
        List<WebElement> allTopMenuLinks = homePage.selectNavigationBar();
        try {
            for (WebElement link : allTopMenuLinks) {
                if (link.getText().equals(menu)) {
                    link.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            allTopMenuLinks = homePage.selectNavigationBar();


        }
    }


    @Test
    public void verifyPageNavigation(){
//Create an arraylist to store all top menu texts
        ArrayList<String> listOfNavigationLinks=new ArrayList<>();
        listOfNavigationLinks.add("Computers");
        listOfNavigationLinks.add("Electronics");
        listOfNavigationLinks.add("Apparel");
        listOfNavigationLinks.add("Digital downloads");
        listOfNavigationLinks.add("Books");
        listOfNavigationLinks.add("Jewelry");
        listOfNavigationLinks.add("Gift Cards");

        for(String navigationLink: listOfNavigationLinks ) {
            selectMenu(navigationLink);
        //1.4 Verify the product will arrange in Descending order
            String actualText = homePage.getPageTitle();
            Assert.assertEquals(actualText, navigationLink, "The page title is incorrect.");
        }
    }

}