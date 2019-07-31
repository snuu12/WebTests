package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import javax.swing.*;
import java.util.List;

public class HomePage {




    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @FindBy(xpath = "//div[@id='navbarDropdownMenuLink']")
    private WebElement menu;

    @FindBy(xpath = "//a[contains(text(),'Wyloguj')]")
    private WebElement logOutOption;

    @FindBy(xpath = "//div[@class='alert alert-warning alert-dismissible fade show mt-2']")
    private WebElement Alert;


    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }




    public void logOut() {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(menu).click().perform();
        actions.moveToElement(logOutOption).click().perform();
    }




}
