import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestChromeDriver {

    protected WebDriver webDriver;

    @BeforeTest
    public void beforeTests() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }






    @AfterTest
    public void closeChrome() {
        webDriver.close();
        webDriver.quit();
    }





}




