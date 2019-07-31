package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {





    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }







    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='user_newsletter']")
    private WebElement newsCheckBox;

    @FindBy(xpath = "//input[@id='user_terms']")
    private WebElement termsCheckBox;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement submitButton;


    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }


    public void regidtrationWithEmailAndPasswodr(String email, String password) throws InterruptedException {
        this.emailInput.sendKeys(email);
        this.passwordInput.sendKeys(password);
        this.newsCheckBox.click();
        this.termsCheckBox.click();
        this.submitButton.click();
        Thread.sleep(500);



    }


}
