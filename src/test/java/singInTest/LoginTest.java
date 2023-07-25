package singInTest;

import signInPage.CredentialsMessagePage;
import signInPage.LoginPage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LoginTest implements IAbstractTest {

    static Logger logger = Logger.getLogger(LoginTest.class.getName());

    @Test
    public void testLogin() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.inputUsername(R.TESTDATA.get("username"));
        loginPage.inputPassword(R.TESTDATA.get("password"));
        CredentialsMessagePage credentialsMessagePage = loginPage.clickOnLoginButton();

        Assert.assertTrue(credentialsMessagePage.isWrongCredentialsMessagePresent(), "The credentials are invalid");

        if (credentialsMessagePage.isWrongCredentialsMessagePresent()) {
            logger.info("The credentials are invalid");
        }
    }

}
