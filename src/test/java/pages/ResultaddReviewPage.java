package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultaddReviewPage {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }



    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement text;
    @FindBy(xpath = "//*[@id=onesignal-popover-cancel-button]")
    private  WebElement popWindow;

//*[@id="onesignal-popover-cancel-button"]
    public ResultaddReviewPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }


    public WebElement getText(){

        return  this.text;

    }

}
