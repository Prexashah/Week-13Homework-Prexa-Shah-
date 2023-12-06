package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ComputerTest extends BaseTest {
    HomePage homePage1 = new HomePage();
    DesktopPage desktop = new DesktopPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    BillingPage billingPage = new BillingPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    ThankYouPage thankYouPage = new ThankYouPage();
    AfterOrderPage afterOrderPage = new AfterOrderPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {

        // 1.1 Click on Computer Menu.
        homePage1.ClickOnComputerMenu();
        //1.2 click on Desktop
        homePage1.clickOnDesktopDropDown();


        //1.3 Select Sort By position "Name: Z to A
        List<WebElement> beforeSorting = desktop.beforeSortElements();
        ArrayList<String> beforeFilter = new ArrayList<>();
        for (WebElement i : beforeSorting) {
            beforeFilter.add(i.getText());
        }
        Collections.sort(beforeFilter);
        Collections.reverse(beforeFilter);
        //click on Z toA
        System.out.println(beforeFilter);
        desktop.clickNameDropDown("Name: Z to A");
        Thread.sleep(2000);
        List<WebElement> afterSorting = desktop.beforeSortElements();
        ArrayList<String> afterFilter = new ArrayList<>();
        for (WebElement i : afterSorting) {
            afterFilter.add(i.getText());
        }
        System.out.println(afterFilter);
        Assert.assertEquals(afterFilter, beforeFilter, "The Products are not sorted in descending order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 click on computer Menu
        homePage1.ClickOnComputerMenu();
        //2.2 click on Desktop
        homePage1.clickOnDesktopDropDown();
        //2.3 Select SortBy position " Name : A to z
        List<WebElement> Sorting = desktop.beforeSortElements();
        ArrayList<String> Filter = new ArrayList<>();
        for (WebElement i : Sorting) {
            Filter.add(i.getText());
        }
        Collections.sort(Filter);

        //2.4Click on "Add to cart
        desktop.addToCart();
        //2.5Verify the text Build your own computer
        String expectedText = "Build your own computer";
        String actualText = buildYourComputerPage.getComputerText();
        Assert.assertEquals(actualText, expectedText, "Not redirected to Build your computer page");

        //2.6 Select "2.2 Ghz Intel Pentium Dial-Core E2200" using Select class
        buildYourComputerPage.selectDropDown();
        buildYourComputerPage.selectOption("2.2 GHz Intel Pentium Dual-Core E2200");

        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourComputerPage.clickOnRAM();
        //select option
        buildYourComputerPage.selectRAMOption("8GB [+$60.00]");

        // 2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourComputerPage.clickOnHDDOption();
        // 2.9 Select OS radio "Vista Premium [+$60.00]
        buildYourComputerPage.clickOnOS();
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        buildYourComputerPage.clickOnSoftwareFirstOption();
        buildYourComputerPage.clickOnSoftwareThirdOption();

        //2.11 Verify the price "$1,475.00"
        buildYourComputerPage.verifyTheTotalPrice();
        //2.12 Click on "ADD TO CARD" Button.
        buildYourComputerPage.clickOnAddToCartOnComputerPage();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        String expectedTxt = "The product has been added to your shopping cart";
        String actualTxt = buildYourComputerPage.VerifyTheMessageTheProductsHasBeenAdded();
        Assert.assertEquals(actualTxt, expectedTxt, "The Products are not Added to ShoppingCart");

        //After that close the bar clicking on the cross button
        buildYourComputerPage.clickOnCloseButton();

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        shoppingCartPage.mouseHoverOnShoppingCart();
        Thread.sleep(5000);  //to avoid 'element not interactive' exception
        shoppingCartPage.clickOnGoToCart();
        //2.15 Verify the message "Shopping cart
        String expectedMessage = "Shopping cart";
        String actualMessage = shoppingCartPage.verifyTheMessageShoppingCart();
        Assert.assertEquals(actualMessage, expectedMessage, "You are not on ShoppingCartPage");

        //2.16 Change the Qty to "2" and Click on "Update shopping cart
        shoppingCartPage.changeQtyTo2();
        shoppingCartPage.sendNewQtyValue("2");
        //2.17 Verify the Total"$2,950.00"
        shoppingCartPage.verifyTheTotalPriceOfShopping();
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermsAndServices();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckout();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedWelcomeMsg = "Welcome, Please Sign In!";
        String actualWelcomeMsg = checkoutPage.verifyTheWelcomeTxt();
        Assert.assertEquals(actualWelcomeMsg, expectedWelcomeMsg, "You have not checked out");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        checkoutPage.clickOnCheckOutAsGuest();
        //2.22 Fill the all mandatory field
        billingPage.firstName("Maria");
        billingPage.lastName("Roshan");
        //Generate a random email
        Random random = new Random();
        int ranNumber = random.nextInt(1000);
        String ranString = String.format("%03d", ranNumber);
        String randomEmail = ranString + "ltester25@gmail.com";
        billingPage.email("ltester25@gmail.com");
        billingPage.selectCountry("Australia");
        billingPage.selectCity("London");
        billingPage.address1("1, chapel street");
        billingPage.postcode("M4 4UH");
        billingPage.phoneNumber("0745859632");
        //2.23 Click on “CONTINUE”
        billingPage.clickOnContinueBtn();
        Thread.sleep(2000);
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutPage.clickOnDeliveryOption();
        //2.25 Click on “CONTINUE”
        checkoutPage.clickOnFinalCtn();
        //2.26 Select Radio Button “Credit Card”
        checkoutPage.clickOnPaymentOption();
        paymentInformationPage.clickOnContinue();

        Thread.sleep(2000);
        //2.27 Select “Master card” From Select credit card dropdown
        paymentInformationPage.selectMasterCardOption("Master card");

        //2.28 Fill all the details
        //cardholder name
        paymentInformationPage.cardHolderName("Maria");
        //card number
        paymentInformationPage.cardNumber("5555 5555 5555 4444");
        //month of expire
        paymentInformationPage.selectMonthOfExpire("09");
        //Year of Expire
        paymentInformationPage.selectExpireYear("2029");
        //card security code
        paymentInformationPage.cardSecurityCode("339");
        //2.29 Click on “CONTINUE”
        paymentInformationPage.clickOnContinue();
        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedMsg = "Credit Card";
        String actualMsg = confirmOrderPage.verifyPaymentMethodCC();
        Assert.assertEquals(actualMsg, expectedMsg, "You are not Confirm order page");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedMsg1 = "Next Day Air";
        String actualMsg1 = confirmOrderPage.VerifyShippingIsNextDayAir();
        Assert.assertEquals(actualMsg1, expectedMsg1, "You are not Confirm order page");
        //2.33 Verify Total is “$2,950.00”
        String expectedPrice = "$2,950";
        String actualPrice = confirmOrderPage.verifyFinalPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Incorrect amount");
        //2.34 Click on “CONFIRM”
        confirmOrderPage.clickOnConfirmBtn();
        //2.35 Verify the Text “Thank You”
        String expectThxMessage = "Thank you";
        String actualThxMessage = thankYouPage.verifyThankYouMessage();
        Assert.assertEquals(actualThxMessage, expectThxMessage, "Not checked out");
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals("Your order has been successfully processed!", thankYouPage.verifyYourOrderIsSuccessfully(),
                "Your order is not successful");
        //2.37 Click on “CONTINUE”
        thankYouPage.verifyThankYouMessage();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals("Welcome to our store", afterOrderPage.verifyWelcomeToOurStoreTxt(), "You are not at Home page");

    }

}
