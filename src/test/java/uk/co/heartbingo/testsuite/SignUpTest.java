package uk.co.heartbingo.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.heartbingo.customlisteners.CustomListeners;
import uk.co.heartbingo.pages.HomePage;
import uk.co.heartbingo.pages.SignUpPage;
import uk.co.heartbingo.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class SignUpTest extends BaseTest {

    //Declaring Object instance of pages
    HomePage homePage;
    SignUpPage signUpPage;

    //This method will initialise the page objects
    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        signUpPage = new SignUpPage();
    }

    //This method will test the successful navigation to Sign Up page
    @Test(groups = "regression")
    public void VerifyUserCanNavigateToSignupPageSuccessfully() {
        //Clicking on Accept Cookies link
        homePage.clickOnAcceptCookiesLink();
        //Clicking on Sign Up link
        homePage.clickOnSignUpLink();
        //Verifying that successful navigation to Sign Up page by "Sign Up" text
        Assert.assertEquals(signUpPage.getSignUpText(), "Sign Up");
    }
}
