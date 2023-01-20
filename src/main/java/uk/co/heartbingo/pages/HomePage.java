package uk.co.heartbingo.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.heartbingo.customlisteners.CustomListeners;
import uk.co.heartbingo.utlities.Utilities;

public class HomePage extends Utilities {

    //Declaraing WebElements variables
    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookiesLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpLink;

    //This method will click on Accept Cookies Link once on Homepage is loaded for first time
    public void clickOnAcceptCookiesLink() {
        Reporter.log("Clicking on Accept Cookies link" + acceptCookiesLink.toString());
        clickOnElement(acceptCookiesLink);
        CustomListeners.test.log(Status.PASS, "Clicked on Accept Cookies link ");
    }

    //This method will click on Signup button/link on Homepage
    public void clickOnSignUpLink() {
        Reporter.log("Clicking on Sign Up link" + signUpLink.toString());
        clickOnElement(signUpLink);
        CustomListeners.test.log(Status.PASS, "Clicked on Sign up link");
    }

}
