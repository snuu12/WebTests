import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LogOutTest extends  TestChromeDriver {

    @Test
    public void loginTest() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        LoginPage login=new LoginPage(webDriver);
        login.loginWithUserLoginAndPassword("snopson","password");
        assertTrue(webDriver.getCurrentUrl().contains("/pulpit"));
        HomePage homePage=new HomePage(webDriver);
        homePage.logOut();
        assertFalse(webDriver.getCurrentUrl().contains("/logowanie"));

    }
}
