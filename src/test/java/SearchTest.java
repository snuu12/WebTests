import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTest extends TestChromeDriver {


    @Test
    public void searchBookTest(){
        webDriver.navigate().to("https://nakanapie.pl/");
        WebElement searchWindow=webDriver.findElement(By.xpath("//input[@id='q']"));
        WebElement searchButton=webDriver.findElement(By.xpath("//form[@name='search']//div//span//img"));
        searchWindow.sendKeys("das");
        searchButton.click();


        assertTrue(webDriver.getCurrentUrl().contains("das"));


    }


}
