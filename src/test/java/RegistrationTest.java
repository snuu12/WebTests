import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RegistrationTest extends  TestChromeDriver {



    @Test
    public void testRegistration() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/rejestracja");
        RegistrationPage registrationPage=new RegistrationPage(webDriver);
        registrationPage.regidtrationWithEmailAndPasswodr("ddddsadsa@gmail.com","password");

        assertTrue(webDriver.getCurrentUrl().contains("po-rejestracji"));

    }


    @Test// testing incorrect  password
    public void passwordTest() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/rejestracja");
        RegistrationPage registrationPage=new RegistrationPage(webDriver);
        registrationPage.regidtrationWithEmailAndPasswodr("dd@gmail.com","pas");

        assertFalse(webDriver.getCurrentUrl().contains("po-rejestracji"));



    }





}
