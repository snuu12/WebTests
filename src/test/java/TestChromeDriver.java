import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestChromeDriver {

    protected WebDriver webDriver;

    @BeforeClass
    public void beforeTests() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }


    @AfterClass
    public void closeChrome() {
        webDriver.close();
        webDriver.quit();
    }


}




