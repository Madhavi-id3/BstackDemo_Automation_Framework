package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverFactory;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    // Sign In button
    By signInButton = By.id("signin");

    // Username dropdown
    By usernameDropdown = By.id("username");

    // Password dropdown
    By passwordDropdown = By.id("password");
    
    By wrongUsernameDropdown = By.xpath("//*[@id=\"username\"]/div[1]/div[1]");

    // Username option
    By usernameOption =
            By.cssSelector("#react-select-2-option-0-0");

    // Password option
    By passwordOption =
            By.cssSelector("#react-select-3-option-0-0");

    // Login button
    By loginButton = By.id("login-btn");

    // Logout button
    By logoutButton = By.xpath("//span[@id='signin']");


    public LoginPage() {

        driver = DriverFactory.driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );
    }


    public void clickSignIn() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        signInButton
                )
        ).click();

        System.out.println("Sign In button clicked");
    }


    public void selectUsername() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        usernameDropdown
                )
        ).click();

        System.out.println("Username dropdown opened");


        wait.until(
                ExpectedConditions.elementToBeClickable(
                        usernameOption
                )
        ).click();

        System.out.println("Username selected");
    }
    public void selectWrongUsername() {
        WebElement dropdown = wait.until(
                ExpectedConditions.elementToBeClickable(wrongUsernameDropdown)
        );

        

        // Type the wrong username directly
        dropdown.sendKeys("ramesh");
        dropdown.sendKeys(Keys.ENTER);

        System.out.println("Wrong Username entered in text box dropdown");
    }

    
    


    public void selectPassword() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        passwordDropdown
                )
        ).click();

        System.out.println("Password dropdown opened");


        wait.until(
                ExpectedConditions.elementToBeClickable(
                        passwordOption
                )
        ).click();

        System.out.println("Password selected");
    }


    public void clickLogin() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        loginButton
                )
        ).click();

        System.out.println("Login button clicked");
    }


    public void login() {

        clickSignIn();

        selectUsername();

        selectPassword();

        clickLogin();
    }


    public boolean isLoginSuccessful() {

        try {

            wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            logoutButton
                    )
            );

            return true;

        } catch (Exception e) {

            return false;
        }
    }
}