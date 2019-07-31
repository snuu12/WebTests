import okhttp3.Address;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddAuthorPage;
import pages.LoginPage;
import pages.ResultAddAuthorPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AddAuthorTest extends TestChromeDriver {




    @Test
    public void correctAddAuthor() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        Thread.sleep(500);
        LoginPage loginPage=new LoginPage(webDriver);
        loginPage.loginWithUserLoginAndPassword("snopson","password");
        Thread.sleep(500);
        webDriver.navigate().to("https://nakanapie.pl/autorzy/dodaj");

        AddAuthorPage addAuthorPage=new AddAuthorPage(webDriver);
        addAuthorPage.addAuthor("kuba","kuba");

        ResultAddAuthorPage resultAddAuthorPage=new ResultAddAuthorPage(webDriver);

        assertTrue(resultAddAuthorPage.getTitle().getText().contains("kuba kuba"));




    }


    @Test
    public void incorrectAddAuthour() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        Thread.sleep(500);
        LoginPage loginPage=new LoginPage(webDriver);
        loginPage.loginWithUserLoginAndPassword("snopson","password");
        Thread.sleep(500);
        webDriver.navigate().to("https://nakanapie.pl/autorzy/dodaj");

        AddAuthorPage addAuthorPage=new AddAuthorPage(webDriver);
        addAuthorPage.addAuthor("kuba");

        assertTrue(webDriver.getCurrentUrl().contains("autorzy/dodaj"));
    }


}
