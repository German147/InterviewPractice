package signInPage;


import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import signInEnum.SignInInputEnum;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//input[@id='email']")
    private ExtendedWebElement inputEmail;
    //    @FindBy(xpath = "//input[@data-testid='royal_email']")
    @FindBy(xpath = "//input[@id='pass']")
    private ExtendedWebElement inputPassword;

    @FindBy(xpath = "//input[@id='%s']")
    private ExtendedWebElement input;
    @FindBy(xpath = "//button[@name='login']")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        openURL("https://www.facebook.com/login/");
    }

    public void typeInput(SignInInputEnum field, String text) {
        input = input.format(field.getId());
        input.type(text);
    }

    public void inputUsername(String username) {
        inputEmail.click();
        inputEmail.type(username);
    }

    public void inputPassword(String password) {
        inputPassword.type(password);
    }

    public CredentialsMessagePage clickOnLoginButton() {
        CredentialsMessagePage credentialsPage = new CredentialsMessagePage(driver);
        loginButton.click();
        return credentialsPage;
    }


}
