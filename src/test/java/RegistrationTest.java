import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RegistrationTest extends  TestChromeDriver {



    @Test
    public void testRegistration(){
        webDriver.navigate().to("https://nakanapie.pl/konto/rejestracja");
        WebElement emailInput=webDriver.findElement(By.xpath("//input[@id='user_email']"));
        WebElement paswordInput=webDriver.findElement(By.xpath("//input[@id='user_password']"));
        WebElement newsCheckBox=webDriver.findElement(By.xpath("//input[@id='user_newsletter']"));
        WebElement termsCheckBox=webDriver.findElement(By.xpath("//input[@id='user_terms']"));
        WebElement submitButton=webDriver.findElement(By.xpath("//input[@name='commit']"));


        emailInput.sendKeys("dd@gmail.pl");
        paswordInput.sendKeys("password");
        newsCheckBox.click();
        termsCheckBox.click();
        submitButton.click();

        assertTrue(webDriver.getCurrentUrl().contains("po-rejestracji"));

    }


    @Test// testing incorrect  password
    public void passwordTest(){
        webDriver.navigate().to("https://nakanapie.pl/konto/rejestracja");
        WebElement emailInput=webDriver.findElement(By.xpath("//input[@id='user_email']"));
        WebElement paswordInput=webDriver.findElement(By.xpath("//input[@id='user_password']"));
        WebElement newsCheckBox=webDriver.findElement(By.xpath("//input[@id='user_newsletter']"));
        WebElement termsCheckBox=webDriver.findElement(By.xpath("//input[@id='user_terms']"));
        WebElement submitButton=webDriver.findElement(By.xpath("//input[@name='commit']"));


        emailInput.sendKeys("dd@gmail.pl");
        paswordInput.sendKeys("pas");
        newsCheckBox.click();
        termsCheckBox.click();
        submitButton.click();

        assertFalse(webDriver.getCurrentUrl().contains("po-rejestracji"));



    }





}
