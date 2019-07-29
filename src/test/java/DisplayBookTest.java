import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DisplayBookTest extends TestChromeDriver {



    @Test
    public void displayBook(){
        webDriver.navigate().to("https://nakanapie.pl/ksiazka/principles-of-geotechnical-engineering");
        WebElement title=webDriver.findElement(By.tagName("h1"));
        WebElement description= webDriver.findElement(By.xpath("//div[@class='text-justify small']"));
        WebElement picture=webDriver.findElement(By.xpath("//div[@class='d-none d-md-block']//img"));


        String url=webDriver.getCurrentUrl().replace("-"," ");


        assertTrue(url.contains(title.getText().toLowerCase()));
        assertNotNull(description);
        assertTrue(picture.isDisplayed());

    }




}
