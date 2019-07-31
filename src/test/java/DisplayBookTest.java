import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.BookPage;

import static org.testng.Assert.*;

public class DisplayBookTest extends TestChromeDriver {



    @Test
    public void displayBook(){
        webDriver.navigate().to("https://nakanapie.pl/ksiazka/principles-of-geotechnical-engineering");
        WebElement title=webDriver.findElement(By.tagName("h1"));
        BookPage bookPage=new BookPage(webDriver);

        assertNotNull(bookPage.getDescription());
        assertTrue(bookPage.hasPicture().isDisplayed());

    }




}
