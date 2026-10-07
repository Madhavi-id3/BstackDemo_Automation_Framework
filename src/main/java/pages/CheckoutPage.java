package pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class CheckoutPage {

    By firstName =
            By.id("firstNameInput");

    By lastName =
            By.id("lastNameInput");

    By address =
            By.id("addressLine1Input");

    By state =
            By.id("provinceInput");

    By postalCode =
            By.id("postCodeInput");
    By submitButton =
			By.id(
					"checkout-shipping-continue"
			);


    public void enterFirstName(
            String value) {

        DriverFactory.driver
                .findElement(firstName)
                .sendKeys(value);
    }


    public void enterLastName(
            String value) {

        DriverFactory.driver
                .findElement(lastName)
                .sendKeys(value);
    }


    public void enterAddress(
            String value) {

        DriverFactory.driver
                .findElement(address)
                .sendKeys(value);
    }


    public void enterState(
            String value) {

        DriverFactory.driver
                .findElement(state)
                .sendKeys(value);
    }


    public void enterPostalCode(
            String value) {

        DriverFactory.driver
                .findElement(postalCode)
                .sendKeys(value);
    }
    
    public void clickSubmit(
           ) {

        DriverFactory.driver
                .findElement(submitButton)
                .click();
    }
    
    
    
    
    
    
    
    
    
    
}