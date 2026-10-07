package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;

    public static void openBrowser() {

        driver = new ChromeDriver();

        driver.manage()
              .window()
              .maximize();

        driver.get(
                ConfigReader.getProperty("url")
        );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void closeBrowser() {

        if (driver != null) {

            driver.quit();
        }
    }
}