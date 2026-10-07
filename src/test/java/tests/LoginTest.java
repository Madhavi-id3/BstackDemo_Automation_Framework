package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ScreenshotUtil;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage login = new LoginPage();

        login.login();

        ScreenshotUtil.takeScreenshot(
                "ValidLogin"
        );

        AssertJUnit.assertTrue("Login was not successful",
                login.isLoginSuccessful()
        );
    }


@Test
public void invalidLoginTest() {

    LoginPage login = new LoginPage();

    login. clickSignIn();

    

    login.selectPassword();

    login.clickLogin();;

    ScreenshotUtil.takeScreenshot(
            "InValidLogin"
    );

    AssertJUnit.assertFalse("Login was not successful",
            login.isLoginSuccessful()
    );
}
}