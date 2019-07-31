import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LoginTest extends TestChromeDriver {




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



    @Test
    public void loginTestIfIncorrectData(){
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        LoginPage login=new LoginPage(webDriver);
        login.loginWithUserLoginAndPassword("sn","password");

        assertFalse(webDriver.getCurrentUrl().contains("/pulpit"));

    }













}
