package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {

    @BeforeMethod
    public void setUp() {

        ConfigReader.loadProperties();

        DriverFactory.openBrowser();
    }


    @AfterMethod
    public void tearDown() {

        DriverFactory.closeBrowser();
    }
}