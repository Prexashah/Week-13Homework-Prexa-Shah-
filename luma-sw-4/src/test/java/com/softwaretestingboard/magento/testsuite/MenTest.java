package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.LumaHomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    LumaHomePage homepage = new LumaHomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart() {
        //Mouse Hover on Men Menu
        homepage.mouseHoverOnMenMenu();
        //Mouse Hover on Bottoms
        homepage.mouseHoverOnBottom();
        //* Click on Pants
        homepage.clickOnPant();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        pantsPage.mouseHoverOnCronusYogaPants();
        pantsPage.mouseHoverAndClickOnSize32();
        //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
        pantsPage.mouseHoverOnCronusYogaPants();
        pantsPage.mouseHoverOnYogaPantAndClickOnColourBlack();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        pantsPage.mouseHoverOnCronusYogaPants();
        pantsPage.addToCartYogaPant();
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = pantsPage.verifyTheMessageYouAddedPantToShoppingCart();
        Assert.assertEquals(actualText, expectedText, "Product is not added to shopping cart");
        //* Click on ‘shopping cart’ Link into message
        pantsPage.clickOnShoppingLinkInToMessage();
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.verifyProductCronusYogaPant(), "Cronus Yoga Pant", "Product is incorrect");
        //* Verify the product size ‘32’
        Assert.assertEquals(shoppingCartPage.verifySize32(), "32", "The size is incorrect");
        //* Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.verifyColourBlack(), "Black", "The colour is incorrect");


    }
}
