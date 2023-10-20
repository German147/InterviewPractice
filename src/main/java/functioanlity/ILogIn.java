package functioanlity;


import com.zebrunner.carina.utils.R;
import homePage.HomePage;
import org.openqa.selenium.WebDriver;
import signInPage.LoginPage;

import static signInEnum.SignInInputEnum.PASSWORD;
import static signInEnum.SignInInputEnum.USER;

public interface ILogIn {



    default void login(WebDriver driver){
        HomePage home= new  HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        home.openFacebook();
        loginPage.typeInput(USER, R.TESTDATA.get("username"));
        loginPage.typeInput(PASSWORD, R.TESTDATA.get("password"));
    }
}
