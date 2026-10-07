package pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class CartPage {

    By cart =
            By.xpath(
                    "//*[@id=\"__next\"]/div/div/div[2]/span"
            );
    By checkoutButton =
			By.cssSelector(
					".buy-btn"
			);


    public void openCart() {

        DriverFactory.driver
                .findElement(cart)
                .click();
    }
     public void clickCheckout() {

		DriverFactory.driver
				.findElement(checkoutButton)
				.click();
	}

    public int getCartItems() {

        return DriverFactory.driver
                .findElements(
                        By.cssSelector(
                                ".float-cart .shelf-item"
                        )
                )
                .size();
    }
}