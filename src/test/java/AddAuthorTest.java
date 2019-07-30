import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class AddAuthorTest extends TestChromeDriver {


    @BeforeMethod
    public void loginBeforeAddBook() {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        WebElement login = webDriver.findElement(By.xpath("//input[@id='user_login']"));
        WebElement password = webDriver.findElement(By.xpath("//input[@id='user_password']"));
        WebElement submit = webDriver.findElement(By.xpath("//input[@name='commit']"));

        login.sendKeys("snopson");
        password.sendKeys("password");
        submit.click();
    }

    @Test
    public void correctAddAuthor() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/autorzy/dodaj");
        WebElement nameImput=webDriver.findElement(By.xpath("//input[@name='first_name']"));
        WebElement surnameImput=webDriver.findElement(By.xpath("//input[@name='last_name']"));
        WebElement submit=webDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));


        nameImput.sendKeys("kuba");
        surnameImput.sendKeys("kuba");
        submit.click();
        Thread.sleep(500);
        WebElement title=webDriver.findElement(By.xpath("//h1[@class='h hb mb-0']"));

        assertTrue(title.getText().contains("kuba kuba"));




    }


    @Test
    public void incorrectAddAuthour()  {
        webDriver.navigate().to("https://nakanapie.pl/autorzy/dodaj");
        WebElement submit=webDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submit.click();
        assertTrue(webDriver.getCurrentUrl().contains("autorzy/dodaj"));
    }


}
