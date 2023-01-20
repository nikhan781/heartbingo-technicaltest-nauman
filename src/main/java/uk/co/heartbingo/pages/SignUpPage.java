package uk.co.heartbingo.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.heartbingo.customlisteners.CustomListeners;
import uk.co.heartbingo.utlities.Utilities;

public class SignUpPage extends Utilities {

    //Declaring WebElement varable
    @CacheLookup
    @FindBy(linkText = "Sign Up")
    WebElement signUpText;

    //This method will return text from Sign up page for verification
    public String getSignUpText() {
        Reporter.log("Getting Sign Up text" + signUpText.toString());
        CustomListeners.test.log(Status.PASS, "The text is " + signUpText.getText());
        return getTextFromElement(signUpText);
    }
}
