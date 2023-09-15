package singInTest;

import com.zebrunner.carina.core.IAbstractTest;
import functioanlity.ILogIn;
import org.testng.Assert;
import org.testng.annotations.Test;
import signInPage.CredentialsMessagePage;
import signInPage.LoginPage;

import java.util.logging.Logger;


public class LoginUsingInterface implements IAbstractTest, ILogIn {
    static Logger logger = Logger.getLogger(LoginTest.class.getName());

    @Test
    public void loginWithInterface() {

        login(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        CredentialsMessagePage credentialsMessagePage = loginPage.clickOnLoginButton();

        if (credentialsMessagePage.isWrongCredentialsMessagePresent()){
            logger.info("The credentials are invalid");
        }
        Assert.assertTrue(credentialsMessagePage.isWrongCredentialsMessagePresent(),"The credentials are");
    }
}
