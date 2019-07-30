import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

public class AddReviewTest extends  TestChromeDriver{


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
    public void addReviewWithCorrectData() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/recenzje");
        WebElement ButtonWriteReview=webDriver.findElement(By.xpath("//a[@class='btn btn-sm btn-primary']"));
        ButtonWriteReview.click();
        Thread.sleep(5000);

        WebElement ButtonChoseBook =webDriver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary']"));
        ButtonChoseBook.click();
        Thread.sleep(5000);

        WebElement inputBookName=webDriver.findElement(By.xpath("//input[@placeholder='Wpisz szukaną frazę']"));
        inputBookName.sendKeys("Pan Tadeusz");
        Thread.sleep(5000);

        WebElement ButtonChoseBookFromInput=webDriver.findElement(By.xpath("//div[@class='modal-content']//div[1]//div[3]//button[1]"));
        ButtonChoseBookFromInput.click();
        Thread.sleep(5000);

        WebElement inputTitle=webDriver.findElement(By.xpath("//input[@name='title']"));
        inputTitle.sendKeys("test");

        WebElement inputReviewDescription=webDriver.findElement(By.xpath("//trix-editor[@class='trix-content']"));
        inputReviewDescription.sendKeys("asdasdsssssssssssssssssssssssssssssssssssssssssss" +
                "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssszzzzzasasasasasasa ");

        Thread.sleep(5000);
        WebElement saveButton=webDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        saveButton.click();
        Thread.sleep(5000);



        WebElement text = webDriver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        assertNotNull(text);
    }

    @Test
    public void addReviewWithInCorrectData() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/recenzje");
        WebElement ButtonWriteReview=webDriver.findElement(By.xpath("//a[@class='btn btn-sm btn-primary']"));
        ButtonWriteReview.click();
        Thread.sleep(5000);

        WebElement saveButton=webDriver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        saveButton.click();

        assertTrue(webDriver.getCurrentUrl().contains("dodaj"));





    }



}
