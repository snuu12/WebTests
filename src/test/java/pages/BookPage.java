package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }




    @FindBy(xpath = "//h1[@class='h hb mb-0']")
    private WebElement title;

    @FindBy(xpath = "//div[@class='text-justify small']")
    private WebElement description;

    @FindBy(xpath = "//div[@class='d-none d-md-block']//img")
    private WebElement picture;


    public BookPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getDescription() {

        return this.description;
    }

    public WebElement hasPicture() {

        return picture;
    }
}
