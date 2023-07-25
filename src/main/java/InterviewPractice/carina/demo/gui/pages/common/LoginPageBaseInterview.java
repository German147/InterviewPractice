package InterviewPractice.carina.demo.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBaseInterview extends AbstractPage {
    public LoginPageBaseInterview(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    @Override
    public void open() {
        super.open();
    }

    public abstract void inputUsername(String username);

    public abstract void inputPassword(String password);

    public abstract void clickOnLoginButton();

    public abstract boolean areCredentialsOk();


}
