package uk.co.heartbingo.utlities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import uk.co.heartbingo.browserfactory.ManageBrowser;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Utilities extends ManageBrowser {


    //This method will click on an element
    public void clickOnElement(WebElement element) {
        element.click();
    }

    //This method will get text from an element
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }


     //This method will take a screenshot

    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
