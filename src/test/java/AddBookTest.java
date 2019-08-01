
import org.testng.annotations.Test;
import pages.AddBookPage;
import pages.HomePage;
import pages.LoginPage;


import static org.testng.Assert.assertTrue;

public class AddBookTest extends  TestChromeDriver {




@Test
    public void addBook() throws InterruptedException {
    webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
    Thread.sleep(500);
    LoginPage loginPage = new LoginPage(webDriver);
    loginPage.loginWithUserLoginAndPassword("snopson", "password");
    Thread.sleep(500);
    webDriver.navigate().to("https://nakanapie.pl/ksiazka/dodaj");
    AddBookPage addBookPage = new AddBookPage(webDriver);
    addBookPage.addBook("WebTest", "Po Godzinach ", "C:\\" +
            "Users\\Michal Snopek\\Desktop\\tadeusz.jpg");


    HomePage homePage = new HomePage(webDriver);
    homePage.logOut();
}


    @Test
         public void addBookWithIncorectData() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        Thread.sleep(500);
        LoginPage loginPage=new LoginPage(webDriver);
        loginPage.loginWithUserLoginAndPassword("snopson","password");
        Thread.sleep(500);
        webDriver.navigate().to("https://nakanapie.pl/ksiazka/dodaj");
        AddBookPage addBookPage=new AddBookPage(webDriver);
        addBookPage.addBook("","","");


        HomePage homePage=new HomePage(webDriver);
        homePage.logOut();


    }















}







