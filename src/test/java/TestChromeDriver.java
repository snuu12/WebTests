import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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




