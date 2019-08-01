package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBookPage {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @FindBy(xpath = "//div[@class='col-12 col-md-12 col-xl-4']//div[@class='form-group']//div//input")
    private WebElement ImageInput;

    @FindBy(xpath = "//input[@id='no_isbn_checkbox']")
    private WebElement isbnChekBox;

    @FindBy(xpath = "//input[@name='title']")
    private WebElement bookTitleInput;

    @FindBy(xpath = "//input[@id='react-select-2-input']")
    private WebElement publishingHouseInput;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttonSubmit;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[2]/div/div[7]/a/text()[1]")
    private WebElement List;


    public AddBookPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void addBook(String title, String publishingHouse, String PhotoSrc) throws InterruptedException {
        this.bookTitleInput.sendKeys(title);

        JavascriptExecutor js = (JavascriptExecutor) this.webDriver;
        js.executeScript("arguments[0].click();", publishingHouseInput);
        this.publishingHouseInput.sendKeys(publishingHouse);
        js.executeScript("arguments[0].click();", publishingHouseInput);

        this.ImageInput.sendKeys(PhotoSrc);
        this.isbnChekBox.click();
        Thread.sleep(500);
        this.buttonSubmit.click();


    }

}
