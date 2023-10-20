package homePage;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    HomePage homePage = new HomePage(driver);

   public void openFacebook(){
       homePage.open();
   }
}
