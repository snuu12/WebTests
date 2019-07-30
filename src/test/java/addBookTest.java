import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.testng.Assert.assertTrue;

public class addBookTest extends  TestChromeDriver {

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
    public void addBook() throws InterruptedException {

    webDriver.navigate().to("https://nakanapie.pl/ksiazka/dodaj");


    WebElement ImageInput=webDriver.findElement(By.xpath("//div[@class='col-12 col-md-12 col-xl-4']//div[@class='form-group']//div//input"));
    WebElement isbnChekBox=webDriver.findElement(By.xpath("//input[@id='no_isbn_checkbox']"));
    WebElement bookTitle =webDriver.findElement(By.xpath("//input[@name='title']"));
    WebElement publishingHouse=webDriver.findElement(By.xpath("//input[@id='react-select-2-input']"));
    WebElement buttonSubmit = webDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));


    ImageInput.sendKeys("C:\\Users\\Michal Snopek\\Desktop\\tadeusz.jpg" );
    isbnChekBox.click();
    bookTitle.sendKeys("WebTest");




     publishingHouse.sendKeys("Po Godzinach ");


    //JavascriptExecutor js = (JavascriptExecutor) webDriver;
   // js.executeScript("document.getElementById('react-select-2-input').value='someValue';");



    /*
    JavascriptExecutor executor = (JavascriptExecutor)webDriver;
    executor.executeScript("arguments[0].click();", element);


     */




    Thread.sleep(500);
    buttonSubmit.click();



}







}
