package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddReviewPage {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    private WebElement ButtonChoseBook;

    @FindBy(xpath = "//input[@placeholder='Wpisz szukaną frazę']")
    private WebElement inputBookName;

    @FindBy(xpath = "//div[@class='modal-content']//div[1]//div[3]//button[1]")
    private WebElement ButtonChoseBookFromInput;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement inputTitle;

    @FindBy(xpath = "//trix-editor[@class='trix-content']")
    private WebElement inputReviewDescription;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveButton;





    public AddReviewPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }



    public void addReview(String bookName,String reviewTitle,String reviewDescription ) throws InterruptedException {
       this.ButtonChoseBook.click();
        Thread.sleep(5000);
        this.inputBookName.sendKeys(bookName);
        Thread.sleep(5000);
        this.ButtonChoseBookFromInput.click();
        Thread.sleep(5000);
        this.inputTitle.sendKeys(reviewTitle);
        this.inputReviewDescription.sendKeys(reviewDescription);
        Thread.sleep(5000);
        saveButton.click();
        Thread.sleep(5000);


    }


}
