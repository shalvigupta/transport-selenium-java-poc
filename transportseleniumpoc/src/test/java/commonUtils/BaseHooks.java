package commonUtils;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseHooks {

    public static WebDriver driver;

    @Before
    public void initializeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        driver.close();
    }

}
