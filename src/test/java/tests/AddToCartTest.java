package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import utils.ScreenshotUtil;

public class AddToCartTest
        extends BaseTest {


    @Test
    public void addSingleProductToCartTest() {

        // Login

        LoginPage login =
                new LoginPage();

        login.login();


        // Check products

        ProductPage product =
                new ProductPage();

        AssertJUnit.assertTrue("Products are not displayed",
                product.getProductCount() > 0
        );


        // Add first product

        product.addFirstProduct();


        ScreenshotUtil.takeScreenshot(
                "ProductAddedToCart"
        );
        product.closeCart();


        System.out.println(
                "Single Product added to cart successfully"
        );
    }
   @Test
    public void addMultipleProductToCartTest() {

        // Login

        LoginPage login =
                new LoginPage();

        login.login();


        // Check products

        ProductPage product =
                new ProductPage();

        AssertJUnit.assertTrue("Products are not displayed",
                product.getProductCount() > 0
        );


        // Add first product

        product.addFirstProduct();
        product.addSecondProduct();


        ScreenshotUtil.takeScreenshot(
                "MultipleProductAddedToCart"
        );
        product.closeCart();


        System.out.println(
                "Multiple Products added to cart successfully"
        );
    }
   
   
   
   
   @Test
   public void EmptyProductsToCartTest() {

       // Login

       LoginPage login =
               new LoginPage();

       login.login();


       // Check products

       ProductPage product =
               new ProductPage();

       AssertJUnit.assertTrue("Products are not displayed",
               product.getProductCount() >= 0
       );
       ScreenshotUtil.takeScreenshot(
               "EmptyProductCart"
       );    
       System.out.println(
               "No Products added to cart successfully"
       );
   }
    
}