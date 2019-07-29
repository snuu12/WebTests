import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LoginTest extends TestChromeDriver {



        @Test
        public void loginTest(){
            webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
            WebElement login=webDriver.findElement(By.xpath("//input[@id='user_login']"));
            WebElement password=webDriver.findElement(By.xpath("//input[@id='user_password']"));
            WebElement submit=webDriver.findElement(By.xpath("//input[@name='commit']"));

            login.sendKeys("snopson");
            password.sendKeys("password");
            submit.click();

            assertTrue(webDriver.getCurrentUrl().contains("/pulpit"));

        }

    @Test
    public void loginTestIfIncorrectData(){
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        WebElement login=webDriver.findElement(By.xpath("//input[@id='user_login']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@id='user_password']"));
        WebElement submit=webDriver.findElement(By.xpath("//input[@name='commit']"));

        login.sendKeys("Piotr");
        password.sendKeys("piter20t");
        submit.click();

        assertFalse(webDriver.getCurrentUrl().contains("/pulpit"));

    }













}
