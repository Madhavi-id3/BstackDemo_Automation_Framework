package utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtil {

    public static void takeScreenshot(String name) {

        try {

            File source =
                    ((TakesScreenshot)
                            DriverFactory.driver)
                            .getScreenshotAs(
                                    OutputType.FILE
                            );

            File destination =
                    new File(
                            "screenshots/"
                            + name
                            + ".png"
                    );

            destination.getParentFile()
                       .mkdirs();

            source.renameTo(destination);

            System.out.println(
                    "Screenshot saved: "
                    + destination.getAbsolutePath()
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}