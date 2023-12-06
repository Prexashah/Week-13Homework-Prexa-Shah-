package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.LumaHomePage;
import com.softwaretestingboard.magento.pages.WomenJacketspage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    LumaHomePage homepage = new LumaHomePage();
    WomenJacketspage jakcetpage = new WomenJacketspage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse hover on Women Menu
        homepage.mouseHoverOnWomenMenu();

        //mouse hover on Tops
        homepage.mouseHoverOnTops();

        //mouse hover and click on jackets
        homepage.clickOnJackets();

        // Verify the products name display in alphabetical order
        //before filter
        List<WebElement> listBeforeFilter = jakcetpage.getProductList();
        ArrayList<String> productsBeforeFilter = new ArrayList<>();
        for (WebElement e : listBeforeFilter) {
            productsBeforeFilter.add(e.getText());
        }
        Collections.sort(productsBeforeFilter);
        jakcetpage.selectSortByDropDown("Product Name");

        //Verify the products name display in alphabetical order

        List<WebElement> listAfterFilter = jakcetpage.getProductList();
        ArrayList<String> productsAfterFilter = new ArrayList<>();
        for (WebElement i : listAfterFilter) {
            productsAfterFilter.add(i.getText());
        }
        Collections.sort(productsAfterFilter);
        jakcetpage.selectSortByDropDown("Product Name");

        //adding assert statement to compare before and after list

        Assert.assertEquals(productsAfterFilter, productsBeforeFilter);
    }


    @Test
    public void verifyTheSortByPriceFilter() {
        //Mouse Hover on Women Menu
        //Mouse hover on Women Menu
        homepage.mouseHoverOnWomenMenu();

        //mouse hover on Tops
        homepage.mouseHoverOnTops();

        //mouse hover and click on jackets
        homepage.clickOnJackets();

        //Select Sort ByFilter "Price"
        //Verify the products display in Low to High

        List<WebElement> listBefore = jakcetpage.getPriceList();
        ArrayList<Double> productsBeforeFilter = new ArrayList<>();
        for (WebElement e : listBefore) {

            productsBeforeFilter.add(Double.valueOf(e.getText().replace("$", "")));
        }
        System.out.println(productsBeforeFilter);// debug purpose
        Collections.sort(productsBeforeFilter);
        jakcetpage.selectSortByDropDown("Price");
        driver.navigate().refresh();//used this to avoid exception

        List<WebElement> listAfter = jakcetpage.getPriceList();
        ArrayList<Double> productsAfterFilter = new ArrayList<>();
        for (WebElement e : listAfter) {

            productsAfterFilter.add(Double.valueOf(e.getText().replace("$", "")));

        }
        System.out.println(productsAfterFilter);//debug purpose
        Assert.assertEquals(productsAfterFilter, productsBeforeFilter, "Product are not sorted by price");


    }
}
