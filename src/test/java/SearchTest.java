import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class SearchTest extends TestChromeDriver {


    @Test
    public void searchBookTest(){
        webDriver.navigate().to("https://nakanapie.pl/");
        HomePage homePage=new HomePage(webDriver);
        homePage.search("das");
        assertTrue(webDriver.getCurrentUrl().contains("das"));


    }


}
