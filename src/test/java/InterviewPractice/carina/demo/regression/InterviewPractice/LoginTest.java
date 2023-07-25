package InterviewPractice.carina.demo.regression.InterviewPractice;

import InterviewPractice.carina.demo.gui.pages.common.LoginPageBaseInterview;
import InterviewPractice.carina.demo.gui.pages.web.LoginPageInterview;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest implements IAbstractTest {

    @Test
    public void testLogin() {
        LoginPageBaseInterview homePage = initPage(getDriver(), LoginPageBaseInterview.class);
        homePage.open();
        LoginPageInterview loginPage = new LoginPageInterview(getDriver());
        loginPage.inputUsername(R.TESTDATA.get("username"));
        loginPage.inputPassword(R.TESTDATA.get("password"));
        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.areCredentialsOk(), "The credentials are invalid");

    }

}
