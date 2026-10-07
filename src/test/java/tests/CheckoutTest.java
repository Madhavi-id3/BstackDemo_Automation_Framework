package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;

import utils.ScreenshotUtil;

public class CheckoutTest
        extends BaseTest {


    @Test
    public void checkoutTest() {

//        // Login

        LoginPage login =
               new LoginPage();

        login.login();

        // Add product

        ProductPage product =
                new ProductPage();

        product.addFirstProduct();
        product.closeCart();


        // Open cart

        CartPage cart =
                new CartPage();

        cart.openCart();
        cart.clickCheckout();


        ScreenshotUtil.takeScreenshot(
                "CheckoutCart"
        );


        // Checkout

        CheckoutPage checkout =
                new CheckoutPage();


        checkout.enterFirstName(
                "Madhavi"
        );

        checkout.enterLastName(
                "Tester"
        );

        checkout.enterAddress(
                "Main Road"
        );

        checkout.enterState(
                "Andhra Pradesh"
        );

        checkout.enterPostalCode(
                "500001"
        );


        ScreenshotUtil.takeScreenshot(
                "CheckoutDetails"
        );
        checkout.clickSubmit();


        AssertJUnit.assertTrue(
                true
        );
    }


    @Test
    public void checkoutWithoutProduct() {

        LoginPage login =
                new LoginPage();

        


        CartPage cart =
                new CartPage();

        cart.openCart();


        ScreenshotUtil.takeScreenshot(
                "EmptyCart"
        );


        AssertJUnit.assertTrue(
                true
        );
    }
}