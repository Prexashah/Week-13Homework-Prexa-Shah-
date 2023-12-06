package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.BagsShoppingCartPage;
import com.softwaretestingboard.magento.pages.LumaHomePage;
import com.softwaretestingboard.magento.pages.OverNightDuffelPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    LumaHomePage homePage = new LumaHomePage();
    BagsPage bagsPage = new BagsPage();
    OverNightDuffelPage overNightDuffelPage = new OverNightDuffelPage();
    BagsShoppingCartPage bagsShoppingCartPage = new BagsShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //* Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearMenu();
        // * Click on Bags
        homePage.clickOnBags();
        //* Click on Product Name ‘Overnight Duffle’
        bagsPage.clickOnOverNightDuffel();
        //* Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = overNightDuffelPage.verifyOvernightDuffle();
        Assert.assertEquals(actualText, expectedText, "Product is not correct");
        //* Change Qty 3
        overNightDuffelPage.changeQuantity();
        overNightDuffelPage.sendNewQuantity("3");
        // * Click on ‘Add to Cart’ Button.
        overNightDuffelPage.clickOnAddToCart();
        // * Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
        String actualText1 = overNightDuffelPage.verifyMessageYouAddedOvernightDuffleToShoppingCart();
        Assert.assertEquals(actualText1, expectedText1, "Product is not added to shopping cart");
        //* Click on ‘shopping cart’ Link into message
        overNightDuffelPage.clickOnShoppingCart();
        //* Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(bagsShoppingCartPage.verifyProductNameOverNightDuffle(), "Overnight Duffle",
                "The Product is incorrect");
        //* Verify the Qty is ‘3’
        Assert.assertEquals(bagsShoppingCartPage.verifyTheQuantityIs3(), "3", "Incorrect Qty");
        //* Verify the product price ‘$135.00’
        Assert.assertEquals(bagsShoppingCartPage.verifyTheProductPrice(), "$135.00", "Incorrect Price");
        //* Change Qty to ‘5’
        bagsShoppingCartPage.changeQtyTo5();
        bagsShoppingCartPage.sendNewQty5("5");
        //* Click on ‘Update Shopping Cart’ button
        bagsShoppingCartPage.clickOnUpdateCart();


    }

}
