package signInPage;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CredentialsMessagePage extends AbstractPage {

    @FindBy(xpath = "//div[@class='_9ay7']")
    private ExtendedWebElement wrongCredentials;

    public CredentialsMessagePage(WebDriver driver) {
        super(driver);
    }

    public boolean isWrongCredentialsMessagePresent() {
        return wrongCredentials.isElementPresent();
    }
}
