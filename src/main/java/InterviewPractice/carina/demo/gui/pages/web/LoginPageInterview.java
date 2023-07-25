package InterviewPractice.carina.demo.gui.pages.web;

import InterviewPractice.carina.demo.gui.pages.common.LoginPageBaseInterview;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP,parentClass = LoginPageBaseInterview.class)
public class LoginPageInterview extends LoginPageBaseInterview {

    @FindBy(xpath = "//div[@class='_9ay7']")
    private ExtendedWebElement wrongCredentials;

    @FindBy(xpath = "//div[@class=\"_6luy _55r1 _1kbt _9nyh\"]")
    private ExtendedWebElement inputPassword;

    @FindBy(className = "inputtext _55r1 _6luy")
    private ExtendedWebElement inputEmail;

    @FindBy(css = "button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    private ExtendedWebElement loginButton;


    public LoginPageInterview(WebDriver driver) {
        super(driver);
    }

    @Override
    public void inputUsername(String username) {
        inputEmail.click();
        inputEmail.type(username);
    }

    @Override
    public void inputPassword(String password) {
        inputPassword.type(password);
    }

    @Override
    public void clickOnLoginButton() {
    loginButton.click();
    }

    @Override
    public boolean areCredentialsOk() {
        return wrongCredentials.isElementPresent();
    }
}
