package uk.co.heartbingo.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.heartbingo.browserfactory.ManageBrowser;
import uk.co.heartbingo.propertyreader.PropertyReader;

public class BaseTest extends ManageBrowser {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
