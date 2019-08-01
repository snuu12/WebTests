import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddReviewPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ResultaddReviewPage;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

public class AddReviewTest extends  TestChromeDriver{




    @Test
    public void addReviewWithCorrectData() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");

        LoginPage login=new LoginPage(webDriver);
        login.loginWithUserLoginAndPassword("snopson","password");


        webDriver.navigate().to("https://nakanapie.pl/recenzje/dodaj");
        AddReviewPage addReviewPage=new AddReviewPage(webDriver);
        addReviewPage.addReview("Pan Tadeusz","test","asdasdss" +
                "                   sssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"ssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"ssssssssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"sssssssssssssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"ssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"sssssssssssssssssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"ssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"ssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss\" +\n" +
                "                \"szzzzzasasasasasasa \");");


        ResultaddReviewPage resultaddReviewPage=new ResultaddReviewPage(webDriver);
        assertNotNull(resultaddReviewPage.getText());

        HomePage homePage=new HomePage(webDriver);
        homePage.logOut();
    }

    @Test
    public void addReviewWithInCorrectData() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");

        LoginPage login=new LoginPage(webDriver);
        login.loginWithUserLoginAndPassword("snopson","password");


        webDriver.navigate().to("https://nakanapie.pl/recenzje/dodaj");
        AddReviewPage addReviewPage=new AddReviewPage(webDriver);
        addReviewPage.addReview("Pan Tadeusz","","");


        assertTrue(webDriver.getCurrentUrl().contains("dodaj"));

        HomePage homePage=new HomePage(webDriver);
        homePage.logOut();





    }



}
