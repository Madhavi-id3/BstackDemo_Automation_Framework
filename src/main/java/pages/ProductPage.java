package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import utils.DriverFactory;

public class ProductPage {

    WebDriver driver;

    WebDriverWait wait;


    By products =
            By.cssSelector(".shelf-item");


    By addToCartButtons1 =
            By.cssSelector(".shelf-item__buy-btn");
    
    By addToCartButtons2 =
            By.xpath("//*[@id=\"2\"]/div[4]");
    
    By closeCartButton =
			By.cssSelector("div.float-cart__close-btn");


    public ProductPage() {

        driver = DriverFactory.driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }


    public int getProductCount() {

        return driver.findElements(products).size();
    }


    public void addFirstProduct() {

        WebElement button =
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                addToCartButtons1
                        )
                );

        button.click();
        System.out.println("Product1 added to cart Successfully");
    }
    
    public void addSecondProduct() {

        WebElement button =
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                addToCartButtons2
                        )
                );

     
        button.click();
        System.out.println("Product2 added to cart Successfully");
        
        }
    
    public void closeCart() {

        WebElement closeButton = driver.findElement(
                By.cssSelector("div.float-cart__close-btn")
        );

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
                closeButton
        );

        System.out.println(
                "Cart closed successfully"
        );
    }
}